object SI {
  def main(args:Array[String]):Unit = {
    var name = "Ishan"
    var age  = 3
    //Sting interpolations
    println(name + " is " + age + " year old ")
    println(s"$name is $age year old")
    println(f"$name%s is $age%d year old")
   //Escape interpolation
    println(s" My name is Pratha \nChudhary")
    println(raw"My name is Shiva \nSinghaniya")
  }

}
