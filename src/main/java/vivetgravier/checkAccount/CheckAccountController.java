package vivetgravier.checkAccount;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class CheckAccountController {

    @RequestMapping(method = RequestMethod.GET, value = "/checkAccount")
    public String checkAccount() {
        int random = new Random().nextInt(100);
        String risk = "HIGH";

        if (random < 50) {
            risk = "LOW";
        }

        return risk;
    }
}
