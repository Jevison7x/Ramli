<%--
    Document   : scripts
    Created on : May 4, 2018, 12:41:51 AM
    Author     : Jevison7x
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <script src="js/jarallax.js"></script>
        <script src="js/SmoothScroll.min.js"></script>
        <script type="text/javascript">
            /* init Jarallax */
            $('.jarallax').jarallax({
                speed: 0.5,
                imgWidth: 1366,
                imgHeight: 768
            });
        </script>
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <!-- here stars scrolling icon -->
        <script type="text/javascript">
            $(document).ready(function(){
                /*
                 var defaults = {
                 containerID: 'toTop', // fading element id
                 containerHoverID: 'toTopHover', // fading element hover id
                 scrollSpeed: 1200,
                 easingType: 'linear'
                 };
                 */
                $().UItoTop({easingType: 'easeOutQuart'});
            });
        </script>
        <!-- Modal Scripts -->
        <script src="js/animsition.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/select2.min.js"></script>
        <script src="js/moment.min.js"></script>
        <script src="js/daterangepicker.js"></script>
        <script src="js/countdowntime.js"></script>
        <script src="js/main.js"></script>