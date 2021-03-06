<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Cursos USAC | Home :: AYD2 2015</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href='http://fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>
        <link href="CSS/style.css" rel="stylesheet" type="text/css" media="all" />
        <link href="CSS/camera.css" rel="stylesheet" type="text/css" media="all" />
        <script type='text/javascript' src="http://cursosusac.site90.net/LIB/jquery.min.js"></script>
        <script type='text/javascript' src="http://cursosusac.site90.net/LIB/jquery.mobile.customized.min.js"></script>
        <script type='text/javascript' src="http://cursosusac.site90.net/LIB/jquery.easing.1.3.js"></script> 
        <script type='text/javascript' src="http://cursosusac.site90.net/LIB/camera.min.js"></script> 

        <script>
            jQuery(function () {

                jQuery('#camera_wrap_4').camera({
                    height: 'auto',
                    loader: 'bar',
                    pagination: false,
                    thumbnails: true,
                    hover: false,
                    opacityOnGrid: false,
                    imagePath: '../IMG/'
                });

            });
        </script>
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
                            <li class="active"><a href="index.jsp"><span>Home</span></a></li>
                            <li id="lblprepost" name="lblprepost"><a href="consultarCurso.jsp"><span>Pre y post</span></a></li>
                            <li><a href="horario"><span>Horarios</span></a></li>
                            <li><a href="pensum.jsp"><span>Pensum</span></a></li>
                            <li><a href="#"><span>Contacto</span></a></li>

                        </ul>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>

        <div class="fluid_container">
            <div class="camera_wrap camera_emboss pattern_1" id="camera_wrap_4">
                <div data-src="IMG/slider1.jpg"> </div>
                <div data-src="IMG/slider2.jpg"> </div>
                <div  data-src="IMG/slider3.jpg"> </div>
            </div>
        </div>
        <div class="clear"></div>
        <div class="wrap">
            <div class="wrapper">
                <div class="main_text">
                    <h2>A place of light, of liberty, and learning</h2>
                    <h3>we provide leading intensive courses</h3>
                </div>	
                <div class="grids_1_of_4">
                    <div class="grid_1_of_4 images_1_of_4 bg1">
                        <img src="IMG/icon1.png">
                    </div>
                    <div class="grid_1_of_4 images_1_of_4 bg2">
                        <img src="IMG/icon2.png">
                    </div>
                    <div class="grid_1_of_4 images_1_of_4 bg3 hide">
                        <img src="IMG/icon3.png">
                    </div>
                    <div class="grid_1_of_4 images_1_of_4 bg4 hide">
                        <img src="IMG/icon4.png">
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="section group">
                    <div class="col_1_of_4 span_1_of_4">
                        <h3>Mauris at eratos</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                        <div class="text1-nav">
                            <ul>
                                <li><a href="">The standard chunk of</a></li>
                                <li><a href="">Duis a augue euismod</a></li>
                                <li><a href="">The standard of Lorem</a></li>
                                <li><a href="">Duis a augue euismod</a></li>
                            </ul>
                        </div>
                        <div class="button">
                            <a href="details.php">learn more</a>
                        </div>
                    </div>
                    <div class="col_1_of_4 span_1_of_4">
                        <h3>imperdiet dolor</h3>
                        <p>Ut enim ad minim veniam,laboris commodo consequat.Duis aute dolor in reprehenderit in voluptate velit esse cillum dolore nulla pariatur.</p>
                        <div class="text1-nav">
                            <ul>
                                <li><a href="">The standard chunk of</a></li>
                                <li><a href="">Duis a augue euismod</a></li>
                                <li><a href="">The standard of Lorem</a></li>
                                <li><a href="">Duis a augue euismod</a></li>
                            </ul>
                        </div>
                        <div class="button">
                            <a href="details.php">learn more</a>
                        </div>
                    </div>
                    <div class="col_1_of_4 span_1_of_4 hide">
                        <h3>Sed porta justjm</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                        <div class="text1-nav">
                            <ul>
                                <li><a href="">The standard chunk of</a></li>
                                <li><a href="">Duis a augue euismod</a></li>
                                <li><a href="">The standard of Lorem</a></li>
                                <li><a href="">Duis a augue euismod</a></li>
                            </ul>
                        </div>
                        <div class="button">
                            <a href="details.php">learn more</a>
                        </div>
                    </div>
                    <div class="col_1_of_4 span_1_of_4 hide">
                        <h3>nisi vulputate</h3>
                        <p>Ut enim ad minim veniam,laboris commodo consequat.Duis aute dolor in reprehenderit in voluptate velit esse cillum dolore nulla pariatur.</p>
                        <div class="text1-nav">
                            <ul>
                                <li><a href="">The standard chunk of</a></li>
                                <li><a href="details.php">Duis a augue euismod</a></li>
                            </ul>
                        </div>
                        <div class="button">
                            <a href="details.php">learn more</a>
                        </div>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
        <div class="main_bg">
            <div class="wrap">
                <div class="wrapper">
                    <div class="main">
                        <div class="grid_1_of_2 images_1_of_2">
                            <h4>Lorem Ipsum is simply <span>dummy text of the</span> ornare vulputate printing and typesetting There are many variations of passages of.</h4>
                            <p class="para">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. </p>
                            <div class="button1">
                                <a href="details.php" class="btn btn_s">view More</a>
                            </div>
                        </div>
                        <div class="grid_1_of_2 images_1_of_2 img_style">
                            <img src="IMG/pic1.jpg" alt="">
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
            </div>
        </div>
        '<div class="wrap">
            <div class="wrapper">
                <div class="footer">
                    <div class="social-icons">
                        <ul>
                            <li class="icon_1"><a href="#" target="_blank"> </a></li>
                            <li class="icon_2"><a href="#" target="_blank"> </a></li>
                            <li class="icon_3"><a href="#" target="_blank"> </a></li>
                            <li class="icon_4"><a href="#" target="_blank"> </a></li>

                        </ul>
                    </div>
                    <a href="index.jsp"><h2>CURSAC</h2></a>
                    <div class="copy">
                        <p class="w3-link">Â© Todos los derechos reservados | Analisis y diseÃ±o 2 FIUSAC 2015</p>
                    </div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
    </body>
</html>