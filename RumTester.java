class RumTester{

public static void main(String[] args){

OldMonk old = new OldMonk();
old.price=440.00;
old.alcoholContent="42.8%";
old.quantity="750ml";
old.mfgDate="2 April 2022";
old.expiry="Best before 36 months";
System.out.println(old.price +"\n "+old.alcoholContent +" "+old.quantity+" "+old.mfgDate+" "+old.expiry);
old.toGetKick();
}



}