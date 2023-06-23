package les_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String[]> people = new ArrayList<>();
        System.out.println("Type your last name, name, patronymic name, age and gender: ");
        while (true) {
            String a = iScanner.nextLine();
            if (a.equals("q"))
                break;
            people.add(a.split(" "));
        }
        for (String[] i : people) {
            System.out.printf("%s %s.%s. %s %s\n", i[0], i[1].toUpperCase().charAt(0), i[2].toUpperCase().charAt(0),
                    i[3], i[4]);
        }

        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronymicName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();

        for (String[] i : people) {
            lastName.add(i[0]);
            name.add(i[1]);
            patronymicName.add(i[2]);
            age.add(Integer.parseInt(i[3]));
            gender.add(i[4].toLowerCase().contains("m"));

        }

        String a = iScanner.nextLine();
        if (a.equals("q")) {
            System.exit(0);
        } else {
            people.sort(new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                }
            });
            for (String[] i : people) {
                System.out.printf("%s %s.%s. %s %s\n", i[0], i[1].toUpperCase().charAt(0), i[2].toUpperCase().charAt(0),
                        i[3], i[4]);
            }
        }
    }
}

/*
 * Black Matthew Aaron 25 M
 * Blight Emilia Mike 34 F
 * Smith Maximilian Fred 15 M
 * Lucid Karmen Julio 20 F
 */
