package Post.model;

import java.util.ArrayList;
import java.util.List;

public class HardCodedPostHandler implements PostDataHandler {

  @Override
  public List<PostBox> getFavoritePosts() {
    List<PostBox> Posts = new ArrayList<PostBox>();

    /*Posts.add(new PostBox("Proverbs", 344, 5));
    Posts.add(new PostBox("Doc. & Cov.", 11888, 10));
    Posts.add(new PostBox("John", 7, 17));*/

    return Posts;
  }
}