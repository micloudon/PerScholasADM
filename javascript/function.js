let sum_of_square = {
    first:0,
    second:0,
    square: function(){
        this.result = ((this.first * this.first)
        + (this.second * this.second));
            return this.result
    }
}
sum_of_square.first = 3;
sum_of_square.second = 3;
let FR = sum_of_square.square()

console.log(FR)
console.log(sum_of_square)