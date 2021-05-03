var users = [{name: "Michael", age:37}, {name: "John", age:30}, {name: "David", age:27}];

/* ¿Cómo harías print/log de la edad de John? */
print("edad de john :"+users[1].age);

/* ¿Cómo harías print/log del nombre del primer objeto? */
print("nombre :"+users[0].name);

/* ¿Cómo harías print/log del nombre y la edad de cada usuario utilizando un for loop? */
for(i in users){
    print(users[i.name]+"-"+users[i.age]);
}

/* ¿Cómo harías para imprimir el nombre de los mayores de edad? */
for(i in users){
    if(users[i.age] >= 18){
        print(users[i.name]);
    }
}
