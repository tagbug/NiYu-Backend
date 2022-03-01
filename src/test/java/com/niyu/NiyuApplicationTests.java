package com.niyu;

import com.niyu.pojo.Tag;
import com.niyu.pojo.Users;
import com.niyu.service.impl.SideBarServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class NiyuApplicationTests {
	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * 插入一条数据
	 */
	@Test
	void contextLoads() {
		Tag tag = new Tag();
		tag.setTag("体育");
		tag.setId("4");
		tag.setTitle("国足you又输了");
		tag.setTopicId("9");
		tag.setArticleNum(10000);
		mongoTemplate.insert(tag);

	}

	@Test
	void insertAll(){
		Users users = new Users();
		users.setId("1");
		users.setAvatar("11");
		users.setChatList(null);
		users.setDescription("11");
		users.setEmail("11");
	}

	/**
	 * 查询数据
	 */

	@Test
	void selectById(String topicId) {
		mongoTemplate.findById(topicId, Tag.class);
	}

	@Test
	void delete(String topicId){
		Tag tag = mongoTemplate.findById(topicId, Tag.class);
		mongoTemplate.remove(tag);
	}

	@Autowired
	private SideBarServiceImpl service;
	@Test
	void test1(){
		List<Tag> recommend = service.getRecommend();
		for (Tag tag : recommend) {
			System.out.println(tag.toString());
		}
	}
}
