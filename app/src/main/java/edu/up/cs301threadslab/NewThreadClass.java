package edu.up.cs301threadslab;

import java.util.Random;

public class NewThreadClass extends Thread {
  //  private AnimationView myAV;

    private StarAnimation myAnimation;

    public NewThreadClass(StarAnimation newStarAnimation){
        this.myAnimation = newStarAnimation;
    }

  //  public NewThreadClass(){}

    @Override
    public void run(){
        while(true){
          //  myAV.postInvalidate();
            Random rand = new Random();
            int randomStar = rand.nextInt(2);
            try {
                if(randomStar == 0){
                    myAnimation.removeStar();
                }
                else{
                    myAnimation.addStar();
                }
                Thread.sleep(2);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
