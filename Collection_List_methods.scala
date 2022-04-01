object Collection_List_methods {
    def main(args: Array[String]): Unit= {
      var fruit : List[String] = List("Mangoes","Bananas","Oranges","Apples","Strawbarries","Pinapples","Chikoos")
      var num = List(1,2,10,4,15,6,0)

     // print("Elements : ")
      //list.foreach((element:Int)) => print(element+ " ")

      println("Element at 2 index :" + num(2) )  //Element present on index


     // var con = fruit++num          // List concatenation
      println(fruit++num)

     // var list1 = num.sorted     //sorting the list
      println(num.sorted)
      println(fruit.sorted)

     // var list2 = num.reverse      //reverse the list
      println(num.reverse)
    }

  }


