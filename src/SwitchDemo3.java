public class SwitchDemo3 {

    public static void main(String[] args) {


        double price = 1.99;
        double discount = 0;
        String condition = "used";
        switch (condition) {
            case "damaged":
                discount = price * 0.1;
                System.out.print(discount);
                break;
            case "used":
                discount = price*0.2;
                System.out.print(discount);
                break;
            default:
                discount = price;
                System.out.print(discount);
        }






    }






}
