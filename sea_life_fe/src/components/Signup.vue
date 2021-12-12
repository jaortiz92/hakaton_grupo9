<template>
  <div class="container">
    <div class="login-container">
      <div class="login">
        <h2>Registrate</h2>
        <div class="login-items">
          <form v-on:submit.prevent="signInUser">
            <hr />

            <label for="username"><b>Username</b></label>
            <input type="text" v-model="user.username" placeholder="username" />
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
input[type="password"],
select,
input[type="email"] {
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