import React, { useState } from 'react';

function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState('');
  const [selectedCurrency, setSelectedCurrency] = useState('INR');

  const rate = 88; // 1 Euro = 88 INR

  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const sayHello= () =>{
    alert("Hello Everyone!");
  }
  const decrement = ()=> {
    setCount(count - 1);
  };


  const sayWelcome =(msg) => {
    alert(msg);
  };

  const handleClick =(e)=> {
    alert("I was clicked!");
  };

  const handleConvert = () => {
    if (amount === '') {
      alert('Please enter an amount');
      return;
    }

    let result;
    if (selectedCurrency === 'INR') {
      result = amount * rate;
      alert(`${amount} Euro = ₹${result.toFixed(2)} INR`);
    } else {
      result = amount / rate;
      alert(`${amount} INR = €${result.toFixed(2)} Euro`);
    }
  };

  return (
    <div style={{ textAlign: 'center' }}>
      <h2>Event Examples App</h2>

      <h3>Counter: {count}</h3>
      <button onClick={increment}>Increment</button><br/> 
      <button onClick={decrement}>Decrement</button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome to React Events!")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={handleClick}>Click Me</button>

      <br /><br />

      <h3>Currency Converter</h3>

      <input
        type="number"
        placeholder="Enter amount"
        value={amount}
        onChange={(e) => setAmount(e.target.value)}
      />

      <select
        value={selectedCurrency}
        onChange={(e) => setSelectedCurrency(e.target.value)}
        style={{ marginLeft: '10px' }}
      >
        <option value="INR">INR</option>
        <option value="EURO">EURO</option>
      </select>

      <br /><br />
      <button onClick={handleConvert}>Convert</button>
    </div>
  );
}

export default App;
