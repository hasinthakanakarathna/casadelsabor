package com.casadelsabor.pos.controller;

import com.casadelsabor.pos.model.MenuItem;
import com.casadelsabor.pos.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MenuController {

    @Autowired
    private MenuItemRepository menuItemRepository;

    // GET all menu items
    @GetMapping("/menu")
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findByAvailableTrue();
    }

    // GET menu items by category
    @GetMapping("/menu/category/{category}")
    public List<MenuItem> getByCategory(@PathVariable String category) {
        return menuItemRepository.findByCategory(category);
    }
}