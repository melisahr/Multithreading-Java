public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Multithreading = process of executing multiple threads simultaneously

        //Method1: Create a subclass of Thread
            MyThread thread1 = new MyThread();

        //Method2: Implement Runnable interface and pass instance as an argument to Thread()
            //An instance for MyRunnable
            MyRunnable runnable= new MyRunnable();
            //Create an object for thread2 and add runnable as an argument
            Thread thread2 = new Thread(runnable);

            /*Set the Daemon thread
                thread1.setDaemon(true);
                thread2.setDaemon(true);*/

            thread1.start();
            //join()=calling thread(ex main) wait until the specified thread dies
            //Wait 3seconds before thread2 to start
            thread1.join(3000);
            thread2.start();

        //Cause an ArithmeticException
            //System.out.println(1/0);
    }
}