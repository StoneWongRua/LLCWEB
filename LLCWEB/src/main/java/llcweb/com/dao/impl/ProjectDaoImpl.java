package llcweb.com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import llcweb.com.dao.ProjectDao;
import llcweb.com.domain.models.Project;
import llcweb.com.mapper.ProjectMapper;

public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	private ProjectMapper projectMapper;

	// 根据项目id查项目
	@Override
	public Project getProjectById(Integer id) {

		Project p = projectMapper.selectByPrimaryKey(id);
		if (p == null)
			throw new RuntimeException("查询结果为空");
		return p;
	}
	
	// 根据id删除project
	public void deleteProject(int id) {
		Project p = projectMapper.selectByPrimaryKey(id);
		if (p == null) {
			throw new RuntimeException("要删除的记录不存在");
		} else {
			projectMapper.deleteByPrimaryKey(id);
		}
	}

	// 添加项目
	public void addProject(Project project) {
		projectMapper.insert(project);
	}


	// 修改项目
	public void modifyProject(Project p) {
		if (projectMapper.selectByPrimaryKey(p.getId()) == null)
			throw new RuntimeException("该id对应的项目不存在！");
		projectMapper.updateByPrimaryKey(p);
	}
	
	// 获取按时间排序的前num个项目
	public List<Project> getProjects(int num){
		List<Project> list = projectMapper.findProjects(num);
		System.out.println(list);
		return list;
	}

	/**
	 * 根据组别找出所有的项目
	 * @param team_num
	 * @return
	 */
	public int coutProjectByTeam(String team)
	{
		return projectMapper.countProjectByTeam(team);
	}

}
