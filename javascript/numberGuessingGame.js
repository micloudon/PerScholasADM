
let input = prompt("Enter a range of nums");
let range = input.split(" ");

var guess = Math.floor(Math.random() * (Number(range[0])) - (Number(range[1])) + (Number(range[0])) );

var stopper = 0;

var userGuess = prompt(`Guess a number ${range[0]} and ${range[1]}`);

while(stopper == userGuess){
    
}