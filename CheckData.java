public class CheckData {

    public void CheckD(String data) {

        String[] dataArr = data.split("\\.");
       
        try {
            Integer.parseInt(dataArr[0]);
            Integer.parseInt(dataArr[1]);
            Integer.parseInt(dataArr[2]);
        } catch (NumberFormatException e) {
            throw new MyNumberFormatException(String.
            format("В дате рождения %s присутствуют не только цифры", data));
        }

    }
}