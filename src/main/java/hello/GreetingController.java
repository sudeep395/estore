package hello;

/**
 * Created by anshulsharma on 24/04/15.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.*;

@Controller
public class GreetingController {


    @RequestMapping("/greeting")
    public @ResponseBody String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        return "Hello world";
    }
    

}
