package llcweb.com.dao.repositoryTest;

import static org.hamcrest.Matchers.notNullValue;

import java.sql.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import llcweb.com.dao.repository.PaperRepository;
import llcweb.com.domain.models.Paper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaperRepositoryTest {
	
	@Autowired
	private PaperRepository paperRepository;
	

	@Test
	public void add() {
		Paper paper = new Paper();
		for(int i = 1; i <= 2; i++) {
			paper.setTitle("test" + i);
			paper.setDate(new Date(i));
			paper.setIntroduction("aaaaa" + i);
			paper.setAuthorList("333" + i);
			paper.setOriginalLink("666" + i);
			paper.setSourceLink("999" + i);
			paper.setBelongProject("555" + i);
			paper.setPeriodical("hahaha");
			Assert.assertThat(paperRepository.saveAndFlush(paper), notNullValue());
		}
	}

}
