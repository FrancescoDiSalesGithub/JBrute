create table assignment_user
(

	email varchar(200),
	IP varchar(14),
	foreign key(email) references users(email),
	foreign key(IP) references machine(IP)

);
