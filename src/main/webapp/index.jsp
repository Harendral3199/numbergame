<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Number Guessing Game</title>
</head>
<body>
    <h2>Guess a number between 1 and 100!</h2>
    <form action="guess" method="post">
        <input type="number" name="number" min="1" max="100" required>
        <input type="submit" value="Guess">
    </form>
</body>
</html>
