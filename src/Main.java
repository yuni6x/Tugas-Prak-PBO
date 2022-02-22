import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //boolean menu = true;
        System.out.println("===============================");
        System.out.println("|| Program Konversi Suhu Air ||");
        System.out.println("===============================");
        System.out.println("Input Data");
        System.out.println("==========");
        System.out.print("Suhu Dalam Celcius : ");
        double celcius = scanner.nextDouble();
        Konversi konversiAir = new Konversi(celcius);
        while (true) {
        System.out.println("Opsi");
        System.out.println("====");
        System.out.println("1. LIhat Data Konversi");
        System.out.println("2. Edit data konversi");
        System.out.println("3. Exit");
        System.out.print("Pilih : ");
        int pilih = scanner.nextInt();
            switch (pilih) {
                case 1 -> {
                    System.out.println("Suhu Dalam Celcius\t\t : " + konversiAir.celcius + "\u2103");
                    System.out.println("Suhu Dalam Fahrenheit\t : " + konversiAir.fahrenheit + "\u2109");
                    System.out.println("Suhu Dalam Reamur\t\t : " + konversiAir.reamur + "\u00B0R");
                    System.out.println("Suhu Dalam Kelvin\t\t : " + konversiAir.kelvin + "\u212A");
                    System.out.println(konversiAir.kondisiAir);
                    break;
                }
                case 2 -> {
                    System.out.println("\nInput Data");
                    System.out.println("==========");
                    System.out.print("Suhu Dalam Celcius : ");
                    double celciusEdit = scanner.nextDouble();
                    Konversi konversiAirEdit = new Konversi(celciusEdit);
                    System.out.println("Suhu Dalam Celcius\t\t : " + konversiAirEdit.celcius + "\u2103");
                    System.out.println("Suhu Dalam Fahrenheit\t : " + konversiAirEdit.fahrenheit + "\u2109");
                    System.out.println("Suhu Dalam Reamur\t\t : " + konversiAirEdit.reamur + "\u00B0R");
                    System.out.println("Suhu Dalam Kelvin\t\t : " + konversiAirEdit.kelvin + "\u212A");
                    System.out.println(konversiAirEdit.kondisiAir);
                    break;
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Opsi tidak ada. Mohon masukkan opsi yang tersedia");
            }
        }
    }


}
