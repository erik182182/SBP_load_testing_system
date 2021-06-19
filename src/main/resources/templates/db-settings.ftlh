<#import "macro.ftlh" as m/>

<!DOCTYPE html>
<html>
<@m.head id="generator" title="Настройки базы данных"/>
<body>
<@m.nav id="nav" active="generator"/>
<div class="container">
    <div class="card text-center form-card">
        <div class="card-header form-header">
            Настройки подключения к базе данных
        </div>
        <div class="card-body">
            <form>
                <div class="form-group row">
                    <label for="inputDbUrl" class="col-sm-3 col-form-label">URL базы данных</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="inputDbUrl" value="${dbUrl}" readonly>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputDbDriverClassName" class="col-sm-3 col-form-label">Драйвер для подключения</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="inputDbDriverClassName" value="${dbDriverClassName}" readonly>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputUsername" class="col-sm-3 col-form-label">Имя пользователя</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="inputUsername" value="${dbUsername}" readonly>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputPassword" class="col-sm-3 col-form-label">Пароль</label>
                    <div class="col-sm-9">
                        <input type="password" class="form-control" id="inputPassword" value="${dbPassword}" readonly>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <a href="/generator" class="btn btn-primary form-btn">Подтвердить</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</html>