/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.sportsshopdataaccessobjectpattern;

import com.mohit.sportsshopdataaccessobjectpattern.controller.MainProgramController;
import com.mohit.sportsshopdataaccessobjectpattern.entity.SportShop;
import com.mohit.sportsshopdataaccessobjectpattern.impl.SportShopDaoImpl;
import com.mohit.sportsshopdataaccessobjectpattern.inte.SportShopDao;
import java.util.Scanner;

/**
 *
 * @author Mohit
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SportShopDao ssd = new SportShopDaoImpl();
        MainProgramController mp = new MainProgramController(input, ssd);
        while (true) {
            mp.menu();
            mp.work();
        }

    }

}
