<?php
$directoryURI = $_SERVER['REQUEST_URI'];
$path = parse_url($directoryURI, PHP_URL_PATH);
$components = explode('/', $path);
$first_part = $components[1];

echo '<div class="wrap">
<div class="wrapper">
<div class="logo">
	<a href="index.html"><h1>CURSAC</h1></a>
</div>
<div class="header_right">
	<div class="cssmenu">
		<ul>
		  	<li class="active"><a href="index.html"><span>Home</span></a></li>
			<li><a href="prepost.html"><span>Pre y post</span></a></li>
			<li><a href="#"><span>Horarios</span></a></li>
			<li><a href="#"><span>Pensum</span></a></li>
			<li><a href="#"><span>Contacto</span></a></li>
			<div class="clear"></div>
		 </ul>
	</div>
</div>
	<div class="clear"></div>
</div>
</div>
';

?>