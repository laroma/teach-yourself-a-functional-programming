object CapitalizeNamesFilter {
    
    implicit class ExtendedList[T](val value: List[String]) extends AnyVal {
        
        def myCapitalizer() = {
            
            def capitalizeFirstChar(current: List[String], capitalized: List[String]): List[String] = {
                //println(" and here"  + capitalized)
                if(current.isEmpty) {
                    capitalized
                } else {
                    val cappedItem = current.head.capitalize
                    //println(cappedItem)
                    capitalizeFirstChar(current.tail, cappedItem :: capitalized)
                }
                
            }
            
            //println("I'm here" + value)
            capitalizeFirstChar(value, List())
        }
    }
        
 
     def main(args: Array[String]) {
        println(List("chewie", "luke", "leia").myCapitalizer())
     }
    
    
}