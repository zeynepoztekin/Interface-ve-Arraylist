import java.util.ArrayList;

public class Araba implements Vergi {
    private ArrayList<String> ozellikler;

    public Araba(String marka, String model, String motor) {
        ozellikler = new ArrayList<>();
        ozellikler.add(marka);
        ozellikler.add(model);
        ozellikler.add(motor);
    }


    @Override
    public double vergiHesapla() {
        int motor = Integer.parseInt(ozellikler.get(2));
        return motor < 1000 ? 200: motor <= 2000 ? 900: 1800;
    }

    @Override
    public String toString() {
        return "Arabanin vergisi = " + vergiHesapla() +
                "\r\nArabanin markasi = " + ozellikler.get(0) +
                "\r\nArabanin modeli = " + ozellikler.get(1) +
                "\r\nArabanin motoru (cc olarak) = " + ozellikler.get(2) + "\r\n";
    }
}
