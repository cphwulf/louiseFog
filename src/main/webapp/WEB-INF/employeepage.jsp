<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
         Demo Page for Employee Roles
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>
    <jsp:body>
        <h1>Hello ${sessionScope.email} </h1>
        You are now logged in as a EMPLOYEE of our wonderful site.
        <p><a href="${pageContext.request.contextPath}/fc/showallorders">Show all orders</a> </p>

        <form ACTION="${pageContext.request.contextPath}/fc/customermateriallist"  method="POST">
            <input type="checkbox" name="id" value="1"> first<BR>
            <input type="checkbox" name="id" value="2"> second<BR>
            <input type="checkbox" name="id" value="3"> third<BR>
            <input type="checkbox" name="id" value="4"> fourth<BR>
            <input type="checkbox" name="id" value="5"> fifth <BR>
            <button class="btn btn-primary" type="submit" value="Login">Sign in</button>
        </form>

        <p><a href="${pageContext.request.contextPath}/fc/customermaterial">Show all orders</a> </p>

    </jsp:body>
</t:genericpage>
