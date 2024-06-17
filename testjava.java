// var x=15;
// {
//     log x = 15;
//     console.log(x);

// }
// console.log(x);
// var x = function (x,y);{
//     return x + y;

// };
// const x = (x,y)=>{
//     return x +y;
// };
// console.log(x(5,6));
// cons myNumbers = [25, 12, 50, 77, -1];
// let maxValue = Math.max(...myNumbers);
// console.log(maxValue);
// const letters = new Set();
// letters.add("a");
// letters.add("b");
// letters.add("a");
// console.log(letters);
const myFunction = () => {
    return new promise((resolve, reject)) =>{
        setTimeout(() => {
            console.log("This is inside promise");
            resolve();

        },2000);
    });

};
myFunction()
    .then(() => {
        console.log("Resolved");

    });
    .catch(() => {
        console.error("Rejected");

    });