package com.zhangqiang.sqgl.repository;

import java.util.List;

import org.springframework.data.repository.Repository;
import com.zhangqiang.sqgl.domain.Bookmark;

public interface BookmarkRepository extends Repository<Bookmark, Long> {
	
    List<Bookmark> findAll();
}