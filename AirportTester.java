class AirportTester{
public static void main(String[] args){

Airport air=new Airport();
air.setName("Kempegowda international Airport");
air.setLocation("Bengaluru");
air.setType("International");
air.setTaxiLane(true);
air.setAvrgFlightLanding(731);

System.out.println(air.getName()+" "+air.getLocation()+" "+air.getType()+" "+air.getTaxiLane()+" "+air.getAvrgFlightLanding());
air.buyTicket();
}

}