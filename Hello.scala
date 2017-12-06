/* object Hello {
    def main(args: Array[String]) {
        println("Hello, World!")
    }
}

*/

object Hello extends App {
    if (args.length > 0)
        println(f"Hello ${args(0)}")
    else
        println("Hello, World!")
}
    
