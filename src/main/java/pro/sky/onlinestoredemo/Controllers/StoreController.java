package pro.sky.onlinestoredemo.Controllers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.onlinestoredemo.Essences.Basket;
import pro.sky.onlinestoredemo.Services.StoreService;

@RestController
@RequestMapping("/store/order")
public class StoreController {

    @ExceptionHandler({RuntimeException.class})
    public String handleException(Exception e) {
        return  e.getMessage();
    }

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    public Basket addBasket (@RequestParam("name") String name,
                             @RequestParam("id") Integer id) {
        return storeService.addBasket(name, id);
    }

}
