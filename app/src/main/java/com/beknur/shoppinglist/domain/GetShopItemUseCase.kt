
import com.beknur.shoppinglist.domain.ShopItem
import com.beknur.shoppinglist.domain.ShopListRepository




class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}
