<%--
    Document   : login-modal
    Created on : May 4, 2018, 3:18:12 AM
    Author     : Jevison7x
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="login-modal" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content modal-box">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">
                    <i class="fa fa-sign-in fa-left-icon"></i>
                    Login
                </h4>
            </div>
            <div class="modal-body">
                <form class="login100-form validate-form" name="loginForm" action="login" method="post">
					<div class="wrap-input100 validate-input" data-validate="Valid email is: a@b.c">
                        <input class="input100" type="email" name="email" required>
						<span class="focus-input100" data-placeholder="Email"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter password">
						<span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
						<input class="input100" type="password" name="password" required>
						<span class="focus-input100" data-placeholder="Password"></span>
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
                            <button class="login100-form-btn" type="submit">
								Login
							</button>
						</div>
					</div>

					<div class="text-center p-t-115">
						<span class="txt1">
							Don't have an account with us?
						</span>

						<a id="create-account-modal-link" class="txt2" href="#">
							Create Account
						</a>
					</div>
				</form>
                <div id="dropDownSelect1"></div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
