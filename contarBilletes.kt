fun main(){

var cant= 1344

var bValores = listOf(500,200,100,50,20,10,5,2,1)
var bContar = mutableMapOf<Int, Int>()
var restCant= cant

for(bValor in bValores){
    var nbilletes= restCant/bValor
    bContar[bValor] = nbilletes
    restCant%= bValor
}

for(bValor in bValores){
    println("${bContar[bValor]} de $bValor")
}







    
}