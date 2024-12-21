package com.yr.simpleblog.dao.blog;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yr.simpleblog.dao.blog.entity.ArticleDO;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper extends BaseMapper<ArticleDO> {
}
