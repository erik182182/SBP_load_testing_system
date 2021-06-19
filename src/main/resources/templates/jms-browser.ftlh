<#import "macro.ftlh" as m/>

<!DOCTYPE html>
<html>
<@m.head id="jms" title="Просмотр JMS"/>
<body>
<@m.nav id="nav" active="jms"/>
<div class="div-load">
    <div class="three-quarters-loader load">
        Loading...
    </div>
</div>
<div class="container queue-container">
    <div class="row">
        <div class="col-sm">
            <div class="card">
                <div class="card-header card-header-queue">
                    Входящая очередь: ${inq}
                </div>
                <ul class="list-group list-group-flush">
                    <#if inq_messages?size != 0>
                        <#list inq_messages as message>
                            <li class="list-group-item">
                                <span class="badge bg-primary rounded-pill">${message?index + 1}</span>
                                <button type="button" class="btn btn-primary look-btn">Просмотреть информацию</button>
                                <br>
                                <span class="xml-item" data-type="content">${message.content}</span>
                                <span class="display-none" data-type="appId">${message.appId}</span>
                                <span class="display-none" data-type="characterSet">${message.characterSet}</span>
                                <span class="display-none" data-type="encoding">${message.encoding}</span>
                                <span class="display-none" data-type="format">${message.format}</span>
                                <span class="display-none" data-type="messageId">${message.messageId}</span>
                                <span class="display-none" data-type="priority">${message.priority}</span>
                                <span class="display-none" data-type="timestamp">${message.timestamp}</span>
                                <span class="display-none" data-type="userId">${message.userId}</span>
                            </li>
                        </#list>
                    </#if>
                    <#if inq_messages?size == 0>
                        <li class="list-group-item empty-queue">
                            <span class="empty-queue">Список сообщений пуст.</span>
                        </li>
                    </#if>
                </ul>
            </div>
        </div>
        <div class="col-sm">
            <div class="card">
                <div class="card-header card-header-queue">
                    Исходящая очередь: ${outq}
                </div>
                <ul class="list-group list-group-flush">
                    <#if outq_messages?size != 0>
                        <#list outq_messages as message>
                            <li class="list-group-item">
                                <span class="badge bg-primary rounded-pill">${message?index + 1}</span>
                                <button type="button" class="btn btn-primary look-btn">Просмотреть информацию</button>
                                <br>
                                <span class="xml-item" data-type="content">${message.content}</span>
                                <span class="display-none" data-type="appId">${message.appId}</span>
                                <span class="display-none" data-type="characterSet">${message.characterSet}</span>
                                <span class="display-none" data-type="encoding">${message.encoding}</span>
                                <span class="display-none" data-type="format">${message.format}</span>
                                <span class="display-none" data-type="messageId">${message.messageId}</span>
                                <span class="display-none" data-type="priority">${message.priority}</span>
                                <span class="display-none" data-type="timestamp">${message.timestamp}</span>
                                <span class="display-none" data-type="userId">${message.userId}</span>
                            </li>
                        </#list>
                    </#if>
                    <#if outq_messages?size == 0>
                        <li class="list-group-item empty-queue">
                            <span class="empty-queue">Список сообщений пуст.</span>
                        </li>
                    </#if>
                </ul>
            </div>
        </div>
    </div>
</div>

<div class="modal fade bd-example-modal-lg" tabindex="-1" id="modalWindow">
    <div class="modal-dialog  modal-lg">
        <div class="modal-content modal-custom">
            <div class="modal-header">
                <h5 class="modal-title">Просмотр сообщения</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group row">
                        <label for="inputMessageId" class="col-sm-2 col-form-label">ID сообщения</label>
                        <div class="col-sm-15">
                            <input type="text" class="form-control" id="inputMessageId" value="" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputTimestamp" class="col-sm-2 col-form-label">Время занесения</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputTimestamp" value="" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputPriority" class="col-sm-2 col-form-label">Приоритет</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputPriority" value="" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputUserId" class="col-sm-2 col-form-label">ID пользователя</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputUserId" value="" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputAppId" class="col-sm-2 col-form-label">ID приложения</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputAppId" value="" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputEncoding" class="col-sm-2 col-form-label">Кодировка</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputCharacterSet" value="" readonly>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputContent">Содержание</label>
                        <br>
                        <span id="inputContent"></span>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Закрыть</button>
            </div>
        </div>
    </div>
</div>

</body>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/jquery/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/tree-xml-formatter/js/simpleXML.js"></script>
<script type="text/javascript" src="/js/browser.js"></script>
</html>