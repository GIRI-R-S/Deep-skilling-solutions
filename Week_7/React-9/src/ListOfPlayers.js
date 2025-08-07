import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 88 },
    { name: "Rahul", score: 60 },
    { name: "Pant", score: 72 },
    { name: "Jadeja", score: 45 },
    { name: "Bumrah", score: 80 },
    { name: "Surya", score: 100 },
    { name: "Hardik", score: 55 },
    { name: "Shami", score: 67 },
    { name: "Ashwin", score: 74 },
    { name: "Gill", score: 98 },
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players:</h2>
      <ul>
        {players.map((p, index) => (
          <li key={index}>{p.name} - {p.score}</li>
        ))}
      </ul>

      <h3>Players with score below 70:</h3>
      <ul>
        {lowScorers.map((p, index) => (
          <li key={index}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
