<template>
  <div class="container">
    <div class="login-container">
      <div class="login">
        <h2>Login</h2>
        <div class="login-items">
          <form v-on:submit.prevent="logInUser">
            <input
              type="username"
              v-model="user.username"
              placeholder="Username"
            />
            <br />
            <input
              type="password"
              v-model="user.password"
              placeholder="Contraseña"
            />
            <br />
            <hr />
            <button type="submit">Iniciar Sesion</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import axios from "axios";

export default {
  name: "loginComponent",
  data: function () {
    return {
      user: {
        username: "",
        password: "",
      },
    };
  },
  methods: {
    logInUser: async function () {
      await axios
        .post(
          "https://hackaton-g9-mintic-auth-ms.herokuapp.com/login/",
          this.user,
          {
            headers: {},
          }
        )
        .then((result) => {
          let dataLogIn = {
            username: this.user.username,
            token_access: result.data.access,
            token_refresh: result.data.refresh,
          };

          this.$emit("completedLogIn", dataLogIn);
        })
        .catch((error) => {
          if (error.response.status == "401")
            alert("ERROR 401: Credenciales Incorrectas.");
        });
    },
  },
};
</script>
<style>
</style>