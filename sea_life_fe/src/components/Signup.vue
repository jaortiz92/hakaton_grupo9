<template>
  <div class="container">
    <div class="login-container">
      <div class="login">
        <h2>Registrate</h2>
        <div class="login-items">
          <form v-on:submit.prevent="signInUser">
            <h1>Regístrate</h1>

            <hr />

            <label for="username"><b>Username</b></label>
            <input
              type="username"
              v-model="user.username"
              placeholder="username"
            />
            <br />
            <label for="psw"><b>Contraseña</b></label>
            <input
              type="password"
              v-model="user.password"
              placeholder="Contraseña"
            />
            <br />
            <label for="psw-repeat"><b>Nombre</b></label>
            <input type="text" v-model="user.name" placeholder="Nombre" />
            <br />
            <label for="email"><b>E-mail</b></label>
            <input
              type="email"
              v-model="user.email"
              placeholder="Correo electrónico"
            />
            <br />
            <label for="email"><b>Rol</b></label>
            <select>
              <option value="0">Usuario</option>
              <option value="1">Administrador</option>
            </select>
            <br />
            <hr />
            <button type="submit" class="registerbtn">Regístrate</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import axios from "axios";

export default {
  name: "singupComponent",
  data: function () {
    return {
      user: {
        username: "",
        password: "",
        name: "",
        email: "",
        rol: "",
      },
    };
  },
  methods: {
    signInUser: function () {
      this.user.rol = parseInt(this.user.rol, 10);
      axios
        .post(
          "https://hackaton-g9-mintic-auth-ms.herokuapp.com/user/",
          this.user,
          {
            headers: {},
          }
        )
        .then((result) => {
          let dataSignUp = {
            email: this.user.email,
            token_access: result.data.access,
            token_refresh: result.data.refresh,
          };

          this.$emit("completedSignUp", dataSignUp);
        })
        .catch((error) => {
          console.log(error);
          alert("ERROR: Fallo en el registro.");
        });
    },
  },
};
</script>
<style>
</style>