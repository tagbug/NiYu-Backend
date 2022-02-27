package com.niyu;

import com.niyu.pojo.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NiyuApplicationTests {
	@Autowired
	private MongoTemplate mongoTemplate;
	@Test
	void contextLoads() {
		Tag tag = new Tag();
		tag.setTag("体育");
		tag.setId("2");
		tag.setTitle("国足又输了");
		tag.setTopicId("2");
		tag.setArticleNum(100);

		mongoTemplate.insert(tag);

	}

}
