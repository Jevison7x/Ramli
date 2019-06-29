<%--
    Document   : banner
    Created on : May 4, 2018, 12:19:51 AM
    Author     : Jevison7x
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <div class="banner jarallax">
            <!-- agileinfo-dot -->
            <div class="agileinfo-dot">
                <div class="w3layouts-header-top">
                    <div class="w3-header-top-grids">
                        <div class="w3-header-top-left">
                            <p><i class="fa fa-envelope" aria-hidden="true"></i> info@bahaushiya.net</p>
                        </div>
                        <div class="w3-header-top-right">
                            <div class="agileinfo-social-grids">
                                <ul>
                                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#"><i class="fa fa-rss"></i></a></li>
                                    <li><a href="#"><i class="fa fa-vk"></i></a></li>
                                </ul>
                            </div>
                            <div class="w3-header-top-right-text">
                                <p><i class="fa fa-volume-control-phone" aria-hidden="true"></i> (+234) 803 488 4629</p>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </div>
                <jsp:include page="header.jsp"/>
                <div class="w3layouts-banner-slider">
                    <div class="w3layouts-banner-top-slider">
                        <div class="slider">
                            <div class="callbacks_container">
                                <ul class="rslides callbacks callbacks1" id="slider4">
                                    <li>
                                        <div class="agileits-banner-info">
                                            <h3>The Ancient Geomancy</h3>
                                            <div class="w3-button">
                                                <a href="#about">More</a>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <div class="clearfix"> </div>
                            <script src="js/responsiveslides.min.js"></script>
                            <script>
        // You can also use "$(window).load(function() {"
        $(function(){
            // Slideshow 4
            $("#slider4").responsiveSlides({
                auto: true,
                pager: true,
                nav: true,
                speed: 500,
                namespace: "callbacks",
                before: function(){
                    $('.events').append("<li>before event fired.</li>");
                },
                after: function(){
                    $('.events').append("<li>after event fired.</li>");
                }
            });

        });
                            </script>
                            <!--banner Slider starts Here-->
                        </div>
                    </div>
                </div>
            </div>
            <!-- //agileinfo-dot -->
        </div>
