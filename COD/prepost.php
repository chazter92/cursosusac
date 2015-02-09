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
<link rel="stylesheet" href="CSS/jquery.jOrgChart.css"/>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.16/jquery-ui.min.js"></script>
<script type="text/javascript" src="LIB/jquery.jOrgChart.js"></script>
<script>
    jQuery(document).ready(function() {
        $("#org").jOrgChart({
			chartElement : '#chart'
        });
    });
    </script>
</head>
<body>
<?php include_once('header.php');?>
<div class="main_bg">
             <div class="wrap">
		     <div class="wrapper">
             <div class="main1">
	             <div class="grid_1_of_2 images_1_of_2">

<div id="chart" class="orgChart"></div>
	
	    
			
            <?php if(isset($_GET['id'])):?>
            
            <ul id="org" style="display:none">
            <li>
              <?php echo $curso['nombre'].'<p>Código: '.$curso['codigo'].'<br>Créditos: '.$curso['creditos'].'</p>';  
             
            	$cursos_post=mysql_query("SELECT C.* FROM CURSO C JOIN CURSO_PRE_POST P ON C.codigo = P.hijo WHERE P.padre = ".$id_curso,$conexion) or
	  die("Problemas en el select:".mysql_error());
	  					
						
						if(mysql_num_rows($cursos_post)>0){
							echo '<ul>';
							while ($curso_post = mysql_fetch_array($cursos_post)){
									echo '<li><a href="prepost.php?id='.$curso_post['codigo'].'">'.$curso_post['nombre'].'</a><p>Código: '.$curso_post['codigo'].'<br>Créditos: '.$curso_post['creditos'].'</p>';
									
									$cursos_post_post=mysql_query("SELECT C.* FROM CURSO C JOIN CURSO_PRE_POST P ON C.codigo = P.hijo WHERE P.padre = ".$curso_post['codigo'],$conexion) or
	  die("Problemas en el select:".mysql_error());
	  							if(mysql_num_rows($cursos_post_post)>0){
									echo '<ul>';
	  								while ($curso_post_post = mysql_fetch_array($cursos_post_post)){
											echo '<li><a href="prepost.php?id='.$curso_post_post['codigo'].'">'.$curso_post_post['nombre'].'</a><p>Código: '.$curso_post_post['codigo'].'<br>Créditos: '.$curso_post_post['creditos'].'</p></li>';
									}
									echo '</ul>';
								}
									echo '</li>';
							}
							echo '</ul>';
							echo '</li></ul>';
						}else{
							echo '</li></ul>';
							echo 'Post Requisitos: NINGUNO';	
						}
						
				$cursos_pre=mysql_query("SELECT C.* FROM CURSO C JOIN CURSO_PRE_POST P ON C.codigo = P.padre WHERE P.hijo =".$id_curso,$conexion) or
	  die("Problemas en el select:".mysql_error());
	  
	  				
	  					echo '<br> Pre requisitos: ';
						
						if(mysql_num_rows($cursos_pre)>0){
						echo '</br><table border="1" align="center">';
	  					while ($curso_pre = mysql_fetch_array($cursos_pre)){
								echo '<tr><td><a href="prepost.php?id='.$curso_pre['codigo'].'">'.$curso_pre['codigo'].' -</a></td><td> <a href="prepost.php?id='.$curso_pre['codigo'].'">'.$curso_pre['nombre'].'</a></td></tr>';
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
				<div class="grid_1_of_2 images_1_of_2 img_style">
				<img src="IMG/pic3.jpg" alt="">
			</div>
                
            <?php endif?>
			</div>
                			
			<div class="clear"></div>
	</div>
</div>
</div>
</div>

<?php include_once ('footer.php');?>
</body>
</html>