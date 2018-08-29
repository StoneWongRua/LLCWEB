package llcweb.com.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

import llcweb.com.domain.models.Project;

/**
 * @author tong
 * @登录以后的项目信息服务接口
 *
 */
@Transactional
public interface ProjectService {
	
	
	
	/** 获取项目信息
	 * @param id
	 * @return
	 */
	public Project getProjectById(Integer id);

	
	/**
	 * 添加项目信息
	 * @param project
	 */
	public void addProject(Project project);
	
	
	/**
	 * 根据id查找项目并且删除项目
	 * @param id
	 */
	public void deleteProject(int id);
	
	/**
	 * 修改项目
	 * @param p
	 */
	public void modifyProject(Project p);
	
	
	/**获取前num个项目（按照时间排序的前num个）
	 * @param num
	 * @return
	 */
	public List<Project> getProjects(int num);
	
	/**
	 * 查询项目并按照时间规则分页排序
	 * @param project
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public Page<Project> findAll(Project project, int pageNum, int pageSize);
}
