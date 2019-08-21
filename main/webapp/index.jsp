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
        <div class="col-md-12">
            <table class="table table-hover" id="orrder_table">
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
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
    <!--显示分页信息 -->
    <div class="row">
        <!--分页文字信息 -->
        <div class="col-md-6 col-sm-6" id="page_info_area"></div>
        <!--分页导航条信息 -->
        <div class="col-md-6 col-sm-6" id="page_nav_area"></div>
    </div>
</div>

<div class="modal fade" id="orrderUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">修改用户</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">姓名</label>
                        <div class="col-sm-10">
                            <p class="form-control-static" id="username"></p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">电话</label>
                        <div class="col-sm-10">
                            <input type="text" name="phone" class="form-control" id="phone_update_input">
                            <span  class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">所选口味</label>
                        <div class="col-sm-10">
                            <input type="text" name="taste" class="form-control" id="taste_update_input" placeholder="推荐蒜泥味">
                            <span  class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">数量</label>
                        <div class="col-sm-10">
                            <input type="text" name="amount" class="form-control" id="amount_update_input" placeholder="请输入数量">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">价格</label>
                        <div class="col-sm-10">
                            <input type="text" name="pay" class="form-control" id="pay_update_input" placeholder="请输入价格">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="orrder_update_btn">修改</button>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">

    var currentPage;
    $(function () {
        to_page(1);
    });

    function to_page(pn) {
        $.ajax({
            url:"http://localhost:8080/orrder",
            data:"pn="+pn,
            type:"GET",
            success:function(result){
                build_order_table(result);
                build_page_info(result);
                build_page_nav(result);
            }
        });
    }

    function build_order_table(result){
        $("#orrder_table tbody").empty();

        var orrder = result.extend.pageInfo.list;
        $.each(orrder, function(index,item){
            var oidTd = $("<td></td>").append(item.oid);
            var usernameTd = $("<td></td>").append(item.username);
            var phoneTd = $("<td></td>").append(item.phone);
            var tasteTd = $("<td></td>").append(item.taste);
            var amountTd = $("<td></td>").append(item.amount);
            var payTd = $("<td></td>").append(item.pay);
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
            editBtn.attr("edit-id", item.oid);
            var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm del_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
            delBtn.attr("del-id", item.oid);
            var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
            $("<tr></tr>").append(oidTd)
                .append(usernameTd)
                .append(phoneTd)
                .append(tasteTd)
                .append(amountTd)
                .append(payTd)
                .append(btnTd)
                .appendTo("#orrder_table tbody")
        });
    }
    function build_page_info(result){
        $("#page_info_area").empty();

        $("#page_info_area").append("当前第"+result.extend.pageInfo.pageNum+"页，总共"+
            result.extend.pageInfo.pages+"页，总共"+result.extend.pageInfo.total+"条记录");
        currentPage = result.extend.pageInfo.pageNum;
    }

    function build_page_nav(result){
        $("#page_nav_area").empty();
        var ul = $("<ul></ul>").addClass("pagination");
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        if(result.extend.pageInfo.hasPreviousPage == false){
            firstPageLi.addClass("disabled");
        }
        firstPageLi.click(function () {
            to_page(1);
        })
        ul.append(firstPageLi);
        $.each(result.extend.pageInfo.navigatepageNums,function(index, item){

            var numLi =$("<li></li>").append($("<a></a>").append(item).attr("href","#"));
            if(result.extend.pageInfo.pageNum == item){
                numLi.addClass("active");
            }
            numLi.click(function () {
                to_page(item);
            })
            ul.append(numLi);
        });
        var lastPageLi = $("<li></li>").append($("<a></a>").append("尾页").attr("href","#"));
        if(result.extend.pageInfo.hasNextPage == false){
            lastPageLi.addClass("disabled");
        }
        lastPageLi.click(function () {
            to_page(result.extend.pageInfo.pages);
        })
        ul.append(lastPageLi);
        var navElm = $("<nav></nav>").append(ul);
        navElm.appendTo("#page_nav_area");
    }

    $(document).on("click",".edit_btn",function () {
        getOrrder($(this).attr("edit-id"));
        $("#orrder_update_btn").attr("edit-id",$(this).attr("edit-id"));
        $("#orrderUpdateModal").modal({
            backdrop:"static"
        });
    });

    $(document).on("click",".del_btn",function () {
        var odrname = $(this).parents("tr").find("td:eq(1)").text();
        var delId = $(this).attr("del-id");
        if(confirm("确认删除名为【"+odrname+"】用户的订单吗？")){
            $.ajax({
               url:"http://localhost:8080/orrder/"+delId,
                type:"DELETE",
                success:function (result) {
                    alert("删除成功！");
                    to_page(currentPage);
                }
            });
        }
    });

    function getOrrder(id) {
        $.ajax({
            url:"http://localhost:8080/orrder/"+id,
            type:"GET",
            success:function (result) {
//                console.log(result);
                var ordr = result.extend.odr;
                $("#username").text(ordr.username);
                $("#phone_update_input").val(ordr.phone);
                $("#taste_update_input").val(ordr.taste);
                $("#amount_update_input").val(ordr.amount);
                $("#pay_update_input").val(ordr.pay);
            }
        });
    }

    $("#orrder_update_btn").click(function () {
        $.ajax({
           url:"http://localhost:8080/orrder/"+$(this).attr("edit-id"),
           type:"POST",
           data:$("#orrderUpdateModal form").serialize()+"&_method=PUT",
            success:function (result) {
               $("#orrderUpdateModal").modal("hide");
               to_page(currentPage);
            }
        });
    });

</script>
</body>
</html>
