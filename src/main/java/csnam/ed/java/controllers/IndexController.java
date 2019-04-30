package csnam.ed.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @project crmjava
 * @user jp
 * @date 2019-04-29
 * This is the controller for the Customer model
 */
@Controller
@RequestMapping("/")
public class IndexController {

  @RequestMapping("/")
  public String index(Model model) {
    return "index";
  }

}
