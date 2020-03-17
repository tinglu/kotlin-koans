// Return the sum of prices for all the products ordered by a given customer
fun moneySpentBy(customer: Customer): Double =
    // customer.orders.sumByDouble { it.products.sumByDouble { it.price } }
    customer.orders.flatMap { it.products }.sumByDouble { it.price }
