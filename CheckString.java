public class CheckString {

    public void CheckS(String str, String text) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new NameException(String.format("В %s %s присутствуют цифры", text, str));
            }
        }
    }
}