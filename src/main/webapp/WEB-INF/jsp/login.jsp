<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>登录</title>
    <jsp:include page="top.jsp"/>
</head>
<body>
<div class="ch-container">
    <div class="row">

        <div class="row">
            <div class="col-md-12 center login-header">
                <h2>Review后台管理系统</h2>
            </div>
            <!--/span-->
        </div><!--/row-->

        <div class="row">
            <div class="well col-md-5 center login-box">
                <div class="alert alert-info">
                    <c:choose>
                        <c:when test="${error != null}">
                            ${error}
                        </c:when>
                        <c:when test="${error == null}">
                            <span id="validate-info">请输入用户名和密码</span>
                        </c:when>
                    </c:choose>
                </div>
                <form class="form-horizontal" action="<%=basePath%>loginPC.do" method="post">
                    <fieldset>
                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user red"></i></span>
                            <input type="text" class="form-control" name="userName" id="userName"placeholder="用户名">
                        </div>
                        <div class="clearfix"></div><br>

                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock red"></i></span>
                            <input type="password" class="form-control" name="password" id="password" placeholder="密码">
                        </div>
                        <div class="clearfix"></div>
						
						<!-- 
                        <div class="input-prepend">
                            <label class="remember" for="remember"><input type="checkbox" id="remember"> 记住用户名</label>
                        </div>
                         -->
                        <div class="clearfix"></div>

                        <p class="center col-md-5">
                            <button type="submit" class="btn btn-primary">登录</button>
                        </p>
                    </fieldset>
                </form>
            </div>
            <!--/span-->
        </div><!--/row-->
    </div><!--/fluid-row-->

</div><!--/.fluid-container-->

<jsp:include page="down.jsp"/>
<script>
    $("form").submit(function(e){
        if(!$('#userName').val() || !$('#password').val()){
            $('#validate-info').html('请输入用户名密码！');
            return false;
        }
    });

</script>
</body>
</html>
