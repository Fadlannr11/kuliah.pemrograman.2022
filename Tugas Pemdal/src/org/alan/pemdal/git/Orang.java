package org.alan.pemdal.git;

public class Orang {
    private String nama;
    private String umur;

    public Orang() {
    }

    public Orang(String nama, String umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Orang{" +
                "nama='" + nama + '\'' +
                ", umur='" + umur + '\'' +
                '}';
    }
}
