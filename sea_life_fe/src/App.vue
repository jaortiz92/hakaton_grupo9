<template>
  <router-view />
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}

/*Fondo oscuro y linterna*/
.adventure {
  cursor: none;
  --cursorX: 50vw;
  --cursorY: 50vh;
}
.adventure:before {
  content: "";
  display: block;
  width: 100%;
  height: 100%;
  position: fixed;
  pointer-events: none;
  background: radial-gradient(
    circle 12vmax at var(--cursorX) var(--cursorY),
    /*diametro de la luz*/ rgba(0, 0, 0, 0) 0%,
    rgba(0, 0, 0, 0.5) 80%,
    rgba(0, 0, 0, 0.9) 100%
  );
}
</style>
