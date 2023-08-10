package pro.sky.onlinestoredemo.Services;

import org.springframework.stereotype.Service;
import pro.sky.onlinestoredemo.Essences.Basket;
import pro.sky.onlinestoredemo.Exceptions.BasketNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService{
    List<Basket> baskets = new ArrayList<>(List.of());

    @Override
    public Basket addBasket(String name, Integer id) {

        Basket addedBasket = new Basket(name, id);
        if (baskets.contains(addedBasket)) {
            throw new BasketNotFoundException("Этот предмет уже есть в корзине");
//        } else if (baskets.size() >= basketsListSize){
//            throw new EmployeeStorageIsFullException("Список сотрудников переполнен");
        }
        baskets.add(addedBasket);
        return addedBasket;
    }

    @Override
    public String getBasket(Integer id) {

        for (Basket basket : baskets) {
            if (basket.getId().equals(id)) {
                final String basketDescription = ""
                        + basket.getName() + " "
                        + basket.getId();
                return basketDescription;
            }
        }
        throw new BasketNotFoundException("Предмет не найден");
    }
}
