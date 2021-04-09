/*ejercicio 1 */
function contar(z,y){
    var contador = 0
    for(var i =0; i<z.length;i++){
        if(z[i]>y){
            contador++
        }
    }
    return contador;
}
var x = contar(prompt("ingresar array",""),prompt("ingresar un numero",""));
console.log(x);

/* ejercicio2 */
function obtener(x){
    var prom = 0;
    var sum = 0;
    var max = 0;
    var min = 0;
    for(var i = 0; i<x.length; i++){
        if(x[i]<min || i == 0){
            min = x[i];
        }
        if(x[i]>max){
            max = x[i];
        }
        sum = sum + Number(x[i]);
    }
    console.log('valor maximo:',max ,'valor minimo:' ,min)
    return sum/x.length;
}
var val = obtener(prompt("ingresar array",[]));
console.log("el promedio es :",val);

/* ejercicio 3 */
function negativos(x){
    var positivos = [];
    for(var i = 0; i<x.length; i++){
        if(x[i] < 0){
            positivos.push("Dojo");
        }else{
            positivos.push(x[i]);
        }
    }
    return positivos;
}
console.log(negativos([4,5,-1,-4,3]));

/*ejercicio 4 */
function rango(list,x,y){
    list.splice(x,y-1);
    return list;
}
console.log(rango(prompt("ingrese array",[]),prompt("ingrese rango",Number),prompt("ingrese rango",Number)));