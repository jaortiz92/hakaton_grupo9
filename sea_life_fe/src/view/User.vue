<template>
  <div>
    <Navbar></Navbar>
    <Signup v-if="pag" @completedSignUp="completedSignUp"></Signup>
    <Login v-else @completedLogIn="completedLogIn"></Login>
  </div>
</template>
<script>
import Navbar from "@/components/Navbar";
import Login from "@/components/Login";
import Signup from "@/components/Signup";
export default {
  name: "login",
  data: function () {
    return {
      pag: false,
    };
  },
  components: {
    Navbar,
    Login,
    Signup,
  },
  methods: {
    completedLogIn: function (data) {
      localStorage.setItem("isAuth", true);
      localStorage.setItem("username", data.username);
      localStorage.setItem("token_access", data.token_access);
      localStorage.setItem("token_refresh", data.token_refresh);
      alert("Autenticación Exitosa");
      this.$router.push({ name: "Home" });
    },
    completedSignUp: function (data) {
      alert("Registro Exitoso");
      this.completedLogIn(data);
    },
  },
  created() {
    if (localStorage.getItem("pagUser") === "new") this.pag = true;
    else this.pag = false;
  },
};
</script>
