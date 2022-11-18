import java.util.ArrayList;

public class Calisan implements Vergi, UcretliSigorta {
    ArrayList<String> ozellikler;

    public Calisan(String isim, String sigortaNo, String maas) {
        ozellikler = new ArrayList<>();
        ozellikler.add(isim);
        ozellikler.add(sigortaNo);
        ozellikler.add(maas);
    }

    @Override
    public double vergiHesapla() {
        int maas = Integer.parseInt(ozellikler.get(2));
        return maas < 33800 ? maas*0.2 : maas*0.4;
    }

    @Override
    public double sigortaHesapla() {
        int maas = Integer.parseInt(ozellikler.get(2));
        return maas/52 < 352 ? 0.0 : maas*0.04;
    }

    @Override
    public String toString() {
        return "Ucretli Sigorta = " + sigortaHesapla() +
                "\r\nVergi = " + vergiHesapla() +
                "\r\nKisinin adi = " + ozellikler.get(0) +
                "\r\nSigorta Numarasi = " + ozellikler.get(1) + "\r\n";
    }
}
