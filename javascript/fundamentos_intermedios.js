/* Fundamentos Intermedios
Parte 1*/

/* sigma */
function sigma(num){
    var sum = 0;
    for(var i = 1; i<= num; i++){
        sum += i;
    }
    return sum;
}

/* Factorial  */
function factorial(num){
    var prod = 0;
    for(var i = 1; i<= num; i++){
        prod *= i;
    }
    return prod;
}

/* Fibonacci  */
function fibonacci(num){
    var res = 0;
    var x = 1;
    var y = 0;
    if(num == 0){
        return y;
    }
    if(num == 1){
        return x;
    }
    for(var i = 2; i<= num; i++){
        res = x + y;
        y = x;
        x = res;
    }
    return res;
}

