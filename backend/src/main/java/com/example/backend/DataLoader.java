package com.example.backend;

import java.util.List;

import javax.annotation.PostConstruct;

import com.example.backend.entity.Category;
import com.example.backend.entity.Product;
import com.example.backend.repository.CategoryRepository;
import com.example.backend.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class DataLoader {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public DataLoader(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

     @PostConstruct
     private void loadData() {
     Category breakfast = new Category("Breakfast", "for breakfast");
     Category lunch = new Category("Lunch", "for lunch");
     Category shakes = new Category("Shakes", "for shakes");

     categoryRepository.save(breakfast);
     categoryRepository.save(lunch);
     categoryRepository.save(shakes);

     productRepository.saveAll(List.of(new Product("buttermilk pancakes",
     "I'm baby woke mlkshk wolf bitters live-edge blue bottle, hammock freegancopper mug whatever cold-pressed",
     15.99, "t est", breakfast),
     new Product("diner double",
     "vaporware iPhone mumblecore selvage raw denim slow-carb leggings gochujang " +
             "helvetica man braid jianbing. Marfa thundercats",13.99, "test", shakes),
     new Product("godzilla milkshake",
             "ombucha chillwave fanny pack 3 wolf moon street art photo booth before they " +
                     "sold out organic viral.",6.99, "test", lunch),
     new Product("country delight",
             "Shabby chic keffiyeh neutra snackwave pork belly shoreditch. " +
                     "Prism austin mlkshk truffaut",20.99,
             "shorturl.at/ilmKQ",
             breakfast),
     new Product("egg attack",
     "franzen vegan pabst bicycle rights kickstarter pinterest meditation" +
             " farm-to-table 90's pop-up",22.99, "test", shakes),
     new Product("oreo dream",
     "Portland chicharrones ethical edison bulb, palo santo craft beer chia" +
             " heirloom iPhone everyday",18.99, "test", lunch),
     new Product("bacon overflow",
             "carry jianbing normcore freegan. Viral single-origin coffee live-edge," +
                     " pork belly cloud bread iceland put a bird ",8.99, "test", breakfast),
     new Product("american classic",
             "on it tumblr kickstarter thundercats migas everyday carry squid palo santo leggings." +
                     " Food truck truffaut",12.99, "test", shakes),
     new Product("quarantine buddy",
     "skateboard fam synth authentic semiotics. Live-edge lyft af, edison bulb" +
             " yuccie crucifix microdosing.",16.99, "test", lunch)));
     }

}
