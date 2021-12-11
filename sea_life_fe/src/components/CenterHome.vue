<template>
  <div>
    <section class="banner">
      <div class="row"></div>
      <button @click="loadAdventure" class="btnServices">JUGAR</button>
    </section>
  </div>
</template>

<script>
export default {
  name: "Adventure",
  methods: {
    loadAdventure() {
      this.$router.push({ name: "Adventure" });
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
li b.active,
li b:hover {
  background: #3ea7f2;
  transition: 0.5s;
}
.checkbtn {
  font-size: 30px;
  color: #fff;
  cursor: pointer;
  display: none;
}
#check {
  display: none;
}
.banner {
  background: url(../assets/img/fondo.jpeg);
  background-size: cover;
  background-position: center center;
  height: calc(90vh - 10px);
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
.banner .row h2 {
  text-align: center;
  font-size: 4rem;
  color: white;
  margin: 0 1.5rem;
}

.banner .btnServices {
  margin-top: 3rem;
  background-color: #3ea7f2;
  color: #12251c;
  padding: 15px 25px;
  border-radius: 5px;
  font-size: 1.5rem;
}

.change {
  display: inline-block;
  vertical-align: bottom;
  animation: blinker 2s linear infinite;
  animation-delay: -1s;
}

.change span {
  color: #2e2e2e;
  float: left;
  overflow: hidden;
  animation: hideShow 12s linear infinite;
}

.change span:nth-child(1) {
  animation-delay: -0s;
}
.change span:nth-child(2) {
  animation-delay: -2s;
}
.change span:nth-child(3) {
  animation-delay: -4s;
}
.change span:nth-child(4) {
  animation-delay: -6s;
}
.change span:nth-child(5) {
  animation-delay: -8s;
}
.change span:nth-child(6) {
  animation-delay: -10s;
}

@keyframes blinker {
  50% {
    opacity: 0;
  }
}
@keyframes hideShow {
  0%,
  16.6%,
  33.33%,
  100% {
    width: 0;
  }
  16.66%,
  33.3% {
    width: auto;
  }
}

/* MEDIAS QUERIES */
@media (max-width: 952px) {
  nav ul li a {
    font-size: 16px;
  }
}

@media (max-width: 858px) {
  .checkbtn {
    display: flex;
  }
  nav {
    padding: 0 30px;
  }
  ul {
    position: absolute;
    width: 100%;
    height: calc(100vh - 80px);
    background: #2c3e50;
    top: 80px;
    left: -100%;
    text-align: center;
    transition: all 0.5s;
    flex-direction: column;
    z-index: 10;
  }
  nav ul li {
    margin: 20px 0;
  }
  nav ul li form {
    font-size: 20px;
  }
  li form:hover,
  li form.active {
    background: #000090;
    color: red;
  }
  #check:checked ~ ul {
    left: 0;
  }
  .banner .row h2 {
    font-size: 3rem;
  }
  .banner .btnServices {
    margin-top: 3rem;
    padding: 10px 20px;
    border-radius: 5px;
    font-size: 1.3rem;
  }
}
h1 {
  color: white;
  font-size: 6em;
  text-align: center;
  position: absolute;
  top: 45%;
  left: 50%;
  transform: translateX(-50%) translateY(-50%);
}
</style>
