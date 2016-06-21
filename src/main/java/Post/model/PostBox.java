
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Post.model;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author robert
 */
public class PostBox {
  private String myPost;
  private String chapter;
  private String verse;
  //private int verse;

  public PostBox(){
    setMyPost("");
    setChapter("");
    //setVerse(1);
    setVerse("");
  }

  public PostBox(String book, String chapter, String verse) {

    this.setMyPost(book);

    this.setChapter(chapter);
    //this.setChapter(strftime(buf, sizeof(buf), "%Y-%m-%d.%X", &tstruct));
    //this.setChapter("%1$s %2$tB %2$td, %2$tY");
    
    this.setVerse(verse);
    //this.setMyPost("%1$s, %2$tB, %2$td, %2$tY");
    SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss MM-dd-yyyy");
    String data = df.format(new Date());
    this.setVerse(data);
  }

  public String getMyPost() {
    return myPost;
  }

  public void setMyPost(String myPost) {
    this.myPost = myPost;
  }

  public String getChapter() {
    return chapter;
  }

  public void setChapter(String chapter) {
    this.chapter = chapter;
  }

  //public int getVerse() {
  public String getVerse() {
    return verse;
  }

  // public void setVerse(int verse) {
  public void setVerse(String verse) {
    this.verse = verse;
  }
  
  //added later by RPH
  public String toFileString() {
            return myPost + "," + chapter + "," + verse;
     }

 
     public void loadFromFileString(String str) {
            // TODO: Validation should be done here
            String[] parts = str.split(",");

 
            myPost = parts[0];
            //chapter = Integer.parseInt(parts[1]);
            chapter = parts[1];
            verse = parts[2];
            //verse = Integer.parseInt(parts[2]);
     }
  @Override
    public String toString() {
      return "\"" + myPost + "\", written by: " + chapter + " on: " + verse;
    }
  
  
}
