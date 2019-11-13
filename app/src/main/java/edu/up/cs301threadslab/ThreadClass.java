package edu.up.cs301threadslab;

public class ThreadClass extends Thread {
    private AnimationView myAV;
    private boolean isAlwaysTrue = true;

    public ThreadClass(AnimationView newAV){
        this.myAV = newAV;
    }

    @Override
    public void run(){
        while(true){
            myAV.postInvalidate();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
