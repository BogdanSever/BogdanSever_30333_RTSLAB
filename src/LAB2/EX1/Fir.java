package LAB2.EX1;

import java.util.Observable;

public class Fir extends Observable implements Runnable {
    public int id;
    public int processorLoad;
    public int c = 0;
    public Window win;
    public Thread t;

    Fir(int id, Window win, int procLoad){
        this.id = id;
        this.win = win;
        this.processorLoad = procLoad;
    }

    public void start(int priority){
        if(t == null){
            t = new Thread(this);
            t.start();
            t.setPriority(priority);
        }
    }

    public void run(){
        while(c < 1000 ){
            for(int j=0; j < this.processorLoad; j++){
                j++;
                j--;
            }

            c++;
            this.setChanged();
            this.notifyObservers();

            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getId() {
        return id;
    }

    public int getC() {
        return c;
    }
}
