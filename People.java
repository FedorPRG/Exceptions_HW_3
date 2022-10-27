public class People {
    private String surname;
    private String name;
    private String patronymic;
    private String data;
    private Integer tel;
    private Character s;

    public People(String surname, String name, String patronymic, String data, Integer tel, Character s) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.data = data;
        this.tel = tel;
        this.s = s;
    }

    public String Get_Surname() {
        return surname;
    }

    public String GetFullName() {
        return surname + " " + name + " " + patronymic + " " + data + " " + tel + " " + s;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %d %c", this.surname, this.name,
                this.patronymic, this.data, this.tel, this.s);
    }

}
