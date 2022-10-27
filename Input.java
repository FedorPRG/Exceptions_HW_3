import java.util.Scanner;

public class Input {
    
    public String[] Inp() {
        String[] strExc = new String[1];
         Scanner input = new Scanner(System.in);
        System.out.println(
                "Введите Фамилию, Имя, Отчество, дату рождения(dd.mm.yyyy), номер телефона, пол(f или m) через пробел");
        String[] str = input.nextLine().split(" ");
        if (str.length != 6) {
            if (str.length < 6) {
                strExc[0] = "-1";
                return strExc;
            }
            if (str.length > 6) {
                strExc[0] = "-2";
                return strExc;
            }
        }
        return str;
    }
}
