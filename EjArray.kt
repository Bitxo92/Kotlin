
fun main(){
    /*Crear 2 arrays de enteros
    - El array 'misPares' con los 100 primeros Pares
    - El array 'misImpares' con los 100 primeros impares
    */

    val misPares = Array<Int>(100){i->i*2 + 2}

    val misImPares = Array<Int>(100){i->i*2+1}
println("Array Pares")
    for(i in misPares){
        print("$i ")
    }
    println()
println("Array Impares")
      for(i in misImPares){
         print("$i ")
    }

    println(misImPares.contentToString())

}