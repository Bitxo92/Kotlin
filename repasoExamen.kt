fun main() {
     //if

     var a =10
    if(a<50){
        println("a es menor de 50")

    }
    else if(a==50){
        println("a==50")
    }
    else{
        println("a es mayor que 50")
    }

    //when

    var msg=4

    when(msg){
        1 -> println("El valor es 1")
        2 -> println("El valor es 2")
        3 -> println("El valor es 3")
        else -> println("valor desconocido")
    }

    //for

    val lista= listOf(10,20,30,40)

    for(k in lista){
        println(k)
    }


    val miArray = arrayOf(100,200,300,400,500)
    for((x,y) in miArray.withIndex()){
        println("$x : $y")

    }

    val valor = 10
    for(va in 1..valor){
        println(va)
    }

    //while
    var b=1
    while(b<=7){
        println(b)
        b++
    }
println("\n")

    //Do..While
    var c=0
    do{
        println(c)
        c++

    }while(c<=7)

    








}