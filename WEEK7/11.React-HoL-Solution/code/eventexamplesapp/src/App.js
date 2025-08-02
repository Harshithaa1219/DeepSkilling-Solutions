import React, { useState } from 'react';

function App() {
  const [count, setCount] = useState(5);
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert('Hello! Member!');
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = (e) => {
    alert('I was clicked');
    console.log('Synthetic event:', e);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency.toLowerCase() === 'euro') {
      const converted = parseInt(amount) * 80;
      alert(`Converting to Euro Amount is ${converted}`);
    } else {
      alert('Please enter valid currency (e.g., Euro)');
    }
  };

  return (
    <div style={{ margin: '20px' }}>
      <h2>{count}</h2>
      <button onClick={increment}>Increment</button>
      <br />
    
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={() => sayWelcome('welcome')}>Say welcome</button>
      <br />
      <button onClick={handleClick}>Click on me</button>

      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>

      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount:</label>
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
          <br/>
        </div>

        <div>
          <label>Currency:</label>
          <textarea
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          ></textarea>
        </div>
        <br/>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
