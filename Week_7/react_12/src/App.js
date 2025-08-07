import React, { useState } from 'react';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  const handleBook = (flight) => {
    alert(`Ticket booked for flight: ${flight}`);
  };

  const flights = [
    { id: 1, name: "Chennai to Delhi", time: "10:00 AM" },
    { id: 2, name: "Mumbai to Bangalore", time: "01:30 PM" },
    { id: 3, name: "Kolkata to Hyderabad", time: "06:00 PM" }
  ];

  return (
    <div style={{ textAlign: 'center', marginTop: '40px' }}>
      {isLoggedIn ? (
        <div>
          <h2>Welcome-Back ,User!</h2>
          <button onClick={handleLogout}>Logout</button>
          
          <h3 style={{ marginTop: '30px' }}>Available Flights:</h3>
          <ul style={{ listStyle: 'none', padding: 0 }}>
            {flights.map((flight) => (
              <li key={flight.id} style={{ marginBottom: '15px' }}>
                <strong>{flight.name}</strong> - {flight.time}
                <br />
                <button onClick={() => handleBook(flight.name)}>Book Ticket</button>
              </li>
            ))}
          </ul>
        </div>
      ) : (
        <div>
          <h2>Welcome Guest!</h2>
          <button onClick={handleLogin}>Login</button>
        </div>
      )}
    </div>
  );
}

export default App;
