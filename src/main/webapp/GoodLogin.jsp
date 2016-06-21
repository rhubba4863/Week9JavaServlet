<%-- 
    Document   : GoodLogin
    Created on : Jun 16, 2016, 11:29:06 AM
    Author     : robert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello, select the options below to add text and/or view text on the following page.</h1>
        <%
        //String bad = (String)session.getAttribute("help");
        //http://www.tutorialspoint.com/servlets/servlets-session-tracking.htm
        out.println(session.getAttribute("help"));
        %>
        <!-- Example, can go to the java file,just leave off java at the end. -->
        <!-- <a href="index.html">Login</a> -->
        
        
        <form method="POST" action="CreatePost">
            Desired input: <input type="text" name="txtBook" /><br />
            <!--Chapter: <input type="text" name="txtChapter" /><br />
            Verse: <input type="text" name="txtVerse" /><br />-->
            <br />
            <input type="submit" value="Submit" />
        </form>
        
        <a href="scriptureList.jsp">Go directly to posts</a>
        <!--public List<PostBox> getFavoritePosts(); -->
        
        
        

        
        
        <button onclick="myFunction()">Click me</button>

        <p id="demo"></p>

        <script>
        PostDataHandler handler = new PostHandler("list.txt");
            request.setAttribute("scriptures", handler.getFavoritePosts());
            request.getRequestDispatcher("scriptureList.jsp").forward(request, response);
        function myFunction() {
            PostDataHandler handler = new PostHandler("list.txt");
            request.setAttribute("scriptures", handler.getFavoritePosts());
            request.getRequestDispatcher("scriptureList.jsp").forward(request, response);
        }
        </script>
        
        
    </body>
</html>
