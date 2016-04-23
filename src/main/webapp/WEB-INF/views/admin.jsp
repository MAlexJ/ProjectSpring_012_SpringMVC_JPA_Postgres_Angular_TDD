<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <jsp:include page="admin_header.jsp" flush="true"/>
</head>
<body ng-app="myApp">
<jsp:include page="admin_nav.jsp" flush="true"/>
<main>
    <div class="section white">
        <div class="row">
            <div class="col s12 l3 m3">
                <jsp:include page="admin_menu.jsp" flush="true"/>
            </div>
            <div class="col s12 l9 m9">
                <ng-view></ng-view>
            </div>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp" flush="true"/>
</body>
</html>
