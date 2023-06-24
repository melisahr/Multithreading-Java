public class MyThread extends Thread{
    @Override
    public void run(){
        //Counting Down
        for (int i=10;i>0;i--){
            System.out.println("Thread #1: "+i);
            try {
                //Pause for 1000 milliseconds between each iteration
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //Cause an ArithmeticException
            //System.out.println(1/0);
        }
        System.out.println("Thread #1 is finished!");
    }
}
