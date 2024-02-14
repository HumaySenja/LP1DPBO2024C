import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static void printAnggotaDPR(ArrayList<Human> humanList) {
        int panjangnama = 0;
        int panjangid = 0;
        int panjangpartai = 0;
        int panjangbidang = 0;
        for (int i = 0; i < humanList.size(); i++) {
            if(humanList.get(i).get_name().length() > panjangnama)
            {
                panjangnama = humanList.get(i).get_name().length();
            }
            if(humanList.get(i).get_id().length() > panjangid)
            {
                panjangid = humanList.get(i).get_id().length();
            }
            if(humanList.get(i).get_partai().length() > panjangpartai)
            {
                panjangpartai = humanList.get(i).get_partai().length();
            }
            if(humanList.get(i).get_bidang().length() > panjangbidang)
            {
                panjangbidang = humanList.get(i).get_bidang().length();
            }
        }
        int panjangsemua = panjangnama + panjangid + panjangpartai + panjangbidang;

        System.out.println("\nDaftar Anggota DPR");
        for (int i = 0 ; i< panjangsemua + 17 ; i++)
        {
            System.out.print("-");
        }
        System.out.print("\n");
        for (int i = 0; i < humanList.size(); i++) {
            System.out.print("| " + (i + 1) + " | ");

            System.out.print(humanList.get(i).get_name());
            for (int j = 0 ; j < panjangnama - humanList.get(i).get_name().length(); j++)
            {
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(humanList.get(i).get_id());
            for (int j = 0 ; j < panjangid - humanList.get(i).get_id().length(); j++)
            {
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(humanList.get(i).get_partai());
            for (int j = 0 ; j < panjangpartai - humanList.get(i).get_partai().length(); j++)
            {
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(humanList.get(i).get_bidang());
            for (int j = 0 ; j < panjangbidang - humanList.get(i).get_bidang().length(); j++)
            {
                System.out.print(" ");
            }
            System.out.print(" |");
            
            System.out.print("\n");
        }
        for (int k = 0 ; k< panjangsemua + 17 ; k++)
            {
                System.out.print("-");
            }
            System.out.print("\n");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n = 0;
        String name;
        String id;
        String partai;
        String bidang;

        ArrayList<Human> humanList = new ArrayList<>();

        System.out.println("Ketikan jumlah anggota DPR yang mau diinput");
        n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            Human temp = new Human();

            System.out.println("Ketikan nama, id, partai dan bidang:");
            name = scanner.next();
            id = scanner.next();
            partai = scanner.next();
            bidang = scanner.next();

            temp.set_name(name);
            temp.set_id(id);
            temp.set_partai(partai);
            temp.set_bidang(bidang);

            humanList.add(temp);
        }

        printAnggotaDPR(humanList);

        int input = 0;
        do {
            System.out.println("\n1. Tambah Anggota DPR");
            System.out.println("2. Update Anggota DPR");
            System.out.println("3. Hapus Anggota DPR");
            System.out.println("4. End program");
            System.out.println("Ketikan pilihan:");

            input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Ketikan jumlah anggota DPR yang mau diinput");
                    n = scanner.nextInt();
                    System.out.println("Ketikan nama, id, partai dan bidang:");
                    for (i = 0; i < n; i++) {
                        Human temp = new Human();

                        name = scanner.next();
                        id = scanner.next();
                        partai = scanner.next();
                        bidang = scanner.next();

                        temp.set_name(name);
                        temp.set_id(id);
                        temp.set_partai(partai);
                        temp.set_bidang(bidang);

                        humanList.add(temp);
                    }
                    break;

                case 2:
                    int indexToUpdate;
                    System.out.println("Ketikan indeks anggota DPR yang mau diubah:");
                    indexToUpdate = scanner.nextInt();
                    System.out.println("Ketikan nama, id, partai dan bidang yang baru:");
                    name = scanner.next();
                    id = scanner.next();
                    partai = scanner.next();
                    bidang = scanner.next();

                    humanList.get(indexToUpdate - 1).set_name(name);
                    humanList.get(indexToUpdate - 1).set_id(id);
                    humanList.get(indexToUpdate - 1).set_partai(partai);
                    humanList.get(indexToUpdate - 1).set_bidang(bidang);
                    break;

                case 3:
                    int indexToRemove;
                    System.out.println("Ketikan indeks anggota DPR yang mau dihapus:");
                    indexToRemove = scanner.nextInt();

                    if (indexToRemove >= 1 && indexToRemove <= humanList.size()) {
                        humanList.remove(indexToRemove - 1);
                        System.out.println("Anggota tersebut berhasil dihapus.");
                    } else {
                        System.out.println("indeks tidak ditemukan");
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("masukkan tidak valid");
                    break;
            }

            if (input != 4)
            {
                printAnggotaDPR(humanList);
            }
            

        } while (input != 4);

        scanner.close();
    }
}
