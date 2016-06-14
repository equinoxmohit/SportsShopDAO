/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.sportsshopdataaccessobjectpattern.impl;

import com.mohit.sportsshopdataaccessobjectpattern.entity.SportShop;
import com.mohit.sportsshopdataaccessobjectpattern.inte.SportShopDao;
import java.util.ArrayList;

/**
 *
 * @author Mohit
 */
public class SportShopDaoImpl implements SportShopDao {

    ArrayList<SportShop> sportList = new ArrayList<>();

    @Override
    public boolean addItems(SportShop s) {
        return sportList.add(s);
    }

    @Override
    public boolean deleteItems(int id) {
        SportShop s=displayById(id);
            if(s!=null)
            {
                 sportList.remove(s);
                return true;
            }
            return false;
    }

  

    @Override
    public SportShop displayById(int id) {
       for(SportShop s:sportList)
       {
           if(s!=null)
           {
               return s;
           }
           
       } 
        return null;
    }

    @Override
    public ArrayList<SportShop> getDetails() {
        return sportList;
    }

    @Override
    public int count() {
        return getDetails().size();
    }

}
