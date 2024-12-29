package ci_cd_github_actions.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // объявляем компонент rest controller
@RequestMapping("/api/divider") // настраиваем корень эндпоинта
public class ExampleController {

    @GetMapping // декларпируем get метод счета.
    public String divide(@RequestParam Double divisible, @RequestParam Double divider) {
        if (divisible == null || divider == null || divider == 0) return "NaN"; // проверка краевых случаев
        return String.valueOf(divisible / divider); // привидение к строке
    }

}
