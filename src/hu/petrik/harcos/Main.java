package hu.petrik.harcos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
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

    }
}
