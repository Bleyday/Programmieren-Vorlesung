function Parent (count){
    this.counter = count;
}
function Child() {
    Parent.call(this, 10);
}

Child.prototype = Object.create(Parent.prototype)
Object.assign( Child.prototype, {
    constructor: Child,
   });

Parent.prototype.up = function(){this.counter++}
Parent.prototype.down = function(){this.counter--}
Child.prototype.leap = function(){this.counter += 10}

console.log(Child.counter)
Child.up()
console.log(Child.counter)