package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Product;
import com.example.demo.form.IndexForm;

@Controller
public class TaskController {

	 @RequestMapping("/task")
	public String index(@ModelAttribute("task") IndexForm from,Model model) {
		 
		 Product product1 = new Product();
		 product1.setProductId(101);
		 product1.setProductName("鉛筆");
		 product1.setPrice(50);
		 
		 Product product2 = new Product();
		 product2.setProductId(102);
		 product2.setProductName("消しゴム");
		 product2.setPrice(100);
		 
		 List<Product> list = new ArrayList<>();
		 list.add(product1);
		 list.add(product2);
		 
		 model.addAttribute("list", list);
		 
		 return "index";
		 
		 
	 }

	 @RequestMapping(value="/result2", method = RequestMethod.POST)
	public void result2(@ModelAttribute("task") IndexForm from,Model model) {
		 model.addAttribute("msg", from.getText()+"さんが下記の商品を選択しました");
	 }
		 
	 @RequestMapping(value="/result", method = RequestMethod.POST)
	public String result(@ModelAttribute("task") IndexForm from,Model model) {
		 
		 int id = from.getId();
		 
		 Product product = null;
		 switch(id) {
		 case 101:
			 product = new Product(101,"鉛筆",50);
			 break;
		 case 102:
			 product = new Product(102,"消しゴム",100);
			 break;
			 
		 }

		 
		 model.addAttribute("product", product);
		 
		 return "result";
		 
		 
	 }
	

}
