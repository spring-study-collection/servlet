package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        //url: http://localhost:8080/hello?username=kim
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain"); //헤더 정보 설정
        response.setCharacterEncoding("utf-8"); //헤더 정보 설정
        response.getWriter().write("hello " + username); //http 메시지 바디에 데이터가 들어감
    }
}
