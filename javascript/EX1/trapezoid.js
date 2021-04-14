function drawTrap(){
    let height = parseInt(prompt("Enter the height"));
    let width = parseInt(prompt("Enter the Width"));
    
    if ( width < 2 * height){
      console.log("Impossible shape!!");
    } else {
    let spaces = 0;
    let stars = width;
    let row = 1;
    
    do {
      let rowString = '';
      for(x=0; x<spaces; x++){
        rowString += ' ';
      }
      for ( i = 0; i < stars; i++){
        rowString += '*';
      }
      for(c = rowString.length; c<width; c++){
        rowString += ' ';
      }
      console.log(rowString);
      spaces += 1;
      stars -= 2;
      row++;
    } while (row <= height);
    }
  }