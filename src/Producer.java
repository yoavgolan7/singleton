import java.util.Random;

public class Producer implements Runnable{
    @Override
    public void run() {
            Random rnd = new Random();
            Message msg = Message.init();
            for (int i = 0; i < 10; i++) {
                String text = "";
                for (int j = 0; j < 3; j++) {
                    text += (char) ((rnd.nextInt(26)) + (int) 'A');
                }
                msg.insert(text);
        }
    }
}
