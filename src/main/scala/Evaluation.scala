object EvaluationApp extends App {
  // Methods with call-by-name parameters
  println("\n-> Methods with call-by-name parameters")
  
  // lazy val, def and val
  println("\n-> lazy val, def and val")
 
  def expr = {
    val x = { print("x"); 1}
    lazy val y = { print("y"); 2}
    def z = { print("z"); 3}
    z + y + x + z + y + x
  }
  
  println(s"\nexpr = ${expr}")
}
