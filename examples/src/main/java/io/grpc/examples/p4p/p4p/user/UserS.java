package io.grpc.examples.p4p.p4p.user;
import io.grpc.examples.p4p.p4p.user.UserVector2;
import io.grpc.examples.p4p.p4p.util.StopWatch;
import io.grpc.examples.p4p.p4p.server.P4PServerSS;
import io.grpc.examples.p4p.p4p.server.P4PServer;
import io.grpc.examples.p4p.p4p.peer.P4PPeer;
import io.grpc.examples.p4p.p4p.peer.P4PPeerS;
import io.grpc.examples.p4p.p4p.sim.P4PSim;
import io.grpc.examples.p4p.p4p.sim.P4PCoordinate;
import java.security.SecureRandom;

import java.util.ArrayList;
import io.grpc.examples.p4p.p4p.util.Util;
import io.grpc.examples.p4p.net.i2p.util.NativeBigInteger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Server that manages startup/shutdown of a {@code UserS} server.
 */
public class UserS {
  private static final Logger logger = Logger.getLogger(UserS.class.getName());
  private static ArrayList<long[]> dataArrayList = new ArrayList<long[]> ();
  private Server server;

  private void start() throws IOException {
    /* The port on which the server should run */
    int port = 1111;
    server = ServerBuilder.forPort(port)
        .addService(new UserSImpl())
        .build()
        .start();
    logger.info("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        try {
          UserS.this.stop();
        } catch (InterruptedException e) {
          e.printStackTrace(System.err);
        }
        System.err.println("*** server shut down");
      }
    });
  }

  private void stop() throws InterruptedException {
    if (server != null) {
      server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
    }
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  public static boolean IsServerPeerUp(){
    boolean isServerPeerUp = true;
    if(P4PServerSS.serverP == null){
      System.out.println("Server haven't started yet, please restart server N0 in Golang before running client in golang");
      isServerPeerUp =  false;
    }else{
      System.out.println(">>>>>Server up !!!");
    }
    if(P4PPeerS.peer == null){
      System.out.println("Peer haven't started yet, please restart Peer Ni in Golang before running client in golang");
      isServerPeerUp =  false;
    }else{
      System.out.println(">>>>>Peer up !!!");
    }
    return isServerPeerUp;
  }
  /**
   * Main launches the server from the command line.
   */
  public static void Main_s(String[] args) throws IOException, InterruptedException {
    // System.out.println("Client args[0]: "+args[0]);
    // String[] argStr = args[0].split(",");
    // int m = Integer.parseInt(argStr[0]);
    // long F = Long.parseLong(argStr[1]);
    // int l = Integer.parseInt(argStr[2]);
    // int zkpIterations = Integer.parseInt(argStr[3]);
    // NativeBigInteger g = new NativeBigInteger(argStr[4]);
    // NativeBigInteger h = new NativeBigInteger(argStr[5]);
    if(!IsServerPeerUp()) return;
    final UserS server = new UserS();
    server.start();
    System.out.println("UserS start !!");
    server.blockUntilShutdown();
  }


  static class UserSImpl extends UserSGrpc.UserSImplBase {

    @Override
    public void sayHello(UserSRequest req, StreamObserver<UserSReply> responseObserver) {
      // String stringInReply = "Zero Knowledge Module[java] received: " + req.getName();
      String stringInReply = "Zero Knowledge Module[java] received. Verification Result is ";
      System.out.println("Check whether Server and Peer is up:");
      if(!IsServerPeerUp()) return;
      try {
        boolean worstcase = false;
        int k = 512;     // Security parameter
        int m = P4PSim.m;      // User vector dimension
        
        P4PServer serverP = P4PServerSS.serverP;
        serverP.init(); // Must clear old states and data
        serverP.generateChallengeVectors(); 
        long[] s = new long[m];
        long[] v = new long[m];


        int l = P4PSim.l;      // Bit length of L
        long L = P4PSim.L;
        long F = P4PSim.F;
        NativeBigInteger g = P4PSim.g;
        NativeBigInteger h = P4PSim.h;
        boolean shouldPass;
        boolean passed = true;
        int nQulaifiedUsers = 0;


        StopWatch proverWatch = new StopWatch();
        StopWatch verifierWatch = new StopWatch();
        double delta = 1.5;
        int nfails = 0;
        SecureRandom rand = P4PCoordinate.rand;
        if (worstcase) shouldPass = true;     // Test the worst case
        else shouldPass = rand.nextBoolean();
        //System.out.println("Loop " + kk + ", user " + i + ". shouldPass = " + shouldPass);
        if (shouldPass) delta = 0.5;
        else delta = 2.0;
        double l2 = (double) L * delta;

        // System.out.println("serverP.getChallengeVectors(): "+serverP.getChallengeVectors());
        for (int i = 0; i < m; i++) {
          s[i] = 0;
          v[i] = 0;
        }
        System.out.println("Client Input: " + req.getName());
        
        long[] data = convertToLongArray(req.getName());
        dataArrayList.add(data);
        long[] s_d123 = new long[m];
        System.out.println("Added to dataArrayList index "+(dataArrayList.size()-1)+" long[] data: " + Arrays.toString(data));
        if(dataArrayList.size() == 3){
          Util.vectorThreeAdd(dataArrayList.get(0), dataArrayList.get(1), dataArrayList.get(2), s_d123, F);
          System.out.println("d1: " + Arrays.toString(dataArrayList.get(0)));
          System.out.println("d2: " + Arrays.toString(dataArrayList.get(1)));
          System.out.println("d3: " + Arrays.toString(dataArrayList.get(2)));
          System.out.println("d1+d2+d3: " + Arrays.toString(s_d123));
          dataArrayList.clear();
          System.out.println("dataArrayList.clear()");
        }
        
        if(data.length != m) System.out.println("!!!! Wrong Length: "+ data.length +", correct length is "+m +"!!!!" );
        UserVector2 uv = new UserVector2(data, F, l, g, h);
        uv.generateShares();
        uv.setChecksumCoefficientVectors(serverP.getChallengeVectors());

        proverWatch.start();
        UserVector2.L2NormBoundProof2 peerProof =
        (UserVector2.L2NormBoundProof2) uv.getL2NormBoundProof2(false);
        UserVector2.L2NormBoundProof2 serverProof =
        (UserVector2.L2NormBoundProof2) uv.getL2NormBoundProof2(true);
        proverWatch.pause();
        
        serverP.setUserVector(0, uv.getU());
        serverP.setProof(0, serverProof);
        long[] vv = uv.getV();
        UserVector2 pv = new UserVector2(m, F, l, g, h);
        pv.setV(vv);
        pv.setChecksumCoefficientVectors(serverP.getChallengeVectors());
        verifierWatch.start();
        boolean peerPassed = pv.verify2(peerProof); // 🌟 verify2 🌟
        verifierWatch.pause();
        if (!peerPassed)
        serverP.disqualifyUser(0); // on one USER //TODO: for (int i = 0; i < n; i++) {
        else
        serverP.setY(0, pv.getY());   
        shouldPass = l2 < L;   // Correct shouldPass using actual data.
        // shouldPass = true;
        if (shouldPass) {
            nQulaifiedUsers++;
            Util.vectorAdd(s, data, s, F);
            Util.vectorAdd(v, vv, v, F);
        }       

        P4PPeer peer = P4PPeerS.peer;
        peer.setPeerSum(v);
        verifierWatch.start();
        serverP.compute(peer);          // 🌟 serverVerify 🐢🌟
        verifierWatch.pause();
        long[] result = serverP.getVectorSum();

        for (int ii = 0; ii < m; ii++) {
          // 7.1 res[ii] != Util.mod(s[ii], F)
            if (result[ii] != Util.mod(s[ii], F)) {
                System.out.println("\tElement " + ii
                        + " don't agree. Computed: "
                        + result[ii] + ", should be "
                        + Util.mod(s[ii], F));
                passed = false;
                nfails++;
                break;
            }
        }
        System.out.println("passed:"+passed);
        if (passed)
            // System.out.println("Test " + kk + " passed. Number of qualified users "
            System.out.println("Test 1 passed. Number of qualified users "

                    + " should be " + nQulaifiedUsers + ". Server reported "
                    + serverP.getNQulaifiedUsers());
        else
            // System.out.println("Test " + kk + " failed. Number of qualified users should be "
            System.out.println("Test 1 failed. Number of qualified users should be "
                    + nQulaifiedUsers + ". Server reported "
                    + serverP.getNQulaifiedUsers());
        verifierWatch.stop();
        proverWatch.stop();
        long end = System.currentTimeMillis();

        System.out.println("Total tests run: 1 . Failed: " + nfails);
        System.out.println("\n  Prover time            Verifier time           Total");
        System.out.println("============================================================");
        System.out.println("    " + (double) proverWatch.getElapsedTime() / 1
                + "                 "
                + (double) verifierWatch.getElapsedTime() / 1
                + "              "
                + ((double) (proverWatch.getElapsedTime()
                + verifierWatch.getElapsedTime())) / 1);
        System.out.println("Note that the time is for all users in ms.");
        System.out.println("Also note that the prover needs to compute proofs"
                + " for both the server and the privacy peer.");
       
        stringInReply += ""+String.valueOf(passed);
     
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("e.getMessage() UserS:"+e.getMessage());
      }
      UserSReply reply = UserSReply.newBuilder().setMessage(stringInReply).build();
      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }
    // // @Override
    // public void SayData(BytesDataSRequest req, StreamObserver<UserSReply> responseObserver) {
    //   UserSReply reply = UserSReply.newBuilder().setMessage("Hello getData").build();
    //   System.out.println("Hello " + req.getData());
    
    //   responseObserver.onNext(reply);
    //   responseObserver.onCompleted();
    // }

   @Override
   public void sayHelloAgain(UserSRequest req, StreamObserver<UserSReply> responseObserver) {
      UserSReply reply = UserSReply.newBuilder().setMessage("Hello again " + req.getName()).build();
      responseObserver.onNext(reply);
        System.out.println(req);
        System.out.println(reply);
     responseObserver.onCompleted();
   }


  }



  private static void printLines(String name, InputStream ins) throws Exception {
    String line = null;
    BufferedReader in = new BufferedReader(
        new InputStreamReader(ins));
    while ((line = in.readLine()) != null) {
        System.out.println(name + " " + line);
    }
  }
  
  private static void runProcess(String command) throws Exception {
    Process pro = Runtime.getRuntime().exec(command);
    printLines(command + " stdout:", pro.getInputStream());
    printLines(command + " stderr:", pro.getErrorStream());
    pro.waitFor();
    System.out.println(command + " exitValue() " + pro.exitValue());
  }


  public static long[] convertToLongArray(String inputString) {
    // String inputString = "Hello World!";
   
    Charset charset = Charset.forName("ASCII");
    byte[] byteArrray = inputString.getBytes(charset);

    long[] data = new long[byteArrray.length-1];
    for (int did = 0; did < byteArrray.length-1; did++) {
        long a = (long) byteArrray[did];
        data[did] = a;
    }
    // System.out.println(data);
    System.out.println("data");
    System.out.println(Arrays.toString(data));
    return data;
}

}

