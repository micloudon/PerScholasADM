function upperTriangle(){
    let size = 5; 
    let stars = "";
    
        for (let i = 0; i < size; i++) {
            for (let j = 0; j < size; j++) {
                if(j>i){
                    stars += "*";
                }
                else {
                    stars += " ";
                }
            }
            stars += "\n";
        }
        console.log(stars);
    }
    
upperTriangle();