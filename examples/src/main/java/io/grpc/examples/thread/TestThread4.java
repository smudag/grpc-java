

// multiple thresds acess same object, problem
public class TestThread4 implements Runnable{
    private int ticketNums = 10;

    @Override
    public void run(){
        while(true){
            if(ticketNums <= 0){
                break;
            }
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--> Obained "+ticketNums);
        }
    }

    public static void main(String[] args){
        TestThread4 t4 = new TestThread4();

        new Thread(t4, "Alice").start();
        new Thread(t4, "Bob").start();
        new Thread(t4, "Cindy").start();
    }
}
