public class Message {
    private String message; private Boolean isEmpty; private static Message m=null;
    public static Message init(){
        if(m==null) {
            m = new Message("");
            return m;
        }
        else
        {
            return m;
        }

    }
    private Message(String msg){
        message = msg;
        if (message=="")
        {
            isEmpty=true;
        }
        else isEmpty=false;
    }

    public synchronized void insert(String text)
    {
        while(!isEmpty)
        {
            try{
             this.wait();
        }
         catch (InterruptedException e){}
        }
        message=text;
        isEmpty=false;
        this.notify();

    }
    public synchronized void remove()
    {

        while(isEmpty)
        {
            try
            {
                this.wait();
            }
            catch (InterruptedException e){}
        }
        System.out.println(message);
        message="";
        isEmpty=true;
        this.notify();
    }
    public Boolean isEmpty(){
        return isEmpty;
    }
    public String getMessage(){
        return message;
    }
}
