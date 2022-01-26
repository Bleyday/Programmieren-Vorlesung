class Parent{
    constructor(content){
        content = []
    }
    has(p){
        if (typeof p !== String){
            new TypeError("not a string")
        }
        else{
            if (this.content.includes(p)){
                return true
            }
            else{
                return false
            }
    }
}
    add(p){
        if (typeof p !== "string"){
            new TypeError("not a string")
        }
        else{
            this.content.push(p)
        }
    }
    remove(p){
        if (typeof p !== String){
            console.log("not a string")
        }
        else{
            this.content.pop(p)
    }
}
    forEach(p){

    }
}

class Child extends Parent{
    constructor (){
        super()
    }
}

let paul = new Child
str = "Hallo"

paul.add(str)
console.log(paul.has(str))
console.log(paul.content)