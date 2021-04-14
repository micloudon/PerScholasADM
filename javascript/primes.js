n = 6;
function primes(n){
    if(n===1) {
        return false
    }

    else if(n===2) {
        return true
    }

    else {
        for(i=2; i < n; i++) {
            if(n%i === 0){
                return false
            }
            return true
        }
    }

}

console.log(primes(n))