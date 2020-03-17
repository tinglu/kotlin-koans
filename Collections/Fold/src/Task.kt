// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val allOrderedProducts = customers.flatMap(Customer::getOrderedProducts).toSet()

    return customers.fold(allOrderedProducts, { orderedByAllCustomers, customer ->
        orderedByAllCustomers.intersect(customer.getOrderedProducts())
    })
}

fun Customer.getOrderedProducts(): List<Product> = orders.flatMap(Order::products)