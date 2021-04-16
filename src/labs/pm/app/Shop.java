/*
 * Copyright (C) 2021 cmass
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;
import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * {@code Shop} class represents an application that manages Products
 * @version 4.0
 * @author cmass
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProductManager pm = new ProductManager(Locale.UK);
        pm.createProduct(101,"Tea",BigDecimal.valueOf(1.99),Rating.NOT_RATED);
        
        pm.printProductReport(101);
        pm.reviewProduct(101, Rating.FOUR_STAR, "Nice hot cup of tea");
        pm.reviewProduct(101, Rating.TWO_STAR, "Rather weak tea");
        pm.reviewProduct(101, Rating.FOUR_STAR, "Fine tea");
        pm.reviewProduct(101, Rating.FOUR_STAR, "Good tea");
        pm.reviewProduct(101, Rating.FIVE_STAR, "Perfect tea");
        pm.reviewProduct(101, Rating.THREE_STAR, "Just add some lemon");
        pm.printProductReport(101);
        
        pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.reviewProduct(102, Rating.THREE_STAR, "Coffee was ok");
        pm.reviewProduct(102, Rating.ONE_STAR, "Where is the milk?!");
        pm.reviewProduct(102, Rating.FIVE_STAR, "It`s perfect with ten spoons of sugar!");
        pm.printProductReport(102);
        
        pm.createProduct(103,"Cake",BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        pm.reviewProduct(103, Rating.FIVE_STAR, "Very nice cake");
        pm.reviewProduct(103, Rating.FOUR_STAR, "It good, but I've expected more chocolate");
        pm.reviewProduct(103, Rating.FIVE_STAR, "This cake is perfect");
        pm.printProductReport(103);
        
        pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
        pm.reviewProduct(105, Rating.THREE_STAR, "Just another cookie");
        pm.reviewProduct(105, Rating.THREE_STAR, "Ok");
        pm.printProductReport(105);
        
        pm.createProduct(105, "Hot Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        pm.reviewProduct(105, Rating.FOUR_STAR, "Tasty");
        pm.reviewProduct(105, Rating.FOUR_STAR, "No bad at all");
        pm.printProductReport(105);
        
        pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        pm.reviewProduct(106, Rating.TWO_STAR, "Too sweet");
        pm.reviewProduct(106, Rating.THREE_STAR, "Better then cookie");
        pm.reviewProduct(106, Rating.TWO_STAR, "Too bitter");
        pm.reviewProduct(106, Rating.ONE_STAR, "I don`t get it!");
        pm.printProductReport(106);
//        Product p2 = pm.createProduct(102,"Coffee",BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        Product p3 = pm.createProduct(103,"Cake",BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p6 = pm.createProduct(104,"Chocolate",BigDecimal.valueOf(2.99),Rating.FIVE_STAR);
//        Product p7 = pm.createProduct(104,"Chocolate",BigDecimal.valueOf(2.99),Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p8 = p4.applyRating(Rating.FIVE_STAR);
//        Product p9 = p1.applyRating(Rating.TWO_STAR);
//        System.out.println(p6.equals(p7));
//        
//        System.out.println(p1.getBestBefore());
//        System.out.println(p3.getBestBefore());
//        if (p3 instanceof Food) {
//            LocalDate bestBefore = ((Food)p3).getBestBefore();
//        }
//        p1.setId(101);
//        p1.setName("Tea");
//        p1.setPrice(BigDecimal.valueOf(1.99));
//        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice()+" "+p1.getDiscount()+" " + p1.getRating().getStars());
//        System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice()+" "+p2.getDiscount()+" " + p2.getRating().getStars());
//        System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice()+" "+p3.getDiscount()+" " + p3.getRating().getStars());
//        System.out.println(p4.getId() + " " + p4.getName() + " " + p4.getPrice()+" "+p4.getDiscount()+" " + p4.getRating().getStars());
//        System.out.println(p5.getId() + " " + p5.getName() + " " + p5.getPrice()+" "+p5.getDiscount()+" " + p5.getRating().getStars());
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);
    }
    
}
