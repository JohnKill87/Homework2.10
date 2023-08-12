package pro.sky.onlinestoredemo.Controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.onlinestoredemo.Essences.Basket;
import pro.sky.onlinestoredemo.Services.BasketService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    @ExceptionHandler({RuntimeException.class})
    public String handleException(Exception e) {
        return  e.getMessage();
    }

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public List<Integer> addBasket (@RequestParam("id") List<Integer> id) {
        return basketService.addBasket(id);
    }

    @GetMapping(path = "/get")
    public List<Integer> getBasket() {
        return null;
    }

}
