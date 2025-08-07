import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ["Virat", "Rahul", "Jadeja", "Bumrah", "Hardik"];
  const evenTeam = ["Rohit", "Pant", "Surya", "Shami", "Ashwin", "Gill"];

  const [odd1, odd2, ...restOdd] = oddTeam;
  const [even1, even2, ...restEven] = evenTeam;

  const T20Players = ["Kohli", "SKY", "Rohit"];
  const RanjiPlayers = ["Pujara", "Iyer", "Rahane"];

  const allPlayers = [...T20Players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players:</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        {restOdd.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>Even Team Players:</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        {restEven.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>Merged Players (T20 + Ranji):</h2>
      <ul>
        {allPlayers.map((p, index) => <li key={index}>{p}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
