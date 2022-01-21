"use strict"

let o = Object.create({name ="paui", age = 21})

let child = Object.create(o)
child.height = 175


let tog = Object.assign(child,o)
console.log(child.keys())
