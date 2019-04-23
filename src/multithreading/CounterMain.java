package multithreading;

public class CounterMain {
    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountDownThread thread1 = new CountDownThread(countdown);
        thread1.setName("Thread 1");

        CountDownThread thread2 = new CountDownThread(countdown);
        thread2.setName("Thread 2");

        CountDownThread thread3 = new CountDownThread(countdown);
        thread3.setName("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class Countdown {

    private int i;

    public void doCountDown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread.1":
                color = ThreadColor.ANSI_CYAN;
                break;

            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;

            case "Thread 3":
                color = ThreadColor.ANSI_BLUE;
                break;

            default:
                color = ThreadColor.ANSI_GREEN;
        }

        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + "" + Thread.currentThread().getName() + " i = " + i);
            }
        }

    }
}


class CountDownThread extends Thread {
    private Countdown threadCountdown;

    public CountDownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountDown();
    }
}