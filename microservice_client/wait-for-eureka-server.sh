#!/bin/sh
# wait-for-config-server.sh

set -e

host="$1"
shift
cmd="$@"

#until PGPASSWORD=$POSTGRES_PASSWORD psql -h "$host" -U "postgres" -c '\q'; do
#  >&2 echo "Postgres is unavailable - sleeping"
#  sleep 1
#done

until $(curl --output /dev/null --silent --head --fail $host); do
    >&2 echo "Eureka Server is unavailable - sleeping"
    sleep 40
done

>&2 echo "Eureka Server is up - executing command"
exec $cmd