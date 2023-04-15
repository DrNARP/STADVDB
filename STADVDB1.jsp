<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, java.util.*, enrollment.*" %>
<html>
    <head>
        <title>Test MySQL</title>
    </head>
    
    <body>
        <h1>mysql express test</h1>
    
        <style>
            td, th {
                padding: 2px;
            }
    
            table, th, td, tr {
            border: 1px solid black;
            }
        </style>
    
        <p><a href="/index_STADVDB.html">Node 0</a></p>
        <p><a href="/index_STADVDB_1.html">Node 1</a></p>
        <p><a href="/index_STADVDB_2.html">Node 2</a></p>
    
        <jsp:useBean id = "movies" class = "fuck" />
        <table>
            <tbody>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>year</th>
                    <th>rank</th>
                </tr>
                <tr>
                    <td> 0 </td>
                    <td> #28 </td>
                    <td> 2002 </td>
                    <td>  </td>
                </tr>
                
        </tbody></table>
        
        
        
    </body>
</html>
