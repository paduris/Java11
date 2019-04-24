package multithreading.messages;


// Producer - Consumer related issues

import java.util.Random;

public class WaitNotifyProducerConsumer {
    public static void main(String[] args) {

        Message message = new Message();
        new Thread(new Writer(message)).start();
        new Thread(new Reader(message)).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;


    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = false;
        notifyAll();
        this.message = message;
    }

}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        String[] msg = {"First Message, \n" +
                "Second Message,\n" +
                "Third Message\n" +
                "Fourth Message "};

        Random random = new Random();

        for (int i = 0; i < msg.length; i++) {

            message.write(msg[i]);

            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message.write("Write Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        for (String latestMsg = message.read(); !latestMsg.equals("Write Finished"); latestMsg = message.read()) {

            System.out.println(latestMsg);

            try {
                Thread.sleep(new Random().nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}