package eczaneotomasyonu.Tablo;

public class FaturaIslem  {
    
    private String ilac_no;
    private String fiyat;

    public FaturaIslem() {
    }

    public FaturaIslem(String ilac_no, String fiyat) {
        this.ilac_no = ilac_no;
        this.fiyat = fiyat;
    }

    public String getIlac_no() {
        return ilac_no;
    }

    public void setIlac_no(String ilac_no) {
        this.ilac_no = ilac_no;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "FaturaIslem{" + "ilac_no=" + ilac_no + ", fiyat=" + fiyat + '}';
    }
    
}
   