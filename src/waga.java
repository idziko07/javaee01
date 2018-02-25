import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/waga")
public class waga extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrzelicznikWag przelicz = new PrzelicznikWag();
        request.setCharacterEncoding("UTF-8");
        String kilogramy = request.getParameter("kilogramy");

        Double kilogramyDouble = Double.valueOf(kilogramy);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.print("<h1> Podana wartosc w przeliczeniu na </h1> \n" );
        writer.printf("<h3> kilogramy: %.2f </h3>\n" ,kilogramyDouble);
        writer.printf("<h3> gramy: %.2f </h3>\n" ,przelicz.kilogramyNaGramy(kilogramyDouble));
        writer.printf("<h3> miligramy: %.2f </h3>\n" ,przelicz.kilogramyNaMiligramy(kilogramyDouble));




    }
}
