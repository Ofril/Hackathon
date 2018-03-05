# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table t_artist_types (
  artist_type_id                integer auto_increment not null,
  type_name                     varchar(255),
  constraint pk_t_artist_types primary key (artist_type_id)
);

create table t_posts (
  id                            integer auto_increment not null,
  type_id                       integer,
  user_id                       integer,
  url                           varchar(255),
  constraint pk_t_posts primary key (id)
);

create table t_post_types (
  post_type_id                  integer auto_increment not null,
  post_type                     varchar(255),
  constraint pk_t_post_types primary key (post_type_id)
);

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
  artist_type                   integer,
  constraint pk_t_users primary key (user_id)
);

alter table t_posts add constraint fk_t_posts_type_id foreign key (type_id) references t_post_types (post_type_id) on delete restrict on update restrict;
create index ix_t_posts_type_id on t_posts (type_id);

alter table t_posts add constraint fk_t_posts_user_id foreign key (user_id) references t_users (user_id) on delete restrict on update restrict;
create index ix_t_posts_user_id on t_posts (user_id);

alter table t_users add constraint fk_t_users_artist_type foreign key (artist_type) references t_artist_types (artist_type_id) on delete restrict on update restrict;
create index ix_t_users_artist_type on t_users (artist_type);


# --- !Downs

alter table t_posts drop foreign key fk_t_posts_type_id;
drop index ix_t_posts_type_id on t_posts;

alter table t_posts drop foreign key fk_t_posts_user_id;
drop index ix_t_posts_user_id on t_posts;

alter table t_users drop foreign key fk_t_users_artist_type;
drop index ix_t_users_artist_type on t_users;

drop table if exists t_artist_types;

drop table if exists t_posts;

drop table if exists t_post_types;

drop table if exists t_users;

