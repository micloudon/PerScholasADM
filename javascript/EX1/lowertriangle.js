function lowerTriangle(){
    let size = 5; 
    let stars = "";

    for (let i = 0; i < size; i++) {
        for (let j = 0; j < i; j++) {
            stars += "*";
        }
        stars += "\n";
    }
    console.log(stars);
}

lowerTriangle();