import React from 'react';
import { players,T20Players,RanjiTrophyPlayers,IndianTeam } from './Components/Players';
import ListofPlayers from './Components/ListOfPlayers';
import ScoreBelow70 from './Components/ScoreBelow70';
import { OddPlayers } from './Components/OddPlayers';
import { EvenPlayers } from './Components/EvenPlayers';
import ListofIndianPlayers from './Components/ListOfIndianPlayers';
function App() {
  const flag = false; // change to true to toggle

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than or Equal to 70</h1>
        <ScoreBelow70 players={players} />
      </div>
    );
  } else {
    const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

    return (
      <div>
        <h1>Indian Team</h1>

        <h1>Odd Players</h1>
<OddPlayers players={IndianTeam} />

        <hr />

        <h1>Even Players</h1>
        <EvenPlayers players={IndianPlayers} />


        <hr />

        <h1>List of Indian Players Merged:</h1>
        <ListofIndianPlayers IndianPlayers={IndianPlayers} />
      </div>
    );
  }
}

export default App;
