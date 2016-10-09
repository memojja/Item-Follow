package com.example.dao;

import com.example.model.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mehmet on 6.10.2016.
 */

public interface ItemDao extends CrudRepository<Item,Long> {
}
