<%--
    Document   : contact
    Created on : May 4, 2018, 12:37:11 AM
    Author     : Jevison7x
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
	<div id="contact-us" class="contact-content">
        <div class="agileinfo-heading">
            <h3 style="margin-bottom: 20px">Contact Us</h3>
        </div>
		<div class="container">
            <!-- map -->
            <div id="location">
                <script>
                    //Initialize Google Map
                    function initialize(){
                        var mapCanvas = document.getElementById('map-canvas');
                        var myLatLng = new google.maps.LatLng(12.022419, 8.502548);
                        var mapOptions = {
                            center: myLatLng,
                            zoom: 16,
                            mapTypeId: google.maps.MapTypeId.ROADMAP
                        };
                        var map = new google.maps.Map(mapCanvas, mapOptions);
                        var marker = new google.maps.Marker({
                            position: myLatLng,
                            map: map,
                            title: 'Bahaushiya.'
                        });
                    }
                    google.maps.event.addDomListener(window, 'load', initialize);
                </script>
                <div id="map-canvas" style="width: auto; height: 470px;">

                </div>
            </div>
            <!-- //map -->
			<div class="contact-form">
				<h3>Contact form</h3>
                <form name="contactForm" action="contact-us" method="post">
                    <input id="contact-name" class="text" name="Name" placeholder="Name" type="text" required="">
                    <input id="contact-email" class="text" name="Email" placeholder="Email" type="email" required="">
                    <input id="contact-subject" class="text" name="Subject" placeholder="Subject" type="text" required="">
                    <textarea id="contact-message" name="Message" style="height: 142px;" placeholder="Message" required=""></textarea>
                    <input id="contact-submit" value="Send Message" type="submit">
                </form>
			</div>
		</div>
	</div>
