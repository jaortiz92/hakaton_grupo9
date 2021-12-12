<template>
  <div>
    <Navbar></Navbar>
    <CreateAdventure></CreateAdventure>
  </div>
</template>
<script>
import Navbar from "@/components/Navbar";
import CreateAdventure from "@/components/CreateAdventure";

export default {
  name: "Administration",
  components: {
    Navbar,
    CreateAdventure,
  },
};
</script>
<style scoped>
</style>