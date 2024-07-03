package com.beknur.shoppinglist.presentation
import EditShopItemUseCase
import androidx.lifecycle.ViewModel
import com.beknur.shoppinglist.data.ShopListRepositoryImpl
import com.beknur.shoppinglist.domain.GetShopListUseCase
import com.beknur.shoppinglist.domain.ShopItem
import com.beknur.shoppinglist.domainimport.DeleteShopItemUseCase


class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}
