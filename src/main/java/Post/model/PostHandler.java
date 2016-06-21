package Post.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PostHandler implements PostDataHandler {

     private String fileName;

     public PostHandler(String fileName) {
          this.fileName = fileName;
     }

     public String getFileName() {
          return fileName;
     }

     public void setFileName(String fileName) {
          this.fileName = fileName;
     }
 
     public void addPost(PostBox scripture) {
          try {
               BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName(), true));
               writer.write(scripture.toFileString() + "\n");
               writer.close(); 

          } catch (IOException e) {
               e.printStackTrace();
          }
     }

     @Override
     public List<PostBox> getFavoritePosts() {
          List<PostBox> list = new ArrayList<PostBox>();

          try {
               BufferedReader reader = new BufferedReader(new FileReader(getFileName()));

               String line;

               while ((line = reader.readLine()) != null) {
                    PostBox post = new PostBox();
                    post.loadFromFileString(line);
                    list.add(post);
               }

          } catch (IOException e) {
               e.printStackTrace();
          }
          
          //RPH GIVING ATTEMPT TO REVERSE THE LIST
          //RPH http://www.tutorialspoint.com/java/util/collections_reverse.htm
          Collections.reverse(list);

          return list;
     }
} 