<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=" utf-8" />
<%@ page contentType="text/html; charset=utf-8" %>
    <%@ page import="java.sql.*, javax.sql.*, java.io.*" %>
            <html>

            <head>
                <script>
                    function submitForm (mode){
                        var myform = document.myform;
                        if(mode == "update"){
                            myform.action = "test.html";
                            //myform.submit();
                        } else if (mode == "delete"){
                            myform.action = "test2.html";
                            //myform.submit();
                        }
                    }

                </script>
    <style>
        input:focus::placeholder {
        color: transparent;
        }
    </style>
</head>
<body>
<form action="test2.html">
<table width="265">
<tr colspan=2>
    <td><input type="text" placeholder="이름"></td>
</tr>
    <td><input type="text" placeholder="비밀번호"></td>
    <td width= 400 style="text-decoration:underline"> <font size="1">비밀번호 도움말</font></td>
</tr >

    <td ><input type ="text" placeholder="비밀번호 재입력"></td>
    <td></td>
</tr>
</table>
<table>
<tr>
    <td>
       <select name="전화번호">
            <option placeholder="02">02</option>
            <option placeholder="031">031</option>
            <option placeholder="032">032</option>
            <option placeholder="033">033</option>
       </select> 
    </td>
    <td ><input type ="number" min="0" max="9"></td>
    <td ><input type ="number" min="0" max="9"></td>
</tr>
<tr>
    <td><select name="휴대폰 번호">
        <option placeholder="010">010</option>
        <option placeholder="011">011</option>
        <option placeholder="019">019</option>
        <option placeholder="017">017</option>
        </select>
    </td>
    <td>
        <input type ="number" min="0" max="9">
    </td>
    <td>
        <input type ="number" min="0" max="9">
    </td>
    <td>
        <input type="submit" value="휴대폰인증"></button>
    </td>
</tr> 
</table>

<table>
<tr>
    <td>
<input type="text" placeholder="이메일" style="width:50px">
    </td>
    <td>@</td>
    <td><select name="이메일">
        <option placeholder="naver">naver.com</option>
        <option placeholder="google">google.com</option>
        <option placeholder="daum">daum.net</option>
        </select></td>
    </tr>
</table>
</form>
<table>
<tr>
<td width="128"></td>
<td >
<form action="test2.html">
<input type="submit" placeholder="제출"></button>
</form>
</td>
</tr>
<script>
var number = 10000;
console.log(number);
</script>
</body>
</html>