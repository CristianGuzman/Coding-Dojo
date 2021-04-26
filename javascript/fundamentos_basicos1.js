/*Obtén del 1 al 255: Escribe una función que devuelve un array con todos los números del 1 al 255.*/
function lista(){
    var arreglo = [];
    for(var i=1;i<256;i++){
        arreglo.push(i);
    }
    return arreglo;
}

/* Consigue pares hasta 1000: Escribe una función que entregue la suma de todos los números pares del 1 al 1000 - Puedes usar un operador de módulo para este ejercicio.  */
function pares(){
    var suma = 0;
    for(var i=1; i<= 1000 ; i++){
        if((i%2) = 0){
            suma = suma + i;
        }
    }
    return suma;
}

/* Suma impares hasta 5000: Escribe una función que devuelva la suma de todos los números impares entre 1 y 5000 (ej: 1+3+5+...+4997+4999). */
function impares(){
    var suma = 0;
    for(var i=1; i<= 5000 ; i++){
        if((i%2) != 0){
            suma = suma + i;
        }
    }
    return suma;
}

/* Itera un array: Escribe una función que devuelva la suma de todos los valores dentro de un array (ej:  [1,2,5] retorna 8. [-5,2,5,12] retorna 14).  */
function iterarray(list){
    var suma = 0;
    for(i in list){
        suma += list[i];
    }
    return suma;
}
console.log(iterarray([5,4,2,-3]));

/* Encuentra el mayor (max): */
function max(list){
    return Math.max(...list);
}

/* Encuentra el promedio (avg) */
function avg(list){
    var suma = 0;
    for(i in list){
        suma += list[i];
    }
    return suma/list.length;
}

/* Array de impares: */
function impares(list){
    var listimpar = [];
    for(i in list){
        if(list[i]%2 != 0){
            listimpar.push(list[i]);
        }
    }
    return listimpar;
}

/* Mayor que Y */
function mayorque(y,list){
    var listmayor = [];
    for(i in list){
        if(list[i] > y){
            listmayor.push(list[i]);
        }
    }
    return listmayor;
}

/* Cuadrados */
function cuadrados(list){
    var listok = [];
    for(i in list){
        listok.push(Math.pow(list[i],2));
    }
    return listok;
}

/* Negativos */
function negativos(list){
    for(i in list){
        if(list[i]<0){
            list[i] = 0;
        }
    }
    return list;
}

/* Max/Min/Avg: */
function maxminavg(list){
    var listok = [];
    listok.push(Math.max(...list));
    listok.push(Math.min(...list));
    listok.push(avg(list))
    return listok;
}
function avg(list){
    var suma = 0;
    for(i in list){
        suma += list[i];
    }
    return suma/list.length;
}

/* Intercambia Valores */
function intercambio(list){
    var listok = [];
    var num = 0;
    for(i in list){
        num = list[list.length];
        list[list.length - 1] = list[0];
        list[0] = num;
    }
    return listok;
}

/* De Número a String */
function astring(list){
    for(i in list){
        if(list[i]<0){
            list[i] = "Dojo"
        }
    }
    return list;
}


