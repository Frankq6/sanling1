<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
<!--使用bootstrap搭建页面 -->
<div class="container">
    <!--标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>物流情况</h1>
        </div>
    </div>
    <br>
    <!--显示表格数据 -->
    <div class="row">
        <div class="table-responsive col-md-12">
            <table class="table table-hover" id="users_table">
                <thead>
                <tr>
                    <th>运输过程实时情况</th>
                    <th>途中各分店卸货</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th>在盱眙洪泽湖南岸打捞并洗涮</th>
                    <th>0</th>
                </tr>
                <tr>
                    <th>分装打包发送到盱眙养殖中心</th>
                    <th>0</th>
                </tr>
                <tr>
                    <th>发往无锡小龙虾店</th>
                    <th>0</th>
                </tr>
                <tr>
                    <th>到达无锡小龙虾店</th>
                    <th>200</th>
                </tr>
                <tr>
                    <th>发往南京盱眙小龙虾店</th>
                    <th>0</th>
                </tr>
                <tr>
                    <th>到达南京小龙虾店</th>
                    <th>300</th>
                </tr>
                </tbody>


            </table>
        </div>
    </div>
    <!--显示分页信息 -->
    <div class="row">
        <!--分页文字信息 -->
        <div class="col-md-6 col-sm-6" id="page_info_area">
            当前第1页，总共1页，总共条6记录
        </div>
        <!--分页导航条信息 -->
        <div class="col-md-6 col-sm-6" id="page_nav_area">

        </div>
    </div>
</div>
</body>
</html>
