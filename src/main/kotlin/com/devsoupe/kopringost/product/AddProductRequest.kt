package com.devsoupe.kopringost.product

import org.springframework.util.Assert

data class AddProductRequest(
  val name: String,
  val price: Int,
  val discountPolicy: DiscountPolicy,
) {
  init {
    Assert.hasText(name, "상품명은 필수입니다.")
    Assert.isTrue(price > 0, "상품 가격은 0보다 커야 합니다.")
  }
}