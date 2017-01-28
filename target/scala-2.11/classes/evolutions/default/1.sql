# --- First database schema

# --- !Ups

set ignorecase true;

create table groceries (
  id                        bigint not null,
  name                      varchar(50) not null,
  quantity                  int,
  notes                     text,
  purchased                 boolean)
;

create sequence groceries_seq start with 1000;
# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists groceries;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists groceries_seq;

