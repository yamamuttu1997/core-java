public class Novel{

public Novel(){
}

private String name;
private int price;
private String author;
private int pages;
private String publisher;

//getter and setter
public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public int getPrice(){
	return price;
}
public void setPrice(int price){
	this.price=price;
}
public String getAuthor(){
	return author;
}
public void setAuthor(String author){
	this.author=author;
}
public int getPages(){
	return pages;
}
public void setPages(int pages){
	this.pages=pages;
}
public String getPublisher(){
	return publisher;
}
public void setPublisher(String publisher){
this.publisher=publisher;
}
 void readNovel(){
	 System.out.println("Habbit of reading Novel is Good");
 }


}




