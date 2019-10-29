<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>商品一覧</title>
</head>
<body>
 <div id="header"></div>



        <div id="main">

                <div id="top">
                        <p>itemList</p>
                </div>

                <div>   　　　　　　　　　　　　　　　　　　　　　
                        <h3>商品情報</h3>
                        <table border="1">
                        <tr>
                                <th>商品名</th>
                                <th>値段</th>
                                <th>在庫</th>
                        </tr>
                <s:iterator value="itemList">
                        <tr>
                                <td><s:property value="itemName" /></td>
                                <td><s:property value="itemPrice" /><span>円</span></td>
                                <td><s:property value="itemStock" /><span>個</span></td>
                        </tr>
                </s:iterator>
                        </table>
            </div>
        </div> <!-- main -->

        <div id="footer"></div>

</body>
</html>