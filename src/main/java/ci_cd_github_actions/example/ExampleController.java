package ci_cd_github_actions.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/divider")
public class ExampleController {

    @GetMapping
    public String divide(@RequestParam Double divisible, @RequestParam Double divider) {
        if (divisible == null || divider == null || divider == 0) return "NaN";
        return "" + divisible / divider;
    }

}
