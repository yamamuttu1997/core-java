class NovelTester{
public static void main(String[] args){

Novel novel = new Novel();
novel.setName("Yaana");
novel.setPrice(200);
novel.setAuthor("S L Bhairappa");
novel.setPages(218);
novel.setPublisher("Sahitya Bhandara");

System.out.println(novel.getName()+" "+novel.getPrice()+" "+novel.getAuthor()+" "+novel.getPages()+" "+novel.getPublisher());
novel.readNovel();
}
}