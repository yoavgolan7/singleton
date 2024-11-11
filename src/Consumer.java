public class Consumer implements Runnable{
    @Override
    public void run(){
        Message msg = Message.init();
        for(int i=0;i<10;i++) {
            msg.remove();
        }


    }
}
