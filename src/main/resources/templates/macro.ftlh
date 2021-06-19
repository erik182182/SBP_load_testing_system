<#macro head id title="">
    <head>
        <meta charset="utf-8">
        <title>${title}</title>
        <link rel="shortcut icon" href="/files/sbp_logo.png"/>
        <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
        <link rel="stylesheet" href="/spinners/spinner/three-quarters.css">
        <link rel="stylesheet" href="/css/styles.css">
        <link rel="stylesheet" href="/tree-xml-formatter/css/simpleXML.css">
    </head>
</#macro>


<#macro nav id active="">
    <nav id="${id}" class="navbar fixed-top navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="/">
                <img src="/files/sbp_logo.png" alt="" width="30" height="24" class="d-inline-block align-text-top">
                <b>СБП</b>
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
                    aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Навигация">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-link <#if active == "generator">active" aria-current="page"</#if>"
                    href="/db-settings">Генератор</a>
                    <a class="nav-link <#if active == "jmeter">active" aria-current="page"</#if>"
                    href="/jmeter">JMeter</a>
                    <a class="nav-link <#if active == "jms">active" aria-current="page"</#if>"
                    href="/jms">Просмотр JMS</a>
                    <a class="nav-link disabled" href="file:///C:/Users/erik1/1Ernest/Programming/Projects/IdeaProjects/SBPStressTestingSystemProject/jmeter/results/index.html">Результаты тестирования</a>
                </div>
            </div>
        </div>
    </nav>
</#macro>