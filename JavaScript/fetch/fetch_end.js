const pokemonName = document.getElementById("name");
const pokemonSprite = document.getElementById("sprite");

function checkStatus(response) {
  if(response.status >= 200 && response.status <= 299) {
    return response.json();
  } else {
    throw new Error(response.status + response.statusText);
  }
}

// function getPokemon() {
//   fetch('https://pokeapi.co/api/v2/pokemon/ditt')
//     .then(checkStatus)
//     .then(data => {
//       pokemonName.innerHTML = data.name;
//       pokemonSprite.src = data.sprites.front_default;
//     })
//     .catch(console.error)
// }

async function getPokemon() {
  let response = await fetch('https://pokeapi.co/api/v2/pokemon/ditto');

  let data = await checkStatus(response);

  pokemonName.innerHTML = data.name;
  pokemonSprite.src = data.sprites.front_default;
}

getPokemon().catch(console.error);