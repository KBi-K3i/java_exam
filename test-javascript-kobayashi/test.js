// 問題１
console.log("--------問題１-------")

console.log("小林啓祐");

console.log("--------------------\n\n")

// 問題２
console.log("--------問題２-------")

let firstName = "Keisuke";
let lastName = "Kobayashi";
console.log(firstName + " " + lastName);

console.log("--------------------\n\n")

// 問題３
console.log("--------問題３-------")

const TAX_RATE = 0.1;

let subTotal1 = 200 * 3;
let subTotal2 = 250 * 4;
let consumptionTax = (subTotal1 + subTotal2) * TAX_RATE;
let total = subTotal1 + subTotal2 + consumptionTax;

console.log("小計");
console.log((subTotal1 + subTotal2) + "円");

console.log("消費税");
console.log(consumptionTax + "円");

console.log("合計金額")
console.log(total + "円");

console.log("--------------------\n\n")


// 問題４
console.log("--------問題４-------")

// 変数変更時、忘れずに保存（Ctrl + S）すること。

// let testScore = -1;
// let testScore = 0;
// let testScore = 79;
// let testScore = 80;
let testScore = 100;
// let testScore = 101;

if(testScore >= 0 && testScore <= 79){
    console.log("追試です");
}else if(testScore >= 80 && testScore <= 100){
    console.log("合格です");
}else{
    console.log("存在しない点数です");
}

console.log("--------------------\n\n")


// 問題５
console.log("--------問題５-------")

let sum = 0;
for(let i = 1; i <= 100; i++){
    sum += i;
}
console.log(sum);

console.log("--------------------\n\n")


// 問題６
console.log("--------問題６-------")

// 関数定義
function add(num1, num2){
    return num1 + num2;
}

function sub(num1, num2){
    return num1 - num2;
}

function multi(num1, num2){
    return num1 * num2;
}

function div(num1, num2){
    return num1 / num2;
}

// 関数の呼び出し
let num1 = 5;
let num2 = 3;

console.log(num1 + " + " + num2 + " = " + add(num1, num2));
console.log(num1 + " - " + num2 + " = " + sub(num1, num2));
console.log(num1 + " * " + num2 + " = " + multi(num1, num2));
console.log(num1 + " / " + num2 + " = " + div(num1, num2));


console.log("--------------------\n\n")