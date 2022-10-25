package exercise.servlet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exercise.User;
import org.apache.commons.lang3.ArrayUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Objects;

public class UsersServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {

        String pathInfo = request.getPathInfo();

        if (pathInfo == null) {
            showUsers(request, response);
            return;
        }

        String[] pathParts = pathInfo.split("/");
        String id = ArrayUtils.get(pathParts, 1, "");

        showUser(request, response, id);
    }

    private List getUsers() throws JsonProcessingException, IOException {
        // BEGIN
        ObjectMapper objectMapper = new ObjectMapper();
        List<User> listUsers = objectMapper.readValue(new File("src/main/resources/users.json"), new TypeReference<List<User>>(){});

        return listUsers;
        // END
    }

    private void showUsers(HttpServletRequest request,
                           HttpServletResponse response)
            throws IOException {

        // BEGIN
        List<User> users = getUsers();

        StringBuilder body = new StringBuilder();

        body.append("""
                <!DOCTYPE html>
                <html lang=\"ru\">
                    <head>
                        <meta charset=\"UTF-8\">
                        <title>Example application | Users</title>
                        <link rel=\"stylesheet\" href=\"src/main/resources/mysite.css\">
                    </head>
                    <body>
                        <table style=\"border: 1px solid black; border-collapse: collapse;\">
                """);

        for (User user : users) {
            body.append("<tr><td style=\"border: 1px solid black; border-collapse: collapse;\">" +
                    "<a href=\"/users/" + user.getId() + "\">" + user.getId() + "</a></td>");
            body.append("<td style=\"border: 1px solid black; border-collapse: collapse;\">" +
                    user.getFirstName() + " " + user.getLastName() + "</td></tr>");
        }

        body.append("""
                    </table>
                </body>
               </html>
                 """);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(body);
        out.close();
        // END
    }

    private void showUser(HttpServletRequest request,
                          HttpServletResponse response,
                          String id)
            throws IOException {

        // BEGIN
        List<User> users = getUsers();
        User user = users.stream()
                .filter(u -> Objects.equals(u.getId(), id))
                .findAny()
                .orElse(null);

        if (user == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        StringBuilder body = new StringBuilder();

        body.append("""
                <!DOCTYPE html>
                <html lang=\"ru\">
                    <head>
                        <meta charset=\"UTF-8\">
                        <title>Example application | Users</title>
                    </head>
                    <body>
                        <table style=\"border: 1px solid black; border-collapse: collapse;\">
                """);

            body.append("<tr><td style=\"border: 1px solid black; border-collapse: collapse;\">id</td>" +
                    "<td style=\"border: 1px solid black; border-collapse: collapse;\">" + user.getId() + "</td></tr>");
            body.append("<tr><td style=\"border: 1px solid black; border-collapse: collapse;\">firstName</td>" +
                    "<td style=\"border: 1px solid black; border-collapse: collapse;\">" + user.getFirstName() + "</td></tr>");
            body.append("<tr><td style=\"border: 1px solid black; border-collapse: collapse;\">lastName</td>" +
                    "<td style=\"border: 1px solid black; border-collapse: collapse;\">" + user.getLastName() + "</td></tr>");
            body.append("<tr><td style=\"border: 1px solid black; border-collapse: collapse;\">email</td>" +
                    "<td style=\"border: 1px solid black; border-collapse: collapse;\">" + user.getEmail() + "</td></tr>");

        body.append("""
                    </table>
                </body>
               </html>
                 """);

        out.println(body);
        out.close();
        // END
    }
}
