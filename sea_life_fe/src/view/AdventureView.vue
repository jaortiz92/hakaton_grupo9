<template>
  <div class="adventureView">
    <section>
      <video autoplay muted loop id="myVideo">
        <source src="../assets/video/hack1.mp4" />
      </video>

      <!--Autoinicio del audio-->
      <audio controls autoplay loop>
        <source
          src="../assets/audio/scuba-divers-copy.ogg"
          type="audio/ogg"
          style="pointer-events: auto"
        />
      </audio>

      <div v-if="is_selecting">
        <Adventure v-on:loadPlay="loadPlay"></Adventure>
      </div>
      <div v-else>
        <PlayAdventure></PlayAdventure>
      </div>
    </section>
  </div>
</template>

<script>
import Adventure from "@/components/Adventure";
import PlayAdventure from "@/components/PlayAdventure";

export default {
  name: "AdventureView",
  data: function () {
    return {
      is_selecting: true,
    };
  },
  components: {
    Adventure,
    PlayAdventure,
  },
  methods: {
    loadPlay: function (value) {
      this.is_selecting = false;
      localStorage.setItem("game", value);
    },
    updateCursor: function (e) {
      let x = e.clientX;
      let y = e.clientY;
      document.documentElement.style.setProperty("--cursorX", x + "px");
      document.documentElement.style.setProperty("--cursorY", y + "px");
    },
  },
  created() {
    document.addEventListener("mousemove", this.updateCursor);
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