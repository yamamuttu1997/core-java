class BeerTester{
public static void main(String[] args){

KingFisher kf=new KingFisher();
kf.price=138.75;
kf.alcoholContent="8%";
kf.quantity="650ml";
kf.mfgDate="april 2022";
kf.expiryDate="best to use before 36 months";
System.out.println(kf.price+"\n"+kf.alcoholContent+"\n"+kf.quantity+"\n"+kf.mfgDate+"\n"+kf.expiryDate);
kf.toGetKick();
}







}