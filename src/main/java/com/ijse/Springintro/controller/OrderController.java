package com.ijse.Springintro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.Springintro.dto.OrderDTO;
//import com.ijse.Springintro.dto.OrderDTO;
import com.ijse.Springintro.entity.Order;
import com.ijse.Springintro.entity.Product;
import com.ijse.Springintro.service.OrderService;
import com.ijse.Springintro.service.ProductService;

@RestController
@CrossOrigin(origins="*")
public class OrderController {
   
    @Autowired
    private OrderService orderService;

    @Autowired

    private ProductService productService;
   
    @GetMapping("/orders")
    public ResponseEntity<List<Order>>getAllOrders(){

        List<Order>orders=orderService.getAllOrders();

       

        return ResponseEntity.status(200). body(orders);        
    }

    @PostMapping("/orders")
     public ResponseEntity<Order> createOrder (@RequestBody OrderDTO orderDTO){
        Order  order= new Order();
        
        order.setTotalPrice(0.0);
        
        List<Long> productIds= orderDTO.getProductIds();


        List<Product> orderedProducts= new ArrayList<>();
        
        productIds.forEach (productId ->{

            Product product=productService.getProductById(productId);
            //add this product id to order

            if (product!=null) {

                orderedProducts.add(product);

                //order.getOrderedProducts().add(product);
                order.setTotalPrice(order.getTotalPrice() + product.getPrice());
                
            }

        });

            order.setOrderedProducts(orderedProducts);

        //save the order in DB

        orderService.createOrder(order);
        return ResponseEntity.status(201).body(order);

     }
    
}
