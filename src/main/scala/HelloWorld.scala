import java.io.File

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
 
object HelloWorld extends App {

  //for windows
  val classLoader: ClassLoader = getClass.getClassLoader
  val file: File = new File(classLoader.getResource("hadoop/bin/winutils.exe").getFile)
  val hadoopPath = file.getAbsolutePath
  System.setProperty("hadoop.home.dir", s"$hadoopPath\\..\\..")

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

