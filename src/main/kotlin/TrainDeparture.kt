// 4. Класс отправления поезда
import kotlin.random.Random
class TrainDeparture(private val route: Pair<String, String>, private val trainCars: List<Int>, private val numPassengers: Int) {
    fun depart() {

        println("Количество вагонов: ${trainCars.size}")
        var passengerCounter = 0
        for (i in trainCars.indices) {
            val passengersInCar = minOf(trainCars[i], numPassengers - passengerCounter) //учитываем остаток пассажиров
            println("Вагон ${i + 1}: вместимость - ${trainCars[i]}, пассажиров - $passengersInCar")
            passengerCounter += passengersInCar
        }

        println("Поезд ${route.first} - ${route.second} отправлен.")
    }
}
