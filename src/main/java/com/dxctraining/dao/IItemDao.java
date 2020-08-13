package com.dxctraining.dao;

import com.dxctraining.entities.Item;

public interface IItemDao {
public Item findItem(int id);
Item update(Item item);
void removeItem(int id);
}
