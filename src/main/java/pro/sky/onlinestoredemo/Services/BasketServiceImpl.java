package pro.sky.onlinestoredemo.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.onlinestoredemo.Essences.Basket;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    List<Integer> baskets = new ArrayList<>(List.of());

    @Override
    public List<Integer> addBasket(List<Integer> id) {

//        Basket addedBasket = new Basket(id);
        baskets.addAll(id);
        return baskets;
    }

    @Override
    public List<Integer> getBasket() {
        return baskets;
    }
}
