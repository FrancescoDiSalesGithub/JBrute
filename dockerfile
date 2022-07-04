FROM postgres

env POSTGRES_PASSWORD=brute
env POSTGRES_USER=postgres
env POSTGRES_DB=brutedb

copy sql/ /docker-entrypoint-initdb.d/


