<template>
  <div>
    <button @click="loadAdventure"></button>
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
<style scoped>
</style>
