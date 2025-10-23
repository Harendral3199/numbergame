package com.example.game;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {

    private int targetNumber = (int)(Math.random() * 100) + 1;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int guess = Integer.parseInt(request.getParameter("number"));
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");

        if (guess < targetNumber) {
            response.getWriter().println("<p>Too low! Try again.</p>");
        } else if (guess > targetNumber) {
            response.getWriter().println("<p>Too high! Try again.</p>");
        } else {
            response.getWriter().println("<p>Correct! You guessed the number " + targetNumber + "!</p>");
            // Reset game
            targetNumber = (int)(Math.random() * 100) + 1;
        }

        response.getWriter().println("<a href='index.jsp'>Back</a>");
        response.getWriter().println("</body></html>");
    }
}
