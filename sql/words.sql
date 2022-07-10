create table words
(

	id serial,
	value varchar(200),
	fk_dictionary varchar(200),
	
	primary key(id),
	foreign key(fk_dictionary) references dictionary(mnenonic_name)

);
