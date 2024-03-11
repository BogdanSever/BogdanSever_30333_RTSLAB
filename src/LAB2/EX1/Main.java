package LAB2.EX1;

public class Main {
    private static final int noOfThreads=6;
    private static final int processorLoad=1000000;

    public static void main(String args[]){
        Window win=new Window(noOfThreads);

        for(int i =0; i<noOfThreads; i++){
            Fir f = new Fir(i, win, processorLoad);
            f.addObserver(win);
            f.start(i + 2);
        }
    }
}