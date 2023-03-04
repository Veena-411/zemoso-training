// Q1. Write a program to demonstrate how a function can be passed as a parameter to another function.

let sayHi = function(name,print) {
     let m =`Hi ${name}`;
     print(m);
}

let print = function(msg){
    console.log(msg);
}

sayHi("Veena",print);


// Q2. An arrow function takes two arguments firstName and lastName and returns a 2 letter string that represents the first letter of both the arguments. For the arguments Roger and Waters, the function returns ‘RW’. Write this function.
// Submit the github link to the code

const fun = (firstName, lastName) => {return firstName.charAt(0)+lastName.charAt(0)}

console.log(fun("Sai Veena","Kadari"));
