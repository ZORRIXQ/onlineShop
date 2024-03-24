package com.zorrix.onlineShop;

import jakarta.persistence.*;
import lombok.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    @Setter
    private String name;

    @Column(name = "description")
    @Setter
    private String description;

    @Column(name = "price", nullable = false)
    @Setter
    private int price;

    @Lob
    @Column(name = "image")
    @Setter
    private byte[] image;

    public Product(String name, String description, int price, File image) throws IOException {
        this.name = name;
        this.description = description;
        this.price = price;
        FileInputStream fis = new FileInputStream(image);
        this.image = fis.readAllBytes();
    }
//
//    public Product(){
//        this.id = 0;
//        this.description = null;
//        this.name = null;
//        this.price = 0;
//    }

//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public int getPrice() {
//        return price;
//    }
}
