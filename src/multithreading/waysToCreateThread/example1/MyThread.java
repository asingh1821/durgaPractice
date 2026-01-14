package multithreading.waysToCreateThread.example1;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("thread running is: " + Thread.currentThread().getName());
    }
}
