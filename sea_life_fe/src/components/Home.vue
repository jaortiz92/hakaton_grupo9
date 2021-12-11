<template>
  <div>
    <button @click="loadAdventure">Jugar</button>
  </div>
</template>

<script>
export default {
  name: "Adventure",
  methods: {
    loadAdventure() {
      this.$router.push({ name: "Adventure" });
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
</style>
