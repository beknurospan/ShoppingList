package com.beknur.shoppinglist.domainimport

import com.beknur.shoppinglist.domain.ShopItem
import com.beknur.shoppinglist.domain.ShopListRepository




class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}
