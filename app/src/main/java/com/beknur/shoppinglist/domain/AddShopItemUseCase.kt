
import com.beknur.shoppinglist.domain.ShopItem
import com.beknur.shoppinglist.domain.ShopListRepository



class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}
