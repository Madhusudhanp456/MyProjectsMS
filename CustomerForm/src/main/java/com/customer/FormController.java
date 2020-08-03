package com.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@GetMapping("cust")
	public String enter() {
		return "customer";
	}
	
	@PostMapping("/details")
	public String details(@RequestParam("cid") String cid,@RequestParam("cname") String cname,ModelMap mp) {
		mp.put("cid",cid);
		mp.put("cname",cname);
		
		return "display";
	}

}
