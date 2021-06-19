<#import "macro.ftlh" as m/>

<!DOCTYPE html>
<html>
<@m.head id="main" title="Главная страница"/>
<body>
<div id="overlay">
    <img src="/files/sbp_logo.jpg">
</div>
<div class="main-span">
    <h1>Система нагрузочного тестирования СБП</h1>
</div>
<div class="container main-container">
    <div class="row justify-content-center">
        <div class="col col-4">
        <a class="btn btn-primary btn-lg" href="/db-settings" role="button">Генератор XML-сообщений</a>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col col-4">
        <a class="btn btn-primary btn-lg" href="/jmeter" role="button">Реализация потока нагрузки</a>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col col-4">
        <a class="btn btn-primary btn-lg" href="/jms" role="button">Просмотр JMS</a>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col col-4">
        <button class="btn btn-primary btn-lg" role="button" disabled>Результаты тестирования</button>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/jquery/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/js/main.js"></script>
</html>