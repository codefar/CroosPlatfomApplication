package org.greenleaf.domain;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Property;
import org.greenrobot.greendao.generator.Schema;
import org.greenrobot.greendao.generator.ToMany;

import java.io.File;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/8/3
 * time: 11:54
 */

public class ExampleDaoGenerator {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1000, "de.greenrobot.daoexample");
        addBase(schema);
        addNote(schema);
        addCustomerOrder(schema);
        new File("../src/main/java").mkdirs();
        new DaoGenerator().generateAll(schema, "../src/main/java");
    }

    private static void addBase(Schema schema) {
        Entity note = schema.addEntity("BaseBean");
        note.addIdProperty().autoincrement();
        note.addStringProperty("text").notNull();
        note.addStringProperty("comment");
        note.addDateProperty("createTime");
        note.addDateProperty("updateTime");
    }

    private static void addNote(Schema schema) {
        Entity note = schema.addEntity("Note");
        note.setSuperclass("de.greenrobot.daoexample.BaseBean");
        note.addStringProperty("name").notNull();
        note.addStringProperty("context").notNull();
    }

    private static void addCustomerOrder(Schema schema) {
        Entity customer = schema.addEntity("Customer");
        customer.addIdProperty();
        customer.addStringProperty("name").notNull();

        Entity order = schema.addEntity("Order");
        order.setDbName("ORDERS"); // "ORDER" is a reserved keyword
        order.addIdProperty();
        Property orderDate = order.addDateProperty("date").getProperty();
        Property customerId = order.addLongProperty("customerId").notNull().getProperty();
        order.addToOne(customer, customerId);

        ToMany customerToOrders = customer.addToMany(order, customerId);
        customerToOrders.setName("orders");
        customerToOrders.orderAsc(orderDate);
    }
}
