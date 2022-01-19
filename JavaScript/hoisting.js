function hoisting(){
    console.log("hoisted vars")
    var a = 5;
    console.log("pre: " + a)
    for (var a = 0; a < 10; a++){
        console.log("in: "+a)
    }
    console.log("post: "+a)
}
hoisting()