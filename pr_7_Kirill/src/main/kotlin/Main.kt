import kotlin.system.exitProcess

fun main() {
    // Создаем экземпляры различных городов с пиццериями
    val pizzaPeter = PizzaPeter(
        175.0, 241.5,
        167.5, 215.0
    )
    val pizzaMoscow = PizzaMoscow(
        215.0, 250.5,
        180.5, 240.0
    )
    val pizzaAmsterdam = PizzaAmsterdam(
        250.0,280.5,
        210.0,275.0
    )
    var currentPizzaCity: PizzaCity

    while (true) {
        // Выводим пользователю меню выбора города
        println("Добрый день! Выберите город")
        println("1. Москва\n2. Санкт-Петербург\n3. Амстердам\n0. Выход из программы")

        // Считываем ввод пользователя и выбираем соответствующий город
        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "3" -> pizzaAmsterdam
            "0" -> break
            else -> {
                println("ERROR")
                exitProcess(1)
                continue
            }
        }

        // Выводим пользователю меню выбора пиццы
        println("Выберите пиццу:")
        println(
            "1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n" +
                    "4. Тирольская пицца\n\n0. Показать статистику"
        )

        // Вызываем функцию для обработки выбора пиццы
        selectPizza(currentPizzaCity)
    }
}

private fun selectPizza(currentPizzaCity: PizzaCity) {
    // Обработка выбора пиццы пользователем
    when (readln()) {
        "1" -> {
            currentPizzaCity.neapolitanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "2" -> {
            currentPizzaCity.romanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "3" -> {
            currentPizzaCity.sicilianPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "4" -> {
            currentPizzaCity.tyroleanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "0" -> currentPizzaCity.showStatistics()
        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}

private fun selectAddService(currentPizzaCity: PizzaCity) {
    // Дополнительные услуги, которые может предложить пиццерия
    if (currentPizzaCity is CheckPhoto) {
        currentPizzaCity.showCheckPhoto()
    }
    if (currentPizzaCity is Drink) {
        currentPizzaCity.drinkSale()
    }
    if (currentPizzaCity is SauceOption) {
        currentPizzaCity.offerSauce()
    }
}
