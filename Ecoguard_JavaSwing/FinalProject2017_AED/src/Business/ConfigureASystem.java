package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Products.Product;
import Business.Role.EcoguardRole;
import Business.Role.SupplierRole;
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
        
        Employee emp = system.getEmployeeDirectory().createEmployee("Dawna");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("s", "s", employee, new SystemAdminRole());

        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("e", "e", ecoguard, new EcoguardRole());
        
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("bos", "bos",bx,new bSupplier() );
        
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("ss","ss",emp,new SupplierRole());

        Product p = system.getProductDirectory().addProduct();
        p.setProdName("Chairs");
        p.setProdType("Teakwood");
        p.setProdPrice(800);
        p.setCordUsed(500);
        p.setQuantity(100);

        Product p2 = system.getProductDirectory().addProduct();
        p2.setProdName("Tables");
        p2.setProdType("Sandalwood");
        p2.setProdPrice(645);
        p2.setCordUsed(500);
        p2.setQuantity(90);

        Product p3 = system.getProductDirectory().addProduct();
        p3.setProdName("Wooden Frames");
        p3.setProdType("RoseWood");
        p3.setProdPrice(770);
        p3.setCordUsed(759);
        p3.setQuantity(120);

        Product p4 = system.getProductDirectory().addProduct();
        p4.setProdName("Desks");
        p4.setProdType("Teakwoodf");
        p4.setProdPrice(789);
        p4.setCordUsed(500);
        p4.setQuantity(140);
        
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
                product2.setQuantity(600);

                Product product3 = s.getProductDirectory().addProduct();
                product3.setProdName("Chairs");
                product3.setProdType("RoseWood");
                product3.setProdPrice(1200);
                product3.setCordUsed(880);
                product3.setQuantity(700);
                 
                 
                Product product4 = s.getProductDirectory().addProduct();
                product4.setProdName("Chairs");
                product4.setProdType("Bamboo");
                product4.setProdPrice(325);
                product4.setCordUsed(720);
                product4.setQuantity(900);
                
                
                Product product5 = s.getProductDirectory().addProduct();
                product5.setProdName("Tables");
                product5.setProdType("Teakwood");
                product5.setProdPrice(565);
                product5.setCordUsed(809);
                product5.setQuantity(750);
                
                Product product6 = s.getProductDirectory().addProduct();
                product6.setProdName("CupBoard");
                product6.setProdType("Mahogany");
                product6.setProdPrice(1200);
                product6.setCordUsed(1400);
                product6.setQuantity(856);
                
                Product product7 = s.getProductDirectory().addProduct();
                product7.setProdName("CupBoard");
                product7.setProdType("Maple-nut Wood");
                product7.setProdPrice(780);
                product7.setCordUsed(1200);
                product7.setQuantity(600);
                
                Product product8 = s.getProductDirectory().addProduct();
                product8.setProdName("CupBoard");
                product8.setProdType("Pine wood");
                product8.setProdPrice(450);
                product8.setCordUsed(800);
                product8.setQuantity(920);
                
                
                Product product9 = s.getProductDirectory().addProduct();
                product9.setProdName("CupBoard");
                product9.setProdType("Iron Wood");
                product9.setProdPrice(550);
                product9.setCordUsed(600);
                product9.setQuantity(920);
                
                Product product10 = s.getProductDirectory().addProduct();
                product10.setProdName("CupBoard");
                product10.setProdType("Bamboo");
                product10.setProdPrice(220);
                product10.setCordUsed(345);
                product10.setQuantity(750);
                
                Product product12 = s.getProductDirectory().addProduct();
                product12.setProdName("CupBoard");
                product12.setProdType("TeakWood");
                product12.setProdPrice(800);
                product12.setCordUsed(1150);
                product12.setQuantity(800);
                
                
                Product product13 = s.getProductDirectory().addProduct();
                product13.setProdName("CupBoard");
                product13.setProdType("Sandalwood");
                product13.setProdPrice(1000);
                product13.setCordUsed(1250);
                product13.setQuantity(1200);
                
                
                Product product14 = s.getProductDirectory().addProduct();
                product14.setProdName("CupBoard");
                product14.setProdType("Rosewood");
                product14.setProdPrice(660);
                product14.setCordUsed(1450);
                product14.setQuantity(900);
                
                Product product15 = s.getProductDirectory().addProduct();
                product15.setProdName("Bed Frame");
                product15.setProdType("Mahogany");
                product15.setProdPrice(2200);
                product15.setCordUsed(1650);
                product15.setQuantity(950);
                
                Product product16 = s.getProductDirectory().addProduct();
                product16.setProdName("Bed Frame");
                product16.setProdType("Maple-nut Wood");
                product16.setProdPrice(770);
                product16.setCordUsed(1150);
                product16.setQuantity(1200);
                
                Product product17 = s.getProductDirectory().addProduct();
                product17.setProdName("Bed Frame");
                product17.setProdType("Pine wood");
                product17.setProdPrice(470);
                product17.setCordUsed(1150);
                product17.setQuantity(1200);
                
                Product product18 = s.getProductDirectory().addProduct();
                product18.setProdName("Bed Frame");
                product18.setProdType("Iron Wood");
                product18.setProdPrice(520);
                product18.setCordUsed(850);
                product18.setQuantity(700);
                
                Product product19 = s.getProductDirectory().addProduct();
                product19.setProdName("Bed Frame");
                product19.setProdType("Bamboo");
                product19.setProdPrice(250);
                product19.setCordUsed(50);
                product19.setQuantity(1100);
                
                Product product20 = s.getProductDirectory().addProduct();
                product20.setProdName("Bed Frame");
                product20.setProdType("TeakWood");
                product20.setProdPrice(850);
                product20.setCordUsed(1550);
                product20.setQuantity(1100);
                
                Product product21 = s.getProductDirectory().addProduct();
                product21.setProdName("Bed Frame");
                product21.setProdType("Sandalwood");
                product21.setProdPrice(1100);
                product21.setCordUsed(1250);
                product21.setQuantity(900);
                
                Product product23 = s.getProductDirectory().addProduct();
                product23.setProdName("Bed Frame");
                product23.setProdType("Rosewood");
                product23.setProdPrice(700);
                product23.setCordUsed(1250);
                product23.setQuantity(1000);
                
                Product product24 = s.getProductDirectory().addProduct();
                product24.setProdName("TV Unit");
                product24.setProdType("Mahogany");
                product24.setProdPrice(2700);
                product24.setCordUsed(1500);
                product24.setQuantity(350);
                
                Product product25 = s.getProductDirectory().addProduct();
                product25.setProdName("TV Unit");
                product25.setProdType("Maple-nut Wood");
                product25.setProdPrice(820);
                product25.setCordUsed(1200);
                product25.setQuantity(920);
                
                Product product26 = s.getProductDirectory().addProduct();
                product26.setProdName("TV Unit");
                product26.setProdType("Pine wood");
                product26.setProdPrice(470);
                product26.setCordUsed(1100);
                product26.setQuantity(700);
                
                Product product27 = s.getProductDirectory().addProduct();
                product27.setProdName("TV Unit");
                product27.setProdType("Iron Wood");
                product27.setProdPrice(580);
                product27.setCordUsed(1300);
                product27.setQuantity(600);
                
                Product product28 = s.getProductDirectory().addProduct();
                product28.setProdName("TV Unit");
                product28.setProdType("Bamboo");
                product28.setProdPrice(290);
                product28.setCordUsed(200);
                product28.setQuantity(690);
                
                Product product29 = s.getProductDirectory().addProduct();
                product29.setProdName("TV Unit");
                product29.setProdType("TeakWood");
                product29.setProdPrice(870);
                product29.setCordUsed(1300);
                product29.setQuantity(500);
                
                Product product30 = s.getProductDirectory().addProduct();
                product30.setProdName("TV Unit");
                product30.setProdType("Sandalwood");
                product30.setProdPrice(1500);
                product30.setCordUsed(900);
                product30.setQuantity(780);
                
                Product product31 = s.getProductDirectory().addProduct();
                product31.setProdName("TV Unit");
                product31.setProdType("Rosewood");
                product31.setProdPrice(680);
                product31.setCordUsed(1800);
                product31.setQuantity(789);
                
                Product product32 = s.getProductDirectory().addProduct();
                product32.setProdName("Racks");
                product32.setProdType("Mahogany");
                product32.setProdPrice(1800);
                product32.setCordUsed(1300);
                product32.setQuantity(600);
                
                Product product34 = s.getProductDirectory().addProduct();
                product34.setProdName("Racks");
                product34.setProdType("Maple-nut Wood");
                product34.setProdPrice(790);
                product34.setCordUsed(1750);
                product34.setQuantity(300);
                
                Product product35 = s.getProductDirectory().addProduct();
                product35.setProdName("Racks");
                product35.setProdType("Pine wood");
                product35.setProdPrice(470);
                product35.setCordUsed(1700);
                product35.setQuantity(900);
                
                Product product36 = s.getProductDirectory().addProduct();
                product36.setProdName("Racks");
                product36.setProdType("Iron Wood");
                product36.setProdPrice(580);
                product36.setCordUsed(900);
                product36.setQuantity(500);
                
                Product product37 = s.getProductDirectory().addProduct();
                product37.setProdName("Racks");
                product37.setProdType("Bamboo");
                product37.setProdPrice(270);
                product37.setCordUsed(400);
                product37.setQuantity(600);
                
                Product product38 = s.getProductDirectory().addProduct();
                product38.setProdName("Racks");
                product38.setProdType("TeakWood");
                product38.setProdPrice(820);
                product38.setCordUsed(850);
                product38.setQuantity(780);
                
                Product product39 = s.getProductDirectory().addProduct();
                product39.setProdName("Racks");
                product39.setProdType("Sandalwood");
                product39.setProdPrice(1215);
                product39.setCordUsed(1630);
                product39.setQuantity(690);
                
                Product product40 = s.getProductDirectory().addProduct();
                product40.setProdName("Racks");
                product40.setProdType("Rosewood");
                product40.setProdPrice(680);
                product40.setCordUsed(1320);
                product40.setQuantity(690);
                
                Product product41 = s.getProductDirectory().addProduct();
                product41.setProdName("Decorative Overlays");
                product41.setProdType("Mahogany");
                product41.setProdPrice(3000);
                product41.setCordUsed(1300);
                product41.setQuantity(690);
                
                Product product42 = s.getProductDirectory().addProduct();
                product42.setProdName("Decorative Overlays");
                product42.setProdType("Maple-nut Wood");
                product42.setProdPrice(850);
                product42.setCordUsed(12500);
                product42.setQuantity(900);
                
                Product product43 = s.getProductDirectory().addProduct();
                product43.setProdName("Decorative Overlays");
                product43.setProdType("Pine wood");
                product43.setProdPrice(480);
                product43.setCordUsed(785);
                product43.setQuantity(635);
                
                Product product45 = s.getProductDirectory().addProduct();
                product45.setProdName("Decorative Overlays");
                product45.setProdType("Iron Wood");
                product45.setProdPrice(600);
                product45.setCordUsed(1300);
                product45.setQuantity(750);
                
                Product product46 = s.getProductDirectory().addProduct();
                product46.setProdName("Decorative Overlays");
                product46.setProdType("Bamboo");
                product46.setProdPrice(275);
                product46.setCordUsed(200);
                product46.setQuantity(800);
                
                Product product47 = s.getProductDirectory().addProduct();
                product47.setProdName("Decorative Overlays");
                product47.setProdType("TeakWood");
                product47.setProdPrice(820);
                product47.setCordUsed(700);
                product47.setQuantity(550);
                
                Product product48 = s.getProductDirectory().addProduct();
                product48.setProdName("Decorative Overlays");
                product48.setProdType("Sandalwood");
                product48.setProdPrice(1200);
                product48.setCordUsed(850);
                product48.setQuantity(750);
                
                Product product49 = s.getProductDirectory().addProduct();
                product49.setProdName("Decorative Overlays");
                product49.setProdType("Rosewood");
                product49.setProdPrice(695);
                product49.setCordUsed(1200);
                product49.setQuantity(230);

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
                product22.setCordUsed(1350);
                product22.setQuantity(750);

                Product product33 = s2.getProductDirectory().addProduct();
                product33.setProdName("Chairs");
                product33.setProdType("RoseWood");
                product33.setProdPrice(1200);
                product33.setCordUsed(750);
                product33.setQuantity(620);

                Product product44 = s2.getProductDirectory().addProduct();
                product44.setProdName("Chairs");
                product44.setProdType("Bamboo");
                product44.setProdPrice(355);
                product44.setCordUsed(100);
                product44.setQuantity(600);
                
                Product product55 = s2.getProductDirectory().addProduct();
                product55.setProdName("Tables");
                product55.setProdType("Teakwood");
                product55.setProdPrice(565);
                product55.setCordUsed(1400);
                product55.setQuantity(300);
                
                Product product56 = s2.getProductDirectory().addProduct();
                product56.setProdName("CupBoard");
                product56.setProdType("Mahogany");
                product56.setProdPrice(2400);
                product56.setCordUsed(1754);
                product56.setQuantity(412);
                
                Product product57 = s2.getProductDirectory().addProduct();
                product57.setProdName("CupBoard");
                product57.setProdType("Maple-nut Wood");
                product57.setProdPrice(790);
                product57.setCordUsed(780);
                product57.setQuantity(200);
                
                Product product58 = s2.getProductDirectory().addProduct();
                product58.setProdName("CupBoard");
                product58.setProdType("Pine wood");
                product58.setProdPrice(480);
                product58.setCordUsed(1400);
                product58.setQuantity(780);
                
                Product product59 = s2.getProductDirectory().addProduct();
                product59.setProdName("CupBoard");
                product59.setProdType("Iron Wood");
                product59.setProdPrice(600);
                product59.setCordUsed(800);
                product59.setQuantity(350);
                
                Product product60 = s2.getProductDirectory().addProduct();
                product60.setProdName("CupBoard");
                product60.setProdType("Bamboo");
                product60.setProdPrice(230);
                product60.setCordUsed(159);
                product60.setQuantity(800);
                
                Product product61 = s2.getProductDirectory().addProduct();
                product61.setProdName("CupBoard");
                product61.setProdType("TeakWood");
                product61.setProdPrice(850);
                product61.setCordUsed(760);
                product61.setQuantity(450);
                
                Product product62 = s2.getProductDirectory().addProduct();
                product62.setProdName("CupBoard");
                product62.setProdType("Sandalwood");
                product62.setProdPrice(1100);
                product62.setCordUsed(1780);
                product62.setQuantity(1200);
                
                Product product63 = s2.getProductDirectory().addProduct();
                product63.setProdName("CupBoard");
                product63.setProdType("Rosewood");
                product63.setProdPrice(680);
                product63.setCordUsed(1500);
                product63.setQuantity(900);
                
                Product product64 = s2.getProductDirectory().addProduct();
                product64.setProdName("Bed Frame");
                product64.setProdType("Mahogany");
                product64.setProdPrice(2500);
                product64.setCordUsed(1250);
                product64.setQuantity(800);
                
                Product product65 = s2.getProductDirectory().addProduct();
                product65.setProdName("Bed Frame");
                product65.setProdType("Maple-nut Wood");
                product65.setProdPrice(870);
                product65.setCordUsed(1250);
                product65.setQuantity(1000);
                
                Product product66 = s2.getProductDirectory().addProduct();
                product66.setProdName("Bed Frame");
                product66.setProdType("Pine wood");
                product66.setProdPrice(490);
                product66.setCordUsed(1250);
                product66.setQuantity(780);
                
                Product product67 = s2.getProductDirectory().addProduct();
                product67.setProdName("Bed Frame");
                product67.setProdType("Iron Wood");
                product67.setProdPrice(530);
                product67.setCordUsed(1200);
                product67.setQuantity(800);
                
                Product product68 = s2.getProductDirectory().addProduct();
                product68.setProdName("Bed Frame");
                product68.setProdType("Bamboo");
                product68.setProdPrice(280);
                product68.setCordUsed(400);
                product68.setQuantity(840);
                
                Product product69 = s2.getProductDirectory().addProduct();
                product69.setProdName("Bed Frame");
                product69.setProdType("TeakWood");
                product69.setProdPrice(880);
                product69.setCordUsed(1300);
                product69.setQuantity(800);
                
                Product product70 = s2.getProductDirectory().addProduct();
                product70.setProdName("Bed Frame");
                product70.setProdType("Sandalwood");
                product70.setProdPrice(1600);
                product70.setCordUsed(1350);
                product70.setQuantity(700);
                
                Product product71 = s2.getProductDirectory().addProduct();
                product71.setProdName("Bed Frame");
                product71.setProdType("Rosewood");
                product71.setProdPrice(750);
                product71.setCordUsed(1110);
                product71.setQuantity(300);
                
                Product product72 = s2.getProductDirectory().addProduct();
                product72.setProdName("TV Unit");
                product72.setProdType("Mahogany");
                product72.setProdPrice(3700);
                product72.setCordUsed(1350);
                product72.setQuantity(900);
                
                Product product73 = s2.getProductDirectory().addProduct();
                product73.setProdName("TV Unit");
                product73.setProdType("Maple-nut Wood");
                product73.setProdPrice(820);
                product73.setCordUsed(1200);
                product73.setQuantity(130);
                
                Product product74 = s2.getProductDirectory().addProduct();
                product74.setProdName("TV Unit");
                product74.setProdType("Pine wood");
                product74.setProdPrice(490);
                product74.setCordUsed(800);
                product74.setQuantity(450);
                
                Product product75 = s2.getProductDirectory().addProduct();
                product75.setProdName("TV Unit");
                product75.setProdType("Iron Wood");
                product75.setProdPrice(590);
                product75.setCordUsed(1160);
                product75.setQuantity(890);
                
                Product product76 = s2.getProductDirectory().addProduct();
                product76.setProdName("TV Unit");
                product76.setProdType("Bamboo");
                product76.setProdPrice(280);
                product76.setCordUsed(750);
                product76.setQuantity(600);
                
                Product product77 = s2.getProductDirectory().addProduct();
                product77.setProdName("TV Unit");
                product77.setProdType("TeakWood");
                product77.setProdPrice(890);
                product77.setCordUsed(1540);
                product77.setQuantity(740);
                
                Product product78 = s.getProductDirectory().addProduct();
                product78.setProdName("TV Unit");
                product78.setProdType("Sandalwood");
                product78.setProdPrice(1600);
                product78.setCordUsed(1750);
                product78.setQuantity(580);
                
                Product product79 = s2.getProductDirectory().addProduct();
                product79.setProdName("TV Unit");
                product79.setProdType("Rosewood");
                product79.setProdPrice(690);
                product79.setCordUsed(780);
                product79.setQuantity(630);
                
                Product product80 = s2.getProductDirectory().addProduct();
                product80.setProdName("Racks");
                product80.setProdType("Mahogany");
                product80.setProdPrice(1900);
                product27.setCordUsed(630);
                product27.setQuantity(750);
                
                Product product81 = s2.getProductDirectory().addProduct();
                product81.setProdName("Racks");
                product81.setProdType("Maple-nut Wood");
                product81.setProdPrice(760);
                product81.setCordUsed(1900);
                product81.setQuantity(350);
                
                Product product82 = s2.getProductDirectory().addProduct();
                product82.setProdName("Racks");
                product82.setProdType("Pine wood");
                product82.setProdPrice(480);
                product82.setCordUsed(1750);
                product82.setQuantity(900);
                
                Product product83 = s2.getProductDirectory().addProduct();
                product83.setProdName("Racks");
                product83.setProdType("Iron Wood");
                product83.setProdPrice(590);
                product83.setCordUsed(785);
                product83.setQuantity(420);
                
                Product product84 = s2.getProductDirectory().addProduct();
                product84.setProdName("Racks");
                product84.setProdType("Bamboo");
                product84.setProdPrice(280);
                product84.setCordUsed(200);
                product84.setQuantity(900);
                
                Product product85 = s2.getProductDirectory().addProduct();
                product85.setProdName("Racks");
                product85.setProdType("TeakWood");
                product85.setProdPrice(830);
                product85.setCordUsed(1600);
                product85.setQuantity(790);
                
                Product product86 = s2.getProductDirectory().addProduct();
                product86.setProdName("Racks");
                product86.setProdType("Sandalwood");
                product86.setProdPrice(1235);
                product86.setCordUsed(1260);
                product86.setQuantity(564);
                
                Product product87 = s2.getProductDirectory().addProduct();
                product87.setProdName("Racks");
                product87.setProdType("Rosewood");
                product87.setProdPrice(690);
                product87.setCordUsed(1350);
                product87.setQuantity(780);
                
                Product product88 = s2.getProductDirectory().addProduct();
                product88.setProdName("Decorative Overlays");
                product88.setProdType("Mahogany");
                product88.setProdPrice(3500);
                product88.setCordUsed(2540);
                product88.setQuantity(465);
                
                Product product89 = s2.getProductDirectory().addProduct();
                product89.setProdName("Decorative Overlays");
                product89.setProdType("Maple-nut Wood");
                product89.setProdPrice(870);
                product89.setCordUsed(1780);
                product89.setQuantity(850);
                
                Product product90 = s2.getProductDirectory().addProduct();
                product90.setProdName("Decorative Overlays");
                product90.setProdType("Pine wood");
                product90.setProdPrice(490);
                product90.setCordUsed(1450);
                product90.setQuantity(900);
                
                Product product91 = s2.getProductDirectory().addProduct();
                product91.setProdName("Decorative Overlays");
                product91.setProdType("Iron Wood");
                product91.setProdPrice(650);
                product91.setCordUsed(1300);
                product91.setQuantity(600);
                
                Product product92 = s2.getProductDirectory().addProduct();
                product92.setProdName("Decorative Overlays");
                product92.setProdType("Bamboo");
                product92.setProdPrice(295);
                product92.setCordUsed(400);
                product92.setQuantity(960);
                
                Product product93 = s2.getProductDirectory().addProduct();
                product93.setProdName("Decorative Overlays");
                product93.setProdType("TeakWood");
                product93.setProdPrice(830);
                product93.setCordUsed(1300);
                product93.setQuantity(600);
                
                Product product94 = s2.getProductDirectory().addProduct();
                product94.setProdName("Decorative Overlays");
                product94.setProdType("Sandalwood");
                product94.setProdPrice(1400);
                product94.setCordUsed(1600);
                product94.setQuantity(990);
                
                Product product95 = s2.getProductDirectory().addProduct();
                product95.setProdName("Decorative Overlays");
                product95.setProdType("Rosewood");
                product95.setProdPrice(715);
                product95.setCordUsed(1750);
                product95.setQuantity(700);

                Supplier s3 = N.getSupplierDirectory().addSupplier();
                s3.setSupplierName("S3");
                s3.setSupplierID(3);
                s3.setSupplierRating("*****");
                
                Product product111 = s3.getProductDirectory().addProduct();
                product111.setProdName("Chairs");
                product111.setProdType("TeakWood");
                product111.setProdPrice(775);
                product111.setCordUsed(1850);
                product111.setQuantity(900);

                Product product222 = s3.getProductDirectory().addProduct();
                product222.setProdName("Chairs");
                product222.setProdType("Sandalwood");
                product222.setProdPrice(900);
                product222.setCordUsed(1750);
                product222.setQuantity(880);

                Product product333 = s3.getProductDirectory().addProduct();
                product333.setProdName("Chairs");
                product333.setProdType("RoseWood");
                product333.setProdPrice(1200);
                product333.setCordUsed(1450);
                product333.setQuantity(900);

                Product product444 = s3.getProductDirectory().addProduct();
                product444.setProdName("Chairs");
                product444.setProdType("Bamboo");
                product444.setProdPrice(165);
                product444.setCordUsed(700);
                product444.setQuantity(860);
                
                 Product product555 = s3.getProductDirectory().addProduct();
                product555.setProdName("Tables");
                product555.setProdType("Bamboo");
                product555.setProdPrice(355);
                product555.setCordUsed(500);
                product555.setQuantity(780);
                
                Product product666 = s3.getProductDirectory().addProduct();
                product666.setProdName("Wooden Frames");
                product666.setProdType("Bamboo");
                product666.setProdPrice(155);
                product666.setCordUsed(500);
                product666.setQuantity(800);
                
                Product product777 = s3.getProductDirectory().addProduct();
                product777.setProdName("Desks");
                product777.setProdType("Bamboo");
                product777.setProdPrice(285);
                product777.setCordUsed(190);
                product777.setQuantity(650);
                
                Product product888 = s3.getProductDirectory().addProduct();
                product888.setProdName("Tables");
                product888.setProdType("Teakwood");
                product888.setProdPrice(495);
                product888.setCordUsed(850);
                product888.setQuantity(350);
                
                Product product96 = s3.getProductDirectory().addProduct();
                product96.setProdName("CupBoard");
                product96.setProdType("Mahogany");
                product96.setProdPrice(2600);
                product96.setCordUsed(720);
                product96.setQuantity(980);
                
                Product product97 = s3.getProductDirectory().addProduct();
                product97.setProdName("CupBoard");
                product97.setProdType("Maple-nut Wood");
                product97.setProdPrice(790);
                product97.setCordUsed(700);
                product97.setQuantity(865);
                
                Product product98 = s3.getProductDirectory().addProduct();
                product98.setProdName("CupBoard");
                product98.setProdType("Pine wood");
                product98.setProdPrice(480);
                product98.setCordUsed(730);
                product98.setQuantity(900);
                
                Product product99 = s3.getProductDirectory().addProduct();
                product99.setProdName("CupBoard");
                product99.setProdType("Iron Wood");
                product99.setProdPrice(580);
                product99.setCordUsed(710);
                product99.setQuantity(756);
                
                Product product100 = s3.getProductDirectory().addProduct();
                product100.setProdName("CupBoard");
                product100.setProdType("Bamboo");
                product100.setProdPrice(230);
                product100.setCordUsed(700);
                product100.setQuantity(678);
                
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
                product104.setQuantity(250);
                
                Product product105 = s3.getProductDirectory().addProduct();
                product105.setProdName("Bed Frame");
                product105.setProdType("Maple-nut Wood");
                product105.setProdPrice(780);
                product105.setCordUsed(970);
                product105.setQuantity(690);
                
                Product product106 = s3.getProductDirectory().addProduct();
                product106.setProdName("Bed Frame");
                product106.setProdType("Pine wood");
                product106.setProdPrice(480);
                product106.setCordUsed(980);
                product106.setQuantity(780);
                
                Product product107 = s3.getProductDirectory().addProduct();
                product107.setProdName("Bed Frame");
                product107.setProdType("Iron Wood");
                product107.setProdPrice(580);
                product107.setCordUsed(990);
                product107.setQuantity(980);
                
                Product product108 = s3.getProductDirectory().addProduct();
                product108.setProdName("Bed Frame");
                product108.setProdType("Bamboo");
                product108.setProdPrice(280);
                product108.setCordUsed(940);
                product108.setQuantity(350);
                
                Product product109 = s3.getProductDirectory().addProduct();
                product109.setProdName("Bed Frame");
                product109.setProdType("TeakWood");
                product109.setProdPrice(880);
                product109.setCordUsed(970);
                product109.setQuantity(660);
                
                Product product110 = s3.getProductDirectory().addProduct();
                product110.setProdName("Bed Frame");
                product110.setProdType("Sandalwood");
                product110.setProdPrice(1700);
                product110.setCordUsed(1000);
                product110.setQuantity(750);
                
                Product product112 = s3.getProductDirectory().addProduct();
                product112.setProdName("Bed Frame");
                product112.setProdType("Rosewood");
                product112.setProdPrice(800);
                product112.setCordUsed(990);
                product112.setQuantity(780);
                
                Product product113 = s3.getProductDirectory().addProduct();
                product113.setProdName("TV Unit");
                product113.setProdType("Mahogany");
                product113.setProdPrice(2900);
                product113.setCordUsed(1000);
                product113.setQuantity(780);
                
                Product product114 = s3.getProductDirectory().addProduct();
                product114.setProdName("TV Unit");
                product114.setProdType("Maple-nut Wood");
                product114.setProdPrice(890);
                product114.setCordUsed(1020);
                product114.setQuantity(989);
                
                Product product115 = s3.getProductDirectory().addProduct();
                product115.setProdName("TV Unit");
                product115.setProdType("Pine wood");
                product115.setProdPrice(570);
                product115.setCordUsed(950);
                product115.setQuantity(780);
                
                Product product116 = s3.getProductDirectory().addProduct();
                product116.setProdName("TV Unit");
                product116.setProdType("Iron Wood");
                product116.setProdPrice(480);
                product116.setCordUsed(990);
                product116.setQuantity(690);
                
                Product product117 = s3.getProductDirectory().addProduct();
                product117.setProdName("TV Unit");
                product117.setProdType("Bamboo");
                product117.setProdPrice(270);
                product117.setCordUsed(880);
                product117.setQuantity(785);
                
                Product product118 = s3.getProductDirectory().addProduct();
                product118.setProdName("TV Unit");
                product118.setProdType("TeakWood");
                product118.setProdPrice(850);
                product118.setCordUsed(900);
                product118.setQuantity(690);
                
                Product product119 = s3.getProductDirectory().addProduct();
                product119.setProdName("TV Unit");
                product119.setProdType("Sandalwood");
                product119.setProdPrice(1800);
                product119.setCordUsed(880);
                product119.setQuantity(758);
                
                Product product120 = s3.getProductDirectory().addProduct();
                product120.setProdName("TV Unit");
                product120.setProdType("Rosewood");
                product120.setProdPrice(690);
                product120.setCordUsed(820);
                product120.setQuantity(770);
                
                Product product121 = s3.getProductDirectory().addProduct();
                product121.setProdName("Racks");
                product121.setProdType("Mahogany");
                product121.setProdPrice(1900);
                product121.setCordUsed(650);
                product121.setQuantity(860);
                
                Product product122 = s3.getProductDirectory().addProduct();
                product122.setProdName("Racks");
                product122.setProdType("Maple-nut Wood");
                product122.setProdPrice(810);
                product122.setCordUsed(780);
                product122.setQuantity(690);
                
                Product product123 = s3.getProductDirectory().addProduct();
                product123.setProdName("Racks");
                product123.setProdType("Pine wood");
                product123.setProdPrice(480);
                product123.setCordUsed(790);
                product123.setQuantity(956);
                
                Product product124 = s3.getProductDirectory().addProduct();
                product124.setProdName("Racks");
                product124.setProdType("Iron Wood");
                product124.setProdPrice(590);
                product124.setCordUsed(800);
                product124.setQuantity(986);
                
                Product product125 = s3.getProductDirectory().addProduct();
                product125.setProdName("Racks");
                product125.setProdType("Bamboo");
                product125.setProdPrice(280);
                product125.setCordUsed(780);
                product125.setQuantity(1050);
                
                Product product126 = s3.getProductDirectory().addProduct();
                product126.setProdName("Racks");
                product126.setProdType("TeakWood");
                product126.setProdPrice(920);
                product126.setCordUsed(800);
                product126.setQuantity(980);
                
                Product product127 = s3.getProductDirectory().addProduct();
                product127.setProdName("Racks");
                product127.setProdType("Sandalwood");
                product127.setProdPrice(1205);
                product127.setCordUsed(820);
                product127.setQuantity(986);
                
                Product product128 = s3.getProductDirectory().addProduct();
                product128.setProdName("Racks");
                product128.setProdType("Rosewood");
                product128.setProdPrice(780);
                product128.setCordUsed(825);
                product128.setQuantity(475);
                
                Product product129 = s3.getProductDirectory().addProduct();
                product129.setProdName("Decorative Overlays");
                product129.setProdType("Mahogany");
                product129.setProdPrice(3000);
                product129.setCordUsed(830);
                product129.setQuantity(475);
                
                Product product130 = s3.getProductDirectory().addProduct();
                product130.setProdName("Decorative Overlays");
                product130.setProdType("Maple-nut Wood");
                product130.setProdPrice(890);
                product130.setCordUsed(820);
                product130.setQuantity(980);
                
                Product product131 = s3.getProductDirectory().addProduct();
                product131.setProdName("Decorative Overlays");
                product131.setProdType("Pine wood");
                product131.setProdPrice(490);
                product131.setCordUsed(710);
                product131.setQuantity(870);
                
                Product product132 = s3.getProductDirectory().addProduct();
                product132.setProdName("Decorative Overlays");
                product132.setProdType("Iron Wood");
                product132.setProdPrice(800);
                product132.setCordUsed(740);
                product132.setQuantity(850);
                
                Product product133 = s3.getProductDirectory().addProduct();
                product133.setProdName("Decorative Overlays");
                product133.setProdType("Bamboo");
                product133.setProdPrice(295);
                product133.setCordUsed(600);
                product133.setQuantity(980);
                
                Product product134 = s3.getProductDirectory().addProduct();
                product134.setProdName("Decorative Overlays");
                product134.setProdType("TeakWood");
                product134.setProdPrice(840);
                product134.setCordUsed(880);
                product134.setQuantity(980);
                
                Product product135 = s3.getProductDirectory().addProduct();
                product135.setProdName("Decorative Overlays");
                product135.setProdType("Sandalwood");
                product135.setProdPrice(1400);
                product135.setCordUsed(780);
                product135.setQuantity(789);
                
                Product product136 = s3.getProductDirectory().addProduct();
                product136.setProdName("Decorative Overlays");
                product136.setProdType("Rosewood");
                product136.setProdPrice(795);
                product136.setCordUsed(420);
                product136.setQuantity(980);

            }
        }
        
        Network network2 = system.createAndAddNetwork();
        network2.setName("Boston");
        
        for(Network network : system.getNetworkList())
        {
            if(network.getName().equalsIgnoreCase("Boston"))
            {
                Supplier s = network.getSupplierDirectory().addSupplier();
                s.setSupplierName("P1");
                s.setSupplierID(100);
                s.setSupplierRating("***");
                
                
                Product product =  s.getProductDirectory().addProduct();
                product.setProdName("Chairs");
                product.setProdType("TeakWood");
                product.setProdPrice(795);
                product.setCordUsed(820);
                product.setQuantity(1600);
                
                Product product2 = s.getProductDirectory().addProduct();
                product2.setProdName("Chairs");
                product2.setProdType("Sandalwood");
                product2.setProdPrice(900);
                product2.setCordUsed(350);
                product2.setQuantity(1600);

                Product product3 = s.getProductDirectory().addProduct();
                product3.setProdName("Chairs");
                product3.setProdType("RoseWood");
                product3.setProdPrice(1200);
                product3.setCordUsed(880);
                product3.setQuantity(1700);
                
                Product product4 = s.getProductDirectory().addProduct();
                product4.setProdName("Chairs");
                product4.setProdType("Bamboo");
                product4.setProdPrice(325);
                product4.setCordUsed(720);
                product4.setQuantity(1900);
                
                
                Product product5 = s.getProductDirectory().addProduct();
                product5.setProdName("Tables");
                product5.setProdType("Teakwood");
                product5.setProdPrice(565);
                product5.setCordUsed(809);
                product5.setQuantity(1750);
                
                Product product6 = s.getProductDirectory().addProduct();
                product6.setProdName("CupBoard");
                product6.setProdType("Mahogany");
                product6.setProdPrice(1200);
                product6.setCordUsed(1400);
                product6.setQuantity(1856);
                
                Product product7 = s.getProductDirectory().addProduct();
                product7.setProdName("CupBoard");
                product7.setProdType("Maple-nut Wood");
                product7.setProdPrice(780);
                product7.setCordUsed(1200);
                product7.setQuantity(1600);
                
                Product product8 = s.getProductDirectory().addProduct();
                product8.setProdName("CupBoard");
                product8.setProdType("Pine wood");
                product8.setProdPrice(450);
                product8.setCordUsed(800);
                product8.setQuantity(1920);
                
                
                Product product9 = s.getProductDirectory().addProduct();
                product9.setProdName("CupBoard");
                product9.setProdType("Iron Wood");
                product9.setProdPrice(550);
                product9.setCordUsed(600);
                product9.setQuantity(1920);
                
                Product product10 = s.getProductDirectory().addProduct();
                product10.setProdName("CupBoard");
                product10.setProdType("Bamboo");
                product10.setProdPrice(220);
                product10.setCordUsed(345);
                product10.setQuantity(1750);
                
                Product product12 = s.getProductDirectory().addProduct();
                product12.setProdName("CupBoard");
                product12.setProdType("TeakWood");
                product12.setProdPrice(800);
                product12.setCordUsed(1150);
                product12.setQuantity(1800);
                
                
                Product product13 = s.getProductDirectory().addProduct();
                product13.setProdName("CupBoard");
                product13.setProdType("Sandalwood");
                product13.setProdPrice(1000);
                product13.setCordUsed(1250);
                product13.setQuantity(1200);
                
                
                Product product14 = s.getProductDirectory().addProduct();
                product14.setProdName("CupBoard");
                product14.setProdType("Rosewood");
                product14.setProdPrice(660);
                product14.setCordUsed(1450);
                product14.setQuantity(1900);
                
                Product product15 = s.getProductDirectory().addProduct();
                product15.setProdName("Bed Frame");
                product15.setProdType("Mahogany");
                product15.setProdPrice(2200);
                product15.setCordUsed(1650);
                product15.setQuantity(1950);
                
                Product product16 = s.getProductDirectory().addProduct();
                product16.setProdName("Bed Frame");
                product16.setProdType("Maple-nut Wood");
                product16.setProdPrice(770);
                product16.setCordUsed(1150);
                product16.setQuantity(1200);
                
                Product product17 = s.getProductDirectory().addProduct();
                product17.setProdName("Bed Frame");
                product17.setProdType("Pine wood");
                product17.setProdPrice(470);
                product17.setCordUsed(1150);
                product17.setQuantity(1200);
                
                Product product18 = s.getProductDirectory().addProduct();
                product18.setProdName("Bed Frame");
                product18.setProdType("Iron Wood");
                product18.setProdPrice(520);
                product18.setCordUsed(850);
                product18.setQuantity(1700);
                
                Product product19 = s.getProductDirectory().addProduct();
                product19.setProdName("Bed Frame");
                product19.setProdType("Bamboo");
                product19.setProdPrice(250);
                product19.setCordUsed(50);
                product19.setQuantity(1100);
                
                Product product20 = s.getProductDirectory().addProduct();
                product20.setProdName("Bed Frame");
                product20.setProdType("TeakWood");
                product20.setProdPrice(850);
                product20.setCordUsed(1550);
                product20.setQuantity(1100);
                
                Product product21 = s.getProductDirectory().addProduct();
                product21.setProdName("Bed Frame");
                product21.setProdType("Sandalwood");
                product21.setProdPrice(1100);
                product21.setCordUsed(1250);
                product21.setQuantity(1900);
                
                Product product23 = s.getProductDirectory().addProduct();
                product23.setProdName("Bed Frame");
                product23.setProdType("Rosewood");
                product23.setProdPrice(700);
                product23.setCordUsed(1250);
                product23.setQuantity(1000);
                
                Product product24 = s.getProductDirectory().addProduct();
                product24.setProdName("TV Unit");
                product24.setProdType("Mahogany");
                product24.setProdPrice(2700);
                product24.setCordUsed(1500);
                product24.setQuantity(1350);
                
                Product product25 = s.getProductDirectory().addProduct();
                product25.setProdName("TV Unit");
                product25.setProdType("Maple-nut Wood");
                product25.setProdPrice(820);
                product25.setCordUsed(1200);
                product25.setQuantity(1920);
                
                Product product26 = s.getProductDirectory().addProduct();
                product26.setProdName("TV Unit");
                product26.setProdType("Pine wood");
                product26.setProdPrice(470);
                product26.setCordUsed(1100);
                product26.setQuantity(1700);
                
                Product product27 = s.getProductDirectory().addProduct();
                product27.setProdName("TV Unit");
                product27.setProdType("Iron Wood");
                product27.setProdPrice(580);
                product27.setCordUsed(1300);
                product27.setQuantity(1600);
                
                Product product28 = s.getProductDirectory().addProduct();
                product28.setProdName("TV Unit");
                product28.setProdType("Bamboo");
                product28.setProdPrice(290);
                product28.setCordUsed(200);
                product28.setQuantity(1690);
                
                Product product29 = s.getProductDirectory().addProduct();
                product29.setProdName("TV Unit");
                product29.setProdType("TeakWood");
                product29.setProdPrice(870);
                product29.setCordUsed(1300);
                product29.setQuantity(1500);
                
                Product product30 = s.getProductDirectory().addProduct();
                product30.setProdName("TV Unit");
                product30.setProdType("Sandalwood");
                product30.setProdPrice(1500);
                product30.setCordUsed(900);
                product30.setQuantity(1780);
                
                Product product31 = s.getProductDirectory().addProduct();
                product31.setProdName("TV Unit");
                product31.setProdType("Rosewood");
                product31.setProdPrice(680);
                product31.setCordUsed(1800);
                product31.setQuantity(1789);
                
                Product product32 = s.getProductDirectory().addProduct();
                product32.setProdName("Racks");
                product32.setProdType("Mahogany");
                product32.setProdPrice(1800);
                product32.setCordUsed(1300);
                product32.setQuantity(1600);
                
                Product product34 = s.getProductDirectory().addProduct();
                product34.setProdName("Racks");
                product34.setProdType("Maple-nut Wood");
                product34.setProdPrice(790);
                product34.setCordUsed(1750);
                product34.setQuantity(1300);
                
                Product product35 = s.getProductDirectory().addProduct();
                product35.setProdName("Racks");
                product35.setProdType("Pine wood");
                product35.setProdPrice(470);
                product35.setCordUsed(1700);
                product35.setQuantity(1900);
                
                Product product36 = s.getProductDirectory().addProduct();
                product36.setProdName("Racks");
                product36.setProdType("Iron Wood");
                product36.setProdPrice(580);
                product36.setCordUsed(900);
                product36.setQuantity(1500);
                
                Product product37 = s.getProductDirectory().addProduct();
                product37.setProdName("Racks");
                product37.setProdType("Bamboo");
                product37.setProdPrice(270);
                product37.setCordUsed(400);
                product37.setQuantity(1600);
                
                Product product38 = s.getProductDirectory().addProduct();
                product38.setProdName("Racks");
                product38.setProdType("TeakWood");
                product38.setProdPrice(820);
                product38.setCordUsed(850);
                product38.setQuantity(1780);
                
                Product product39 = s.getProductDirectory().addProduct();
                product39.setProdName("Racks");
                product39.setProdType("Sandalwood");
                product39.setProdPrice(1215);
                product39.setCordUsed(1630);
                product39.setQuantity(1690);
                
                Product product40 = s.getProductDirectory().addProduct();
                product40.setProdName("Racks");
                product40.setProdType("Rosewood");
                product40.setProdPrice(680);
                product40.setCordUsed(1320);
                product40.setQuantity(1690);
                
                Product product41 = s.getProductDirectory().addProduct();
                product41.setProdName("Decorative Overlays");
                product41.setProdType("Mahogany");
                product41.setProdPrice(3000);
                product41.setCordUsed(1300);
                product41.setQuantity(1690);
                
                Product product42 = s.getProductDirectory().addProduct();
                product42.setProdName("Decorative Overlays");
                product42.setProdType("Maple-nut Wood");
                product42.setProdPrice(850);
                product42.setCordUsed(12500);
                product42.setQuantity(1900);
                
                Product product43 = s.getProductDirectory().addProduct();
                product43.setProdName("Decorative Overlays");
                product43.setProdType("Pine wood");
                product43.setProdPrice(480);
                product43.setCordUsed(785);
                product43.setQuantity(1635);
                
                Product product45 = s.getProductDirectory().addProduct();
                product45.setProdName("Decorative Overlays");
                product45.setProdType("Iron Wood");
                product45.setProdPrice(600);
                product45.setCordUsed(1300);
                product45.setQuantity(1750);
                
                Product product46 = s.getProductDirectory().addProduct();
                product46.setProdName("Decorative Overlays");
                product46.setProdType("Bamboo");
                product46.setProdPrice(275);
                product46.setCordUsed(200);
                product46.setQuantity(1800);
                
                Product product47 = s.getProductDirectory().addProduct();
                product47.setProdName("Decorative Overlays");
                product47.setProdType("TeakWood");
                product47.setProdPrice(820);
                product47.setCordUsed(700);
                product47.setQuantity(1550);
                
                Product product48 = s.getProductDirectory().addProduct();
                product48.setProdName("Decorative Overlays");
                product48.setProdType("Sandalwood");
                product48.setProdPrice(1200);
                product48.setCordUsed(850);
                product48.setQuantity(1750);
                
                Product product49 = s.getProductDirectory().addProduct();
                product49.setProdName("Decorative Overlays");
                product49.setProdType("Rosewood");
                product49.setProdPrice(695);
                product49.setCordUsed(1200);
                product49.setQuantity(1230);
                
                
                 Supplier s2 = network.getSupplierDirectory().addSupplier();
                s2.setSupplierName("P2");
                s2.setSupplierID(101);
                s2.setSupplierRating("****");
                
                
                Product product211 =  s2.getProductDirectory().addProduct();
                product211.setProdName("Chairs");
                product211.setProdType("TeakWood");
                product211.setProdPrice(755);
                product211.setCordUsed(820);
                product211.setQuantity(1800);
                
                Product product22 = s2.getProductDirectory().addProduct();
                product22.setProdName("Chairs");
                product22.setProdType("Sandalwood");
                product22.setProdPrice(900);
                product22.setCordUsed(1350);
                product22.setQuantity(1750);

                Product product33 = s2.getProductDirectory().addProduct();
                product33.setProdName("Chairs");
                product33.setProdType("RoseWood");
                product33.setProdPrice(1200);
                product33.setCordUsed(750);
                product33.setQuantity(1620);

                Product product44 = s2.getProductDirectory().addProduct();
                product44.setProdName("Chairs");
                product44.setProdType("Bamboo");
                product44.setProdPrice(355);
                product44.setCordUsed(100);
                product44.setQuantity(1600);
                
                Product product55 = s2.getProductDirectory().addProduct();
                product55.setProdName("Tables");
                product55.setProdType("Teakwood");
                product55.setProdPrice(565);
                product55.setCordUsed(1400);
                product55.setQuantity(1300);
                
                Product product56 = s2.getProductDirectory().addProduct();
                product56.setProdName("CupBoard");
                product56.setProdType("Mahogany");
                product56.setProdPrice(2400);
                product56.setCordUsed(1754);
                product56.setQuantity(1412);
                
                Product product57 = s2.getProductDirectory().addProduct();
                product57.setProdName("CupBoard");
                product57.setProdType("Maple-nut Wood");
                product57.setProdPrice(790);
                product57.setCordUsed(780);
                product57.setQuantity(1200);
                
                Product product58 = s2.getProductDirectory().addProduct();
                product58.setProdName("CupBoard");
                product58.setProdType("Pine wood");
                product58.setProdPrice(480);
                product58.setCordUsed(1400);
                product58.setQuantity(1780);
                
                Product product59 = s2.getProductDirectory().addProduct();
                product59.setProdName("CupBoard");
                product59.setProdType("Iron Wood");
                product59.setProdPrice(600);
                product59.setCordUsed(800);
                product59.setQuantity(1350);
                
                Product product60 = s2.getProductDirectory().addProduct();
                product60.setProdName("CupBoard");
                product60.setProdType("Bamboo");
                product60.setProdPrice(230);
                product60.setCordUsed(159);
                product60.setQuantity(1800);
                
                Product product61 = s2.getProductDirectory().addProduct();
                product61.setProdName("CupBoard");
                product61.setProdType("TeakWood");
                product61.setProdPrice(850);
                product61.setCordUsed(760);
                product61.setQuantity(1450);
                
                Product product62 = s2.getProductDirectory().addProduct();
                product62.setProdName("CupBoard");
                product62.setProdType("Sandalwood");
                product62.setProdPrice(1100);
                product62.setCordUsed(1780);
                product62.setQuantity(1200);
                
                Product product63 = s2.getProductDirectory().addProduct();
                product63.setProdName("CupBoard");
                product63.setProdType("Rosewood");
                product63.setProdPrice(680);
                product63.setCordUsed(1500);
                product63.setQuantity(1900);
                
                Product product64 = s2.getProductDirectory().addProduct();
                product64.setProdName("Bed Frame");
                product64.setProdType("Mahogany");
                product64.setProdPrice(2500);
                product64.setCordUsed(1250);
                product64.setQuantity(1800);
                
                Product product65 = s2.getProductDirectory().addProduct();
                product65.setProdName("Bed Frame");
                product65.setProdType("Maple-nut Wood");
                product65.setProdPrice(870);
                product65.setCordUsed(1250);
                product65.setQuantity(1000);
                
                Product product66 = s2.getProductDirectory().addProduct();
                product66.setProdName("Bed Frame");
                product66.setProdType("Pine wood");
                product66.setProdPrice(490);
                product66.setCordUsed(1250);
                product66.setQuantity(1780);
                
                Product product67 = s2.getProductDirectory().addProduct();
                product67.setProdName("Bed Frame");
                product67.setProdType("Iron Wood");
                product67.setProdPrice(530);
                product67.setCordUsed(1200);
                product67.setQuantity(1800);
                
                Product product68 = s2.getProductDirectory().addProduct();
                product68.setProdName("Bed Frame");
                product68.setProdType("Bamboo");
                product68.setProdPrice(280);
                product68.setCordUsed(400);
                product68.setQuantity(1840);
                
                Product product69 = s2.getProductDirectory().addProduct();
                product69.setProdName("Bed Frame");
                product69.setProdType("TeakWood");
                product69.setProdPrice(880);
                product69.setCordUsed(1300);
                product69.setQuantity(1800);
                
                Product product70 = s2.getProductDirectory().addProduct();
                product70.setProdName("Bed Frame");
                product70.setProdType("Sandalwood");
                product70.setProdPrice(1600);
                product70.setCordUsed(1350);
                product70.setQuantity(1700);
                
                Product product71 = s2.getProductDirectory().addProduct();
                product71.setProdName("Bed Frame");
                product71.setProdType("Rosewood");
                product71.setProdPrice(750);
                product71.setCordUsed(1110);
                product71.setQuantity(1300);
                Product product72 = s2.getProductDirectory().addProduct();
                product72.setProdName("TV Unit");
                product72.setProdType("Mahogany");
                product72.setProdPrice(3700);
                product72.setCordUsed(1350);
                product72.setQuantity(1900);
                
                Product product73 = s2.getProductDirectory().addProduct();
                product73.setProdName("TV Unit");
                product73.setProdType("Maple-nut Wood");
                product73.setProdPrice(820);
                product73.setCordUsed(1200);
                product73.setQuantity(1130);
                
                Product product74 = s2.getProductDirectory().addProduct();
                product74.setProdName("TV Unit");
                product74.setProdType("Pine wood");
                product74.setProdPrice(490);
                product74.setCordUsed(800);
                product74.setQuantity(1450);
                
                Product product75 = s2.getProductDirectory().addProduct();
                product75.setProdName("TV Unit");
                product75.setProdType("Iron Wood");
                product75.setProdPrice(590);
                product75.setCordUsed(1160);
                product75.setQuantity(1890);
                
                Product product76 = s2.getProductDirectory().addProduct();
                product76.setProdName("TV Unit");
                product76.setProdType("Bamboo");
                product76.setProdPrice(280);
                product76.setCordUsed(750);
                product76.setQuantity(1600);
                
                Product product77 = s2.getProductDirectory().addProduct();
                product77.setProdName("TV Unit");
                product77.setProdType("TeakWood");
                product77.setProdPrice(890);
                product77.setCordUsed(1540);
                product77.setQuantity(1740);
                
                Product product78 = s.getProductDirectory().addProduct();
                product78.setProdName("TV Unit");
                product78.setProdType("Sandalwood");
                product78.setProdPrice(1600);
                product78.setCordUsed(1750);
                product78.setQuantity(1580);
                
                Product product79 = s2.getProductDirectory().addProduct();
                product79.setProdName("TV Unit");
                product79.setProdType("Rosewood");
                product79.setProdPrice(690);
                product79.setCordUsed(780);
                product79.setQuantity(1630);
                
                Product product80 = s2.getProductDirectory().addProduct();
                product80.setProdName("Racks");
                product80.setProdType("Mahogany");
                product80.setProdPrice(1900);
                product27.setCordUsed(630);
                product27.setQuantity(1750);
                
                Product product81 = s2.getProductDirectory().addProduct();
                product81.setProdName("Racks");
                product81.setProdType("Maple-nut Wood");
                product81.setProdPrice(760);
                product81.setCordUsed(1900);
                product81.setQuantity(1350);
                
                Product product82 = s2.getProductDirectory().addProduct();
                product82.setProdName("Racks");
                product82.setProdType("Pine wood");
                product82.setProdPrice(480);
                product82.setCordUsed(1750);
                product82.setQuantity(1900);
                
                Product product83 = s2.getProductDirectory().addProduct();
                product83.setProdName("Racks");
                product83.setProdType("Iron Wood");
                product83.setProdPrice(590);
                product83.setCordUsed(785);
                product83.setQuantity(1420);
                
                Product product84 = s2.getProductDirectory().addProduct();
                product84.setProdName("Racks");
                product84.setProdType("Bamboo");
                product84.setProdPrice(280);
                product84.setCordUsed(200);
                product84.setQuantity(1900);
                
                Product product85 = s2.getProductDirectory().addProduct();
                product85.setProdName("Racks");
                product85.setProdType("TeakWood");
                product85.setProdPrice(830);
                product85.setCordUsed(1600);
                product85.setQuantity(1790);
                
                Product product86 = s2.getProductDirectory().addProduct();
                product86.setProdName("Racks");
                product86.setProdType("Sandalwood");
                product86.setProdPrice(1235);
                product86.setCordUsed(1260);
                product86.setQuantity(1564);
                
                Product product87 = s2.getProductDirectory().addProduct();
                product87.setProdName("Racks");
                product87.setProdType("Rosewood");
                product87.setProdPrice(690);
                product87.setCordUsed(1350);
                product87.setQuantity(1780);
                
                Product product88 = s2.getProductDirectory().addProduct();
                product88.setProdName("Decorative Overlays");
                product88.setProdType("Mahogany");
                product88.setProdPrice(3500);
                product88.setCordUsed(2540);
                product88.setQuantity(1465);
                
                Product product89 = s2.getProductDirectory().addProduct();
                product89.setProdName("Decorative Overlays");
                product89.setProdType("Maple-nut Wood");
                product89.setProdPrice(870);
                product89.setCordUsed(1780);
                product89.setQuantity(1850);
                
                Product product90 = s2.getProductDirectory().addProduct();
                product90.setProdName("Decorative Overlays");
                product90.setProdType("Pine wood");
                product90.setProdPrice(490);
                product90.setCordUsed(1450);
                product90.setQuantity(1900);
                
                Product product91 = s2.getProductDirectory().addProduct();
                product91.setProdName("Decorative Overlays");
                product91.setProdType("Iron Wood");
                product91.setProdPrice(650);
                product91.setCordUsed(1300);
                product91.setQuantity(1600);
                
                Product product92 = s2.getProductDirectory().addProduct();
                product92.setProdName("Decorative Overlays");
                product92.setProdType("Bamboo");
                product92.setProdPrice(295);
                product92.setCordUsed(400);
                product92.setQuantity(1960);
                
                Product product93 = s2.getProductDirectory().addProduct();
                product93.setProdName("Decorative Overlays");
                product93.setProdType("TeakWood");
                product93.setProdPrice(830);
                product93.setCordUsed(1300);
                product93.setQuantity(1600);
                
                Product product94 = s2.getProductDirectory().addProduct();
                product94.setProdName("Decorative Overlays");
                product94.setProdType("Sandalwood");
                product94.setProdPrice(1400);
                product94.setCordUsed(1600);
                product94.setQuantity(1990);
                
                Product product95 = s2.getProductDirectory().addProduct();
                product95.setProdName("Decorative Overlays");
                product95.setProdType("Rosewood");
                product95.setProdPrice(715);
                product95.setCordUsed(1750);
                product95.setQuantity(1700);
                
                Supplier s3 = network.getSupplierDirectory().addSupplier();
                s3.setSupplierName("P3");
                s3.setSupplierID(102);
                s3.setSupplierRating("*****");                
                
                
                
                Product product111 = s3.getProductDirectory().addProduct();
                product111.setProdName("Chairs");
                product111.setProdType("TeakWood");
                product111.setProdPrice(775);
                product111.setCordUsed(1850);
                product111.setQuantity(1900);

                Product product222 = s3.getProductDirectory().addProduct();
                product222.setProdName("Chairs");
                product222.setProdType("Sandalwood");
                product222.setProdPrice(900);
                product222.setCordUsed(1750);
                product222.setQuantity(1880);

                Product product333 = s3.getProductDirectory().addProduct();
                product333.setProdName("Chairs");
                product333.setProdType("RoseWood");
                product333.setProdPrice(1200);
                product333.setCordUsed(1450);
                product333.setQuantity(1900);

                Product product444 = s3.getProductDirectory().addProduct();
                product444.setProdName("Chairs");
                product444.setProdType("Bamboo");
                product444.setProdPrice(165);
                product444.setCordUsed(700);
                product444.setQuantity(1860);
                
                 Product product555 = s3.getProductDirectory().addProduct();
                product555.setProdName("Tables");
                product555.setProdType("Bamboo");
                product555.setProdPrice(355);
                product555.setCordUsed(500);
                product555.setQuantity(1780);
                
                Product product666 = s3.getProductDirectory().addProduct();
                product666.setProdName("Wooden Frames");
                product666.setProdType("Bamboo");
                product666.setProdPrice(155);
                product666.setCordUsed(500);
                product666.setQuantity(1800);
                
                Product product777 = s3.getProductDirectory().addProduct();
                product777.setProdName("Desks");
                product777.setProdType("Bamboo");
                product777.setProdPrice(285);
                product777.setCordUsed(190);
                product777.setQuantity(1650);
                
                Product product888 = s3.getProductDirectory().addProduct();
                product888.setProdName("Tables");
                product888.setProdType("Teakwood");
                product888.setProdPrice(495);
                product888.setCordUsed(850);
                product888.setQuantity(1350);
                
                Product product96 = s3.getProductDirectory().addProduct();
                product96.setProdName("CupBoard");
                product96.setProdType("Mahogany");
                product96.setProdPrice(2600);
                product96.setCordUsed(720);
                product96.setQuantity(1980);
                
                Product product97 = s3.getProductDirectory().addProduct();
                product97.setProdName("CupBoard");
                product97.setProdType("Maple-nut Wood");
                product97.setProdPrice(790);
                product97.setCordUsed(700);
                product97.setQuantity(1865);
                
                Product product98 = s3.getProductDirectory().addProduct();
                product98.setProdName("CupBoard");
                product98.setProdType("Pine wood");
                product98.setProdPrice(480);
                product98.setCordUsed(730);
                product98.setQuantity(1900);
                
                Product product99 = s3.getProductDirectory().addProduct();
                product99.setProdName("CupBoard");
                product99.setProdType("Iron Wood");
                product99.setProdPrice(580);
                product99.setCordUsed(710);
                product99.setQuantity(1756);
                
                Product product100 = s3.getProductDirectory().addProduct();
                product100.setProdName("CupBoard");
                product100.setProdType("Bamboo");
                product100.setProdPrice(230);
                product100.setCordUsed(700);
                product100.setQuantity(1678);
                
                Product product101 = s3.getProductDirectory().addProduct();
                product101.setProdName("CupBoard");
                product101.setProdType("TeakWood");
                product101.setProdPrice(830);
                product101.setCordUsed(1730);
                
                Product product102 = s3.getProductDirectory().addProduct();
                product102.setProdName("CupBoard");
                product102.setProdType("Sandalwood");
                product102.setProdPrice(1200);
                product102.setCordUsed(1730);
                
                Product product103 = s3.getProductDirectory().addProduct();
                product103.setProdName("CupBoard");
                product103.setProdType("Rosewood");
                product103.setProdPrice(680);
                product103.setCordUsed(1740);
                
                Product product104 = s3.getProductDirectory().addProduct();
                product104.setProdName("Bed Frame");
                product104.setProdType("Mahogany");
                product104.setProdPrice(2300);
                product104.setCordUsed(950);
                product104.setQuantity(1250);
                
                Product product105 = s3.getProductDirectory().addProduct();
                product105.setProdName("Bed Frame");
                product105.setProdType("Maple-nut Wood");
                product105.setProdPrice(780);
                product105.setCordUsed(970);
                product105.setQuantity(1690);
                
                Product product106 = s3.getProductDirectory().addProduct();
                product106.setProdName("Bed Frame");
                product106.setProdType("Pine wood");
                product106.setProdPrice(480);
                product106.setCordUsed(980);
                product106.setQuantity(1780);
                
                Product product107 = s3.getProductDirectory().addProduct();
                product107.setProdName("Bed Frame");
                product107.setProdType("Iron Wood");
                product107.setProdPrice(580);
                product107.setCordUsed(990);
                product107.setQuantity(1980);
                
                Product product108 = s3.getProductDirectory().addProduct();
                product108.setProdName("Bed Frame");
                product108.setProdType("Bamboo");
                product108.setProdPrice(280);
                product108.setCordUsed(940);
                product108.setQuantity(1350);
                
                Product product109 = s3.getProductDirectory().addProduct();
                product109.setProdName("Bed Frame");
                product109.setProdType("TeakWood");
                product109.setProdPrice(880);
                product109.setCordUsed(970);
                product109.setQuantity(1660);
                
                Product product110 = s3.getProductDirectory().addProduct();
                product110.setProdName("Bed Frame");
                product110.setProdType("Sandalwood");
                product110.setProdPrice(1700);
                product110.setCordUsed(1000);
                product110.setQuantity(1750);
                
                Product product112 = s3.getProductDirectory().addProduct();
                product112.setProdName("Bed Frame");
                product112.setProdType("Rosewood");
                product112.setProdPrice(800);
                product112.setCordUsed(990);
                product112.setQuantity(1780);
                
                Product product113 = s3.getProductDirectory().addProduct();
                product113.setProdName("TV Unit");
                product113.setProdType("Mahogany");
                product113.setProdPrice(2900);
                product113.setCordUsed(1000);
                product113.setQuantity(1780);
                
                Product product114 = s3.getProductDirectory().addProduct();
                product114.setProdName("TV Unit");
                product114.setProdType("Maple-nut Wood");
                product114.setProdPrice(890);
                product114.setCordUsed(1020);
                product114.setQuantity(1989);
                
                Product product115 = s3.getProductDirectory().addProduct();
                product115.setProdName("TV Unit");
                product115.setProdType("Pine wood");
                product115.setProdPrice(570);
                product115.setCordUsed(950);
                product115.setQuantity(1780);
                
                Product product116 = s3.getProductDirectory().addProduct();
                product116.setProdName("TV Unit");
                product116.setProdType("Iron Wood");
                product116.setProdPrice(480);
                product116.setCordUsed(990);
                product116.setQuantity(1690);
                
                Product product117 = s3.getProductDirectory().addProduct();
                product117.setProdName("TV Unit");
                product117.setProdType("Bamboo");
                product117.setProdPrice(270);
                product117.setCordUsed(880);
                product117.setQuantity(1785);
                
                Product product118 = s3.getProductDirectory().addProduct();
                product118.setProdName("TV Unit");
                product118.setProdType("TeakWood");
                product118.setProdPrice(850);
                product118.setCordUsed(900);
                product118.setQuantity(1690);
                
                Product product119 = s3.getProductDirectory().addProduct();
                product119.setProdName("TV Unit");
                product119.setProdType("Sandalwood");
                product119.setProdPrice(1800);
                product119.setCordUsed(880);
                product119.setQuantity(1758);
                
                Product product120 = s3.getProductDirectory().addProduct();
                product120.setProdName("TV Unit");
                product120.setProdType("Rosewood");
                product120.setProdPrice(690);
                product120.setCordUsed(820);
                product120.setQuantity(1770);
                
                Product product121 = s3.getProductDirectory().addProduct();
                product121.setProdName("Racks");
                product121.setProdType("Mahogany");
                product121.setProdPrice(1900);
                product121.setCordUsed(650);
                product121.setQuantity(1860);
                
                Product product122 = s3.getProductDirectory().addProduct();
                product122.setProdName("Racks");
                product122.setProdType("Maple-nut Wood");
                product122.setProdPrice(810);
                product122.setCordUsed(780);
                product122.setQuantity(1690);
                
                Product product123 = s3.getProductDirectory().addProduct();
                product123.setProdName("Racks");
                product123.setProdType("Pine wood");
                product123.setProdPrice(480);
                product123.setCordUsed(790);
                product123.setQuantity(1956);
                
                Product product124 = s3.getProductDirectory().addProduct();
                product124.setProdName("Racks");
                product124.setProdType("Iron Wood");
                product124.setProdPrice(590);
                product124.setCordUsed(800);
                product124.setQuantity(1986);
                
                Product product125 = s3.getProductDirectory().addProduct();
                product125.setProdName("Racks");
                product125.setProdType("Bamboo");
                product125.setProdPrice(280);
                product125.setCordUsed(780);
                product125.setQuantity(1050);
                
                Product product126 = s3.getProductDirectory().addProduct();
                product126.setProdName("Racks");
                product126.setProdType("TeakWood");
                product126.setProdPrice(920);
                product126.setCordUsed(800);
                product126.setQuantity(1980);
                
                Product product127 = s3.getProductDirectory().addProduct();
                product127.setProdName("Racks");
                product127.setProdType("Sandalwood");
                product127.setProdPrice(1205);
                product127.setCordUsed(820);
                product127.setQuantity(1986);
                
                Product product128 = s3.getProductDirectory().addProduct();
                product128.setProdName("Racks");
                product128.setProdType("Rosewood");
                product128.setProdPrice(780);
                product128.setCordUsed(825);
                product128.setQuantity(1475);
                
                Product product129 = s3.getProductDirectory().addProduct();
                product129.setProdName("Decorative Overlays");
                product129.setProdType("Mahogany");
                product129.setProdPrice(3000);
                product129.setCordUsed(830);
                product129.setQuantity(1475);
                
                Product product130 = s3.getProductDirectory().addProduct();
                product130.setProdName("Decorative Overlays");
                product130.setProdType("Maple-nut Wood");
                product130.setProdPrice(890);
                product130.setCordUsed(820);
                product130.setQuantity(1980);
                
                Product product131 = s3.getProductDirectory().addProduct();
                product131.setProdName("Decorative Overlays");
                product131.setProdType("Pine wood");
                product131.setProdPrice(490);
                product131.setCordUsed(710);
                product131.setQuantity(1870);
                
                Product product132 = s3.getProductDirectory().addProduct();
                product132.setProdName("Decorative Overlays");
                product132.setProdType("Iron Wood");
                product132.setProdPrice(800);
                product132.setCordUsed(740);
                product132.setQuantity(1850);
                
                Product product133 = s3.getProductDirectory().addProduct();
                product133.setProdName("Decorative Overlays");
                product133.setProdType("Bamboo");
                product133.setProdPrice(295);
                product133.setCordUsed(600);
                product133.setQuantity(1980);
                
                Product product134 = s3.getProductDirectory().addProduct();
                product134.setProdName("Decorative Overlays");
                product134.setProdType("TeakWood");
                product134.setProdPrice(840);
                product134.setCordUsed(880);
                product134.setQuantity(1980);
                
                Product product135 = s3.getProductDirectory().addProduct();
                product135.setProdName("Decorative Overlays");
                product135.setProdType("Sandalwood");
                product135.setProdPrice(1400);
                product135.setCordUsed(780);
                product135.setQuantity(1789);
                
                Product product136 = s.getProductDirectory().addProduct();
                product136.setProdName("Decorative Overlays");
                product136.setProdType("Rosewood");
                product136.setProdPrice(795);
                product136.setCordUsed(420);
                product136.setQuantity(1980);

                
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
