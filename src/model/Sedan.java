package model;

public class Sedan extends Mobil{
    private String merk;
    private int tahunProduksi;

    public Sedan() {
        super();
    }

    public Sedan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahunProduksi() {
        return this.tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

}
