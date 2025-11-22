url = "https://jsonplaceholder.typicode.com/users"

fetch(url)
.then(res => res.json())
.then(result => {
    console.log(result);
})
























// counter = 1
// designer = new Promise((res, rej) => {
//     console.log(counter++, " Dress preparation started...");
//     setTimeout(() => {
//         res("Dress ready hai lekar jao")
//     }, 8000)

// })

// baker = new Promise((res, rej) => {
//     console.log(counter++, "Cake preparation started...");    
//     setTimeout(() => {
//         res("Cake ready hai lekar jao")
//     }, 3000)

// })

// designer.then(res => {
//     console.log(counter++, res);
// })

// baker.then(res => {
//     console.log(counter++, res);
// })