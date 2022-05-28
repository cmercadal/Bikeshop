-- d)Cantidad de inventario de productos por marca
SELECT brands.brand_id, brands.brand_name, SUM(stocks.quantity) as SUMA
FROM brands	
INNER JOIN products on products.brand_id = brands.brand_id
INNER JOIN stocks on stocks.product_id = products.product_id
GROUP BY brands.brand_id
ORDER BY suma DESC;