<#import "macro.ftlh" as m/>

<!DOCTYPE html>
<html>
<@m.head id="error" title="Ошибка"/>
<body>
<@m.nav id="nav" active=""/>
<div class="error-main">
    <div class="error-div">
        <h1>${code}</h1>
        <h2>${message}</h2>
    </div>
</div>


</body>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</html>