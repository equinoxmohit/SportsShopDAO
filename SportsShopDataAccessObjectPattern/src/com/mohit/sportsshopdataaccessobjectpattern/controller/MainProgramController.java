/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.sportsshopdataaccessobjectpattern.controller;

import com.mohit.sportsshopdataaccessobjectpattern.entity.SportShop;
import com.mohit.sportsshopdataaccessobjectpattern.inte.SportShopDao;
import java.util.Scanner;

/**
 *
 * @author Mohit
 */
public class MainProgramController {

    Scanner input;
    SportShopDao ssd;

    public MainProgramController(Scanner input, SportShopDao ssd) {
        this.input = input;
        this.ssd = ssd;
    }

    public void menu() {
        System.out.println("Welcome to sports shop management system");
        System.out.println("Enter 1 to add items");
        System.out.println("Enter 2 to delete items");
        System.out.println("Enter 3 to display items by its id");
        System.out.println("Enter 4 to display all items");
        System.out.println("Enter 5 to exit from the system");
        System.out.println("Enter your choice[1-5]");

    }

    private void add() {
        while (true) {
            SportShop s = new SportShop();
            s.setId(ssd.count() + 1);
            System.out.println("Enter the name of the item to add");
            s.setProductName(input.next());
            System.out.println("Enter the number of product to add");
            s.setNumberOfProduct(input.nextInt());
            System.out.println("Enter the price of the product");
            s.setPrice(input.next());
            System.out.println("Enter the status of the product");
            s.setStatus(input.nextBoolean());
            ssd.addItems(s);
            System.out.println("Do you want to add more items?[Y/N]");
            if (input.next().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    private void delete() {
        while(true){
        System.out.println("Enter id to delete");
        SportShop ss=ssd.displayById(input.nextInt());
         if (ss!=null) {
            ssd.deleteItems(input.nextInt());
            break;
        }
         else
         {
             System.out.println("No items to add.\nDo you want to add more??[Y/N]");
                if(input.next().equalsIgnoreCase("Y"))
                {
                    add();
                }
         }
        }
    }

    private void displayById() {
        while (true) {
            System.out.println("Enter the id of the product");
            SportShop ss = ssd.displayById(input.nextInt());
            if (ss != null) {
                System.out.println("The name of the item is: " + ss.getProductName() + "\nThe price of the product is: " + ss.getPrice());
                System.out.println("Enter any key to go to main menu");
                input.next();
                break;
            } else {
                System.out.println("Sorry the id is not available." + "\n Do you want to search again[Y/N]");
                if (input.next().equalsIgnoreCase("N")) {
                    break;
                }
            }
        }
    }

    private void displayAll() {
        for (SportShop sprt : ssd.getDetails()) {
            System.out.println("The name of the item is: " + sprt.getProductName() + "\nThe price of the product is: " + sprt.getPrice());
            System.out.println("The status of the item is: " + sprt.isStatus() + "\nWhile the id of the product is: " + sprt.getId());

        }
        System.out.println("Enter any key to go to main menu");
        input.next();
    }

    private void exit() {
        System.out.println("Do you really want to exit from the system?[Y/N]");
        if (input.next().equalsIgnoreCase("y")) {
            System.exit(0);
        }

    }

    public void work() {
        switch (input.nextInt()) {
            case 1://add
                add();
                break;

            case 2://delete
                delete();
                break;

            case 3://displaybyid
                displayById();
                break;

            case 4://displayall
                displayAll();
                break;

            case 5:
                exit();
                break;
            default:
                System.out.println("Please enter the correct number");
        }

    }
}
