package com.java.pdfgeneration;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.java.model.*;

public class OrderHelper {

    public static Order getOrder() {
        Order order = new Order();
        order.setOrderId(1234);
        order.setDate("2022-10-25");
        Address address = new Address();
        address.setCity("MADURAI");
        address.setStreet("2  Vaigai Street");
        address.setZipCode("625002");
        address.setState("TAMIL NADU");
        Account account = new Account();
        account.setPhoneNumber("671-363-6415");
        account.setEmail("abc@gmail.com");
        account.setName("Mr. Suresh Raina");
        account.setAddress(address);
        order.setAccount(account);

        List<Item> items = new ArrayList<>();
        order.setItems(items);
        Item item1 = new Item();
        item1.setName("CSK IPL Jersy");
        item1.setPrice(BigDecimal.valueOf(9.99));
        item1.setQuantity(3);
        item1.setSku("100034");
        items.add(item1);
        Item item2 = new Item();
        item2.setName("Mumbai IPL Jersy");
        item2.setPrice(BigDecimal.valueOf(12.49));
        item2.setSku("100075");
        item2.setQuantity(3);

        items.add(item2);
        Item item3 = new Item();
        item3.setName("Grey Sports Shoes");
        item3.setPrice(BigDecimal.valueOf(14.49));
        item3.setSku("100022");
        item3.setQuantity(1);
        items.add(item3);

        Payment payment = new Payment();
        BigDecimal totalPrice = items.stream().map(item -> item.getPrice().multiply(BigDecimal.valueOf(item.getQuantity()))).reduce(BigDecimal.ZERO, BigDecimal::add);
        payment.setAmount(totalPrice);
        payment.setCardNumber("4111111111111111");
        payment.setCvv("123");
        payment.setMonth("04");
        payment.setYear("2030");
        order.setPayment(payment);
        return order;
    }
}
