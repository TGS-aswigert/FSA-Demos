import React, { useState } from 'react';
import './index.css'

export default function CounterFunctional() {

  function add1ToCount() {};

  function subtract1FromCount() {};

  return (
    <div className='counter'>
      <h1>0</h1>

      <div className='buttons'>
        <button>-</button>
        <button>+</button>
      </div>
    </div>
  );
}
