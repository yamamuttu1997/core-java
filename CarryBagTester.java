class CarryBagTester{

public static void main(String[] args){

CarryBagDTO carry = new CarryBagDTO();
//carry.name="Babu's CarryBag";
//carry.price=5.00;

carry.setName("Babu's CarryBag");
carry.setPrice(5.00);

System.out.println(carry.getName()+" "+carry.getPrice());
}
}