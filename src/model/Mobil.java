package model;

public class Mobil {
    private int status;

    public Mobil() {
    }

    public Mobil(int status) {
        this.status = status;
    }

    public void start(Engine e){
        e.on();
    }
    public void stop(Engine e){
        e.off();
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}