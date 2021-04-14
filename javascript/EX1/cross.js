function cross() {
    const size = 10;
    let star = "";

    for(i=0; i<size; i++){
       for(j=0; j<size; j++){
           if(j==i || j==(size-1)-i){
               star += "*";
           }
           else {
                star += " ";
           }
    
       }
       star += "\n";
    }
    console.log(star)
}

cross()