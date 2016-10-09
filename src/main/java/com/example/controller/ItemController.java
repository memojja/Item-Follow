package com.example.controller;

import com.example.model.Item;
import com.example.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by mehmet on 9.10.2016.
 */
@Controller
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping("items/add")
    public ModelAndView addItem() {
        return new ModelAndView("addItem","item",new Item());
    }

    @RequestMapping(value = "/items",method = RequestMethod.POST)
    public String handleItemAdd(@Valid@ModelAttribute Item item, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return "items/add";
        itemService.addItem(item);
        return "redirect:/items";
    }

    @RequestMapping(value = "/items",method = RequestMethod.GET)
    public ModelAndView getItemsPage(){
        return new ModelAndView("items","items",itemService.getItems());
    }

    @RequestMapping(value = "/items/{id}",method = RequestMethod.DELETE)
    public String deleteItemById(@PathVariable Long id){
        itemService.deleteItemById(id);
        return "redirect:/items";
    }

}
