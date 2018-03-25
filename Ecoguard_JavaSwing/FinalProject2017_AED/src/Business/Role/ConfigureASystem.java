package Business.Role;

import Business.*;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Products.Product;
import Business.Role.EcoguardRole;
import Business.Role.SystemAdminRole;
import Business.Role.bSupplier;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
//import Business.Vaccine.Vaccine;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {

    public static EcoSystem configure() throws ParseException {

        EcoSystem system = EcoSystem.getInstance();

        Employee employee = system.getEmployeeDirectory().createEmployee("Aashrith");

        Employee ecoguard = system.getEmployeeDirectory().createEmployee("Vijay");
        
        Employee bx = system.getEmployeeDirectory().createEmployee("Boston");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("s", "s", employee, new SystemAdminRole());

        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("e", "e", ecoguard, new EcoguardRole());
        
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("bos", "bos",bx,new bSupplier() );

        Product p = system.getProductDirectory().addProduct();
        p.setProdName("Chairs");
        p.setProdType("Teakwood");
        p.setProdPrice(800);
        p.setCordUsed(500);

        Product p2 = system.getProductDirectory().addProduct();
        p2.setProdName("Tables");
        p2.setProdType("Sandalwood");
        p2.setProdPrice(645);
        p2.setCordUsed(500);

        Product p3 = system.getProductDirectory().addProduct();
        p3.setProdName("Wooden Frames");
        p3.setProdType("RoseWood");
        p3.setProdPrice(770);
        p3.setCordUsed(759);

        Product p4 = system.getProductDirectory().addProduct();
        p4.setProdName("Desks");
        p4.setProdType("Teakwood");
        p4.setProdPrice(789);
        p4.setCordUsed(500);
        Network network1 = system.createAndAddNetwork();
        network1.setName("Chicago");

        for (Network N : system.getNetworkList()) {

            if (N.getName().equalsIgnoreCase("Chicago")) {

                Supplier s = N.getSupplierDirectory().addSupplier();
                s.setSupplierName("S1");
                s.setSupplierID(1);
                s.setSupplierRating("**");
                
                Product product = s.getProductDirectory().addProduct();
                product.setProdName("Chairs");
                product.setProdType("Teakwood");              
                product.setProdPrice(800);
                product.setCordUsed(450);
                product.setQuantity(500);
            

                Product product2 = s.getProductDirectory().addProduct();
                product2.setProdName("Chairs");
                product2.setProdType("Sandalwood");
                product2.setProdPrice(900);
                product2.setCordUsed(350);

                Product product3 = s.getProductDirectory().addProduct();
                product3.setProdName("Chairs");
                product3.setProdType("RoseWood");
                product3.setProdPrice(1200);
                product3.setCordUsed(880);
                 
                 
                Product product4 = s.getProductDirectory().addProduct();
                product4.setProdName("Chairs");
                product4.setProdType("Bamboo");
                product4.setProdPrice(325);
                
                
                Product product5 = s.getProductDirectory().addProduct();
                product5.setProdName("Tables");
                product5.setProdType("Teakwood");
                product5.setProdPrice(565);
                product5.setCordUsed(809);
                
                Product product6 = s.getProductDirectory().addProduct();
                product6.setProdName("CupBoard");
                product6.setProdType("Mahogany");
                product6.setProdPrice(1200);
                product6.setCordUsed(1400);
                
                Product product7 = s.getProductDirectory().addProduct();
                product7.setProdName("CupBoard");
                product7.setProdType("Maple-nut Wood");
                product7.setProdPrice(780);
                product7.setCordUsed(1200);
                
                Product product8 = s.getProductDirectory().addProduct();
                product8.setProdName("CupBoard");
                product8.setProdType("Pine wood");
                product8.setProdPrice(450);
                product8.setCordUsed(800);
                
                
                Product product9 = s.getProductDirectory().addProduct();
                product9.setProdName("CupBoard");
                product9.setProdType("Iron Wood");
                product9.setProdPrice(550);
                product8.setCordUsed(600);
                
                Product product10 = s.getProductDirectory().addProduct();
                product10.setProdName("CupBoard");
                product10.setProdType("Bamboo");
                product10.setProdPrice(220);
                product10.setCordUsed(0);
                
                Product product12 = s.getProductDirectory().addProduct();
                product12.setProdName("CupBoard");
                product12.setProdType("TeakWood");
                product12.setProdPrice(800);
                product12.setCordUsed(1150);
                
                
                Product product13 = s.getProductDirectory().addProduct();
                product13.setProdName("CupBoard");
                product13.setProdType("Sandalwood");
                product13.setProdPrice(1000);
                product13.setCordUsed(1250);
                
                
                Product product14 = s.getProductDirectory().addProduct();
                product14.setProdName("CupBoard");
                product14.setProdType("Rosewood");
                product14.setProdPrice(660);
                product14.setCordUsed(1450);
                
                Product product15 = s.getProductDirectory().addProduct();
                product15.setProdName("Bed Frame");
                product15.setProdType("Mahogany");
                product15.setProdPrice(2200);
                product15.setCordUsed(1650);
                
                Product product16 = s.getProductDirectory().addProduct();
                product16.setProdName("Bed Frame");
                product16.setProdType("Maple-nut Wood");
                product16.setProdPrice(770);
                product16.setCordUsed(1150);
                
                Product product17 = s.getProductDirectory().addProduct();
                product17.setProdName("Bed Frame");
                product17.setProdType("Pine wood");
                product17.setProdPrice(470);
                product17.setCordUsed(1150);
                
                Product product18 = s.getProductDirectory().addProduct();
                product18.setProdName("Bed Frame");
                product18.setProdType("Iron Wood");
                product18.setProdPrice(520);
                product18.setCordUsed(850);
                
                Product product19 = s.getProductDirectory().addProduct();
                product19.setProdName("Bed Frame");
                product19.setProdType("Bamboo");
                product19.setProdPrice(250);
                 product19.setCordUsed(50);
                
                Product product20 = s.getProductDirectory().addProduct();
                product20.setProdName("Bed Frame");
                product20.setProdType("TeakWood");
                product20.setProdPrice(850);
                product20.setCordUsed(1550);
                
                Product product21 = s.getProductDirectory().addProduct();
                product21.setProdName("Bed Frame");
                product21.setProdType("Sandalwood");
                product21.setProdPrice(1100);
                product21.setCordUsed(1250);
                
                Product product23 = s.getProductDirectory().addProduct();
                product23.setProdName("Bed Frame");
                product23.setProdType("Rosewood");
                product23.setProdPrice(700);
                product23.setCordUsed(1250);
                
                Product product24 = s.getProductDirectory().addProduct();
                product24.setProdName("TV Unit");
                product24.setProdType("Mahogany");
                product24.setProdPrice(2700);
                product24.setCordUsed(1500);
                
                Product product25 = s.getProductDirectory().addProduct();
                product25.setProdName("TV Unit");
                product25.setProdType("Maple-nut Wood");
                product25.setProdPrice(820);
                product25.setCordUsed(1200);
                
                Product product26 = s.getProductDirectory().addProduct();
                product26.setProdName("TV Unit");
                product26.setProdType("Pine wood");
                product26.setProdPrice(470);
                product26.setProdPrice(500);
                
                Product product27 = s.getProductDirectory().addProduct();
                product27.setProdName("TV Unit");
                product27.setProdType("Iron Wood");
                product27.setProdPrice(580);
                
                Product product28 = s.getProductDirectory().addProduct();
                product28.setProdName("TV Unit");
                product28.setProdType("Bamboo");
                product28.setProdPrice(290);
                
                Product product29 = s.getProductDirectory().addProduct();
                product29.setProdName("TV Unit");
                product29.setProdType("TeakWood");
                product29.setProdPrice(870);
                
                Product product30 = s.getProductDirectory().addProduct();
                product30.setProdName("TV Unit");
                product30.setProdType("Sandalwood");
                product30.setProdPrice(1500);
                
                Product product31 = s.getProductDirectory().addProduct();
                product31.setProdName("TV Unit");
                product31.setProdType("Rosewood");
                product31.setProdPrice(680);
                
                Product product32 = s.getProductDirectory().addProduct();
                product32.setProdName("Racks");
                product32.setProdType("Mahogany");
                product32.setProdPrice(1800);
                
                Product product34 = s.getProductDirectory().addProduct();
                product34.setProdName("Racks");
                product34.setProdType("Maple-nut Wood");
                product34.setProdPrice(790);
                
                Product product35 = s.getProductDirectory().addProduct();
                product35.setProdName("Racks");
                product35.setProdType("Pine wood");
                product35.setProdPrice(470);
                
                Product product36 = s.getProductDirectory().addProduct();
                product36.setProdName("Racks");
                product36.setProdType("Iron Wood");
                product36.setProdPrice(580);
                
                Product product37 = s.getProductDirectory().addProduct();
                product37.setProdName("Racks");
                product37.setProdType("Bamboo");
                product37.setProdPrice(270);
                
                Product product38 = s.getProductDirectory().addProduct();
                product38.setProdName("Racks");
                product38.setProdType("TeakWood");
                product38.setProdPrice(820);
                
                Product product39 = s.getProductDirectory().addProduct();
                product39.setProdName("Racks");
                product39.setProdType("Sandalwood");
                product39.setProdPrice(1215);
                
                Product product40 = s.getProductDirectory().addProduct();
                product40.setProdName("Racks");
                product40.setProdType("Rosewood");
                product40.setProdPrice(680);
                
                Product product41 = s.getProductDirectory().addProduct();
                product41.setProdName("Decorative Overlays");
                product41.setProdType("Mahogany");
                product41.setProdPrice(3000);
                
                Product product42 = s.getProductDirectory().addProduct();
                product42.setProdName("Decorative Overlays");
                product42.setProdType("Maple-nut Wood");
                product42.setProdPrice(850);
                
                Product product43 = s.getProductDirectory().addProduct();
                product43.setProdName("Decorative Overlays");
                product43.setProdType("Pine wood");
                product43.setProdPrice(480);
                
                Product product45 = s.getProductDirectory().addProduct();
                product45.setProdName("Decorative Overlays");
                product45.setProdType("Iron Wood");
                product45.setProdPrice(600);
                
                Product product46 = s.getProductDirectory().addProduct();
                product46.setProdName("Decorative Overlays");
                product46.setProdType("Bamboo");
                product46.setProdPrice(275);
                
                Product product47 = s.getProductDirectory().addProduct();
                product47.setProdName("Decorative Overlays");
                product47.setProdType("TeakWood");
                product47.setProdPrice(820);
                
                Product product48 = s.getProductDirectory().addProduct();
                product48.setProdName("Decorative Overlays");
                product48.setProdType("Sandalwood");
                product48.setProdPrice(1100);
                
                Product product49 = s.getProductDirectory().addProduct();
                product49.setProdName("Decorative Overlays");
                product49.setProdType("Rosewood");
                product49.setProdPrice(695);

                Supplier s2 = N.getSupplierDirectory().addSupplier();
                s2.setSupplierName("S2");
                s2.setSupplierID(2);
                s2.setSupplierRating("****");
                
                Product product11 = s2.getProductDirectory().addProduct();
                product11.setProdName("Chairs");
                product11.setProdType("TeakWood");
                product11.setProdPrice(775);
                product11.setCordUsed(500);
                product11.setQuantity(800);

                Product product22 = s2.getProductDirectory().addProduct();
                product22.setProdName("Chairs");
                product22.setProdType("Sandalwood");
                product22.setProdPrice(900);

                Product product33 = s2.getProductDirectory().addProduct();
                product33.setProdName("Chairs");
                product33.setProdType("RoseWood");
                product33.setProdPrice(1200);

                Product product44 = s2.getProductDirectory().addProduct();
                product44.setProdName("Chairs");
                product44.setProdType("Bamboo");
                product44.setProdPrice(355);
                
                Product product55 = s2.getProductDirectory().addProduct();
                product55.setProdName("Tables");
                product55.setProdType("Teakwood");
                product55.setProdPrice(565);
                
                Product product56 = s2.getProductDirectory().addProduct();
                product56.setProdName("CupBoard");
                product56.setProdType("Mahogany");
                product56.setProdPrice(2400);
                
                Product product57 = s2.getProductDirectory().addProduct();
                product57.setProdName("CupBoard");
                product57.setProdType("Maple-nut Wood");
                product57.setProdPrice(790);
                
                Product product58 = s2.getProductDirectory().addProduct();
                product58.setProdName("CupBoard");
                product58.setProdType("Pine wood");
                product58.setProdPrice(480);
                
                Product product59 = s2.getProductDirectory().addProduct();
                product59.setProdName("CupBoard");
                product59.setProdType("Iron Wood");
                product59.setProdPrice(600);
                
                Product product60 = s2.getProductDirectory().addProduct();
                product60.setProdName("CupBoard");
                product60.setProdType("Bamboo");
                product60.setProdPrice(230);
                
                Product product61 = s2.getProductDirectory().addProduct();
                product61.setProdName("CupBoard");
                product61.setProdType("TeakWood");
                product61.setProdPrice(850);
                
                Product product62 = s2.getProductDirectory().addProduct();
                product62.setProdName("CupBoard");
                product62.setProdType("Sandalwood");
                product62.setProdPrice(1100);
                
                Product product63 = s2.getProductDirectory().addProduct();
                product63.setProdName("CupBoard");
                product63.setProdType("Rosewood");
                product63.setProdPrice(680);
                
                Product product64 = s2.getProductDirectory().addProduct();
                product64.setProdName("Bed Frame");
                product64.setProdType("Mahogany");
                product64.setProdPrice(2500);
                
                Product product65 = s2.getProductDirectory().addProduct();
                product65.setProdName("Bed Frame");
                product65.setProdType("Maple-nut Wood");
                product65.setProdPrice(870);
                
                Product product66 = s2.getProductDirectory().addProduct();
                product66.setProdName("Bed Frame");
                product66.setProdType("Pine wood");
                product66.setProdPrice(490);
                
                Product product67 = s2.getProductDirectory().addProduct();
                product67.setProdName("Bed Frame");
                product67.setProdType("Iron Wood");
                product67.setProdPrice(530);
                
                Product product68 = s2.getProductDirectory().addProduct();
                product68.setProdName("Bed Frame");
                product68.setProdType("Bamboo");
                product68.setProdPrice(280);
                
                Product product69 = s2.getProductDirectory().addProduct();
                product69.setProdName("Bed Frame");
                product69.setProdType("TeakWood");
                product69.setProdPrice(880);
                
                Product product70 = s2.getProductDirectory().addProduct();
                product70.setProdName("Bed Frame");
                product70.setProdType("Sandalwood");
                product70.setProdPrice(1600);
                
                Product product71 = s2.getProductDirectory().addProduct();
                product71.setProdName("Bed Frame");
                product71.setProdType("Rosewood");
                product71.setProdPrice(750);
                
                Product product72 = s2.getProductDirectory().addProduct();
                product72.setProdName("TV Unit");
                product72.setProdType("Mahogany");
                product72.setProdPrice(3700);
                
                Product product73 = s2.getProductDirectory().addProduct();
                product73.setProdName("TV Unit");
                product73.setProdType("Maple-nut Wood");
                product73.setProdPrice(820);
                
                Product product74 = s2.getProductDirectory().addProduct();
                product74.setProdName("TV Unit");
                product74.setProdType("Pine wood");
                product74.setProdPrice(490);
                
                Product product75 = s2.getProductDirectory().addProduct();
                product75.setProdName("TV Unit");
                product75.setProdType("Iron Wood");
                product75.setProdPrice(590);
                
                Product product76 = s2.getProductDirectory().addProduct();
                product76.setProdName("TV Unit");
                product76.setProdType("Bamboo");
                product76.setProdPrice(280);
                
                Product product77 = s2.getProductDirectory().addProduct();
                product77.setProdName("TV Unit");
                product77.setProdType("TeakWood");
                product77.setProdPrice(890);
                
                Product product78 = s.getProductDirectory().addProduct();
                product78.setProdName("TV Unit");
                product78.setProdType("Sandalwood");
                product78.setProdPrice(1600);
                
                Product product79 = s2.getProductDirectory().addProduct();
                product79.setProdName("TV Unit");
                product79.setProdType("Rosewood");
                product79.setProdPrice(690);
                
                Product product80 = s2.getProductDirectory().addProduct();
                product80.setProdName("Racks");
                product80.setProdType("Mahogany");
                product80.setProdPrice(1900);
                
                Product product81 = s2.getProductDirectory().addProduct();
                product81.setProdName("Racks");
                product81.setProdType("Maple-nut Wood");
                product81.setProdPrice(760);
                
                Product product82 = s2.getProductDirectory().addProduct();
                product82.setProdName("Racks");
                product82.setProdType("Pine wood");
                product82.setProdPrice(480);
                
                Product product83 = s2.getProductDirectory().addProduct();
                product83.setProdName("Racks");
                product83.setProdType("Iron Wood");
                product83.setProdPrice(590);
                
                Product product84 = s2.getProductDirectory().addProduct();
                product84.setProdName("Racks");
                product84.setProdType("Bamboo");
                product84.setProdPrice(280);
                
                Product product85 = s2.getProductDirectory().addProduct();
                product85.setProdName("Racks");
                product85.setProdType("TeakWood");
                product85.setProdPrice(830);
                
                Product product86 = s2.getProductDirectory().addProduct();
                product86.setProdName("Racks");
                product86.setProdType("Sandalwood");
                product86.setProdPrice(1235);
                
                Product product87 = s2.getProductDirectory().addProduct();
                product87.setProdName("Racks");
                product87.setProdType("Rosewood");
                product87.setProdPrice(690);
                
                Product product88 = s2.getProductDirectory().addProduct();
                product88.setProdName("Decorative Overlays");
                product88.setProdType("Mahogany");
                product88.setProdPrice(3500);
                
                Product product89 = s2.getProductDirectory().addProduct();
                product89.setProdName("Decorative Overlays");
                product89.setProdType("Maple-nut Wood");
                product89.setProdPrice(870);
                
                Product product90 = s2.getProductDirectory().addProduct();
                product90.setProdName("Decorative Overlays");
                product90.setProdType("Pine wood");
                product90.setProdPrice(490);
                
                Product product91 = s2.getProductDirectory().addProduct();
                product91.setProdName("Decorative Overlays");
                product91.setProdType("Iron Wood");
                product91.setProdPrice(650);
                
                Product product92 = s2.getProductDirectory().addProduct();
                product92.setProdName("Decorative Overlays");
                product92.setProdType("Bamboo");
                product92.setProdPrice(295);
                
                Product product93 = s2.getProductDirectory().addProduct();
                product93.setProdName("Decorative Overlays");
                product93.setProdType("TeakWood");
                product93.setProdPrice(830);
                
                Product product94 = s2.getProductDirectory().addProduct();
                product94.setProdName("Decorative Overlays");
                product94.setProdType("Sandalwood");
                product94.setProdPrice(1400);
                
                Product product95 = s2.getProductDirectory().addProduct();
                product95.setProdName("Decorative Overlays");
                product95.setProdType("Rosewood");
                product95.setProdPrice(715);

                Supplier s3 = N.getSupplierDirectory().addSupplier();
                s3.setSupplierName("S3");
                s3.setSupplierID(3);
                s3.setSupplierRating("*****");
                
                Product product111 = s3.getProductDirectory().addProduct();
                product111.setProdName("Chairs");
                product111.setProdType("TeakWood");
                product111.setProdPrice(775);

                Product product222 = s3.getProductDirectory().addProduct();
                product222.setProdName("Chairs");
                product222.setProdType("Sandalwood");
                product222.setProdPrice(900);

                Product product333 = s3.getProductDirectory().addProduct();
                product333.setProdName("Chairs");
                product333.setProdType("RoseWood");
                product333.setProdPrice(1200);

                Product product444 = s3.getProductDirectory().addProduct();
                product444.setProdName("Chairs");
                product444.setProdType("Bamboo");
                product444.setProdPrice(165);
                
                 Product product555 = s3.getProductDirectory().addProduct();
                product555.setProdName("Tables");
                product555.setProdType("Bamboo");
                product555.setProdPrice(355);
                
                Product product666 = s3.getProductDirectory().addProduct();
                product666.setProdName("Wooden Frames");
                product666.setProdType("Bamboo");
                product666.setProdPrice(155);
                
                Product product777 = s3.getProductDirectory().addProduct();
                product777.setProdName("Desks");
                product777.setProdType("Bamboo");
                product777.setProdPrice(285);
                
                Product product888 = s3.getProductDirectory().addProduct();
                product888.setProdName("Tables");
                product888.setProdType("Teakwood");
                product888.setProdPrice(495);
                product888.setCordUsed(850);
                
                Product product96 = s3.getProductDirectory().addProduct();
                product96.setProdName("CupBoard");
                product96.setProdType("Mahogany");
                product96.setProdPrice(2600);
                product96.setCordUsed(720);
                
                Product product97 = s3.getProductDirectory().addProduct();
                product97.setProdName("CupBoard");
                product97.setProdType("Maple-nut Wood");
                product97.setProdPrice(790);
                product96.setCordUsed(700);
                
                Product product98 = s3.getProductDirectory().addProduct();
                product98.setProdName("CupBoard");
                product98.setProdType("Pine wood");
                product98.setProdPrice(480);
                product96.setCordUsed(730);
                
                Product product99 = s3.getProductDirectory().addProduct();
                product99.setProdName("CupBoard");
                product99.setProdType("Iron Wood");
                product99.setProdPrice(580);
                product99.setCordUsed(710);
                
                Product product100 = s3.getProductDirectory().addProduct();
                product100.setProdName("CupBoard");
                product100.setProdType("Bamboo");
                product100.setProdPrice(230);
                product100.setCordUsed(700);
                
                Product product101 = s3.getProductDirectory().addProduct();
                product101.setProdName("CupBoard");
                product101.setProdType("TeakWood");
                product101.setProdPrice(830);
                product101.setCordUsed(730);
                
                Product product102 = s3.getProductDirectory().addProduct();
                product102.setProdName("CupBoard");
                product102.setProdType("Sandalwood");
                product102.setProdPrice(1200);
                product102.setCordUsed(730);
                
                Product product103 = s3.getProductDirectory().addProduct();
                product103.setProdName("CupBoard");
                product103.setProdType("Rosewood");
                product103.setProdPrice(680);
                product103.setCordUsed(740);
                
                Product product104 = s3.getProductDirectory().addProduct();
                product104.setProdName("Bed Frame");
                product104.setProdType("Mahogany");
                product104.setProdPrice(2300);
                product104.setCordUsed(950);
                
                Product product105 = s3.getProductDirectory().addProduct();
                product105.setProdName("Bed Frame");
                product105.setProdType("Maple-nut Wood");
                product105.setProdPrice(780);
                product105.setCordUsed(970);
                
                Product product106 = s3.getProductDirectory().addProduct();
                product106.setProdName("Bed Frame");
                product106.setProdType("Pine wood");
                product106.setProdPrice(480);
                product96.setCordUsed(980);
                
                Product product107 = s3.getProductDirectory().addProduct();
                product107.setProdName("Bed Frame");
                product107.setProdType("Iron Wood");
                product107.setProdPrice(580);
                product107.setCordUsed(990);
                
                Product product108 = s3.getProductDirectory().addProduct();
                product108.setProdName("Bed Frame");
                product108.setProdType("Bamboo");
                product108.setProdPrice(280);
                product108.setCordUsed(940);
                
                Product product109 = s3.getProductDirectory().addProduct();
                product109.setProdName("Bed Frame");
                product109.setProdType("TeakWood");
                product109.setProdPrice(880);
                product109.setCordUsed(970);
                
                Product product110 = s3.getProductDirectory().addProduct();
                product110.setProdName("Bed Frame");
                product110.setProdType("Sandalwood");
                product110.setProdPrice(1700);
                product110.setCordUsed(1000);
                
                Product product112 = s3.getProductDirectory().addProduct();
                product112.setProdName("Bed Frame");
                product112.setProdType("Rosewood");
                product112.setProdPrice(800);
                product112.setCordUsed(990);
                
                Product product113 = s3.getProductDirectory().addProduct();
                product113.setProdName("TV Unit");
                product113.setProdType("Mahogany");
                product113.setProdPrice(2900);
                product113.setCordUsed(1000);
                
                Product product114 = s3.getProductDirectory().addProduct();
                product114.setProdName("TV Unit");
                product114.setProdType("Maple-nut Wood");
                product114.setProdPrice(890);
                product114.setCordUsed(1020);
                
                Product product115 = s3.getProductDirectory().addProduct();
                product115.setProdName("TV Unit");
                product115.setProdType("Pine wood");
                product115.setProdPrice(570);
                product115.setCordUsed(950);
                
                Product product116 = s3.getProductDirectory().addProduct();
                product116.setProdName("TV Unit");
                product116.setProdType("Iron Wood");
                product116.setProdPrice(480);
                product96.setCordUsed(990);
                
                Product product117 = s3.getProductDirectory().addProduct();
                product117.setProdName("TV Unit");
                product117.setProdType("Bamboo");
                product117.setProdPrice(270);
                product117.setCordUsed(880);
                
                Product product118 = s3.getProductDirectory().addProduct();
                product118.setProdName("TV Unit");
                product118.setProdType("TeakWood");
                product118.setProdPrice(850);
                product118.setCordUsed(900);
                
                Product product119 = s3.getProductDirectory().addProduct();
                product119.setProdName("TV Unit");
                product119.setProdType("Sandalwood");
                product119.setProdPrice(1800);
                product119.setCordUsed(880);
                
                Product product120 = s3.getProductDirectory().addProduct();
                product120.setProdName("TV Unit");
                product120.setProdType("Rosewood");
                product120.setProdPrice(690);
                product120.setCordUsed(820);
                
                Product product121 = s3.getProductDirectory().addProduct();
                product121.setProdName("Racks");
                product121.setProdType("Mahogany");
                product121.setProdPrice(1900);
                product121.setCordUsed(650);
                
                Product product122 = s3.getProductDirectory().addProduct();
                product122.setProdName("Racks");
                product122.setProdType("Maple-nut Wood");
                product122.setProdPrice(810);
                product122.setCordUsed(780);
                
                Product product123 = s3.getProductDirectory().addProduct();
                product123.setProdName("Racks");
                product123.setProdType("Pine wood");
                product123.setProdPrice(480);
                product123.setCordUsed(790);
                
                Product product124 = s3.getProductDirectory().addProduct();
                product124.setProdName("Racks");
                product124.setProdType("Iron Wood");
                product124.setProdPrice(590);
                product124.setCordUsed(800);
                
                Product product125 = s3.getProductDirectory().addProduct();
                product125.setProdName("Racks");
                product125.setProdType("Bamboo");
                product125.setProdPrice(280);
                product125.setCordUsed(780);
                
                Product product126 = s3.getProductDirectory().addProduct();
                product126.setProdName("Racks");
                product126.setProdType("TeakWood");
                product126.setProdPrice(920);
                product126.setCordUsed(800);
                
                Product product127 = s3.getProductDirectory().addProduct();
                product127.setProdName("Racks");
                product127.setProdType("Sandalwood");
                product127.setProdPrice(1205);
                product127.setCordUsed(820);
                
                Product product128 = s3.getProductDirectory().addProduct();
                product128.setProdName("Racks");
                product128.setProdType("Rosewood");
                product128.setProdPrice(780);
                product128.setCordUsed(825);
                
                Product product129 = s3.getProductDirectory().addProduct();
                product129.setProdName("Decorative Overlays");
                product129.setProdType("Mahogany");
                product129.setProdPrice(3000);
                product129.setCordUsed(830);
                
                Product product130 = s3.getProductDirectory().addProduct();
                product130.setProdName("Decorative Overlays");
                product130.setProdType("Maple-nut Wood");
                product130.setProdPrice(890);
                product130.setCordUsed(820);
                
                Product product131 = s3.getProductDirectory().addProduct();
                product131.setProdName("Decorative Overlays");
                product131.setProdType("Pine wood");
                product131.setProdPrice(490);
                product131.setCordUsed(710);
                
                Product product132 = s3.getProductDirectory().addProduct();
                product132.setProdName("Decorative Overlays");
                product132.setProdType("Iron Wood");
                product132.setProdPrice(800);
                product132.setCordUsed(740);
                
                Product product133 = s3.getProductDirectory().addProduct();
                product133.setProdName("Decorative Overlays");
                product133.setProdType("Bamboo");
                product133.setProdPrice(295);
                product133.setCordUsed(820);
                
                Product product134 = s3.getProductDirectory().addProduct();
                product134.setProdName("Decorative Overlays");
                product134.setProdType("TeakWood");
                product134.setProdPrice(840);
                product134.setCordUsed(880);
                
                Product product135 = s3.getProductDirectory().addProduct();
                product135.setProdName("Decorative Overlays");
                product135.setProdType("Sandalwood");
                product135.setProdPrice(1400);
                product135.setCordUsed(780);
                
                Product product136 = s.getProductDirectory().addProduct();
                product136.setProdName("Decorative Overlays");
                product136.setProdType("Rosewood");
                product136.setProdPrice(795);
                product136.setCordUsed(420);

            }
        }
        
        Network network2 = system.createAndAddNetwork();
        network2.setName("Boston");
        
        for(Network network : system.getNetworkList())
        {
            if(network.getName().equalsIgnoreCase("Boston"))
            {
                Supplier S = network.getSupplierDirectory().addSupplier();
                S.setSupplierName("S1");
                S.setSupplierID(1);
                S.setSupplierRating("***");
                
                
                Product product =  S.getProductDirectory().addProduct();
                product.setProdName("Chairs");
                product.setProdType("TeakWood");
                product.setProdPrice(795);
                product.setCordUsed(820);
                product.setQuantity(600);
                
                
                 Supplier S2 = network.getSupplierDirectory().addSupplier();
                S2.setSupplierName("S2");
                S2.setSupplierID(2);
                S2.setSupplierRating("****");
                
                
                Product product21 =  S2.getProductDirectory().addProduct();
                product21.setProdName("Chairs");
                product21.setProdType("TeakWood");
                product21.setProdPrice(755);
                product21.setCordUsed(820);
                product21.setQuantity(800);
                
                
            }
        }
        
         for(Network network : system.getNetworkList())
        {
            if(network.getName().equalsIgnoreCase("Boston"))
            {
             for(Supplier S : network.getSupplierDirectory().getSupplierList())
             {
                 for(Product product : S.getProductDirectory().getProductList())
                 {
                     System.out.println(product.getProdName());
                 }
             }
            
            }
        }
        
        
        

        Enterprise e = network1.getEnterpriseDirectory().createAndAddEnterprise("NEU", Enterprise.EnterpriseType.Education);
        e.setName("NEU");
        e.getOrder().addOrderItem(1, 1, p, 11, "2016/02/02",100);

        e.getOrder().addOrderItem(2, 2, p2, 9, "2015/02/02",101);

        e.getOrder().addOrderItem(3, 3, p2, 12, "2014/02/02",102);

        e.getOrder().addOrderItem(1, 4, p4, 14, "2013/02/02",103);

        e.getOrder().addOrderItem(1, 5, p3, 14, "2012/02/02",104);
        
        
        Enterprise e2 = network1.getEnterpriseDirectory().createAndAddEnterprise("Boston University", Enterprise.EnterpriseType.Education);
        e2.setName("Boston University");
        e2.getOrder().addOrderItem(1, 1, p, 10, "2016/02/02",100);

        e2.getOrder().addOrderItem(2, 2, p2, 9, "2015/02/02",101);

        e2.getOrder().addOrderItem(3, 3, p2, 12, "2014/02/02",102);

        e2.getOrder().addOrderItem(1, 4, p4, 14, "2013/02/02",103);

        e2.getOrder().addOrderItem(1, 5, p3, 14, "2012/02/02",104);


        
        
        return system;
    }

}
