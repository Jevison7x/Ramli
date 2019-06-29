<%--
    Document   : header
    Created on : May 4, 2018, 12:14:07 AM
    Author     : Jevison7x
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
                <div class="head">
                    <div class="head-nav-grids">
                        <div class="navbar-top">
                            <!-- Brand and toggle get grouped for better mobile display -->
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                                <div class="navbar-brand logo">
                                    <h1><a href="index.jsp">Ramli </a></h1>
                                </div>
                            </div>
                            <!-- Collect the nav links, forms, and other content for toggling -->
                            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                                <ul class="nav navbar-nav link-effect-4">
                                    <li class="active"><a href="index.jsp" data-hover="Home">Home</a> </li>
                                    <li><a href="#about" data-hover="About">About </a> </li>
                                    <li><a href="#gallery" data-hover="Gallery">Symbols</a></li>
                                    <li><a href="#gallery" data-hover="Play">Play</a></li>
                                    <li><a href="#contact-us" data-hover="Contact">Contact</a></li>
                                </ul>
                            </div><!-- /.navbar-collapse -->
                        </div>
                        <div class="header-left">
                            <ul>
                            <c:if test="${param.login ne null and param.login eq 0}">
                                <li><span class="ca-failed">Invalid email or password</span></li>
                            </c:if>
                    <c:choose>
                        <c:when test="${user ne null}">
                            <jsp:useBean id="user" scope="session" class="com.ramli.users.User"/>
                                <li>
                                    <span class="ca-success">${user.name}</span>
                                </li>
                                <li>
                                    <i class="fa fa-sign-out" aria-hidden="true"></i>
                                    <a href="logout">
                                        Log-out
                                    </a>
                                </li>
                        </c:when>
                        <c:otherwise>
                                <li>
                            <c:choose>
                                <c:when test="${param.ca ne null and param.ca eq 1}">
                                    <span class="ca-success">Account was created successfully.</span>
                                </c:when>
                                <c:when test="${param.ca ne null and param.ca eq 0}">
                                    <span class="ca-failed">There was an error.</span>
                                </c:when>
                                <c:otherwise>
                                    <i class="fa fa-user-plus" aria-hidden="true"></i>
                                    <a href="#" data-toggle="modal" data-target="#create-account-modal">
                                        Create Account
                                    </a>
                                </c:otherwise>
                            </c:choose>
                                </li>
                                <li>
                                    <i class="fa fa-sign-in" aria-hidden="true"></i>
                                    <a href="#" data-toggle="modal" data-target="#login-modal">
                                        Log-in
                                    </a>
                                </li>
                        </c:otherwise>
                    </c:choose>
                            </ul>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
