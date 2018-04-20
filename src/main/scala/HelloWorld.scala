import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
 
object HelloWorld extends App {

  //initialise spark context
  val conf = new SparkConf()
    .setMaster("local[*]")
    .setAppName("HelloWorld")
  val sc = new SparkContext(conf)

  //do stuff
  println("************")
  println("************")
  println("Hello, world!")
  println("************")
  println("************")

  //terminate spark context
  sc.stop()
}

