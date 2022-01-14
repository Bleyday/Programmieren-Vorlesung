let str = "€\ud83d\udc99abc"

arr =[str.length,
    str.charAt(5),
    str.toUpperCase(),
    str.replace("a","t"),
    str.concat("kapiert"),
    str.startsWith("€"),
    str.startsWith("d"),
]

for (let i = 0; i < arr.length; i++){
    console.log(arr[i])
}
