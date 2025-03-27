CREATE TABLE IF NOT EXISTS usuario(
    usuario_id SERIAL PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    email VARCHAR(255) NOT NULL,
    password(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS articulo(
    articulo_id SERIAL PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL, 
    contenido TEXT NOT NULL
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