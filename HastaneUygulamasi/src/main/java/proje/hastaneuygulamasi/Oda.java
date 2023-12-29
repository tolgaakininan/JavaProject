package proje.hastaneuygulamasi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Oda implements Serializable {
    private int yatakSayisi;
    private List<Hasta> hastaListesi;

    public Oda(int yatakSayisi) {
        this.yatakSayisi = yatakSayisi;
        this.hastaListesi = new ArrayList<>();
    }

    public boolean bosYerVarMi() {
        return hastaListesi.size() < yatakSayisi;
    }

    public boolean hastaEkle(Hasta hasta) {
        if (bosYerVarMi()) {
            hastaListesi.add(hasta);
            return true;
        }
        return false;
    }

    public int getYatakSayisi() {
        return yatakSayisi;
    }

    public int getHastaSayisi() {
        return hastaListesi.size();
    }

    public List<Hasta> getHastaListesi() {
        return new ArrayList<>(hastaListesi);
    }

    public void setYatakSayisi(int yeniYatakSayisi) {
        this.yatakSayisi = yeniYatakSayisi;
    }

    @Override
    public String toString() {
        return "Yatak sayısı: " + yatakSayisi;
    }
}