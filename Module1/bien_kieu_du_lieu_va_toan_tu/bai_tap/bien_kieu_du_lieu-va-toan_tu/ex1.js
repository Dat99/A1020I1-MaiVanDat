var chemistry;
var biology;
var physical;

chemistry=prompt("Enter the chemistry: ");
biology=prompt("Enter the biology: ");
physical=prompt("Enter the physical: ");

var a=parseInt(chemistry);
var b=parseInt(biology);
var c= parseInt(physical);

var average =(a+b+c)/3;
document.write("The average is:  "+average);

var sum = a+b+c;
document.write("<br>The sum is: "+sum);


