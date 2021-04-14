s = "757"

function isNum(s){
    if(isNaN(s)) {
        return false;
    }
    else {
        return true;
    }
}

console.log(isNum(s))