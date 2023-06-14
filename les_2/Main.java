package les_2;

import java.util.Arrays;

/* Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

 */

public class Main {
    public static void main(String[] args) {
        String s = "name, Ivanov, country, Russia, city, Moscow, age, null";
        String[] strings = s
                .replaceAll("\\p{P}", "")
                .split(" ");
        StringBuilder builder = new StringBuilder();

        builder.append(strings[0]).append(" = ").append("\"").append(strings[1]).append("\", ")
                .append(strings[2]).append(" = ").append("\"").append(strings[3]).append("\", ")
                .append(strings[4]).append(" = ").append("\"").append(strings[5]).append("\", ")
                .append(strings[6]).append(" = ").append("\"").append(strings[7]).append("\"");

        System.out.println(builder);

    }
}
