package pro.sky.onlinestoredemo.Services;

import pro.sky.onlinestoredemo.Essences.Basket;

import java.util.List;

public interface BasketService {
    List<Integer> addBasket(List<Integer> id);

    List<Integer> getBasket();
}
