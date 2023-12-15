class PizzaAmsterdam(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double,
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice, sicilianPizzaPrice, tyroleanPizzaPrice
), CheckPhoto, Drink, SauceOption {

    // Переопределение свойств и методов из интерфейсов

    override val saucePriceTomato: Double = 20.0
    override val saucePriceCreamy: Double = 25.0

    override var sauceCountTomato: Int = 0
    override var sauceCountCreamy: Int = 0
    override var revenueFromTomatoSauce: Double = 0.0
    override var revenueFromCreamySauce: Double = 0.0

    // Переопределение функции showCheckPhoto() из интерфейса CheckPhoto
    override fun showCheckPhoto() {
        // Отображение вопроса о наличии фотографии чека и обработка выбора пользователя
    }

    // Переопределение функции drinkSale() из интерфейса Drink
    override fun drinkSale() {
        // Отображение вопроса о покупке кофе и обработка выбора пользователя
    }

    // Переопределение функций продажи различных видов пиццы из абстрактного класса PizzaCity
    override fun romanPizzaSale() {
        // Логика продажи римской пиццы в Амстердаме
    }

    override fun sicilianPizzaSale() {
        // Логика продажи сицилийской пиццы в Амстердаме
    }

    override fun tyroleanPizzaSale() {
        // Логика продажи тирольской пиццы в Амстердаме
    }

    override fun neapolitanPizzaSale() {
        // Логика продажи неаполитанской пиццы в Амстердаме
    }

    // Переопределение функции offerSauce() из интерфейса SauceOption
    override fun offerSauce() {
        // Отображение вариантов выбора соуса и обработка выбора пользователя
    }
}
