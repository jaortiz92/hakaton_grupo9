<template>
  <div class="create-adventure">
    <h2 style="color blue">Bienvenido! Crea tu Nueva Aventura</h2>

    <textarea id="new_adv_name" cols="50">
   Nombre de tu nueva Aventura
        </textarea
    ><br />
    <textarea id="new_adv_name" cols="50">
   Descrición de tu nueva Aventura
        </textarea
    ><br />

    <select id="new_adv_item" cols="30">
      <option value="">Elige un Item</option>
    </select>

    <input
      type="int"
      id="new_adv_item_type"
      cols="30"
      placeholder="Score del Item"
    />
    <br />
    <select id="new_adv_item" cols="30">
      <option value="">Elige un Item</option>
    </select>

    <input
      type="int"
      id="new_adv_item_type"
      cols="30"
      placeholder="Score del Item"
    />
    <br /><select id="new_adv_item" cols="30">
      <option value="">Elige un Item</option>
    </select>

    <input
      type="int"
      id="new_adv_item_type"
      cols="30"
      placeholder="Score del Item"
    />
    <br /><select id="new_adv_item" cols="30">
      <option value="">Elige un Item</option>
    </select>

    <input
      type="int"
      id="new_adv_item_type"
      cols="30"
      placeholder="Score del Item"
    />
    <br /><select id="new_adv_item" cols="30">
      <option value="">Elige un Item</option>
    </select>

    <input
      type="int"
      id="new_adv_item_type"
      cols="30"
      placeholder="Score del Item"
    />
    <br /><select id="new_adv_item" cols="30">
      <option value="">Elige un Item</option>
    </select>

    <input
      type="int"
      id="new_adv_item_type"
      cols="30"
      placeholder="Score del Item"
    />
    <br /><select id="new_adv_item" cols="30">
      <option value="">Elige un Item</option>
    </select>
    <input
      type="int"
      id="new_adv_item_type"
      cols="30"
      placeholder="Score del Item"
    />

    <br />
    <button class="button button2">Crear Mi nueva Aventura</button>
  </div>
</template>
<script>
export default {
  name: "Create Adventure",
  createAdventure: {
    name: "",
    description: "",
    items: [
      { name: "", type: "", description: "", score: "" },
      { name: "", type: "", description: "", score: "" },
      { name: "", type: "", description: "", score: "" },
      { name: "", type: "", description: "", score: "" },
      { name: "", type: "", description: "", score: "" },
      { name: "", type: "", description: "", score: "" },
      { name: "", type: "", description: "", score: "" },
      { name: "", type: "", description: "", score: "" },
      { name: "", type: "", description: "", score: "" },
    ],
  },
};
</script>
<style scoped>
.adventure {
  padding-top: 5%;
  height: 100%;
  margin: 0;
  font-family: papyrus;
  color: deepskyblue;
  background-color: aliceblue;
  text-align: center;
}

.button {
  width: 524px;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
textarea,
#new_adv_item {
  border: solid orange 1px;
  font-family: papyrus;
  color: gray;
  border-radius: 10px;
}

.button2 {
  background-color: orange;
  color: white;
  height: 45px;
  width: 470px;
  border-radius: 10px;
  border: none;
  font-family: papyrus;
  font-size: 30px;
  padding: 3px;
} /* Blue */
</style>