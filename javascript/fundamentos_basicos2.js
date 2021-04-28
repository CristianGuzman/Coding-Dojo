/* Tamaño Grande */
function grande(list){
    for(i in list){
        if(list[i]>0){
            list[i] = "big"
        }
    }
    return list;
}

/* Imprime (print) el menor, devuelve (return) el mayor */
function imprime(list){
    var mayor = 0;
    var menor = 0;
    for(i in list){
        if(list[i] < menor){
            menor = list[i];
        }
        if(list[i] > mayor){
            mayor = list[i];
        }
    }
    println(menor);
    return mayor;
}

/* Imprime (print) uno, devuelve (return) otro */
function imprimeydevuelve(list){
    var impar = 0;
    var val = 0;
    for(i in list){
        if (impar == 0){
            if(list[i] % 2 != 0){
                impar = list[i];
            }
        }
        if(i = list.length -1){
            val = list.length;
        }
    }
    print(val);
    return impar;
}

/* Doble Visión */
function doble(list){
    for(i in list){
        list[i] += list[i];
    }
    return list;
}

/* Contar Positivos */
function contar(list){
    var contador = 0;
    for(i in list){
        if(list[i]>0){
            contador ++
        }
    }
    list[list.length-1] = contador;
    return list;
}

/* pares e impares */
function parimpar(){
    var pares = 0;
    var impares = 0;
    for(i in list){
        if(list[i] % 2 != 0){
            impares ++
            pares = 0;
        }else{
            pares ++
            impares = 0;
        }
        if(pares = 3){
            print("¡Es para bien!");
            pares = 0;
        }
        if(impares = 3){
            print("¡Qué imparcial!");
            impares = 0;
        }
    }
}

/* Incrementa los Segundos */
function incrementar(arr){
    for(i in arr){
        if(i%2 != 0){
            list[i]++;
        }
        console.log(arr[i]);
    }
    return arr;    
}

/* Longitudes previas */
function longitudesPrevias(arr){
    for(var i = arr.length; i > 0; i--){
        arr[i] = (arr[i-1]).length;
    }
    return arr;
}

/* Agrega Siete  */
function suma7(arr){
    var list = [];
    for(i in arr){
        list.push(arr[i] + 7);
    }
    return list;
}

/* Array Inverso */
function invertir(arr){
    var cont = (arr.length)-1;
    var temp = 0;
    for(var i=0; i< cont/2; i++){
        temp = arr[i];
        arr[i] = arr[cont];
        arr[cont] = temp;
        cont--;
    }
    return arr;
}
function invertir2(arr){
    arr.reverse();
    return arr;
}
console.log(invertir2([3,1,6,4,2]));

/* Perspectiva: Negativa  */
function negativos(arr){
    var list = [];
    for(i in arr){
        if (arr[i]<0){
            list[i] = arr[i];
        }else{
            list[i] = arr[i] * -1;
        }
    }
    return list;
}

/* Siempre hambriento */
function hambriento(arr){
    var cont = 0;
    for(i in arr){
        if(arr[i] == "comida"){
            print("yummy");
            cont++;
        }
    }
    if(cont != 0){
        print("tengo hambre");
    }
}

/* Cambiar hacia el centro */
function cambiaHaciaElCentro(arr){
    var cont = (arr.length)-1;
    var temp = 0;
    for(var i=0; i< cont/2;){
        temp = arr[i];
        arr[i] = arr[cont];
        arr[cont] = temp;
        cont-2;
        i + 2;
    }
}

/* Escala el Array  */
function multiplica(arr,num){
    for(i in arr){
        arr[i] * num;
    }
    return arr;
}

