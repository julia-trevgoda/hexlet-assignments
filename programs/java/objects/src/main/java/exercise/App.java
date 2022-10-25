package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class App {
    // BEGIN
    public static String buildList(String[] stringArray) {
        if (stringArray.length == 0) {
            return "";
        }
        StringBuilder list = new StringBuilder();
        list.append("<ul>\n");
        for (String s : stringArray) {
            list.append("  <li>" + s + "</li>\n");
        }
        list.append("</ul>");
        return String.valueOf(list);
    }

    public static String getUsersByYear(String[][] usersArray, int givenYear) {
        StringBuilder users = new StringBuilder();

        for (String[] strings : usersArray) {
            String user = strings[0];
            String dateOfBirth = strings[1];
            if (dateOfBirth.substring(0, 4).equals(Integer.toString(givenYear))) {
                users.append("  <li>" + user + "</li>\n");
            }
        }

        if (users.length() > 0) {
            users.insert(0, "<ul>\n").append("</ul>");
        }

        return String.valueOf(users);
    }

    // END


    // Это дополнительная задача, которая выполняется по желанию.
    // BEGIN
    public static Date userDateFormatter(String userDateOfBirth) throws ParseException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        Date userDate = dateFormatter.parse(userDateOfBirth);
        return userDate;
    }

    public static Date givenDateFormatter(String givenDate) throws ParseException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd MMM yyyy");
        Date dateToCompare = dateFormatter.parse(givenDate);
        return dateToCompare;
    }

    public static String getYoungestUser(String[][] usersArray, String date) throws Exception {
        if (usersArray[0].length == 0 && usersArray[1].length == 0) {
            return "";
        }
        Date dateToCompare = givenDateFormatter(date);
        String youngestUser = "";
        Date currentYoungestDate = new Date(0);
        for (String[] strings : usersArray) {
            String user = strings[0];
            Date dateOfBirth = userDateFormatter(strings[1]);
            if (dateOfBirth.before(dateToCompare) && dateOfBirth.after(currentYoungestDate)) {
                youngestUser = user;
                currentYoungestDate = dateOfBirth;
            }
        }
        return youngestUser;
        // END
    }
}
