<#import "macro.ftlh" as m/>

<!DOCTYPE html>
<html>
<@m.head id="jms" title="Просмотр JMS"/>
<body>
<@m.nav id="nav" active="jms"/>
<div class="container">
    <div class="card text-center form-card">
        <div class="card-header form-header">
            Настройки подключения к IBM MQ
        </div>
        <div class="card-body">
            <form>
                <div class="form-group row">
                    <label for="inputHost" class="col-sm-2 col-form-label">Хост</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputHost" value="${host}" readonly>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputPort" class="col-sm-2 col-form-label">Порт</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputPort" value="${port?c}" readonly>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputManager" class="col-sm-2 col-form-label">Имя менеджера очередей</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputManager" value="${manager}" readonly>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputChannel" class="col-sm-2 col-form-label">Канал</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputChannel" value="${channel}" readonly>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputInQueue" class="col-sm-2 col-form-label">Входящая очередь</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputInQueue" value="${inq}" readonly>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputOutQueue" class="col-sm-2 col-form-label">Исходящая очередь</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputOutQueue" value="${outq}" readonly>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <a href="/jms/messages" class="btn btn-primary form-btn">Подтвердить</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/jquery/jquery-3.6.0.min.js"></script>
</html>