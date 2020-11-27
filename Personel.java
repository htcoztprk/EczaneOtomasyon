package eczaneotomasyonu.Tablo;

public class Personel {
    private String personeladi;
    private String personelsoyadi;
    private int yas;
    private Long telefonno;
    private Long tcnumarasi;

    public Personel() {
    }

    public Personel(String personeladi, String personelsoyadi, int yas, Long telefonno, Long tcnumarasi) {
        this.personeladi = personeladi;
        this.personelsoyadi = personelsoyadi;
        this.yas = yas;
        this.telefonno = telefonno;
        this.tcnumarasi = tcnumarasi;
    }

    public String getPersoneladi() {
        return personeladi;
    }

    public void setPersoneladi(String personeladi) {
        this.personeladi = personeladi;
    }

    public String getPersonelsoyadi() {
        return personelsoyadi;
    }

    public void setPersonelsoyadi(String personelsoyadi) {
        this.personelsoyadi = personelsoyadi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Long getTelefonno() {
        return telefonno;
    }

    public void setTelefonno(Long telefonno) {
        this.telefonno = telefonno;
    }

    public Long getTcnumarasi() {
        return tcnumarasi;
    }

    public void setTcnumarasi(Long tcnumarasi) {
        this.tcnumarasi = tcnumarasi;
    }

    @Override // Nesnenin diðer sýnýflardan kalýtým almasýný saðlar.//
    public String toString() {
        return "Personel{" + "personeladi=" + personeladi + ", personelsoyadi=" + personelsoyadi + ", yas=" + yas + ", telefonno=" + telefonno + ", tcnumarasi=" + tcnumarasi + '}';
    }
    
}
    

   