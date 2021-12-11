<template>
  <img src="zocalo.png" /> <img src="../assets/img/zocalo.png" /><img
    src="../assets/img/zocalo.png"
  />

  <div class="bienvenida">
    <!--<h1>Bienvenido Janfry</h1>-->
    <a href="#"></a>
  </div>

  <a href="#coral"> <img src="../assets/img/2.png" div id="circle1" /></a>
  <a href="#cardumen"> <img src="../assets/img/3.png" div id="circle2" /></a>
  <a href="#pez_amarillo">
    <img src="../assets/img/4.png" div id="circle3"
  /></a>
  <a href="#pez_rayado"> <img src="../assets/img/5.png" div id="circle4" /></a>
  <a href="#vidrio"> <img src="../assets/img/6.png" div id="circle5" /></a>
  <a href="#bag"> <img src="../assets/img/bag.png" div id="circle6" /></a>
  <a href="#bag"> <img src="../assets/img/gris-azul.png" div id="circle7" /></a>
  <a href="#tropical">
    <img src="../assets/img/tropical.png" div id="circle8"
  /></a>
  <a href="#tropical"> <img src="../assets/img/9.png" div id="circle9" /></a>
</template>
<script>
export default {
  name: "PlayAdventure",
  data: function () {},
};
</script>
<style>
/*Animación items*/
article img {
  opacity: 0.01;
  padding: 80;
  width: 10px; /*Ancho inicial*/
  height: 10px;
  padding: 40px;
  transition: width 3s, height 3s, transform 2s; /*Cambia el ancho inicial al ancho en hover*/
  z-index: 999;
}

article img:hover {
  opacity: 1;
  padding: 80px;
  width: 250px; /*ancho final*/
  height: 250px;
  transform: rotate(360deg); /*gira la imagen una vuelta completa*/
  z-index: 999;
}

article img:hover:after {
  content: url(image/circle.PNG); /* no need for quotes */
  opacity: 1;
}

#circle1 {
  position: absolute;
  top: 33%;
  left: 2%;
  -ms-transform: skewY(20deg); /* IE 9 */
  transform: skewY(20deg);
}

#circle2 {
  position: absolute;
  top: 63%;
  left: 38%;
}
#circle3 {
  position: absolute;
  top: 41%;
  left: 35%;
}
#circle4 {
  position: absolute;
  top: 57%;
  left: 67%;
}
#circle5 {
  position: absolute;
  top: 65%;
  left: 52%;
}
#circle6 {
  position: absolute;
  top: 10%;
  left: 73%;
}
#circle7 {
  position: absolute;
  top: 5%;
  left: 34%;
}
#circle8 {
  position: absolute;
  top: 50%;
  left: 74%;
}
#circle9 {
  position: absolute;
  top: 5%;
  left: 54%;
}

/*End divs-items*/
</style>