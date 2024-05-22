import kotlin.random.Random

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


println()

/*Programa que genera 10 numeros */



/*Programa que genera un array de x numeros aleatorios entre 1 y 1000
Muestra los valores por pantalla y calcula el maximo, minimo y la media*/
var x=100
val random= Array<Int>(x){(1..1000).random()}
var maxValor= random[0]
var minValor= random[0]
var suma =0



for(num in random){
    print("$num, ")
    if(num>maxValor){
        maxValor=num
    }

    if(num<minValor){
        minValor=num
    }
    suma= num + suma
}

var media = suma/x;

println("el valor maximo es: $maxValor")
println("el valor minimo es $minValor")
println("media del array: $media")


/*Programa que genera un array de x numeros aleatorios entre 1 y 1000
Ordena los elementos del array de menor a mayor
Imprime los valores del array del inicio al final
Imprime los valores del array del final al inicio
*/

val aleatorio= Array<Int>(x){(1..1000).random()}
//Ordenamos array
aleatorio.sort()
println("Inicio a final")
println(aleatorio.contentToString())
println("final a inicio")
println(aleatorio.reversedArray().joinToString("-"))
















}