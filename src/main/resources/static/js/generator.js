$(document).ready(function () {
    $(".generate-btn").on("click", function () {
        $(".div-load").removeClass("display-none");
        let data = {
            messageCount: $("#inputMessageCount").val(),
            edType: $('input[name="inputEdType"]:checked').val(),
            resultDirectoryUrl: $("#inputResultDirectoryUrl").val(),
            generateMethod: $('input[name="inputGenerateMethod"]:checked').val()
        };
        $.ajax({
            type: "POST",
            url: "/generator",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "text json",
            success: function(){
                $(".loaded-title").text("Генерация завершена.");
            },
            error: function() {
                alert("Произошла ошибка.");
            }
        });
    });
});