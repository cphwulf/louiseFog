<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
         Customer Page
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>

    <jsp:body>
        <h1>Hello ${sessionScope.email} </h1>
        You are now logged in as a Customer of Fog. Here are your orders.
        Role: ${sessionScope.role}
        <form ACTION="${pageContext.request.contextPath}/fc/customermateriallist"  method="POST">
       <c:forEach var="order" items="${requestScope.orderlist}">
           <input type="checkbox" name="id" value="${order.ordreId}">${order.ordreId} for ${order.kundeMail}
       </c:forEach>
            <button class="btn btn-primary" type="submit" value="Login">Lav stykliste</button>
        </form>

    </jsp:body>

</t:genericpage>

