const API_KEY = "da5d1b0b-a581-4f5f-b66d-5a763e223e2b";

const img = document.getElementById('cat-img');

fetch('https://api.thecatapi.com/v1/images/search?', {
  headers: {
    "x-api-key": API_KEY
  }
})
.then(response => response.json())
.then(data => {
  console.log(data);
  img.src = data[0].url
})