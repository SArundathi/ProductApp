package in.arundathi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.arundathi.entity.Product;

@Controller
public class ProductController {
	
    @RequestMapping("/")
	public String getProduct(Model m)
	{
		Product p=new Product();
		m.addAttribute("product", p);
		return "form";
	}
    
    @PostMapping("/product")
    public String handleFormSumbit(Product product,Model m)
    {
    	System.out.println("output.."+product);
    	m.addAttribute("msg", "Product added succesfully..");
    	return "success";
    }
}
