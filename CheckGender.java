public class CheckGender {

    public void CheckG(String gender) {

        if (gender.length() != 1) {
            throw new NameException(String.
            format("В поле %s присутствуют более одного символа", gender));
        } else {
            if (!gender.equals("f") && !gender.equals("m")) {
                throw new NameException(String.format("В поле введены не 'f' или 'm'",
                gender));
            }
        }
    }
}