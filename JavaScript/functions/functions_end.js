function add(x, y) {
  return x + y;
}

function getYearsFromRetirement() {
  let currentAge = prompt("How old are you?");

  if(currentAge >= 65) {
    alert("You are already retirement age!");
  } else if (currentAge < 0) {
    alert("Please enter a positive number");
    getYearsFromRetirement();
  }
   else {
    alert(`You are ${65-currentAge} year(s) from retirement.`);
  }
  
}

getYearsFromRetirement();