import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/weight")
public class Weight extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WeightConvert convert = new WeightConvert();
        request.setCharacterEncoding("UTF-8");
        String kilogram = request.getParameter("kilogram");
        String gram = request.getParameter("gram");
        String miligram = request.getParameter("miligram");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

            if(!(kilogram == "")){
                Double kilogramDouble = Double.valueOf(kilogram);

                writer.print("<h1> Podana wartosc w przeliczeniu na </h1> \n" );
                writer.printf("<h3> kilogramy: %.2f </h3>\n" ,kilogramDouble);
                writer.printf("<h3> gramy: %.2f </h3>\n" ,convert.kilogramToGram(kilogramDouble));
                writer.printf("<h3> miligramy: %.2f </h3>\n" ,convert.kilogramToMiligramy(kilogramDouble));
            }

            if(!(gram == "")){
                Double gramDouble = Double.valueOf(gram);

                writer.print("<h1> Podana wartosc w przeliczeniu na </h1> \n" );
                writer.printf("<h3> kilogramy: %.2f </h3>\n" ,convert.gramToKilogram(gramDouble));
                writer.printf("<h3> gramy: %.2f </h3>\n" ,gramDouble);
                writer.printf("<h3> miligramy: %.2f </h3>\n" ,convert.gramToMiligram(gramDouble));
            }

            if(!(miligram == "")){
                Double miligramDouble = Double.valueOf(miligram);

                writer.print("<h1> Podana wartosc w przeliczeniu na </h1> \n" );
                writer.printf("<h3> kilogramy: %.2f </h3>\n" ,convert.miligramTokilogram(miligramDouble));
                writer.printf("<h3> gramy: %.2f </h3>\n" ,convert.miligramToGram(miligramDouble));
                writer.printf("<h3> miligramy: %.2f </h3>\n" ,miligramDouble);
            }

    }
}
