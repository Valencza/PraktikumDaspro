import java.util.Scanner;

public class ifCetakKRS11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // Bentuk IF-ELSE biasa
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu.");
        }

        // Transformasi ke Ternary Operator
        String pesan = uktLunas 
            ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" 
            : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu.";

        System.out.println("\n--- Versi Ternary Operator ---");
        System.out.println(pesan);
    }
}
