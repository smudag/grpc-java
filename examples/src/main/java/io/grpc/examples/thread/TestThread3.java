

public class TestThread3 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++){
            System.out.println("Coding: "+i);
        }
    }

    public static void main(String[] args){
        TestThread3 thread3 = new TestThread3();

        // create thread object
        // Thread thread = new Thread(thread3);
        // thread.start();
        new Thread(thread3).start();
        
        for(int i = 0; i < 100; i++){
            System.out.println("Learning: "+i);
        }
    }

}
