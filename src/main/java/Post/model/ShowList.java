package Post.model; 

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Post.model.PostHandler;
import Post.model.HardCodedPostHandler;

import Post.model.PostBox;
import Post.model.PostDataHandler;

/**
 * Servlet implementation class ShowList
 */
@WebServlet("/ShowList")
public class ShowList extends HttpServlet {
       private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#HttpServlet()
    */
   public ShowList() {
       super();
       // TODO Auto-generated constructor stub
   }

      /**

       * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

       */
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           /*METHOD 1 -- OTHER CHANGES ALSO NEEDED
           List<String> scriptures = new ArrayList<String>();
           scriptures.add("Proverbs 3:5");
           scriptures.add("Doc. &amp; Cov. 112:10");
           scriptures.add("John 87:17");

           request.setAttribute("scriptures", scriptures);
           request.getRequestDispatcher("scriptureList.jsp").forward(request,response);*/
           
           /*METHOD 2 -- OTHER CHANGES ALSO NEEDED
           List<Scripture> scriptures = new ArrayList<Scripture>();
            scriptures.add(new PostBox("Proverbs", 3, 5));
            scriptures.add(new PostBox("Doc. & Cov.", 112, 10));
            scriptures.add(new PostBox("John", 7, 17));

            request.setAttribute("scriptures", scriptures);

            request.getRequestDispatcher("scriptureList.jsp").forward(request, response);*/
           
           /*METHOD 3 -- OTHER CHANGES ALSO NEEDED
            PostDataHandler handler = new PostDataHandler();
            request.setAttribute("scriptures", handler.getFavoritePosts());

            request.getRequestDispatcher("scriptureList.jsp").forward(request, response);*/
           
           /*METHOD 3 -- OTHER CHANGES ALSO NEEDED
            PostDataHandler handler = new HardCodedPostHandler();
            request.setAttribute("scriptures", handler.getFavoritePosts());

            request.getRequestDispatcher("scriptureList.jsp").forward(request, response);*/
            
            
            //METHOD 4
            PostDataHandler handler = new PostHandler("list.txt");
            request.setAttribute("scriptures", handler.getFavoritePosts());

            request.getRequestDispatcher("scriptureList.jsp").forward(request, response);

       }

}