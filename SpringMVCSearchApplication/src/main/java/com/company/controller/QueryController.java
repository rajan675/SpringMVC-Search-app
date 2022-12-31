package com.company.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class QueryController {
    @RequestMapping("/home")
	public String query() {
		return "home";
	}
    @RequestMapping("/search")
    public RedirectView search(@RequestParam("querySearch")String query) {
    	String url = "https://www.google.com/search?q="+query;
    	if(query.isBlank()) {
    		return new RedirectView("home");
    	}
    	RedirectView redirectView = new RedirectView();
    	redirectView.setUrl(url);
    	return redirectView;
    }
}
