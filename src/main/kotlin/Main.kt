fun main() {
    val routeGenerator = RouteGenerator()
    val ticketSales = TicketSales()

    println("Добро пожаловать в П О Е З Д!")
    while (true)
    {
        println("\nВыберите действие\n1.Составить поезд\n2.Выход")
        val input = readln().toInt()

        if (input == 2 )
        {
            break
        }
        else if (input ==1)
        {
            val (startCity, endCity) = routeGenerator.generateRoute()
            val numPassengers = ticketSales.sellTickets()
            println("Количество проданных билетов: $numPassengers")

            val trainCars = TrainFormation(numPassengers).formTrain()
            TrainDeparture(Pair(startCity, endCity), trainCars, numPassengers).depart()

        }
        else
        {
            println("Неверный ввод. Пожалуйста, введите 1 или 2.")
        }
    }
}

