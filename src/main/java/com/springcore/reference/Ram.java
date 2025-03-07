package com.springcore.reference;

public class Ram {
    private Geeta geeta;

    public Geeta getGeeta() {
        return geeta;
    }

    public void setGeeta(Geeta geeta) {
        this.geeta = geeta;
    }

    public void doMoreWork(){
        System.out.println("Ram is doing work.....");
        geeta.doWork();
    }

    @Override
    public String toString() {
        return "Ram{" +
                "geeta=" + geeta +
                '}';
    }

}
