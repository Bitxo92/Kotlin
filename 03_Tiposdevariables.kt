fun main(){
 //tipos de variables
 //Tipos Numericos

 var a:Int  = 22

 var l:Long = 345L

 var d:Double = 23.564

 var f:Float =45.876f

 val h = 0x64 //hexadecimal

 val b =0b11001 //binario



 println("$a $l $d $f $h $b")

 //tipos booleanos

 var t = true

 var w= false

 println("$t $w")


 //tipo Char

 var cara = 'E'

 println("$cara")

 //tipo String
 var m1="primer string"
 var m2= "segundo String"
 
 println("$m1 $m2")

 //iterar sobre string (for-each loop)

 var m3 = "Prueba de iteracion"

 for(s in m3){
    println(s)
 }

 for((index,value) in m3.withIndex()){
    println("$index :$value")
 }

 




}