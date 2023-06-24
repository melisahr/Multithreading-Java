# Multithreading-Java

Overview:

I followed along a YouTube video that helped me understand the concept of multithreading in Java.
A multithreading is a process of executing multiple threads at the same time.
To create a thread, there are two methods that can accomplish this. In one method, I did a for 
loop to count down. In the second method, I did a for loop to count up. 
Both the for methods has a sleep method of 1000 milliseconds and a try-catch block surrounding it. 
A join method is included to pause one thread until the other finished. And a daemon thread and a
ArithmeticException was include but commented out. 

How:

Method 1:
Creating a thread can be done by making a subclass of Thread. In its run method,
its override and the for loop is added inside it. Then an instance is created in the Main. 
To prove that a thread is run independently, a Arithmetic exception is added. 

Method 2:
Creating a thread can be done by making a class with an implement Runnable.
The run method is also override and a for loop is added.
In the Main, an instance is created for the runnable class and a second thread is made.
In the second instance thread, the runnable instance is pass as an argument of the thread. 

Both the thread each has a start method but in between a join method is added and invoked a throw declaration.
The join method will pause until a specified thread finished. In this case,
thread1 starts first but after 3 seconds thread2 begins. A Daemon thread
is include, it converts the two threads from user thread into a daemon thread.
The JVM ignores daemon thread; therefore, the counts up/down isn't exceuted
but the exception is still there. 
