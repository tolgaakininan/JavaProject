package proje.hastaneuygulamasi;

import java.io.Serializable;

public class Bakici extends Kisi implements Serializable {
    private int bakiciNo;

    public Bakici(String isim, String soyisim, String yas, String vatandasNo, int bakiciNo) {
        super(isim, soyisim, yas, vatandasNo);
        this.bakiciNo = bakiciNo;
    }

    @Override
    protected String bilgileriYazdir() {
        return "zort";
    }
}
