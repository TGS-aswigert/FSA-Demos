const pokemonName = document.getElementById("name");
const pokemonSprite = document.getElementById("sprite");

function getPokemon() {
  fetch('https://pokeapi.co/api/v2/pokemon/ditto')
    .then(response => response.json())
    .then(data => {
      pokemonName.innerHTML = data.name;
      pokemonSprite.src = data.sprites.front_default;
    });
}

getPokemon();