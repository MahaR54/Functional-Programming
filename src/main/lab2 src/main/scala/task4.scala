// Define a class
class Celsius(val temperature: Double)

// Define a companion object with implicit conversion
object TemperatureConversions {
  // Implicit conversion from Celsius to Fahrenheit
  implicit def celsiusToFahrenheit(celsius: Celsius): Fahrenheit = {
    new Fahrenheit(celsius.temperature * 9 / 5 + 32)
  }

  // Define a class for Fahrenheit
  class Fahrenheit(val temperature: Double) {
    def display(): Unit = {
      println(s"$temperature°F")
    }
  }
}

// Import the implicit conversion
import TemperatureConversions._

object ImplicitConversionExample {
  def main(args: Array[String]): Unit = {
    val celsiusTemperature = new Celsius(25.0)

    // Implicit conversion from Celsius to Fahrenheit
    val fahrenheitTemperature: Fahrenheit = celsiusTemperature

    // Now you can use the Fahrenheit object
    fahrenheitTemperature.display()
  }
}
