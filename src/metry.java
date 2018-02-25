import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/metry")
public class metry extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrzelicznikMetryczny przelicz = new PrzelicznikMetryczny();
        request.setCharacterEncoding("UTF-8");
        String centymetry = request.getParameter("centymetry");

        Double centymetryDouble = Double.valueOf(centymetry);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.print("<h1> Podana wartosc w przeliczeniu na </h1> \n" );
        writer.printf("<h3> metry: %.2f </h3>\n" ,przelicz.centymetryNaMetry(centymetryDouble));
        writer.printf("<h3> centymetry: %.2f </h3>\n" ,centymetryDouble);
        writer.printf("<h3> milimetry: %.2f </h3>\n" ,przelicz.centymetryNaMilimetry(centymetryDouble));



    }
}
