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
<h1 align="center">Apply Loan</h1>
<hr/>
<form name="userForm" method="post" action="controller">
    <table width="450px" align="center">
        <tr>
            <td valign="top"><label>User ID</label></td>
            <td valign="top"><input type="text" name="user_id"
                                    maxlength="50" size="30"></td>
        </tr>

        <tr>
            <td valign="top"><label>User Name</label></td>
            <td valign="top"><input type="text" name="user_name"
                                    maxlength="50" size="30"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
