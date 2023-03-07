//Using promise
console.log("start")
let promise = new Promise(function(resolve,reject){
    setTimeout(function(){
        console.log("fetched data!");
        resolve("abc@gmail.com");
    },3000)
})
promise.then(function(result){
    var email = result;
    console.log("email ="+email);
    console.log("end");
})



//Using Async await 
async function main(){
    let promise =  new Promise(function(resolve,reject){
        setTimeout(() => {
        console.log("Fetched the data!");
        resolve("skc@gmail.com");
        }, 4000);})
    console.log("start");
    var email = await promise;
    console.log("Email id of the user id is: " + email);
    console.log("end");
} 
main()



//Way-2
function getData(uId){
    return new Promise(function(resolve,reject){
        setTimeout(() => {
            console.log("Fetched the data!");
            resolve("skc@gmail.com");
            }, 4000);
    })
}

async function main(){
    console.log("start");
    var email = await getData("skc");
    console.log("Email id of the user id is: " + email);
    console.log("end");
}
main()