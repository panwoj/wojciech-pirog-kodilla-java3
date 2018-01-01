package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Product product3 = new Product("Product 3");
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Item item1 = new Item(new BigDecimal("300.00"), 20);
        Item item2 = new Item(new BigDecimal("300.00"), 50);
        Item item3 = new Item(new BigDecimal("5000.00"), 3);
        Item item4 = new Item(new BigDecimal("20.00"), 200);
        Item item5 = new Item(new BigDecimal("20.00"), 100);

        Invoice invoice = new Invoice("1234567899");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);

        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);
        item4.setProduct(product3);
        item5.setProduct(product3);

        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item3);
        product3.getItems().add(item4);
        product3.getItems().add(item5);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.delete(id);
    }

}
