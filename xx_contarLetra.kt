fun main(){

    var cad1:String = "HOlaaI que TaAal"
    var cont:Int= 0

    for(s in cad1.lowercase()){
        if(s=='a'){
            cont++
        }

    }
    println(cont)

    var vocMin:Int =0
    var vocMax:Int=0
    var vocTotal:Int=0

    for(s in cad1){
        if(s=='A'|| s=='E'|| s=='I'|| s=='O'|| s=='U'){
            vocMax++
        }

        else if(s=='a'|| s=='e'|| s=='i'|| s=='o'|| s=='u'){
            vocMin++
        }

        
    }

    vocTotal = vocMax + vocMin

    println("total vocales minusculas: $vocMin")
    println("total vocales Mayusculas: $vocMax")
    println("total vocales: $vocTotal")

//buscar una subcadena dentro de una cadena
    var cadena: String= "Cadena  bu a buscar  busc"

   var buscar = "buscar"

   var position=cadena.indexOf(buscar)

   if(position!=-1){
    println("$buscar esta en la posicion $position")
    println(cadena.subSequence(position,position+buscar.length))
   }
   else{
    println("$buscar no  esta en la cadena")
   }
}