package pro.sky.onlinestoredemo.Services;

import pro.sky.onlinestoredemo.Essences.Basket;

public interface StoreService {
    Basket addBasket(String name, Integer id);

    String getBasket(Integer id);
}
