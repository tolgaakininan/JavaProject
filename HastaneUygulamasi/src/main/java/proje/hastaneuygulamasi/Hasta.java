package proje.hastaneuygulamasi;

import java.io.Serializable;

public class Hasta extends Kisi implements Serializable {
    private String hastaNo;

    public Hasta(String isim, String soyisim, String yas, String vatandasNo, String hastaNo)
    {
        super(isim, soyisim, yas, vatandasNo);
        this.hastaNo = hastaNo;

    }

    @Override
    public String getIsim() {
        return super.getIsim();
    }

    public String getHastaNo() {
        return hastaNo;
    }

    @Override
    public String getSoyisim() {
        return super.getSoyisim();
    }

    @Override
    public String getVatandasNo() {
        return super.getVatandasNo();
    }

    @Override
    public String getYas() {
        return super.getYas();
    }


    @Override
    public String toString() {
        return bilgileriYazdir();
    }

    @Override
    protected String bilgileriYazdir() {
        return "Hastanın adı: " + isim + " " + soyisim;
    }

}
