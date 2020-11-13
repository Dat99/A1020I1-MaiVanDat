var inputWidth;//khai báo biến
var inputHeight;

inputWidth = prompt("Enter the width");//nhập dữ liệu
inputHeight = prompt("Enter the height");

var width = parseInt(inputWidth); //chuyển dữ liệu từ chuổi sang số nguyên
var height = parseInt(inputHeight);
var area = width * height;
document.write("The area is: " + area);