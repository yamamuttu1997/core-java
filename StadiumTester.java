class StadiumTester{
public static void main(String[] args){

Stadium stadium=new Stadium();
stadium.setName("Chinnaswamy");
stadium.setLocation("Bengaluru");
stadium.setEntryFees(1999);
stadium.setMatch("CSK VS RCB");
stadium.setSeatNo(235);

System.out.println(stadium.getName()+" "+stadium.getLocation()+" "+stadium.getEntryFees()+" "+stadium.getMatch()+" "+stadium.getSeatNo());
stadium.watchMatch();
}

}
