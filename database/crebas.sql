/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/3/31 21:02:55                           */
/*==============================================================*/


drop table if exists t_discussion;

drop table if exists t_photo;

drop table if exists t_r_photo_discussion;

drop table if exists t_r_school_photo;

drop table if exists t_r_user_discussion;

drop table if exists t_r_user_school;

drop table if exists t_school;

drop table if exists t_user;

/*==============================================================*/
/* Table: t_discussion                                          */
/*==============================================================*/
create table t_discussion
(
   content              text,
   floor_num            int,
   create_time          date,
   discussion_id        varchar(32) not null,
   primary key (discussion_id)
);

/*==============================================================*/
/* Table: t_photo                                               */
/*==============================================================*/
create table t_photo
(
   photo_id             varchar(32) not null,
   name                 varchar(80),
   title                varchar(40),
   latitude             numeric(8,0),
   longitude            numeric(8,0),
   introduction         text,
   view_num             int,
   like_num             int,
   creator_id           varchar(32),
   primary key (photo_id)
);

/*==============================================================*/
/* Table: t_r_photo_discussion                                  */
/*==============================================================*/
create table t_r_photo_discussion
(
   discussion_id        varchar(32) not null,
   photo_id             varchar(32) not null,
   primary key (discussion_id, photo_id)
);

/*==============================================================*/
/* Table: t_r_school_photo                                      */
/*==============================================================*/
create table t_r_school_photo
(
   school_id            varchar(32) not null,
   photo_id             varchar(32) not null,
   primary key (school_id, photo_id)
);

/*==============================================================*/
/* Table: t_r_user_discussion                                   */
/*==============================================================*/
create table t_r_user_discussion
(
   user_id              varchar(32) not null,
   discussion_id        varchar(32) not null,
   primary key (user_id, discussion_id)
);

/*==============================================================*/
/* Table: t_r_user_school                                       */
/*==============================================================*/
create table t_r_user_school
(
   user_id              varchar(32) not null,
   school_id            varchar(32) not null,
   primary key (user_id, school_id)
);

/*==============================================================*/
/* Table: t_school                                              */
/*==============================================================*/
create table t_school
(
   name                 varchar(80),
   page_view            int,
   active_index         int,
   introduction         text,
   photo_count          int,
   racking              int,
   school_id            varchar(32) not null,
   pinyin               varchar(40),
   pinyin_header        varchar(30),
   primary key (school_id)
);

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   user_id              varchar(32) not null,
   user_name            varchar(10),
   user_email           varchar(30),
   user_phone           varchar(20),
   user_address         text,
   user_image           varchar(50),
   gender               int,
   score                int,
   user_password        varchar(20),
   primary key (user_id)
);

alter table t_r_photo_discussion add constraint FK_t_r_photo_discussion foreign key (discussion_id)
      references t_discussion (discussion_id) on delete restrict on update restrict;

alter table t_r_photo_discussion add constraint FK_t_r_photo_discussion2 foreign key (photo_id)
      references t_photo (photo_id) on delete restrict on update restrict;

alter table t_r_school_photo add constraint FK_t_r_school_photo foreign key (school_id)
      references t_school (school_id) on delete restrict on update restrict;

alter table t_r_school_photo add constraint FK_t_r_school_photo2 foreign key (photo_id)
      references t_photo (photo_id) on delete restrict on update restrict;

alter table t_r_user_discussion add constraint FK_t_r_user_discussion foreign key (user_id)
      references t_user (user_id) on delete restrict on update restrict;

alter table t_r_user_discussion add constraint FK_t_r_user_discussion2 foreign key (discussion_id)
      references t_discussion (discussion_id) on delete restrict on update restrict;

alter table t_r_user_school add constraint FK_t_r_user_school foreign key (user_id)
      references t_user (user_id) on delete restrict on update restrict;

alter table t_r_user_school add constraint FK_t_r_user_school2 foreign key (school_id)
      references t_school (school_id) on delete restrict on update restrict;

