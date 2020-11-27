package eczaneotomasyonu.Tablo;


public class Kozmetik  {
    
    private String ürünadi;
    private String ürünmarkasi;
    private String ürüntür;
    private String ürünkullanimmetni;

    public Kozmetik() {
    }

    public Kozmetik(String ürünadi, String ürünmarkasi, String ürüntür, String ürünkullanimmetni) {
        this.ürünadi = ürünadi;
        this.ürünmarkasi = ürünmarkasi;
        this.ürüntür = ürüntür;
        this.ürünkullanimmetni = ürünkullanimmetni;
    }

    public String getÜrünadi() {
        return ürünadi;
    }

    public void setÜrünadi(String ürünadi) {
        this.ürünadi = ürünadi;
    }

    public String getÜrünmarkasi() {
        return ürünmarkasi;
    }

    public void setÜrünmarkasi(String ürünmarkasi) {
        this.ürünmarkasi = ürünmarkasi;
    }

    public String getÜrüntür() {
        return ürüntür;
    }

    public void setÜrüntür(String ürüntür) {
        this.ürüntür = ürüntür;
    }

    public String getÜrünkullanimmetni() {
        return ürünkullanimmetni;
    }

    public void setÜrünkullanimmetni(String ürünkullanimmetni) {
        this.ürünkullanimmetni = ürünkullanimmetni;
    }

    @Override
    public String toString() {
        return "Kozmetik{" + "\u00fcr\u00fcnadi=" + ürünadi + ", \u00fcr\u00fcnmarkasi=" + ürünmarkasi + ", \u00fcr\u00fcnt\u00fcr=" + ürüntür + ", \u00fcr\u00fcnkullanimmetni=" + ürünkullanimmetni + '}';
    }
    
   }
   

    