class PizzaMoscow(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice, sicilianPizzaPrice, tyroleanPizzaPrice
), CheckPhoto {

    // Переопределение функции showCheckPhoto() из интерфейса CheckPhoto
    override fun showCheckPhoto() {
        // Отображение вопроса о наличии фотографии чека и обработка выбора пользователя
        println("У вас есть фотография чека?")
        println("1. Да\n2. Нет")
        val choice = readln()
        totalChecksDisplayed++
        if (choice == "1") {
            println("Вам будет скидка 50 рублей с покупки")
            checksWithPhoto++
            totalDiscountAmount += 50.0
        }

    }

    // Переопределение функций продажи различных видов пиццы из абстрактного класса PizzaCity
    override fun romanPizzaSale() {
        // Логика продажи римской пиццы в Москве
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Москве")
    }

    override fun sicilianPizzaSale() {
        // Логика продажи сицилийской пиццы в Москве
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Москве")
    }

    override fun tyroleanPizzaSale() {
        // Логика продажи тирольской пиццы в Москве
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Москве")
    }

    override fun neapolitanPizzaSale() {
        // Логика продажи неаполитанской пиццы в Москве
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Москве")
    }
    override fun offerSauce() {}
}