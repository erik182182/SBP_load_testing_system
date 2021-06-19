$(document).ready(function () {
    $(".xml-item").each(function () {
        var xml = $(this).text();
        $(this).empty().simpleXML({
            xmlString: xml,
        });
    });

    $(".div-load").remove();

    $(".look-btn").on("click", function () {
        $("#inputMessageId").val($(this).parent().children("span[data-type=\"messageId\"]").text());
        $("#inputTimestamp").val($(this).parent().children("span[data-type=\"timestamp\"]").text());
        $("#inputPriority").val($(this).parent().children("span[data-type=\"priority\"]").text());
        $("#inputUserId").val($(this).parent().children("span[data-type=\"userId\"]").text());
        $("#inputAppId").val($(this).parent().children("span[data-type=\"appId\"]").text());
        $("#inputCharacterSet").val($(this).parent().children("span[data-type=\"characterSet\"]").text());
        $("#inputContent").text($(this).parent().children("span[data-type=\"content\"]").text());
        var xmlContent = $("#inputContent").text();
        $("#inputContent").empty().simpleXML({
            xmlString: xmlContent,
        });
        $("#modalWindow").modal("show");
    });
});