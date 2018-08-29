package llcweb.com.dao;

import java.util.List;

import org.springframework.data.domain.Page;

import llcweb.com.domain.models.Project;

/**登录信息持久化
 * @author tong
 *
 */
public interface ProjectDao{
	
	/**
	 * @param id
	 * @return
	 */
	public Project getProjectById(Integer id);
	
	
	// 根据id删除project
	public void deleteProject(int id);
	
	// 添加project
	public void addProject(Project project);
	

	// 修改项目
	public void modifyProject(Project p);
	
	/**
	 * 获取按时间排序的前num个项目
	 * 
	 * @param num
	 * @return List<Project>
	 */
	public List<Project> getProjects(int num);
	
	/**
	 * 根据组别找出所有的项目
	 * @param team_num
	 * @return
	 */
	public int coutProjectByTeam(String team);
}
