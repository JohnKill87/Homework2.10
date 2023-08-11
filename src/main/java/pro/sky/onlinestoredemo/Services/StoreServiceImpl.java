package pro.sky.onlinestoredemo.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.onlinestoredemo.Essences.Basket;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class StoreServiceImpl implements StoreService{
    List<Basket> baskets = new ArrayList<>(List.of());

    @Override
    public Basket addBasket(Integer id) {

        Basket addedBasket = new Basket(id);
        baskets.add(addedBasket);
        return addedBasket;
    }

    @Override
    public List<Basket> getBasket() {
        return baskets;
    }
}
