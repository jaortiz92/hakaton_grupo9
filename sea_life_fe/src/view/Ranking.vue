<template>
  <div class="body-scores">
    <h1
      style="
        font-family: papyrus;
        color: white;
        font-size: 70px;
        text-align: center;
      "
    >
      RANKING
    </h1>

    <table id="customers">
      <tr>
        <th>Nombre</th>
        <th>Score</th>
      </tr>
      <tr v-for="score in scores" :key="score">
        <td>score</td>
        <td>score</td>
      </tr>
    </table>
    <h3>{{ this.scores }}</h3>
  </div>
</template>
<script>
import axios from "axios";
export default {
  name: "Ranking",
  data: function () {
    return {
      scores: [],
    };
  },
  methods: {
    loadScores: function () {
      axios
        .get(`https://hackaton-g9-mintic-game-ms.herokuapp.com/game/scores`, {
          headers: {
            "Access-Control-Allow-Origin": "*",
            "Access-Control-Allow-Methods": "GET",
          },
        })
        .then((result) => {
          this.scores = result;
        })
        .catch((error) => {
          console.log(error);
          alert("ERROR: Fallo carga de scores");
        });
    },
  },
  created() {
    this.loadScores();
  },
};
</script>
<style scoped>
.body-scores {
  background: url("../assets/img/ranking.jpeg");
  background-size: cover;
  background-position: center center;
  height: calc(100vh - 10px);
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
#customers {
  margin-top: 200px;
  font-family: papyrus;
  border-collapse: collapse;
  width: 100%;
  color: cornflowerblue;
  border-radius: 15px;
  height: 30px;
  width: 60%;
  margin-left: 20%;
  background-color: white;
}

#customers td,
#customers th {
  border: 3px solid orange;
  padding: 8px;
  height: 30px;
}
</style>