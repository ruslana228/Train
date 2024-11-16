// 3. Класс формирования поезда
import kotlin.random.Random
class TrainFormation(private val numPassengers: Int) {
    private val trainCars = mutableListOf<Int>()

    fun formTrain(): List<Int> {
        var totalCapacity = 0
        while (totalCapacity < numPassengers) {
            val carCapacity = Random.nextInt(5, 26) // 5..25 включительно
            trainCars.add(carCapacity)
            totalCapacity += carCapacity
        }
        return trainCars
    }
}