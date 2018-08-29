package llcweb.com.dao.repositoryTest;

import static org.hamcrest.Matchers.notNullValue;

import java.sql.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import llcweb.com.dao.ProjectDao;
import llcweb.com.dao.repository.ProjectRepository;
import llcweb.com.domain.models.Project;
import llcweb.com.service.ProjectService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectRepositoryTest1 {

	@Autowired
    private ProjectRepository projectRepository;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private ProjectDao projectDao;
	
	//Repository测试
	@Test
	public void add() {
		Project project = new Project();
		for(int i = 1; i <=10; i++) {
			project.setStatus("ing" + i);
			project.setMoney("99" + i);
			project.setEndDate(new Date(i));
			project.setStartDate(new Date(i));
			project.setTitle("title" + i);
			project.setResponsiblePeople("re" + i);
			project.setRequireNum("CN" + i);
			project.setProjectType("xy" + i);
			project.setProjectName("car" + i);
			project.setMembers("who" + i);
			project.setTeam("999" + i);
			project.setProjectDes("test" + i);
			project.setProjectAim("testPassed" + i);
			project.setHostUnit("GDUT" + i);
			project.setCoUnit("GDUT");
			project.setUndertakeUnit("GDUT");
			Assert.assertThat(projectRepository.saveAndFlush(project), notNullValue());
		}

	}
	
	//service测试
	@Test
	public void testInsertProjectService() {
		
		Project project = new Project();
		project.setStatus("ing");
		project.setMoney("99");
		project.setEndDate(new Date(1));
		project.setStartDate(new Date(0));
		project.setTitle("title");
		project.setResponsiblePeople("re");
		project.setRequireNum("CN");
		project.setProjectType("xy");
		project.setProjectName("car");
		project.setMembers("who");
		project.setTeam("999");
		project.setProjectDes("test");
		project.setProjectAim("testPassed");
		project.setHostUnit("GDUT");
		project.setCoUnit("GDUT");
		project.setUndertakeUnit("GDUT");
		
		Assert.assertEquals(projectService.getProjectById(project.getId()).getProjectName(), "car");
		Assert.assertEquals(projectService.getProjectById(project.getId()).getCoUnit(),  "GDUT");
		
	}
	
	
	//Dao测试
	@Test
	public void testInsertProjectDao() {
		
		Project project = new Project();
		project.setStatus("ing");
		project.setMoney("99");
		project.setEndDate(new Date(1));
		project.setStartDate(new Date(0));
		project.setTitle("title");
		project.setResponsiblePeople("re");
		project.setRequireNum("CN");
		project.setProjectType("xy");
		project.setProjectName("car");
		project.setMembers("who");
		project.setTeam("999");
		project.setProjectDes("test");
		project.setProjectAim("testPassed");
		project.setHostUnit("GDUT");
		project.setCoUnit("GDUT");
		project.setUndertakeUnit("GDUT");
		
		Assert.assertEquals(projectDao.getProjectById(project.getId()).getProjectName(), "car");
		Assert.assertEquals(projectDao.getProjectById(project.getId()).getCoUnit(),  "GDUT");
		
	}
	

}
