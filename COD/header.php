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
		  	<li class="'; if($first_part=="index.php" || $first_part==""){echo "active"; }else {echo "noactive";} echo'"><a href="index.php"><span>Home</span></a></li>
			<li class="'; if($first_part=="prepost.php" || $first_part==""){echo "active"; }else {echo "noactive";} echo'"><a href="prepost.php"><span>Pre y post</span></a></li>
			<li class="'; if($first_part=="staff.php" || $first_part==""){echo "active"; }else {echo "noactive";} echo'"><a href="staff.php"><span>Staff</span></a></li>
			<li class="'; if($first_part=="service.php" || $first_part==""){echo "active"; }else {echo "has-sub";} echo'"><a href="service.php"><span>Services</span></a></li>
			<li "'; if($first_part=="contact.php" || $first_part==""){echo "active"; }else {echo "last";} echo'"><a href="contact.php"><span>Contact</span></a></li>
			<div class="clear"></div>
		 </ul>
	</div>
</div>
	<div class="clear"></div>
</div>
</div>
';

?>