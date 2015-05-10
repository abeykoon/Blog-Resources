<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Course Grain Authorization</title>
</head>

<body bgcolor="#F0F0F0">
<h1 align="center">Experiment Caching</h1>
<hr/>
<form name="userForm" method="post" action="CacheWriteServlet">
    <h2> Write to Cache </h2>
    <br/>
    <table width="450px" align="center">
        <tr>
            <td valign="top"><label>Cache Key</label></td>
            <td valign="top"><input type="text" name="cacheKey"
                                    maxlength="50" size="30"></td>
        </tr>

        <tr>
            <td valign="top"><label>Cache Value</label></td>
            <td valign="top"><input type="text" name="cacheValue"
                                    maxlength="50" size="30"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"></td>
        </tr>
    </table>
</form>

<br/>
<br/>
<br/>

<form name="userForm" method="post" action="CacheReadServlet">
    <h2> Read From Cache </h2>
    <br/>
    <table width="450px" align="center">
        <tr>
            <td valign="top"><label>Cache Key</label></td>
            <td valign="top"><input type="text" name="cacheKey"
                                    maxlength="50" size="30"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"></td>
        </tr>
    </table>
</form>

</body>
</html>
