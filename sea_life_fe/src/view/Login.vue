<template>
  <div>
    <Navbar></Navbar>
    <Login @completedLogIn="completedLogIn"></Login>
  </div>
</template>
<script>
import Navbar from "@/components/Navbar";
import Login from "@/components/LoginComponent";
export default {
  name: "login",
  components: {
    Navbar,
    Login,
  },
  methods: {
    completedLogIn: function (data) {
      localStorage.setItem("isAuth", true);
      localStorage.setItem("username", data.username);
      localStorage.setItem("token_access", data.token_access);
      localStorage.setItem("token_refresh", data.token_refresh);
      alert("Autenticación Exitosa");
    },
  },
};
</script>
