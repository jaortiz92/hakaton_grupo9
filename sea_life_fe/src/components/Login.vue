<template>
  <div class="container">
    <div class="login-container">
      <div class="login">
        <h2>Login</h2>
        <hr />
        <div class="login-items">
          <form v-on:submit.prevent="logInUser">
            <input type="text" v-model="user.username" placeholder="Username" />
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
        .post("https://sealife-auth.herokuapp.com/login/", this.user, {
          headers: {},
        })
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
<style scoped>
.container {
  background: url("../assets/img/ranking.jpeg");
  background-size: cover;
  background-position: center center;
  height: calc(90vh - 10px);
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}

body {
  font-family: papyrus;
  color: deepskyblue;
}
form {
  border: 3px solid orange;
}

input[type="text"],
input[type="password"] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid orange;
  box-sizing: border-box;
}

button {
  background-color: deepskyblue;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  border-radius: 10px;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: black;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}
</style>