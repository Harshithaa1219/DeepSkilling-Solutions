import React from 'react';

function ListofPlayers({ players }) {
  return (
    <div>
      {
        players.map((item) => (
          <div key={item.id}>
            <li>
              Mr. {item.name} <span> {item.score} </span>
            </li>
          </div>
        ))
      }
    </div>
  );
}

export default ListofPlayers;
