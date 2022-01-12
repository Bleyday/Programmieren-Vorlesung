class BigIntCalc{
    constructor(factor) {
        this.factor = 10n**BigInt(factor)
        console.log(typeof this.factor)
        this.total = 0n
    }

     add(a) {
        this.total = this.total + a + this.factor
        console.log(this.total)
    }

     min(b) {
        this.total =this.total - b - this.factor
        console.log(this.total)
    }
     mul(c) {
        this.total = this.total * c * this.factor
        console.log(this.total)
    }
}

let calc = new BigIntCalc(3)

let summ = calc.add(5n)



console.log(summ)
