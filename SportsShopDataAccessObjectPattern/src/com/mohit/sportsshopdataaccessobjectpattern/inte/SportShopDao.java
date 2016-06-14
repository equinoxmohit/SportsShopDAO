/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.sportsshopdataaccessobjectpattern.inte;

import com.mohit.sportsshopdataaccessobjectpattern.entity.SportShop;
import java.util.ArrayList;

/**
 *
 * @author Mohit
 */
public interface SportShopDao {

    boolean addItems(SportShop s);

    boolean deleteItems(int id);

   
    SportShop displayById(int id);

    ArrayList<SportShop> getDetails();
    
    int count();
}
