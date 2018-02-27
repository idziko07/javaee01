import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/meter")
public class Meter extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MetricConverter convert = new MetricConverter();
        request.setCharacterEncoding("UTF-8");
        String meter = request.getParameter("meter");
        String centimeter = request.getParameter("centimeter");
        String milimeter = request.getParameter("milimeter");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if(!(meter == "")) {
            Double meterDouble = Double.valueOf(meter);

            writer.print("<h1> Podana wartosc w przeliczeniu na </h1> \n");
            writer.printf("<h3> metry: %.2f </h3>\n",meterDouble);
            writer.printf("<h3> centymetry: %.2f </h3>\n",convert.meterToCentimeter(meterDouble));
            writer.printf("<h3> milimetry: %.2f </h3>\n", convert.meterToMilimeter(meterDouble));
        }

        if(!(centimeter == "")){
            Double centimeterDouble = Double.valueOf(centimeter);

            writer.print("<h1> Podana wartosc w przeliczeniu na </h1> \n");
            writer.printf("<h3> metry: %.2f </h3>\n", convert.centimeterToMeter(centimeterDouble));
            writer.printf("<h3> centymetry: %.2f </h3>\n", centimeterDouble);
            writer.printf("<h3> milimetry: %.2f </h3>\n", convert.centimeterToMilimeter(centimeterDouble));
        }

        if (!(milimeter == "")){
            Double milimeterDouble = Double.valueOf(centimeter);

            writer.print("<h1> Podana wartosc w przeliczeniu na </h1> \n");
            writer.printf("<h3> metry: %.2f </h3>\n", convert.milimeterToMeter(milimeterDouble));
            writer.printf("<h3> centymetry: %.2f </h3>\n", convert.milimeterToCentimeter(milimeterDouble));
            writer.printf("<h3> milimetry: %.2f </h3>\n",milimeterDouble);
        }

    }
}
