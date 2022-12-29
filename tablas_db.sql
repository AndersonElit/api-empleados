
-- public.empleado definition

-- Drop table

-- DROP TABLE public.empleado;

CREATE TABLE public.empleado (
	id serial4 NOT NULL,
	fecha_ingreso date NULL,
	nombre varchar(250) NULL,
	salario int4 NULL,
	CONSTRAINT empleado_pkey PRIMARY KEY (id)
);

-- public.solicitud definition

-- Drop table

-- DROP TABLE public.solicitud;

CREATE TABLE public.solicitud (
	id serial4 NOT NULL,
	codigo varchar(250) NULL,
	descripcion varchar(250) NULL,
	resumen varchar(250) NULL,
	id_empleado int4 NULL,
	CONSTRAINT solicitud_pkey PRIMARY KEY (id)
);


-- public.solicitud foreign keys

ALTER TABLE public.solicitud ADD CONSTRAINT fk_empleado FOREIGN KEY (id_empleado) REFERENCES public.empleado(id);
