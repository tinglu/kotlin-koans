// Return customers who have more undelivered orders than delivered
// fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> {
//     val (moreUndelivered, _) = customers.partition { it.orders.filter { it.isDelivered }.size < it.orders.filter { !it.isDelivered }.size }
//     return moreUndelivered.toSet()
// }
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = customers.filter {
    val (delivered, undelivered) = it.orders.partition { it.isDelivered }
    undelivered.size > delivered.size
}.toSet()