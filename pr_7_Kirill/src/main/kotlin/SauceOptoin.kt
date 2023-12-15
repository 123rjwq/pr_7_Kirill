// Интерфейс SauceOption позволяет стандартизировать функциональность для предложения соусов и общаться с различными классами,
interface SauceOption {
    // Интерфейс SauceOption объявляет свойства saucePriceTomato и saucePriceCreamy, которые представляют цены на различные виды соуса.
    val saucePriceTomato: Double
    // Также интерфейс объявляет функцию offerSauce(), которая представляет предложение о выборе соуса
    val saucePriceCreamy: Double

    fun offerSauce()
}