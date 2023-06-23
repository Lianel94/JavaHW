package les_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


/* Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов. */

public class Main {

    public static void main(String[] args) {
        addPerson("Petrov", "89221947845");
        addPerson("Ivanova", "8954845654");
        addPerson("Petrov", "89568456842");
        addPerson("Ivanova", "89475612856");
        addPerson("Petrov", "89221947845");
        addPerson("Sidorov", "8521456987");

        printPhBook();
    }

    public static HashMap<String, ArrayList<String>> pBook = new HashMap<String, ArrayList<String>>();

    public static void addPerson(String name, String number) {
        if (pBook.containsKey(name)) {
            ArrayList<String> phones = pBook.get(name);
            phones.add(number);
            pBook.put(name, phones);
        } else {
            ArrayList<String> phones = new ArrayList<String>();
            phones.add(number);
            pBook.put(name, phones);
        }
    }

    public static void printPhBook() {
        ArrayList<Map.Entry<String, ArrayList<String>>> lst = new ArrayList<>(pBook.entrySet());

        Collections.sort(lst, new Comparator<Map.Entry<String, ArrayList<String>>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList<String>> o1, Map.Entry<String, ArrayList<String>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });

        for(Map.Entry<String, ArrayList<String>> entry : lst){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}