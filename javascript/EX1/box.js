function shape(){
    const width = 7;
    const height = 5;

    for(i=0; i<height; i++){
        const star = '*';
        s = star.repeat(width);
        console.log(s)
    }

}

shape()