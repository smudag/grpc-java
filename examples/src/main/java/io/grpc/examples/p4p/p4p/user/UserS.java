package io.grpc.examples.p4p.p4p.user;

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

  /**
   * Main launches the server from the command line.
   */
  public static void main(String[] args) throws IOException, InterruptedException {
    final UserS server = new UserS();
    server.start();
    System.out.println("UserS start !!");
    server.blockUntilShutdown();
  }


  static class UserSImpl extends UserSGrpc.UserSImplBase {

    @Override
    public void sayHello(UserSRequest req, StreamObserver<UserSReply> responseObserver) {
      UserSReply reply = UserSReply.newBuilder().setMessage("Zero Knowledge Module[java] received: " + req.getName()).build();
      try {
        // runProcess("javac Main.java");
          System.out.println("Client Input: " + req.getName());
          convertToByteArray(req.getName());
      } catch (Exception e) {
        e.printStackTrace();
      }
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


  public static void convertToByteArray(String inputString) {
    // String inputString = "Hello World!";
   
    Charset charset = Charset.forName("ASCII");
    byte[] byteArrray = inputString.getBytes(charset);
    System.out.println("byteArrray");
    System.out.println(Arrays.toString(byteArrray));
}

}

