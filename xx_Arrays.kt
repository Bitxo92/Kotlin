import kotlin.random.Random

fun main(){
    //Declarar un Array
    //con arrayOf()
    val miArray1= arrayOf(10,15,20,35,67)

    for(i in miArray1){
        println(i)
    }

    val miArray2= arrayOf('a', 'b','c','d','e')

    for(i in miArray2){
        println(i)
    }

     val miArray3= arrayOf("Uno","Dos","Tres","Cuatro")
  
    for(i in miArray3){
        println(i)
    }

    //CON CONSTRUCTOR DE ARRAYS
    val miArray4= Array<Int>(5){0}
    val miArray5= Array<Int>(5,{e->e+ 100})
    for(i in miArray4){
        println(i)
    }
      for(i in miArray5){
        println(i)
    }

    //Arrays de tipo primitivos
    val miArray6 = intArrayOf(156,489,147,354,845)

    val miArray7= charArrayOf('a','b','c','d')
   for(i in miArray6){
        println(i)
    }
      for(i in miArray7){
        println(i)
    }
//Creacion de un array vacio, es decir array nulo
println()
val miArrayVacio1= arrayOf<Int>()
println()
val miArrayVacio2=emptyArray<String>()
println()

//Creacion de array no inicializado
var arrayNoInicializado= arrayOfNulls<Int>(10)
for(i in arrayNoInicializado){
    println(i)
}

//Recuperar valores de un array

val miArray8= arrayOf(12,23,45,56,67,78,89)

println(miArray8[2])
println()
println(miArray8.get(1))

//Modificar valores del array

var miArray9=arrayOf(12,23,45,56,78,89)
miArray9.set(1,99)
for(i in miArray9){
    println("$i")
}

println()
//Array inverso
var miArray10= arrayOf(12,23,45,56,67,78,89)

miArray10.reverse()

for(i in miArray10){
    print ("$i ")
}

//Último elemento del array

var miArray11= arrayOf(12,23,45,56,67,78,89)
println("El último indice es: " + miArray11.lastIndex)
println("El último elemento es: " + miArray11.get(miArray11.lastIndex))

//Comprobar la existencia de elementos en el array
var miArray12= arrayOf(12,23,45,56,67,78,89)

if(miArray12.any()){
    println("El array No esta vacio")
}
else{
    println("El array está vacio")
}

//Numero de elementos en el array

var miArray13= arrayOf(12,23,45,56,67,78,89)

println("Estre array tiene ${miArray13.count()} elmentos")

//añadir elementos al array
var miArray14= arrayOf(10,20,30)

miArray14=miArray14.plus(40)

for(i in miArray14){
    print("$i ")
}

//Crear un array de 100 enteros con numeros aleatorios entre 1 y 1000
val random = Random
//val numerosAleatorios = IntArray(100,{e->random.nextInt(1,1001)})
val numerosAleatorios = IntArray(100){random.nextInt(1,1001)}

//imprimir valores del array alaeatorio
println("Array de numeros aleatorios:")
println(numerosAleatorios.contentToString())




}