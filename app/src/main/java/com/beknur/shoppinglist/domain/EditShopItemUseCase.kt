import com.beknur.shoppinglist.domain.ShopItem
import com.beknur.shoppinglist.domain.ShopListRepository


class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}
