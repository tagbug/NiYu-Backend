package com.niyu;

import com.niyu.pojo.Articles;
import com.niyu.pojo.Tag;
import com.niyu.pojo.Users;
import com.niyu.service.impl.ArticleServiceImpl;
import com.niyu.service.impl.SideBarServiceImpl;
import com.niyu.util.ISODateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
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
		tag.setTitle("国足youyouyou又输了");
		tag.setTopicId("10");
		tag.setArticleNum(10000);
		Tag insert = mongoTemplate.insert(tag);
		System.out.println(insert);

	}

	@Test
	void insertAll(){
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		Users users = new Users();
		users.setAvatar("13");
		users.setChatList(null);
		users.setDescription("11");
		users.setEmail("11");
		users.setArticleNum(11);
		users.setFollows(null);
		users.setUserId("1");
		users.setFans(list);
		users.setLikedArticles(null);
		users.setLastPostTime(new Date());
		users.setUsername("pq");
		users.setPassword("1234");
		users.setNickname("zpq111");
		users.setStaredArticles(null);

		mongoTemplate.insert(users);
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

	@Test
	void testUtil(){
		String s = ISODateUtil.dateToISODate(new Date());
		System.out.println(s);
	}

	@Test
	void TestGetActiveUser(){
		List<Users> user = service.getActiveUser();
		for (Users users : user) {
			System.out.println(users.toString());
		}
	}
	@Autowired
	private ArticleServiceImpl articleService;
	@Test
	void TestGetArticleById(){
		Articles article = articleService.getArticleById("1");
		System.out.println(article.toString());
	}

	@Test
	void insertArticle(){
		Articles articles = new Articles();
		articles.setArticleId("4");
		articles.setAuthorId("3");
		articles.setAvailable(true);
		articles.setContent("aaaaa");
		articles.setImages(null);
		articles.setLikerList(null);
		articles.setLikes(11);
		articles.setMentionList(null);
		articles.setReplyTo("111");
		articles.setTags(null);
		articles.setReviewList(null);
		articles.setPostDate(new Date());
		mongoTemplate.insert(articles);
	}

	@Test
	void deleteArticle(){
		long l = articleService.deleteArticle("1");
		System.out.println(l);
	}
}
