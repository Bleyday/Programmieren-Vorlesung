function detect (a,b){
    x = a / b
    if (x == Infinity){
        console.log("x is Infinity")
    }
    else if (x == NaN){
        console.log("x is NaN")
    }
    else if (Number.isInteger(x)){
        console.log("x is a Number")
    }
}

detect(Math.random(),"Hallo")
detect(Math.random(),0)
detect(Math.random(),2)