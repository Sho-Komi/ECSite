<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>管理者画面</title>
</head>

<body>

        <div id=header></div>

        <div id="main">
                <div id="top">
                        <p>Admin</p>
                </div>

                <h3>管理者画面</h3>

                <div class="container">
                        <div class="item">
                                <h4>商品</h4>
                                <a href='<s:url action="ItemCreateAction" />'>商品登録</a>
                                <a href='<s:url action="ItemListAction" />'>一覧</a>
                        </div>
                        <div class="item">
                                 <h4>ユーザー</h4>
                                 <a>新規登録</a>
                                <a>一覧</a>
                        </div>
                </div>

        </div>

        <div id="footer"></div>

</body>
</html>