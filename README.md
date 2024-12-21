## simple-blog
博客系统

### PDM
```sql
drop database if exists blog;
create database if not exists blog character set utf8mb4 collate utf8mb4_general_ci;
use blog;
    
create table blog_category (
    id bigint not null auto_increment comment '主键',
    category_name varchar(32) not null default '' comment '分类名称',
    creator_id varchar(32) not null default '' comment '创建人ID',
    modifier_id varchar(32) not null default '' comment '修改人ID',
    create_time datetime not null default current_timestamp comment '创建时间',
    modify_time datetime not null default current_timestamp on update current_timestamp comment '修改时间',
    is_delete smallint not null default 0 comment '逻辑删除标志',
    primary key (id)
) engine = innodb character set utf8mb4 collate utf8mb4_general_ci comment '博客分类表';

create table blog_article (
    id bigint not null auto_increment comment '主键',
    category_id bigint not null comment '分类ID',
    title varchar(64) not null default '' comment '文章标题',
    content text not null  comment '文章内容',
    creator_id varchar(32) not null default '' comment '创建人ID',
    modifier_id varchar(32) not null default '' comment '修改人ID',
    create_time datetime not null default current_timestamp comment '创建时间',
    modify_time datetime not null default current_timestamp on update current_timestamp comment '修改时间',
    is_delete smallint not null default 0 comment '逻辑删除标志',
    primary key (id)
) engine = innodb character set utf8mb4 collate utf8mb4_general_ci comment '博客文章表';

```
