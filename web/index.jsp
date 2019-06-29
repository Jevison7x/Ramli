<%--
    Document   : index
    Created on : Apr 11, 2018, 4:29:51 PM
    Author     : Jevison7x
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Ramli</title>
        <jsp:include page="WEB-INF/fragments/head-codes.jsp"/>
    </head>
    <body>
        <!-- banner -->
        <jsp:include page="WEB-INF/fragments/banner.jsp"/>
        <!-- //banner -->
        <!-- welcome -->
        <jsp:include page="WEB-INF/fragments/about.jsp"/>
        <!-- //welcome -->
        <!-- symbols -->
        <jsp:include page="WEB-INF/fragments/symbols.jsp"/>
        <!-- //symbols -->
        <!-- playing section -->
        <jsp:include page="WEB-INF/fragments/playing-section.jsp"/>
        <!-- //playing section -->
        <!-- history -->
        <jsp:include page="WEB-INF/fragments/history.jsp"/>
        <!-- //history -->
	<!-- contact -->
    <jsp:include page="WEB-INF/fragments/contact.jsp"/>
	<!-- //contact -->
    <!-- //subscribe -->
    <!-- footer -->
    <jsp:include page="WEB-INF/fragments/footer.jsp"/>
    <!-- //footer -->
    <!-- Create Account Modal -->
    <jsp:include page="WEB-INF/fragments/create-account-modal.jsp"/>
    <!-- //Create Account Modal -->
    <!-- Login Modal -->
    <jsp:include page="WEB-INF/fragments/login-modal.jsp"/>
    <!-- //Login Modal -->
    <!-- Symbol Details Modal -->
    <jsp:include page="WEB-INF/fragments/symbol-details-modal.jsp"/>
    <!-- //Symbol Details Modal -->
    <!-- scripts -->
    <jsp:include page="WEB-INF/fragments/scripts.jsp"/>
    <!-- //scripts -->
    </body>
</html>
