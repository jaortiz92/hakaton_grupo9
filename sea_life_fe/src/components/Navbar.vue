<template>
  <nav>
    <a href="#" class="enlace">
      <img src="../assets/img/logo.jpeg" alt="" class="logo" />
      <title>Sea Life</title>
    </a>
    <input type="checkbox" id="check" />
    <label for="check" class="checkbtn">
      <i class="fas fa-bars"></i>
    </label>
    <ul>
      <li><a class="active" href="#">Inicio</a></li>
      <li><a @click="loadLogin">Log In</a></li>
    </ul>
  </nav>
</template>
<script>
export default {
  name: "Navbar",
  data: function () {
    return {
      status: false,
    };
  },
  methods: {
    loadLogin: function () {
      this.$router.push({ name: "Login" });
    },
    updateLogin: function () {
      if (localStorage.getItem("isAuth") == "true") this.status = true;
    },
  },
  updated() {
    this.updateLogin();
  },
};
</script>
<style>
* {
  padding: 0;
  margin: 0;
  text-decoration: none;
  list-style: none;
  box-sizing: border-box;
  font-family: Arial, Helvetica, sans-serif;
}
nav {
  background: #fff;
  height: 80px;
  width: 100%;
  padding: 0 50px;
  display: flex;
  align-items: center;
  justify-content: space-between;
}
.logo {
  height: 40px;
}
nav ul {
  display: flex;
  justify-content: center;
}
nav ul li {
  margin: 0 5px;
}
nav ul li a {
  color: #12251c;
  font-size: 18px;
  padding: 7px 13px;
  border-radius: 3px;
  text-transform: uppercase;
}
li a.active,
li a:hover {
  background: #3ea7f2;
  transition: 0.5s;
}
nav ul li b {
  color: #12251c;
  font-size: 18px;
  padding: 7px 13px;
  border-radius: 3px;
  text-transform: uppercase;
}
</style>