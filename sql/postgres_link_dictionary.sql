create table brute.dictionary_words
(

	words_id serial,
	dictionary_name varchar(200),

	foreign key(words_id) references brute.words(words_id),
	foreign key(dictionary_name) references brute.dictionary(dictionary_name)

);
