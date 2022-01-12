class weihnachtsbaum{
    constructor(groesse){
        this.groesse = groesse

        for(var i=0; i<=groesse; i++){
            var star = ''
            for(var k = 1; k <= groesse - i; k++){
                star += " "
            }
            for(var j=0; j<=i; j++) {
                star += " *"
            }
            console.log(star)
        }
    }
}

new weihnachtsbaum(4)