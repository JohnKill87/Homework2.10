package pro.sky.onlinestoredemo.Services;

import pro.sky.onlinestoredemo.Essences.Basket;

import java.util.List;
import java.util.Map;

public interface StoreService {
    Basket addBasket(Integer id);

    List<Basket> getBasket();
}
