# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table t_users (
  user_id                       integer auto_increment not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  stage_name                    varchar(255),
  password                      varchar(255),
  email                         varchar(255),
  birthdate                     datetime(6),
  description                   varchar(255),
  profile_picture               varchar(255),
  constraint pk_t_users primary key (user_id)
);


# --- !Downs

drop table if exists t_users;

