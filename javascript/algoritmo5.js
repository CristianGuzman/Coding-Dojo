/* ejercicio 1 */
function resetnegativo(list){
    for(var i=0; i<list.length; i++){
        if(list[i] < 0){
            list[i] = 0;
        }
    }
    return list;
}
console.log(resetnegativo([3,4,-1,6,-4]))

/* ejercicio 2 */
function mover(list){
    var listok = [];
    for(var i = 1; i < list.length; i++){
    
        listok.push(list[i]);
    
    }
    listok.push(0);
    return listok;
}
console.log(mover(prompt("ingrese lista")));

/* ejercicio 3 */
function reverso(list){
    var listok = [];
    for(var i = list.length; i >= 0; i--){
        listok.push(list[i]);
    }
    return listok;
}
console.log(reverso(prompt("ingrese lista")));

/* ejercicio 4 */
function repetirValores(list){
    var listok = [];
    for(var i = 0; i < list.length; i++){
        listok.push(list[i],list[i]);
    }
    return listok;
}
console.log(repetirValores(prompt("ingrese lista")));
