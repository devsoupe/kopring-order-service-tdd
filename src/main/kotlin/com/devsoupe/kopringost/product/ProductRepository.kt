package com.devsoupe.kopringost.product

class ProductRepository(
  private val persistence: HashMap<Long, Product> = HashMap(),
  private var sequence: Long = 0,
) {
  fun save(product: Product) {
    product.  assignId(++sequence)
    persistence[product.getId()] = product
  }
}