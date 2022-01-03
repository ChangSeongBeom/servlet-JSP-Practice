package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        System.out.println("request"+request);
        System.out.println("response"+response);
        System.out.println("HelloSERVLET");

        String username=request.getParameter("user");
        String userSex=request.getParameter("sex");

        System.out.println("username = " + username);
        System.out.println("userSex = " + userSex);

        response.getWriter().write("hello"+username);
    }
}
