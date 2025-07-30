import React, { Component } from 'react';
import Posts from './Posts';

class App extends Component {
  render() {
    return (
      <div className="App" style={{ padding: '2rem' }}>
        <h1>Welcome to Blog App</h1>
        <Posts />
      </div>
    );
  }
}

export default App;
