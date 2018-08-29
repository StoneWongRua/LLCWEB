package llcweb.com.dao.repositoryTest;

import static org.hamcrest.Matchers.notNullValue;

import java.sql.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import llcweb.com.dao.repository.PatentRepository;
import llcweb.com.domain.models.Patent;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatentRepositoryTest {
	
	@Autowired
	private PatentRepository patentRepository;
	
	@Test
	public void add() {
		Patent patent = new Patent();
		for(int i = 1; i <= 2; i++) {
			patent.setTitle("test" + i);
			patent.setAppliDate(new Date(i));
			patent.setIntroduction("aaaaa" + i);
			patent.setAuthorList("333" + i);
			patent.setOriginalLink("666" + i);
			patent.setBelongProject("555" + i);
			patent.setPublicDate(new Date(i));
			patent.setPublicNum("CN" + i);
			patent.setPublicDate(new Date(i));
			patent.setAgency("GDUT");
			patent.setAppliPeople("hahah");
			Assert.assertThat(patentRepository.saveAndFlush(patent), notNullValue());
		}
	}

}
