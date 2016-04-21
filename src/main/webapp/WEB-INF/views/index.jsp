<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>TDD</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/img/favicon.ico" type=”image/x-icon”>

    <meta charset="UTF-8"/>

    <!-- materialize: CSS -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <!-- materialize: CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/materialize.min.css"/>
    <!-- materialize:  JQuery-->
    <script src="${pageContext.request.contextPath}/resources/js/lib/jquery-2.2.2.min.js"
            type="text/javascript"></script>
    <!-- materialize: JS -->
    <script src="${pageContext.request.contextPath}/resources/js/lib/materialize.min.js"
            type="text/javascript"></script>
    <!-- materialize: icon -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/icon.css"/>

    <!-- JS -->
    <script src="${pageContext.request.contextPath}/resources/js/script.js"
            type="text/javascript"></script>
    <!-- CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>

    <!-- AngularJS: lib -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/angular.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/lib/angular-route.min.js"></script>

    <!-- AngularJS: Module -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/module/module.js"></script>
    <!-- AngularJS: Controller -->
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/controller/controller.js"></script>
    <!-- AngularJS: Service -->
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/service/service.js"></script>
    <!-- AngularJS: Directive -->
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/directive/directive.js"></script>


</head>
<body ng-app="myApp">
<jsp:include page="navbar.jsp" flush="true"/>
<main>
    <div class="container">
       <ng-view></ng-view>
    </div>
</main>
<jsp:include page="footer.jsp" flush="true"/>
</body>
</html>
