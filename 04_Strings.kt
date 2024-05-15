fun main(){
    //declaraciones de variables de tipo String

    var miCadena = "Hola. Esto es una cadena"
    var miCadena2: String = "Otra cadena de texto"

    println(miCadena)
    println(miCadena2)


    //Declaracion de cadena de texto vacia

    var miCadenaVacia = String()
    var miCadenaVacia2=" "

    println("XXX $miCadenaVacia XXX")


    //Acceder a elementos de un String
    var s1 = "ABCDEFGHI"

    println("Primer elemento es " + s1[0])
    println("Segundo elemento es " + s1[1])
    println("el ultimo elemento es "+ s1[s1.length-1])

    //recorrer elementos de un String
    var recorrerCadena = "voy a recorrer este texto"

    for(i in recorrerCadena){
        println(i)
    }

    //Impresion de variables por pantalla
    var nombre = "Fulanito"
    println("Mi nombre es: "+ nombre)
    println("Mi nombre es $nombre")
// si quieres imprimir un atributo debemos utilizar la siguiente sintaxis 
    println("$nombre.length es ${nombre.length}")

    //comparacion de cadenas
    var cad1 = "Hola, Fulanito"
    var cad2 = "Hola,"+ " Fulanito"

    println(cad1 == cad2)

   //Gestion de subcadenas
   var cad3= "CAMALEON"
   //subSequence() devuelve un substring dentro de un string
   println(cad3.subSequence(0,4))
   println(cad3.subSequence(4,8))
   println(cad3.subSequence(4,cad3.length))

   //Strings multilinea
   var multilinea1="Esta es una linea \n Ultima linea"
   var multilinea2="""Esta es la forma
   mas correcta 
   de escribir
   una variable multilinea"""

   println(multilinea1)
   println(multilinea2)

   var cad4= "Hola, "
   var cad5="me gusta Kotlin"
//concatenar strings
   println(cad4 + cad5)
   println(cad4.plus(cad5))

   

}