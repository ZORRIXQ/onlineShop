package com.zorrix.onlineShop;

import jakarta.persistence.*;
import lombok.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

@Getter @Setter
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
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private int price;

    @Lob
    @Column(name = "image")
    private byte[] image;

    public Product(String name, String description, int price, File image) throws IOException {
        this.name = name;
        this.description = description;
        this.price = price;
        FileInputStream fis = new FileInputStream(image);
        this.image = fis.readAllBytes();

    }

    public Image bytesToimage() throws IOException {

        return ImageIO.read(new ByteArrayInputStream(this.image));
    }
}
