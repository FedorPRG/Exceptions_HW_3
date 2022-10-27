public class CheckTel {

    public void CheckT(String tel) {
        
        try {
            Integer.parseInt(tel);
        } catch (NumberFormatException e) {
            throw new MyNumberFormatException(String.
            format("В номере телефона %s присутствуют не только цифры", tel));
        }

    }
}