
INSERT INTO TBL_CATEGORY (category_name, description) VALUES
('Breakfast','for breakfast'),
('Lunch', 'for Lunch'),
('Shakes', 'for shakes');

INSERT INTO TBL_PRODUCT(product_name, description, price, image_url, category_id)
    VALUES('buttermilk pancakes', 'I''m baby woke mlkshk wolf bitters live-edge blue bottle, hammock freegan copper mug whatever cold-pressed', '15.99', 'test', 100),
    ('diner double', 'vaporware iPhone mumblecore selvage raw denim slow-carb leggings gochujang helvetica man braid jianbing. Marfa thundercats', '13.99', 'test', 102),
    ('godzilla milkshake', 'ombucha chillwave fanny pack 3 wolf moon street art photo booth before they sold out organic viral.', '6.99', 'test', 101),
    ('country delight', 'Shabby chic keffiyeh neutra snackwave pork belly shoreditch. Prism austin mlkshk truffaut', '20.99', 'test', 100),
    ('egg attack', 'franzen vegan pabst bicycle rights kickstarter pinterest meditation farm-to-table 90''s pop-up', '22.99', 'test', 102),
    ('oreo dream', 'Portland chicharrones ethical edison bulb, palo santo craft beer chia heirloom iPhone everyday', '18.99', 'test', 101),
    ('bacon overflow', 'carry jianbing normcore freegan. Viral single-origin coffee live-edge, pork belly cloud bread iceland put a bird ', '8.99', 'test', 100),
    ('american classic', 'on it tumblr kickstarter thundercats migas everyday carry squid palo santo leggings. Food truck truffaut', '12.99', 'test', 102),
    ('quarantine buddy', 'skateboard fam synth authentic semiotics. Live-edge lyft af, edison bulb yuccie crucifix microdosing.', '16.99', 'test', 101);

-- INSERT INTO TBL_EMPLOYEES (first_name, last_name, email) VALUES
--   ('Lokesh', 'Gupta', 'abc@gmail.com'),
--   ('Deja', 'Vu', 'xyz@email.com'),
--   ('Caption', 'America', 'cap@marvel.com');