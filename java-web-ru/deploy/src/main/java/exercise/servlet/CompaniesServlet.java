package exercise.servlet;

import exercise.Data;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

public class CompaniesServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {

        // BEGIN
        PrintWriter out = response.getWriter();

        List<String> companies = Data.getCompanies();
        List<String> filteredCompanies;

        if (request.getQueryString() == null || request.getParameter("search").equals("")) {
            filteredCompanies = companies;
        } else {
            filteredCompanies = companies.stream()
                    .filter(str -> str.contains(request.getParameter("search")))
                    .collect(Collectors.toList());
        }

        if (filteredCompanies.isEmpty()) {
            out.println("Companies not found");
        } else {
            filteredCompanies.forEach(out::println);
        }
        out.close();
        // END
    }
}