public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //Counting Up
        for (int i=0;i<10;i++){
            System.out.println("Thread #2: "+i);
            try {
                //Pause for 1000 milliseconds between each iteration
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #2 is finished!");
    }
    }

