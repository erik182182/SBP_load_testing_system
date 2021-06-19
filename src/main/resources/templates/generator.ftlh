<#import "macro.ftlh" as m/>

<!DOCTYPE html>
<html>
<@m.head id="generator" title="Генератор XML сообщений"/>
<body>
<@m.nav id="nav" active="generator"/>
<div class="div-load display-none">
    <div class="three-quarters-loader load">
    </div>
    <div class="row justify-content-center">
        <span class="loaded-title">Генерация XML-сообщений...</span>
    </div>
</div>
<div class="container generator-form">
    <div class="row justify-content-center">
        <div class="card text-center form-card col-8">
            <div class="card-header form-header">
                Настройки генерации ED701-сообщений
            </div>
            <div class="card-body">
                <form>
                    <div class="form-group row">
                        <label for="inputMessageCount" class="col-sm-6 col-form-label">Количество генерируемых сообщений</label>
                        <div class="col-sm-6">
                            <input type="number" class="form-control" id="inputMessageCount">
                        </div>
                    </div>
                    <div class="form-check generator-check col-sm-8">
                        <input class="form-check-input" type="checkbox" value="" id="defaultCheck1" checked>
                        <label class="form-check-label" for="defaultCheck1">
                            Канонизация XML-сообщений <span class="recommend">(рекомендуется)</span>
                        </label>
                    </div>
                    <div class="form-check generator-check col-sm-8">
                        <input class="form-check-input" type="checkbox" value="" id="defaultCheck2" checked>
                        <label class="form-check-label" for="defaultCheck2">
                            Кодирование сообщений с помощью Base-64 <span class="recommend">(рекомендуется)</span>
                        </label>
                    </div>
                    <div class="form-check generator-check col-sm-8">
                        <input class="form-check-input" type="checkbox" value="" id="defaultCheck3" checked>
                        <label class="form-check-label" for="defaultCheck3">
                            Упаковка сообщений в транспортный конверт <span class="recommend">(рекомендуется)</span>
                        </label>
                    </div>
                    <fieldset class="form-group row">
                        <div class="row">
                            <legend class="col-form-label col-sm-3 pt-0">Тип ED701:</legend>
                            <div class="col-sm-4">
                                <div class="form-check form-radio">
                                    <input class="form-check-input" type="radio" name="inputEdType" id="gridRadios1" value="ff" checked>
                                    <label class="form-check-label" for="gridRadios1">
                                        ФИЗ - ФИЗ (CCPL, CCPH)
                                    </label>
                                </div>
                                <div class="form-check form-radio">
                                    <input class="form-check-input" type="radio" name="inputEdType" id="gridRadios2" value="uf">
                                    <label class="form-check-label" for="gridRadios2">
                                        ЮР- ФИЗ (BCPH)
                                    </label>
                                </div>
                                <div class="form-check form-radio">
                                    <input class="form-check-input" type="radio" name="inputEdType" id="gridRadios3" value="fu">
                                    <label class="form-check-label" for="gridRadios3">
                                        ФИЗ-ЮР (CBPH)
                                    </label>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    <div class="form-group row form-margin-top">
                        <label for="inputMessageCount" class="col-sm-6 col-form-label">Адрес папки для результатов генерации</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="inputResultDirectoryUrl">
                        </div>
                    </div>
                    <fieldset class="form-group row">
                        <div class="row">
                            <legend class="col-form-label col-sm-4 pt-0">Способ генерации:</legend>
                            <div class="col-sm-6">
                                <div class="form-check form-radio">
                                    <input class="form-check-input" type="radio" name="inputGenerateMethod" id="gridRadios11" value="random" checked>
                                    <label class="form-check-label" for="gridRadios11">
                                        Случайная выборка из базы данных
                                    </label>
                                </div>
                                <div class="form-check form-radio">
                                    <input class="form-check-input" type="radio" name="inputGenerateMethod" id="gridRadios22" value="sequence">
                                    <label class="form-check-label" for="gridRadios22">
                                        Последовательная выборка из базы данных
                                    </label>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="card text-center form-card-2 col-12">
            <div class="card-header form-header">
                Просмотр объектов в базе данных
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered form-table">
                        <thead>
                        <tr>
                            <th scope="col">№</th>
                            <th scope="col">Название организации</th>
                            <th scope="col">Адрес</th>
                            <th scope="col">БИК</th>
                            <th scope="col">Кор/счет</th>
                            <th scope="col">Сумма</th>
                            <th scope="col">Вид транзакции</th>
                            <th scope="col">ID транзакции</th>
                            <th scope="col">ID платежа</th>
                            <th scope="col">Издатель</th>
                            <th scope="col">Получатель</th>
                            <th scope="col">Номер документа</th>
                            <th scope="col">Назначение</th>
                        </tr>
                        </thead>
                        <tbody>
                        <#list ed701list as ed701>
                            <tr>
                                <th scope="row"><#if (ed701.edNo)??>${ed701.edNo}</#if></th>
                                <td><#if (ed701.organizationName)??>${ed701.organizationName}</#if></td>
                                <td><#if (ed701.address)??>${ed701.address}</#if></td>
                                <td><#if (ed701.bic)??>${ed701.bic}</#if></td>
                                <td><#if (ed701.correspAcc)??>${ed701.correspAcc}</#if></td>
                                <td><#if (ed701.sum)??>${ed701.sum}</#if></td>
                                <td><#if (ed701.transKind)??>${ed701.transKind}</#if></td>
                                <td><#if (ed701.transactionID)??>${ed701.transactionID}</#if></td>
                                <td><#if (ed701.paymentID)??>${ed701.paymentID}</#if></td>
                                <td><#if (ed701.edAuthor)??>${ed701.edAuthor}</#if></td>
                                <td><#if (ed701.edReceiver)??>${ed701.edReceiver}</#if></td>
                                <td><#if (ed701.accDocNo)??>${ed701.accDocNo}</#if></td>
                                <td><#if (ed701.purpose)??>${ed701.purpose}</#if></td>
                            </tr>
                        </#list>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="row justify-content-md-center">
        <button class="btn btn-primary col-sm-2 generate-btn" type="submit">Сгенерировать</button>
    </div>
</div>
</body>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/jquery/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/js/generator.js"></script>
</html>