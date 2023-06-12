package model;

public class Engine {
    private int cc;
    private String merk;

    public Engine() {
    }

    public Engine(int cc, String merk) {
        this.cc = cc;
        this.merk = merk;
    }
    public void on(){
        System.out.println("Mesin dihidupkan");
    }
    public void off(){
        System.out.println("Mesin dimatikan");
    }
    public int getCc() {
        return this.cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

}
