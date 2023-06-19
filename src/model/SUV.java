package model;

public class SUV extends Mobil {
    private String merk;
    private int tahunProduksi;

    public SUV() {
        super(1);
    }

    public SUV(String merk, int tahunProduksi) {
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
