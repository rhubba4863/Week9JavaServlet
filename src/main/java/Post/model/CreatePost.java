package Post.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Post.model.PostHandler;
import javax.servlet.http.HttpSession;
import Post.model.PostBox;

/**
* Servlet implementation class CreatePost
*/
@WebServlet("/CreatePost")
public class CreatePost extends HttpServlet {
       private static final long serialVersionUID = 1L;

     /**
     * @see HttpServlet#HttpServlet()  
     */
     public CreatePost() {
          super();
          // TODO Auto-generated constructor stub
     }

       /**
       * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
       */
       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String myNewPost = request.getParameter("txtBook");
            //int chapter = Integer.parseInt(request.getParameter("txtChapter"));
            //int verse = Integer.parseInt(request.getParameter("txtVerse"));
            HttpSession session = request.getSession(true);
            String chapter = (String)session.getAttribute("help");
            String verse = "hi";

            PostBox newPost = new PostBox(myNewPost, chapter, verse);

            // TODO: Add this scripture to the list
            //RPH ADDED THIS, WORKED BEFORE THIS AND OTHER LINE ON PAGE SHOWLIST.JAVA
            PostHandler handler = new PostHandler("list.txt");
            handler.addPost(newPost);
            //

            response.sendRedirect("ShowList");
     }
}