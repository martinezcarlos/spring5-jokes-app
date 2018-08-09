package martin.karle.joke.controllers;

import martin.karle.joke.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by carlosmartinez on 9/8/18 20:04
 */
@Controller
public class JokeController {

  private final JokeService jokeService;

  public JokeController(final JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @RequestMapping({"/", ""})
  public String showJoke(final Model model) {
    model.addAttribute("joke", jokeService.getJoke());
    return "chucknorris";
  }
}
