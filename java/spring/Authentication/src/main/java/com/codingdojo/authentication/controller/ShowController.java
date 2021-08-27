package com.codingdojo.authentication.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.authentication.models.Show;
import com.codingdojo.authentication.services.ShowService;

@Controller
@RequestMapping("/shows")
public class ShowController {
	
	@Autowired
	private ShowService showService;
	
	@RequestMapping("/createshow")
    public String registerShow(@ModelAttribute("show") Show show) {
        return "newshow.jsp";
    }
    @RequestMapping("/")
    public String home() {
        return "homePage.jsp";
    }
    @RequestMapping("/{idshow}")
    public String index(Model model, @ModelAttribute("show") Show show,HttpSession session) {
        model.addAttribute("showId", show.getIdshow());
        session.setAttribute("showId", show.getIdshow());
        return "mostrar.jsp";
    }
    
    @RequestMapping(value="/createshow", method=RequestMethod.POST)
    public String registerShow(@Valid @ModelAttribute("show") Show show, BindingResult result, HttpSession session) {

    	if(result.hasErrors()) {
    		return "newshow.jsp";
    	}
    	Show s = showService.createShow(show);
    	session.setAttribute("showId", s.getIdshow());
    	return "redirect:/home";
    }

}
