let a = []
a.push(1,2,3,4,5,6,7,8,9)
console.log("push "+a)
a.pop()
console.log("pop "+a)

a.shift()
console.log("shift "+a)
a.unshift(1)
console.log("unshift "+a)

let b = [1,2,3,4,5,6,7,8,9]
let c = b.reduce((x,y) => (x*y))
console.log(c)

function div2(...array){
    return array.filter((n) => n % 2 === 0)
}
console.log(div2(1,2,3,4,5,6,7,8,9))

function fnum(s) {
    return s.match(/(?:\+|\-)?\d+/g)?.reduce((x, y) => { x.push(parseInt(y)); return x; }, []) ?? [];
  }

  console.log(fnum("123th2isisa test -45 yes1"))