package tugas5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<String> listObat = new ArrayList<>();
        List<Integer> listJumlah = new ArrayList<>();

        System.out.println("Selamat Datang di Apotek Fisika Farma! Obat apa yang ingin kamu pesan? Tulis dalam format nama \"obat<spasi>jumlah\" (cth: Panadol 2)");
        Scanner scanner = new Scanner(System.in);

        try{
            while (scanner.hasNextLine()){
                String in = scanner.nextLine();
                if(in.equalsIgnoreCase("end")){
                    break;
                }

                String[] pesanan = in.split("-");
                String obat = pesanan[0];
                int jumlah = Integer.parseInt(pesanan[1]);

                listObat.add(obat);
                listJumlah.add(jumlah);

                System.out.println("\nOke, ada lagi? Bila sudah, Anda bisa menulis \"end\"");
            }

            System.out.println("Baik, saya ulang obat pesanan Anda. Anda memesan obat:");
            for(int i=0; i<listObat.size(); i++){
                System.out.println("- " + listObat.get(i) + " sejumlah " + listJumlah.get(i));
            }
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Maaf, pesanan anda gagal. Mohon masukkan pesanan sesuai format (cth: Panadol-2)");
        }
    }
}
