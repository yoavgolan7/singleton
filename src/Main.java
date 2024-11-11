// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Runnable produce = new Producer();
        Thread pThr = new Thread(produce);
        Runnable consume = new Consumer();
        Thread cThr = new Thread(consume);
        pThr.start();
        cThr.start();
        try {pThr.join();}
        catch(InterruptedException e){}
        try {cThr.join();}
        catch(InterruptedException e){}
        System.out.println("all done");
    }
}