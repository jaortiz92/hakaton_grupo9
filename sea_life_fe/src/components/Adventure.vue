<template>
  <article>
    <a @click="play(1)">
      <img src="../assets/img/coral_adv.jpeg" div id="circle1"
    /></a>
    <a @click="play(2)">
      <img src="../assets/img/caves_adv.jpeg" div id="circle2"
    /></a>
    <a @click="play(3)">
      <img src="../assets/img/whales_adv.jpeg" div id="circle3"
    /></a>
  </article>
</template>
<script>
export default {
  name: "Adventure",
  data: function () {},
  methods: {
    play: function (value) {
      this.$emit("loadPlay", value);
    },
  },
};
</script>
<style scoped>
/*titulo*/
.bienvenida img {
  width: 50px;
  opacity: 1;
  position: absolute;
  text-align: center;
  top: 50%;
  left: 47%;
}

h1 {
  color: yellow;
  font-size: 70px;
  font-family: sans-serif;
  text-align: center;
  position: absolute;
  top: 30%;
  left: 50%;
  transform: translate(-50%, -50%);
  font-weight: 200;
}
/*End Titulo*/

/*zocalo*/

img {
  opacity: 0.9;
  width: 1450px;
  height: 800px;
  position: fixed;
  display: inline;
  top: 0;
  left: 0;
  z-index: -1;
}

/*Animación items*/
article img {
  opacity: 0.3;
  padding: 80;
  width: 150px; /*Ancho inicial*/
  height: 150px;
  padding: 40px;
  transition: width 3s, height 3s, transform 2s; /*Cambia el ancho inicial al ancho en hover*/
  z-index: 999;
  border-radius: 50%;
}

article img:hover {
  opacity: 1;
  padding: 80px;
  width: 250px; /*ancho final*/
  height: 250px;
  transform: rotate(360deg); /*gira la imagen una vuelta completa*/
  z-index: 999;
  border-radius: 50%;
}

article img:hover:after {
  opacity: 1;
  border-radius: 50%;
}

/*Adventures*/
#circle1 {
  position: absolute;
  top: 25%;
  left: 10%;
}

#circle2 {
  position: absolute;
  top: 35%;
  left: 40%;
}
#circle3 {
  position: absolute;
  top: 45%;
  left: 70%;
}

/*End Adventures*/

/*End divs-items*/
</style>