import React, { Component } from 'react';
import './index.css';

export default class CounterClass extends Component {

  add1ToCount() {};

  subtract1FromCount() {};

  render() {
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
}
