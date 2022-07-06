public class Stadium{
public Stadium(){
}
private String name;
private String location;
private int entryFees;
private String match;
private int seatNo;

public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public String getLocation(){
	return location;
}
public void setLocation(String location){
	this.location=location;
}
public int getEntryFees(){
	return entryFees;
}
public void setEntryFees(int entryFees){
	this.entryFees=entryFees;
}
public  String getMatch(){
    return match;
}
public void setMatch(String match){
    this.match=match;
}
public int getSeatNo(){
	return seatNo;
}
public void setSeatNo(int seatNo){
	this.seatNo=seatNo;
}
public void watchMatch(){
	System.out.println("High voltage Match");
}

}