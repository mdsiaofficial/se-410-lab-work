class Message1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("This is from message 1");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

class Message2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("This is from message 2");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

public class ThreadTask {
    public static void main(String[] args) {
        Message1 m1 = new Message1();
        Message2 m2 = new Message2();
        m1.start();
        m2.start();
    }
}