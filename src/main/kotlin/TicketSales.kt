// 2. Класс продажи билетов
import kotlin.random.Random
class TicketSales {
    fun sellTickets(): Int {
        return Random.nextInt(5, 202) // 5..201 включительно

    }
}