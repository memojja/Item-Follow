package com.example.service;

import com.example.model.Item;
import org.springframework.stereotype.Service;

/**
 * Created by mehmet on 6.10.2016.
 */
public interface ItemService {

    void addItem(Item item);

    void deleteItemById(Long id);
    Iterable<Item> getItems();

}
