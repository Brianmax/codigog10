CREATE TABLE IF NOT EXISTS usuario(
    usuario_id SERIAL PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS articulo(
    articulo_id SERIAL PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL, 
    contenido TEXT NOT NULL,
    usuario_id_fk INT,

    FOREIGN KEY(usuario_id_fk) REFERENCES usuario(usuario_id)
);

CREATE TABLE IF NOT EXISTS comentario(
    comentario_id SERIAL PRIMARY KEY,
    contenido TEXT NOT NULL,
    usuario_id_fk INT,
    articulo_id_fk INT,

    FOREIGN KEY(usuario_id_fk) REFERENCES usuario(usuario_id),
    FOREIGN KEY(articulo_id_fk) REFERENCES articulo(articulo_id)
);

CREATE TABLE IF NOT EXISTS categoria(
    categoria_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) UNIQUE NOT NULL,
    descripcion VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS topics(
    topic_id SERIAL PRIMARY KEY, 
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255),
    categoria_id_fk INT,

    FOREIGN KEY(categoria_id_fk) REFERENCES categoria(categoria_id)
);

CREATE TABLE IF NOT EXISTS articulo_categoria(
    articulo_id_fk INT,
    categoria_id_fk INT,
    
    FOREIGN KEY(articulo_id_fk) REFERENCES articulo(articulo_id),
    FOREIGN KEY(categoria_id_fk) REFERENCES categoria(categoria_id)
);

ALTER TABLE categoria ADD CONSTRAINT order_unique UNIQUE (nombre);
ALTER TABLE categoria ADD CONSTRAINT not_null UNIQUE (nombre);