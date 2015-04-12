<%-- 
    Document   : prepost
    Created on : Apr 2, 2015, 1:21:36 PM
    Author     : Chaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title> Mi horario </title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href='http://fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>
        <link href="CSS/style.css" rel="stylesheet" type="text/css" media="all" />
        <link rel="stylesheet" href="CSS/jquery.jOrgChart.css"/>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.16/jquery-ui.min.js"></script>


    </head>
    <body>
        <div class="wrap">
            <div class="wrapper">
                <div class="logo">
                    <a href="index.jsp"><h1>CURSAC</h1></a>
                </div>
                <div class="header_right">
                    <div class="cssmenu">
                        <ul>
                            <li class="noactive"><a href="index.jsp"><span>Home</span></a></li>
                            <li class="noactive"><a href="consultarCurso.jsp"><span>Pre y post</span></a></li>
                            <li class="active"><a href="horario"><span>Horarios</span></a></li>
                            <li class="has-sub"><a href="#"><span>Pensum</span></a></li>
                            <li "last"><a href="contact.html"><span>Contacto</span></a></li>
                            <div class="clear"></div>
                        </ul>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <div class="main_bg">
            <div class="wrap">
                <div class="wrapper">
                    <div class="main1">
                        <div class="grid_1_of_2 images_1_of_2">
                            <h2 class="style"> Mi horario </h2>
                                Total asignaciones: ${requestScope['asginaciones']}
                                Total traslapes: ${requestScope['traslapes']}
                        </div>
                    </div>
                </div>
            </div>
            <div class="wrap">
                <div class="wrapper">
                    <div class="footer">
                        <div class="social-icons">
                            <ul>
                                <li class="icon_1"><a href="#" target="_blank"> </a></li>
                                <li class="icon_2"><a href="#" target="_blank"> </a></li>
                                <li class="icon_3"><a href="#" target="_blank"> </a></li>
                                <li class="icon_4"><a href="#" target="_blank"> </a></li>
                                <div class="clear"></div>
                            </ul>
                        </div>
                        <a href="index.jsp"><h2>CURSAC</h2></a>
                        <div class="copy">
                            <p class="w3-link">© Todos los derechos reservados | Analisis y diseño 2 FIUSAC 2015</p>
                        </div>
                    </div>
                </div>
                <div class="clear"></div>
            </div></body>
</html>
