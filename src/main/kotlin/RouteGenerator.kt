import kotlin.random.Random

// 1. Класс создания направления
class RouteGenerator {
    private val cities = listOf(
        "Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург", "Казань",
        "Нижний Новгород", "Челябинск", "Омск", "Самара", "Ростов-на-Дону",
        "Уфа", "Красноярск", "Пермь", "Воронеж", "Волгоград", "Бийск", "Барнаул"
    )

    fun generateRoute(): Pair<String, String> {
        var startCity = cities.random()
        var endCity = cities.random()
        while (startCity == endCity) {
            endCity = cities.random()
        }
        println("Направление: ${Pair(startCity, endCity)}")
        return Pair(startCity, endCity)
    }
}