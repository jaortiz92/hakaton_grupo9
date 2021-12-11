<template>
  <div>
    <Navbar></Navbar>
    <CenterHome></CenterHome>
  </div>
</template>
<script>
import Navbar from "@/components/Navbar";
import CenterHome from "@/components/CenterHome";

export default {
  name: "Home",
  components: {
    Navbar,
    CenterHome,
  },
};
</script>
<style>
</style>