package com.example.service.impl;

import com.example.dao.ItemDao;
import com.example.model.Item;
import com.example.service.ItemService;
import org.springframework.stereotype.Service;

/**
 * Created by mehmet on 6.10.2016.
 */
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemDao itemDao;


    public ItemServiceImpl(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public void addItem(Item item){
        itemDao.save(item);
    }

    @Override
    public void deleteItemById(Long id) {
        itemDao.delete(id);
    }

    @Override
    public Iterable<Item> getItems() {
        return itemDao.findAll();
    }


}
