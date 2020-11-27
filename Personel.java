package eczaneotomasyonu.Tablo;

public class Personel {
    private String personeladi;
    private String personelsoyadi;
    private int yas;
    private Long telefonno;
    private Long tcnumarasi;
    
    public Personel() {
    }

    public Personel(String personeladi, String personelsoyadi, int yas, long telefonno, long tcnumarasi) {
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

    public long getTelefonno() {
        return telefonno;
    }

    public void setTelefonno(long telefonno) {
        this.telefonno = telefonno;
    }

    public long getTcnumarasi() {
        return tcnumarasi;
    }

    public void setTcnumarasi(long tcnumarasi) {
        this.tcnumarasi = tcnumarasi;
    }

    @Override // Diğer sınıflardan kalıtım alacağı için kullanıldı.//
    public String toString() {
        return "Personel{" + "personeladi=" + personeladi + ", personelsoyadi=" + personelsoyadi + ", yas=" + yas + ", telefonno=" + telefonno + ", tcnumarasi=" + tcnumarasi + '}';
    }

}