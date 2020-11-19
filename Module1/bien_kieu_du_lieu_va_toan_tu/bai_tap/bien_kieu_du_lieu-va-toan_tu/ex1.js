let chemistry;
let biology;
let physical;

chemistry = prompt("Enter the chemistry: ");
biology = prompt("Enter the biology: ");
physical = prompt("Enter the physical: ");

let a = parseInt(chemistry);
let b = parseInt(biology);
let c = parseInt(physical);

let average = (a + b + c) / 3;
document.write("The average is:  " + average);

let sum = a + b + c;
document.write("<br>The sum is: " + sum);


