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

/* Array: Penúltimo: */
function penultimo(array){
    if(array.length < 3){
        return null;
    }else{
        return array[array.length-2]
    }
    
}

/* Array: Segundo más grande: */
function segundomax(array){
    var max = 0;
    var max2 = 0;
    if(array.length < 2){
        return null;
    }else{
        for(i in array){
            if(array[i] > max) {
                max = array[i];
            }
        }
        for(i in array){
            if (array[i] > max2 && array[i] != max) {
                max2 = array[i];
            }
        }
        return max2;
    }
}

/* Doble Problema Par */
function doblepar(array){
    for(i in array){
        array.splice(i+1,0,array[i]);
    }
}

