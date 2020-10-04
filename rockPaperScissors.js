const message = document.querySelector('.message');
const score = document.querySelector('.score');
const winnerScores = [0,0];

function playGame(e) {
    //setup player selection
    let playerSelection = window.prompt("Please choose any one: Rock, Paper, Scissors", "Rock");

    //setup random number selection for computer
    //number between 0 and 1 is selected(1 not included)
    let computerSelection = Math.random();

    if (computerSelection < .34) {
        computerSelection = 'Rock';
    } else if (computerSelection <= .67) {
        computerSelection = 'Paper';
    } else {
        computerSelection = 'Scissors';
    }

    //function to compare values and get result
    let result = checkWinner(playerSelection, computerSelection);

    if (result === 'Player') {
        winnerScores[0]++;
    }
    if (result === 'Computer') {
        winnerScores[1]++;
    }

    //output score into Score DIV
    score.innerHTML = 'Player: [ ' + winnerScores[0]+ ' ] Computer: [ ' + winnerScores[1] + ' ]';

    //output player and computer's selections
    messenger('Player: <strong>' + playerSelection + '</strong> Computer: <strong>' + computerSelection + '</strong><br>' + result);
}

function messenger(selectionMessage) {
    message.innerHTML = selectionMessage;
}

function checkWinner(player, computer) {
    if (player === computer) {
        return 'Draw';
    }

    if (player === 'Rock') {
        if (computer === 'Paper') {
            return 'Computer';
        } else {
            return 'Player';
        }
    }

    if (player === 'Paper') {
        if (computer === 'Rock') {
            return 'Player';
        } else {
            return 'Computer';
        }
    }

    if (player === 'Scissors') {
        if (computer === 'Rock') {
            return 'Computer';
        } else {
            return 'Player';
        }
    }
}
