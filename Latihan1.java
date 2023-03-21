package Modul2;

import java.util.ArrayList;

public class Latihan1 {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan : ");
        System.out.println(Hewan);

        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        for (String warna : DeleteHewan){
            Hewan.remove(warna);
        }

        System.out.println("\nHewan yang dihapus: ");
        System.out.println(DeleteHewan);

        System.out.println("\nOutput Hewan : ");
        System.out.println(Hewan);
    }
}
