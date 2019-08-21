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
            <h1>智能终端烹饪情况</h1>
        </div>
    </div>
    <!--按钮 -->
    <br>
    <!--显示表格数据 -->
    <div class="row">
        <div class="table-responsive col-md-12">
            <table class="table table-hover" id="users_table">
                <thead>
                <tr>
                    <th>店面名称</th>
                    <th>每日消耗总量</th>
                    <th>辅助材料消耗量</th>
                    <th>客户反馈</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th>南京盱眙小龙虾店</th>
                    <th>200</th>
                    <th>58.1</th>
                    <th>十三香小龙虾味道正宗，值得推荐！</th>
                </tr>
                <tr>
                    <th>上海小龙虾店</th>
                    <th>400</th>
                    <th>86.9</th>
                    <th>这家店的蒜蓉小龙虾很好吃，各位值得前来品尝</th>
                </tr>
                <tr>
                    <th>无锡小龙虾店</th>
                    <th>320</th>
                    <th>74.0</th>
                    <th>强烈推荐这家店的麻辣小龙虾，真够味</th>
                </tr>

                </tbody>


            </table>
        </div>
    </div>
    <!--显示分页信息 -->
    <div class="row">
        <!--分页文字信息 -->
        <div class="col-md-6 col-sm-6" id="page_info_area">
            当前第1页，总共1页，总共3条记录
        </div>
        <!--分页导航条信息 -->
        <div class="col-md-6 col-sm-6" id="page_nav_area">

        </div>
    </div>
</div>
</body>
</html>