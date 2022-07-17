create table brute.machine_user
(

	email varchar(200),
	IP varchar(14),
	foreign key(email) references brute.users(email),
	foreign key(IP) references brute.machine(IP)

);
