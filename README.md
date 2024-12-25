## simple-blog
博客系统

### PDM
```sql
drop database if exists blog;
create database if not exists blog character set utf8mb4 collate utf8mb4_general_ci;
use blog;
   
-- 博客分类表
create table blog_category (
    id            bigint      not null auto_increment comment '主键',
    category_name varchar(32) not null default '' comment '分类名称',
    creator_id    varchar(32) not null default '' comment '创建人ID',
    modifier_id   varchar(32) not null default '' comment '修改人ID',
    create_time   datetime    not null default current_timestamp comment '创建时间',
    modify_time   datetime    not null default current_timestamp on update current_timestamp comment '修改时间',
    is_delete     smallint    not null default 0 comment '逻辑删除标志',
    primary key (id)
) engine = innodb character set utf8mb4 collate utf8mb4_general_ci comment '博客分类表';

-- 博客文章表
create table blog_article (
    id          bigint      not null auto_increment comment '主键',
    category_id bigint      not null comment '分类ID',
    title       varchar(64) not null default '' comment '文章标题',
    content     text        not null comment '文章内容',
    creator_id  varchar(32) not null default '' comment '创建人ID',
    modifier_id varchar(32) not null default '' comment '修改人ID',
    create_time datetime    not null default current_timestamp comment '创建时间',
    modify_time datetime    not null default current_timestamp on update current_timestamp comment '修改时间',
    is_delete   smallint    not null default 0 comment '逻辑删除标志',
    primary key (id)
) engine = innodb character set utf8mb4 collate utf8mb4_general_ci comment '博客文章表';

-- 用户表
create table user (
    id          bigint auto_increment                 not null comment '主键',
    account_id  varchar(32)                           not null comment '账号ID',
    name        varchar(32) null comment '名称',
    email       varchar(100) null comment '邮箱地址',
    phone       varchar(11) null comment '手机号',
    password    varchar(255)                          not null comment '加密后的密码',
    avatar      varchar(255) null comment '头像URL',
    status      varchar(10)                           not null default 'normal' comment '状态||normal:正常;disable:禁用',
    creator_id  varchar(32) default ''                not null comment '创建人ID',
    modifier_id varchar(32) default ''                not null comment '修改人ID',
    create_time datetime    default CURRENT_TIMESTAMP not null comment '创建时间',
    modify_time datetime    default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '修改时间',
    is_delete   smallint    default 0                 not null comment '逻辑删除标志',
    primary key (id)
) engine = innodb
  character set utf8mb4
  collate utf8mb4_general_ci comment '用户表';
```
