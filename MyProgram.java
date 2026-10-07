public class MyProgram
{
    public int getDiscount(String membershipType, double totalPurchase) {
            if (membershipType.equals("gold") && totalPurchase >= 100){
                return 15;
            }
            else if (membershipType.equals("silver") && totalPurchase >=50){
                return 5;
            }
            else if (membershipType.equals("gold") && totalPurchase >= 50) {
                return 10;
            }
            else {
                return 0;
            }
        }
    public static void main(String[] args)
    {
        MyProgram d = new MyProgram();
        System.out.print(d.getDiscount("gold", 100));
    }
}
