package pro.sky.onlinestoredemo.Controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.onlinestoredemo.Essences.Basket;
import pro.sky.onlinestoredemo.Services.StoreService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class StoreController {

    @ExceptionHandler({RuntimeException.class})
    public String handleException(Exception e) {
        return  e.getMessage();
    }

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "/add")
    public Basket addBasket (@RequestParam("id") Integer id) {
        return storeService.addBasket(id);
    }

    @GetMapping(path = "/get")
    public List<Basket> getBasket() {
        return storeService.getBasket();
    }

}
