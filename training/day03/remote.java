
 package com.trimindtech.training.day03;

public class remote {

    private int channel;
    private int volume;
    private boolean tvon;



    public void raisethevaluem(){
        this.volume++;
        System.out.println("raise the valuem" +this.volume);

    }
    public void lowerthevaluem(){
        this.volume--;
        System.out.println("lower the valuem"+this.volume);


    }
    public void incresmthechannel(){
        this.channel++;
        System.out.println("increse the channel"+this.channel);

    }
    public void decresthevaluem(){
        this.volume--;
        System.out.println("decreased volume "+this.volume);
    }
    public void tvon(){
        if(tvon == true){
            System.out.println("tv is alredy on");
            return;
        }
        this.tvon= true;
        System.out.println("tvon");

    }
}
