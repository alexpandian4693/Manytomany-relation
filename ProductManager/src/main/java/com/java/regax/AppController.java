package com.java.regax;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AppController {
	public static final Log LOG = LogFactory.getLog(AppController.class);

	@Autowired
	private PlayerService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Player> listPlayers = service.listAll();
		model.addAttribute("listPlayers", listPlayers);
		LOG.info(listPlayers);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewplayerPage(Model model) {
		Player player = new Player();
	
		model.addAttribute("player", player);
		
		return "new_player";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveplayer(@ModelAttribute("player") Player player) {
		service.save(player);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditplayerPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_player");
		Player player = service.get(id);
		mav.addObject("player", player);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteplayer(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";		
	}
}
