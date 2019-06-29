
(function($){
    "use strict";


    /*==================================================================
     [ Focus input ]*/
    $('.input100').each(function(){
        $(this).on('blur', function(){
            if($(this).val().trim() !== ""){
                $(this).addClass('has-val');
            }else{
                $(this).removeClass('has-val');
            }
        });
    });


    /*==================================================================
     [ Validate ]
     var input = $('.validate-input .input100');

     $('.validate-form').on('submit', function(){
     var check = true;

     for(var i = 0; i < input.length; i++){
     if(validate(input[i]) === false){
     showValidate(input[i]);
     check = false;
     }
     }
     alert(check);
     return check;
     });*/


    $('.validate-form .input100').each(function(){
        $(this).focus(function(){
            hideValidate(this);
        });
    });

    function validate(input){
        if($(input).attr('type') === 'email' || $(input).attr('name') === 'email'){
            if($(input).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) === null){
                return false;
            }
        }else{
            if($(input).val().trim() === ''){
                return false;
            }
        }
    }

    function showValidate(input){
        var thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');
    }

    function hideValidate(input){
        var thisAlert = $(input).parent();

        $(thisAlert).removeClass('alert-validate');
    }

    /*==================================================================
     [ Show pass ]*/
    var showPass = 0;
    $('.btn-show-pass').on('click', function(){
        if(showPass === 0){
            $(this).next('input').attr('type', 'text');
            $(this).find('i').removeClass('zmdi-eye');
            $(this).find('i').addClass('zmdi-eye-off');
            showPass = 1;
        }else{
            $(this).next('input').attr('type', 'password');
            $(this).find('i').addClass('zmdi-eye');
            $(this).find('i').removeClass('zmdi-eye-off');
            showPass = 0;
        }
    });


})(jQuery);

$(document).ready(function(){
    //When login link is clicked on create account modal
    $('#login-modal-link').click(function(){
        $('#create-account-modal').modal('hide');
        $('#login-modal').modal('show');
    });

    //When create account link is clicked on login modal
    $('#create-account-modal-link').click(function(){
        $('#login-modal').modal('hide');
        $('#create-account-modal').modal('show');
    });

    //Scroll to about section
    $('.navbar-nav li a, .w3-button a').click(function(event){
        event.preventDefault();

        $('html,body').animate({
            scrollTop: $(this.hash).offset().top
        }, 1000);
    });

    //Clock stuff - Jevison7x Dec 12, 2015 02:13 AM
    setInterval('updateClock()', 1000);

    $('.start-playing').click(function(){
        $('#gallery').slideUp(1000);
        $('#play-section').slideDown(1000);
    });
});

/*
 * Date Time Clock Display
 * By Jevison7x Dec 12, 2015 02:10 AM
 */
function updateClock()
{
    var currentTime = new Date();
    var second = currentTime.getSeconds();
    var minute = currentTime.getMinutes();
    var hour = currentTime.getHours();
    var days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    var months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];
    var day = days[currentTime.getDay()];
    var date = currentTime.getDate();
    var month = months[currentTime.getMonth()];
    var year = currentTime.getFullYear();

    // Pad the minutes and seconds with leading zeros, if required
    minute = (minute < 10 ? "0" : "") + minute;
    second = (second < 10 ? "0" : "") + second;

    // Choose either "AM" or "PM" as appropriate
    var timeOfDay = (hour < 12) ? "AM" : "PM";

    // Convert the hours component to 12-hour format if needed
    hour = (hour > 12) ? hour - 12 : hour;

    // Convert an hours component of "0" to "12"
    hour = (hour === 0) ? 12 : hour;

    // Compose the string for display
    var currentTimeString = day + " " + month + " " + date + ", " + year + " " + hour + ":" + minute + ":" + second + " " + timeOfDay;


    $("#clock-div").html(currentTimeString);
}