<#import "macro.ftlh" as m/>

<!DOCTYPE html>
<html>
<@m.head id="jmeter" title="JMeter"/>
<body>
<@m.nav id="nav" active="jmeter"/>
<div class="div-load display-none">
    <div class="three-quarters-loader load">
    </div>
    <div class="row justify-content-center">
        <span class="loaded-title">Генерация нагрузки...</span>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="card text-center form-card col">
            <div class="card-header form-header">
                Настройки подключения к фабрике соединений
            </div>
            <div class="card-body">
                <form>
                    <div class="form-group row">
                        <label for="inputFactoryName" class="col-sm-4 col-form-label">Имя фабрики соединений</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="inputFactoryName" value="${factoryName}" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputInitialFactory" class="col-sm-4 col-form-label">Фабрика начального контекста</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="inputInitialFactory" value="${initialFactory}" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputProvidedUrl" class="col-sm-4 col-form-label">URL поставщика</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="inputProvidedUrl" value="${providedUrl}" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputInObject" class="col-sm-4 col-form-label">Объект входящей очереди</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="inputInObject" value="${inObjectName}" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputOutObject" class="col-sm-4 col-form-label">Объект исходящей очереди</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="inputOutObject" value="${outObjectName}" readonly>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="col col-1">
        </div>
        <div class="card text-center form-card col">
            <div class="card-header form-header">
                Настройки JMS-сообщений
            </div>
            <div class="card-body">
                <form>
                    <div class="form-group row">
                        <label for="inputUserNumber" class="col-sm-4 col-form-label">Количество параллельных потоков</label>
                        <div class="col-sm-8">
                            <input type="number" class="form-control" id="inputUserNumber" value="${userNumber?c}">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputRampup" class="col-sm-4 col-form-label">Ramp-up период</label>
                        <div class="col-sm-8">
                            <input type="number" class="form-control" id="inputRampup" value="${rampup?c}">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputLoopCount" class="col-sm-4 col-form-label">Количество циклов</label>
                        <div class="col-sm-8">
                            <input type="number" class="form-control" id="inputLoopCount" value="${numberLoopCount?c}">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputJmsExpiration" class="col-sm-4 col-form-label">Истечение срока сообщения (мс)</label>
                        <div class="col-sm-8">
                            <input type="number" class="form-control" id="inputJmsExpiration" value="${jmsExpiration?c}">
                            <small class="form-text text-muted">Значение "0" - неограниченный срок сообщения.</small>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputJmsPriority" class="col-sm-4 col-form-label">Приоритет сообщения</label>
                        <div class="col-sm-8">
                            <input type="number" class="form-control" id="inputJmsPriority" value="${jmsPriority?c}">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="card text-center form-card-2 col-8">
            <div class="card-header form-header">
                Настройки JMeter
            </div>
            <div class="card-body">
                <form>
                    <div class="form-group row">
                        <label for="inputXmlDirectory" class="col-sm-4 col-form-label">Адрес директории с отправляемыми сообщениями</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="inputXmlDirectory" value="${xmlDirectory}">
                        </div>
                    </div>
                    <fieldset class="form-group row">
                        <div class="row">
                            <legend class="col-form-label col-sm-4 pt-0">Запуск:</legend>
                            <div class="col-sm-7">
                                <div class="form-check form-radio">
                                    <input class="form-check-input" type="radio" name="inputInterfaceView" id="gridRadios1" value="CONSOLE" checked>
                                    <label class="form-check-label" for="gridRadios1">
                                        Без графического интерфейса <span class="recommend">(рекомендуется)</span>
                                    </label>
                                </div>
                                <div class="form-check form-radio">
                                    <input class="form-check-input" type="radio" name="inputInterfaceView" id="gridRadios2" value="GRAPHICAL">
                                    <label class="form-check-label" for="gridRadios2">
                                        С графическим интерфейсом
                                    </label>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
    <div class="row justify-content-md-center">
        <button class="btn btn-primary col-sm-2 jmeter-set-btn" type="submit">Подтвердить</button>
    </div>
</div>
</body>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/jquery/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/js/jmeter.js"></script>
</html>