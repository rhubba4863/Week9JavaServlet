/*package scriptures.model;

import java.util.ArrayList;
import java.util.List;

public class PostDataHandler {

  public List<Scripture> getFavoritePosts() {
    List<Scripture> scriptures = new ArrayList();

    scriptures.add(new PostBox("Proverbs", 3, 5));
    scriptures.add(new PostBox("Doc. & Cov.", 112, 10));
    scriptures.add(new PostBox("John", 7, 17));

    return scriptures;
  }
}*/

package Post.model;

import java.util.List;

public interface PostDataHandler {
  public List<PostBox> getFavoritePosts();
}