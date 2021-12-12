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
:root {
  cursor: none;
  --cursorX: 50vw;
  --cursorY: 50vh;
}
.adventureView:before {
  content: "";
  display: block;
  width: 100%;
  height: 100%;
  position: fixed;
  pointer-events: none;
  background: radial-gradient(
    circle 12vmax at var(--cursorX) var(--cursorY),
    /*diametro de la luz*/ rgba(0, 0, 0, 0) 0%,
    rgba(0, 0, 0, 0.5) 80%,
    rgba(0, 0, 0, 0.9) 100%
  );
}
#myVideo {
  position: fixed;
  z-index: -1;
  right: 0;
  bottom: 0;
  min-width: 100%;
  min-height: 100%;
  color: black;
}

.content {
  position: fixed;
  bottom: 0;
  background: rgba(0, 0, 0, 0.5);
  color: #f1f1f1;
  width: 100%;
  padding: 20px;
}
</style>