<%-- 
    Document   : index
    Created on : 16 Feb 2023, 09:33:11
    Author     : tumelo.pii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./Stylesheets/style.css" />
    </head>
    <body>

        <form action="Results" method="POST">
            <div class="head">
                <h1 id="appName">Quiz App</h1>
                <div class="particulars">
                    <label>First Name : <input type="text" name="fname"> </label>
                    <label>Last  Name : <input type="text" name="lname"> </label>
                </div>
            </div>
            <hr color="red" size="5px" width="100%"/>
            <ol>
                <li> <!-- Question 1 -->
                    <h5 class="question">What type of protocol is HTTP?</h5>
                    <ol type="a">
                        <li> <label><input type="radio" name="Q1" value="Stateless" /> Stateless</label></li>
                        <li> <label><input type="radio" name="Q1" value="Stateful" /> Stateful</label></li>
                        <li> <label><input type="radio" name="Q1" value="transfer protocol" /> transfer protocol</label></li>
                        <li> <label><input type="radio" name="Q1" value="information protocol" /> information protocol</label></li>
                    </ol>
                </li>
                <hr/>
                <li> <!-- Question 2 -->
                    <h5 class="question">How can we take input text from user in HTML page?</h5>
                    <ol type="a">
                        <li> <label><input type="radio" name="Q2" value="input tag" /> input tag</label></li>
                        <li> <label><input type="radio" name="Q2" value="inoutBufferedReader tag" /> inoutBufferedReader tag</label></li>
                        <li> <label><input type="radio" name="Q2" value="meta tag" /> meta tag</label></li>
                        <li> <label><input type="radio" name="Q2" value="scanner tag" /> scanner tag</label></li>
                    </ol>
                </li>
                <hr/>
                <li> <!-- Question 3 -->
                    <h5 class="question">How can we connect to database in a web application?</h5>
                    <ol type="a">
                        <li> <label><input type="radio" name="Q3" value="oracle sql developer" /> oracle sql developer</label></li>
                        <li> <label><input type="radio" name="Q3" value="toad" /> toad</label></li>
                        <li> <label><input type="radio" name="Q3" value="JDBC template" /> JDBC template</label></li>
                        <li> <label><input type="radio" name="Q3" value="mysql" /> mysql</label></li>
                    </ol>
                </li>
                <hr/>
                <li> <!-- Question 4 -->
                    <h5 class="question">Servlet are used to program which component in a web application?</h5>
                    <ol type="a">
                        <li> <label><input type="radio" name="Q4" value="Client" /> Client</label></li>
                        <li> <label><input type="radio" name="Q4" value="Server" /> Server</label></li>
                        <li> <label><input type="radio" name="Q4" value="Tomcat" /> Tomcat</label></li>
                        <li> <label><input type="radio" name="Q4" value="Applet" /> Applet</label></li>
                    </ol>
                </li>
                <hr/>
                <li> <!-- Question 5 -->
                    <h5 class="question">How can we connect to database in a web application?</h5>
                    <ol type="a">
                        <li> <label><input type="radio" name="Q5" value="oracle sql developer" /> oracle sql developer</label></li>
                        <li> <label><input type="radio" name="Q5" value="toad" /> toad</label></li>
                        <li> <label><input type="radio" name="Q5" value="JDBC template" /> JDBC template</label></li>
                        <li> <label><input type="radio" name="Q5" value="mysql" /> mysql</label></li>
                    </ol>
                </li>
                <hr/>
                <li> <!-- Question 6 -->
                    <h5 class="question">What does local IP address start with? Choose the correct answers</h5>
                    <ol type="a">
                        <li> <label><input type="checkbox" name="Q6" value="10.X.X.X" /> 10.X.X.X</label></li>
                        <li> <label><input type="checkbox" name="Q6" value="172.X.X.X" /> 172.X.X.X</label></li>
                        <li> <label><input type="checkbox" name="Q6" value="192.168.X.X" /> 192.168.X.X</label></li>
                        <li> <label><input type="checkbox" name="Q6" value="200.0.4.22" /> 200.0.4.22</label></li>
                    </ol>
                </li>
                <hr/>
                <li> <!-- Question 7 -->
                    <h5 class="question">Mention the 3 servlet lifecycle methods in order</h5>
                    <ol type="a">
                        <li> <label><input type="text" name="Q7" value="" /> method 1</label></li>
                        <li> <label><input type="text" name="Q7" value="" /> method 2</label></li>
                        <li> <label><input type="text" name="Q7" value="" /> method 3</label></li>
                    </ol>
                </li>
                <hr/>
                <li> <!-- Question 8 -->
                    <h5 class="question">What is the response code for when a server cannot find the requested resource</h5>
                    <ol type="a">
                        <li> <label><input type="radio" name="Q8" value="200" /> 200</label></li>
                        <li> <label><input type="radio" name="Q8" value="404" /> 404</label></li>
                        <li> <label><input type="radio" name="Q8" value="400" /> 400</label></li>
                        <li> <label><input type="radio" name="Q8" value="500" /> 500</label></li>
                    </ol>
                </li>
                <li> <!-- Question 9 -->
                    <h5 class="question">In CGI, process starts with each request and will initiate OS level process.</h5>
                    <ol type="a">
                        <li> <label><input type="radio" name="Q9" value="true" /> true</label></li>
                        <li> <label><input type="radio" name="Q9" value="false" /> false</label></li>
                    </ol>
                </li>
                <hr/>
                <li> <!-- Question 10 -->
                    <h5 class="question">Which one the following is not a session tracking techniques</h5>
                    <ol type="a">
                        <li> <label><input type="radio" name="Q10" value="URL rewriting" /> URL rewriting</label></li>
                        <li> <label><input type="radio" name="Q10" value="Using Servlet object" /> Using Servlet object</label></li>
                        <li> <label><input type="radio" name="Q10" value="Using cookies" /> Using cookies</label></li>
                        <li> <label><input type="radio" name="Q10" value="Using session object" /> Using session object</label></li>
                    </ol>
                </li>
                <hr/>

            </ol>
            <div class="submit">
                <input type="submit" value="Submit Quiz" />
            </div>
        </form>


    </body>
</html>
