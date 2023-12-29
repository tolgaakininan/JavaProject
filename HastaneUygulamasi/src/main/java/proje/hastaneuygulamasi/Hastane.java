package proje.hastaneuygulamasi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hastane implements HastaIsleri, Serializable {
    private List<Oda> odaListesi;
    public Hastane() {
        this.odaListesi = new ArrayList<>();
    }

    public void odaEkle(Oda oda) {
        odaListesi.add(oda);
    }


    public List<Oda> getOdaListesi() {
        return new ArrayList<>(odaListesi);
    }

    @Override
    public boolean hastaYerlestir(Hasta hasta, Oda oda) {
        for (Oda o : odaListesi) {
            if (o == oda && o.bosYerVarMi()) {
                return o.hastaEkle(hasta);
            }
        }
        return false;
    }

    @Override
    public boolean hastaTaburcu(Oda oda, Hasta hasta) {
        for (Oda o : odaListesi) {
            if (o == oda && o.getHastaListesi().contains(hasta)) {
                o.getHastaListesi().remove(hasta);
                return true;
            }
        }
        return false;
    }
}