#set ( $package = $packageAsDirectory.replaceAll("/", ".") )
package ${package}.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class StartController {

    @GetMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public String helloWorld() {
        return "Hello World";
    }

}