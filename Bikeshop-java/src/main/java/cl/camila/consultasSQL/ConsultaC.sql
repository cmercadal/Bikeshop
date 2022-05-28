-- c) Cantidad de productos por cada categoría
SELECT categories.category_id, categories.category_name, count(category_name) AS count
FROM categories
INNER JOIN products on products.category_id =categories.category_id
GROUP BY category_name
ORDER BY count DESC;