import React, { useState } from 'react';
import './App.css'

export default function Counter() {

  const [count, setCount] = useState(0);

  function add1ToCount() {
    setCount(count + 1);
  };

  function subtract1FromCount() {
    setCount(count - 1);
  };

  return (
    <div className='counter'>
      <h1>{count}</h1>

      <div className='buttons'>
        <button id='decrement' onClick={subtract1FromCount}>-</button>
        <button id='increment' onClick={add1ToCount}>+</button>
      </div>
    </div>
  );
}
