package proje.hastaneuygulamasi;

import java.io.Serializable;

public abstract class Kisi implements Serializable {
    protected abstract String bilgileriYazdir();
    protected String isim;
    protected String soyisim;
    protected String yas;
    protected String vatandasNo;

    public Kisi(String isim, String soyisim, String yas, String vatandasNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.vatandasNo = vatandasNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getVatandasNo() {
        return vatandasNo;
    }

    public void setVatandasNo(String vatandasNo) {
        this.vatandasNo = vatandasNo;
    }
}
