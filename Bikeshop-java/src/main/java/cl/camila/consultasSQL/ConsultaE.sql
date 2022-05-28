-- e) Inventario para tienda Santa Cruz Bike de productos en categoría Electric Bikes
SELECT stores.store_name, products.product_id, products.product_name,
SUM(stocks.quantity) AS quantity
FROM products
INNER JOIN stocks on stocks.product_id = products.product_id
INNER JOIN categories on categories.category_id = products.category_id
INNER JOIN stores on stores.store_id = stocks.store_id
WHERE stores.store_name = 'Santa Cruz Bikes' AND categories.category_name = 'Electric Bikes'
GROUP BY product_id
ORDER BY quantity DESC;