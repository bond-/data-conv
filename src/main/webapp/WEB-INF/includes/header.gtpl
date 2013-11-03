<!doctype html>
<html>
<head>
    <title>Gaelyk</title>
    <link rel="shortcut icon" href="/images/gaelyk-small-favicon.png" type="image/png">
    <link rel="icon" href="/images/gaelyk-small-favicon.png" type="image/png">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
    <script type="text/javascript" src="/js/jquery-2.0.3.min.js">
    </script>
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
    <style type="text/css">
    body {
        padding-top: 60px;
    }
    </style>
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">Data Converter</a>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="${request.servletPath == '/WEB-INF/pages/index.gtpl' ? 'active' : ''}"><a href="/">Home</a></li>
                <li class="${request.servletPath == '/WEB-INF/pages/datetime.gtpl' ? 'active' : ''}"><a href="/datetime">Current Time</a></li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>

<div class="container">
