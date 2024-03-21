import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueLL<String> queue = new QueueLL<>();

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("To Do List :");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Hapus Tugas");
            System.out.println("3. Tampilkan Tugas");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan : ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Tambah Tugas: ");
                    String tambahTugas = input.nextLine();

                    queue.addData(tambahTugas);
                    System.out.println();

                    break;
                case 2:
                    String hapusTugas = queue.removeData();
                    System.out.println("Tugas " + hapusTugas + " sudah di hapus");
                    System.out.println();
                    break;

                case 3:
                    // ListIterator<Tugas> iterator = queue.tampilkanQueue();
                    queue.tampilkanQueue();
                    System.out.println();

                    break;
                case 4:
                    System.out.println("Keluar dari aplikasi");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }

    }
}
