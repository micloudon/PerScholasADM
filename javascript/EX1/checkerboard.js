function checkerBoard(){
    const width = 11;
    const height = 6;
    star = '';

    for(row=0; row<height; row++){
        for(col=0; col<width; col++){
            if(row%2==0 && col%2==0) {
                star += '*';
            }
            else if(row%2==0 && col%2!=0) {
                star += ' ';
            }
            else if(row%2!=0 && col%2==0) {
                star += '*';
            }
            else if(row%2!=0 && col%2!=0){
                star += ' ';
            }
        }
        star += "\n";
    }
    console.log(star)
}

checkerBoard()