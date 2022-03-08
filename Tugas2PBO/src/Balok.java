
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi, hasilVol, hasilLuasP;

    public Balok(double panjang, double lebar, double tinggi){
        super(panjang , lebar);
        tinggi = tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPr() {
        return 2 * (super.hitungLuas() + (super.getLebar() * tinggi) + (super.getPanjang() * tinggi));
    }
}
