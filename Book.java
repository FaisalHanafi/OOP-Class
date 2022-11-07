public class Book{
    private String title;
    private int  pages;
    private  String  genre; 
    
    public Book(){
    }
    public Book(String title, int pages, String genre)
    {
        this.title=title;
        this.pages=pages;
        this.genre=genre;
    }
    public String gettitle()
    {
        return title;
    }
    public String getgenre()
    {
        return genre;
    }
    public int getpages()
    {
        return pages;
    }
    public void settitle(String title)
    {
        this.title=title;
    }
    public void setgenre(String genre)
    {
        this.genre=genre;
    }
    public void setpages(int pages)
    {
        this.pages=pages;
    }
    public String toString()
    {
        return " " + title + " " + pages + " " + genre;
    }
}
    

 