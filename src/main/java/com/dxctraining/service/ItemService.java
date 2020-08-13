package com.dxctraining.service;

import com.dxctraining.dao.IItemDao;
import com.dxctraining.entities.Item;

import javax.transaction.Transactional;

@Transactional
@Service
public class ItemService implements IItemService{

    @Autowired
private IItemDao itemDao;

    @Override
    public Item findItem(int id) {
        validateId(id);
       Item item=itemDao.findItem(id);
       return  item;
    }

    private void validateId(int id) {
       if(id<0)
       {
           System.out.println("ID can't be negative");
       }
    }

    @Override
    public Item update(Item item) {
        item=itemDao.update(item);
        return item;
    }

    @Override
    public void removeItem(int id) {
    itemDao.removeItem(id);
    }

}
