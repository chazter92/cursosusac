<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>

<?php 	
	require_once 'config.php';
	require_once 'conexion.php';
	 
	$conexion = conectar();
	
	if(isset($_GET['id'])){
		$id_curso = trim($_GET['id']);
	$cursos=mysql_query("SELECT * FROM CURSO WHERE codigo = ".$id_curso,$conexion) or
	  die("Problemas en el select:".mysql_error());
	  
	  if($curso=mysql_fetch_array($cursos)){
		  $titulo = $curso['nombre'];		  
	  }else{
		 header('Location: prepost.php');
	  }
	}else{
		  $titulo = "CURSAC | Pre y post";
	}
?>;


<title><?php echo $titulo;?></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href='http://fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>
<link href="CSS/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<?php include_once('header.php');?>
<div class="main_bg">
<div class="wrap">
<div class="wrapper">
	<div class="main1">
			<div class="grid_1_of_2 images_1_of_2">
            <?php if(isset($_GET['id'])):?>
				<table border="1" align="center">
                	<tr>
                    	<td><b>Código:</b></td>
                        <td><?php echo $curso["codigo"];?></td>
                    </tr>
                    <tr>
                    	<td><b>Nombre:</b></td>
                        <td><?php echo $curso["nombre"];?></td>
                    </tr>
                    <tr>
                    	<td><b>Créditos:</b></td>
                        <td><?php echo $curso["creditos"];?></td>
                    </tr>
                </table>
                </br>
			<?php
			
            	$cursos_post=mysql_query("SELECT C.* FROM CURSO C JOIN CURSO_PRE_POST P ON C.codigo = P.hijo WHERE P.padre = ".$id_curso,$conexion) or
	  die("Problemas en el select:".mysql_error());
	  					echo '<br> Post requisitos: ';
						
						if(mysql_num_rows($cursos_post)>0){
						
						echo '</br><table border="1" align="center"><tr><th>Código</th><th>Nombre</th><th>Créditos</th></tr>';
	  					while ($curso_post = mysql_fetch_array($cursos_post)){
								echo '<tr><td>'.$curso_post['codigo'].'</td><td>'.$curso_post['nombre'].'</td><td>'.$curso_post['creditos'].'</td></tr>';
						}
						echo '</table>';
						}else{
							echo 'NINGUNO';
						}
				$cursos_pre=mysql_query("SELECT C.* FROM CURSO C JOIN CURSO_PRE_POST P ON C.codigo = P.padre WHERE P.hijo =".$id_curso,$conexion) or
	  die("Problemas en el select:".mysql_error());
	  
	  
	  					echo '<br> Pre requisitos: ';
						
						if(mysql_num_rows($cursos_pre)>0){
						echo '</br><table border="1" align="center"><tr><th>Código</th><th>Nombre</th><th>Créditos</th></tr>';
	  					while ($curso_pre = mysql_fetch_array($cursos_pre)){
								echo '<tr><td>'.$curso_pre['codigo'].'</td><td>'.$curso_pre['nombre'].'</td><td>'.$curso_pre['creditos'].'</td></tr>';
						}
						echo '</table>';		
						}else{
							echo 'NINGUNO';	
						}
             else:?>
				<h2 class="style">Cursos pre y post requisito</h2>
				<p class="para top">Muchas veces como estudiantes queremos obtener información sobre los cursos que llevamos y los cursos que le siguen a este, pero es bastante complicado tomar un folleto con el pensum de la carrera y comenzar a buscar uno por uno los códigos diminutos de cada curso ¿Por qué no hacerlo más fácil? Nosotros te ayudaremos ¡Que la magía comience! </p>
                <form action="prepost.php" method=GET>
                	<br>Código:
                    <input type="text" name="id">
                    <br>
                    <div class="button1">
					<input type="submit" value="Do it!" class="btn btn_s">
					</div>
                </form>
				
                
            <?php endif?>
			</div>
			<div class="grid_1_of_2 images_1_of_2 img_style">
				<img src="IMG/pic3.jpg" alt="">
			</div>
			<div class="clear"></div>
	</div>
</div>
</div>
</div>
<?php include_once ('footer.php');?>
</body>
</html>