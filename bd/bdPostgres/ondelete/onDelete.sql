-- on delete set null

CREATE TABLE IF NOT EXISTS profesores(
    id_profesor SERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS cursos(
    id_curso SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    id_profesor_fk INT,

    FOREIGN KEY(id_profesor_fk) REFERENCES profesores(id_profesor) ON DELETE SET NULL
);

INSERT INTO profesores(nombre, apellido) VALUES
('george', 'maxi'),
('jose', 'beltran');

SELECT * FROM profesores;


INSERT INTO cursos(nombre, id_profesor_fk) VALUES
('MATEMATICA', 1),
('FISICA', 1),
('PROGRAMACION',2),
('ESTADISTICA', 1);


SELECT * FROM cursos;

DELETE FROM profesores WHERE id_profesor = 1;


-- ON DELETE CASCADE

CREATE TABLE orders(
    order_id SERIAL PRIMARY KEY,
    order_date DATE NOT NULL,
    descripcion VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS items_order(
    id_item_order SERIAL PRIMARY KEY, 
    producto VARCHAR(255),
    cantidad INT,
    precio FLOAT,
    order_id_fk INT,

    FOREIGN KEY(order_id_fk) REFERENCES orders(order_id) ON DELETE CASCADE
);

INSERT INTO orders(order_date, descripcion) VALUES
('2025-12-12', 'descripcion1'),
('2025-11-12', 'descripcion2'),
('2025-10-12', 'descripcion3'),
('2025-12-10', 'descripcion4'),
('2025-12-22', 'descripcion5')

SELECT * FROM orders

INSERT INTO items_order(producto, cantidad, precio, order_id_fk) VALUES
('Laptop HP', 2, 1999, 1),
('Impresora Canon', 5, 800, 1),
('Teclado Logitech', 2, 300, 1),
('Celular Xiaomi', 1, 1500, 2),
('Cargador Portatil', 4, 200, 1)


SELECT * FROM items_order;


DELETE FROM orders WHERE order_id = 1;


