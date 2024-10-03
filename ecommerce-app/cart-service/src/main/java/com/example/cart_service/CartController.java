package com.example.cart_service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    private final List<Item> cart = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Item>> getCart() {
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Item> addToCart(@RequestBody Item item) {
        cart.add(item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }
}


