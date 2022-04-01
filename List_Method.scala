object List_Method {
  def main(args: Array[String]):Unit={
    var fruit = "apples" ::("oranges" ::("pears"::Nil))
    var fruit2 = "mangoes" ::("banana" :: Nil)
    var num = Nil


    println("Head of fruit: "+ fruit.head)
    println("Tail of fruit2: "+fruit2.tail)
    println("Check fruit is empty: "+fruit.isEmpty)
    println("Check fruit2 is empty: "+fruit2.isEmpty)
    println("Check num is Empty: "+num.isEmpty)
  }

}
