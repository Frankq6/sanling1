<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>中央厨房系统</title>
    <script type="text/javascript" src="./static/js/jquery-3.2.1.js"></script>
    <link rel="stylesheet" href="./static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="./static/bootstrap-3.3.7-dist/js/bootstrap.min.js" ></script>
<%--    <script type="text/javascript" src="${APP_PATH}/static/js/index.js"/>--%>
</head>
<body>

<div class="container">
    <!--标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>盱眙小龙虾订单管理</h1>
        </div>
    </div>
    <!--按钮 -->
<%--    <div class="row">--%>
<%--        <div class="col-md-4 col-md-offset-8 col-sm-4 col-sm-offset-8">--%>
<%--            <button class="btn btn-primary" id="user_add_modal_btn">新增</button>--%>
<%--            <button class="btn btn-danger" id="user_delete_all_btn">删除</button>--%>
<%--        </div>--%>
<%--    </div>--%>
    <br>
    <!--显示表格数据 -->
    <div class="row">
        <div class="table col-md-12">
            <table class="table table-hover" id="users_table">
                <thead>
                <tr>
                    <th>订单号</th>
                    <th>姓名</th>
                    <th>电话</th>
                    <th>所选口味</th>
                    <th>数量</th>
                    <th>价格</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${pageInfo.list }" var="odr">
                <tr>
                    <th>${odr.oid}</th>
                    <th>${odr.username}</th>
                    <th>${odr.phone}</th>
                    <th>${odr.taste}</th>
                    <th>${odr.amount}</th>
                    <th>${odr.pay}</th>
                    <th>
                        <button class="btn btn-primary" >编辑</button>
                        <button class="btn btn-danger" >删除</button>
                    </th>
                </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <!--显示分页信息 -->
    <div class="row">
        <!--分页文字信息 -->
        <div class="col-md-6 col-sm-6" id="page_info_area">
            当前第${pageInfo.pageNum }页，总${pageInfo.pages }共页，总共${pageInfo.total }条记录
        </div>
        <!--分页导航条信息 -->
        <div class="col-md-6 col-sm-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="/index2.jsp?pn=1">首页</a> </li>
                    <li><a href="/index2.jsp?pn=1">1</a> </li>
                    <li><a href="/index2.jsp?pn=2">2</a> </li>
                    <li><a href="/index2.jsp?pn=3">3</a> </li>
                    <li><a href="/index2.jsp?pn=4">4</a> </li>
                    <li><a href="/index2.jsp?pn=5">5</a> </li>
                    <li><a href="/index2.jsp?pn=6">6</a> </li>
                    <li><a href="/index2.jsp?pn=${pageInfo.pages}">尾页</a> </li>
                </ul>
            </nav>
        </div>
    </div>
</div>
</body>
</html>
