-- INNER JOIN AEROLINEAS/AVIONES

SELECT * FROM aerolineas JOIN aviones
ON aerolineas.id_aerolinea = aviones.id_aerolinea_fk;


-- INNER JOIN (AVIONES-VUELOS)

SELECT a.modelo, v.fecha_salida, v.fecha_llegada, v.origen, v.destino FROM aviones a JOIN vuelos v
ON a.id_avion = v.id_avion_fk;

-- PASAJEROS -- BOLETOS

SELECT p.nombre, p.apellido, b.asiento, v.origen, v.destino FROM pasajeros p JOIN boletos b
ON p.id_pasajero = b.id_pasajero_fk JOIN vuelos v
ON b.id_vuelo_fk = v.id_vuelo;

SELECT * FROM pasajeros p JOIN boletos b
ON p.id_pasajero = b.id_pasajero_fk JOIN vuelos v
ON b.id_vuelo_fk = v.id_vuelo;

-- LEFT JOIN


SELECT * FROM aerolineas a LEFT JOIN aviones av
ON a.id_aerolinea = av.id_aerolinea_fk;

-- PASAJEROS -- BOLETOS

SELECT * FROM pasajeros p LEFT JOIN boletos b
ON p.id_pasajero = b.id_pasajero_fk;


-- LEFT OUTTER JOIN
SELECT * FROM pasajeros p LEFT JOIN boletos b
ON p.id_pasajero = b.id_pasajero_fk WHERE b.id_pasajero_fk IS NULL;


-- LEFT OUTTER JOIN (AEROLINEAS CON AVIONES)
-- AEROLINEAS QUE NO TIENEN AVIONES

SELECT * FROM aerolineas a LEFT JOIN aviones av
ON a.id_aerolinea = av.id_aerolinea_fk WHERE av.id_aerolinea_fk IS NULL;


-- DELETE AEROLINEA

DELETE FROM aerolineas WHERE id_aerolinea = 20;