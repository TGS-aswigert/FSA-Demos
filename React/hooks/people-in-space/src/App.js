import React, { useState } from 'react';
import axios from 'axios';

function App() {
  const [peopleInSpace, setPeopleInSpace] = useState([]);

  const style = {
    container: {
      width: '500px',
      height: '400px',
      margin: '20vh auto',
      textAlign: 'center'
    },
    button: {
      width: '100px',
      height: '25px',
      backgroundColor: '#99e7ff',
      borderRadius: '5px',
      cursor: 'pointer'
    }
  }

  const checkForPeopleInSpace = () => {
    axios.get('http://api.open-notify.org/astros.json')
      .then((response) => {
        setPeopleInSpace(response.data.people);
      });
  }

  const peopleList = peopleInSpace.map(person => {
    return <li key={person.name}>{person.name} is aboard the {person.craft}</li>
  })

  return (
    <div style={style.container}>
      <h3>How many people are in space right now?</h3>
      <button
        type='button'
        style={style.button}
        onClick={checkForPeopleInSpace}>
          Find Out
      </button>
      <ol>{peopleList}</ol>
    </div>
  )
}

export default App;
