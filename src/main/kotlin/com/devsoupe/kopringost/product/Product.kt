package com.devsoupe.kopringost.product

import org.springframework.util.Assert

class Product(
  private val name: String,
  private val price: Int,
  private val discountPolicy: DiscountPolicy,
) {
  var id: Long = 0L

  fun assignId(id: Long) {
    this.id = id
  }

  init {
    Assert.hasText(name, "상품명은 필수입니다.")
    Assert.isTrue(price > 0, "상품 가격은 0보다 커야 합니다.")
  }
}