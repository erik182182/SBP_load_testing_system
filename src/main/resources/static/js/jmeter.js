$(document).ready(function () {
    $(".jmeter-set-btn").on("click", function () {
        let data = {
            userNumber: $("#inputUserNumber").val(),
            rampup: $("#inputRampup").val(),
            loopCount: $("#inputLoopCount").val(),
            expiration: $("#inputJmsExpiration").val(),
            priority: $("#inputJmsPriority").val(),
            xmlDirectory: $("#inputXmlDirectory").val(),
            interfaceView: $('input[name="inputInterfaceView"]:checked').val()
        };
        $.ajax({
            type: "POST",
            url: "/jmeter",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "text json",
            success: function(){
                $(".div-load").removeClass("display-none");
            },
            error: function() {
                alert("Произошла ошибка.");
            }
        });
    });
});