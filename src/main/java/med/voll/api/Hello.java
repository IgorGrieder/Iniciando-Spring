package med.voll.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 */
@RestController
@RequestMapping("hello")
public class Hello {

  @GetMapping
  public String Say() {
    return "Hello a todosss";
  }

}
