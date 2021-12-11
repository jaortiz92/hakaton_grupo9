<template>
  <article>
    <div v-for="index in 8" :key="index">
      <img
        :src="require(`../assets/img/${items[index - 1].description}`)"
        div
        :id="`circle${index}`"
      />
    </div>
  </article>
</template>
<script>
export default {
  name: "PlayAdventure",
  data: function () {
    return {
      items: [
        {
          name: "Ballena azul",
          description: "ballena_azul.png",
          type: 1,
        },
        {
          name: "Ballena gris",
          description: "ballena_gris.png",
          type: 1,
        },
        {
          name: "Ballena jorobada",
          description: "ballena_jorobada.png",
          type: 1,
        },
        {
          name: "Betta",
          description: "betta.png",
          type: 1,
        },
        {
          name: "Cachalote",
          description: "cachalote.png",
          type: 1,
        },
        {
          name: "Koral",
          description: "koral.png",
          type: 1,
        },
        {
          name: "Idolo moro",
          description: "Idolo_moro.png",
          type: 1,
        },
        {
          name: "Mandarin drag",
          description: "mandarin_drag.png",
          type: 1,
        },
      ],
    };
  },
};
</script>
<style scoped>
/*Animación items*/
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
  opacity: 0.01;
  padding: 80;
  width: 70px; /*Ancho inicial*/
  height: 70px;
  padding: 40px;
  transition: width 3s, height 3s, transform 2s; /*Cambia el ancho inicial al ancho en hover*/
  z-index: 999;
  border-radius: 50%;
}

article img:hover {
  opacity: 1;
  padding: 80px;
  width: 400px; /*ancho final*/
  height: 400px;
  transform: rotate(360deg); /*gira la imagen una vuelta completa*/
  z-index: 999;
  border-radius: 50%;
}

article img:hover:after {
  opacity: 1;
  border-radius: 50%;
}

#circle1 {
  position: absolute;
  top: 33%;
  left: 2%;
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
  top: 50%;
  left: 74%;
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