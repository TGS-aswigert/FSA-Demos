import React, { useState } from 'react';
import './index.css'

export default function Counter() {

  function add1ToCount() {};

  function subtract1FromCount() {};

  return (
    <div className='counter'>
      <h1>count</h1>

      <div className='buttons'>
        <button>-</button>
        <button>+</button>
      </div>
    </div>
  );
}
