
function magic(){
    arr=["Apfel", "Banane", "Gurke"]
    let str ="Apfel"

    console.log(str.raw)
    for (let i=0; i<arr.length;i++){
        console.log(`${i} | "${arr[i]}" `)
    }
}
magic()