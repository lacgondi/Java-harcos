package hu.petrik.harcos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Harcos> hList = new ArrayList<>();
        hList.add(new Harcos("Walter White", 2));
        hList.add(new Harcos("Patrick Bateman", 3));
        hList.add(new Harcos("Lou Bloom", 1));

        File fileName = new File("harcosok.csv");
        Scanner scR = null;
        try {
            scR = new Scanner(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scR.hasNextLine()){
            String[] temp = scR.nextLine().split(";");
            hList.add(new Harcos(temp[0],Integer.parseInt(temp[1])));
        }
        for (int i = 0; i < hList.size(); i++) {
            System.out.println(hList.get(i).toString());
        }

        System.out.println("A Játék kezdete________________________");
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a karaktere nevét: ");
        String name = sc.nextLine();
        System.out.print("Adja meg melyik karakter sablont szeretné használni(1)");
        int template = sc.nextInt();

        Harcos player = new Harcos(name, template);

        String option = null;
        while (!option.equals("q")){
            for (int i = 0; i < hList.size(); i++) {
                System.out.println(i+1+" - "+hList.get(i).toString());
            }
            System.out.println("Válassz egy opciót\n\tCsata egy harcossal (1)\n\tGyógyulás (2)\n\tKilépés (q)");
            option=sc.nextLine().toLowerCase();

        }
    }
}
