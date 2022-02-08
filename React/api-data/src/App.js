import { useState } from "react";
import axios from 'axios';

function App() {
  const [peopleInSpace, setPeopleInSpace] = useState([]);

  const checkForPeopleInSpace = () => {
    axios.get('http://api.open-notify.org/astros.json')
      .then( response => {
        setPeopleInSpace(response.data.people);
      })
  }

  const peopleList = peopleInSpace.map(person => {
    return <li key={person.name}>{person.name} is aboard the {person.craft}</li>;
  })

  return (
    <div className="App">
      <h3>How many people are in space right now?</h3>
      <button
        type="button"
        onClick={checkForPeopleInSpace}>
      Find Out
      </button>
      <ol>{peopleList}</ol>
    </div>
  );
}

export default App;
