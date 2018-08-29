package llcweb.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import llcweb.com.dao.repository.ProjectRepository;
import llcweb.com.domain.models.Project;
import llcweb.com.service.ProjectService;

/**
 * @author tong
 * 实现项目的一些基本操作
 */

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	@Qualifier("ProjectServiceImpl")
	private ProjectService projectService;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	/* (non-Javadoc)
	 * @see llcweb.com.service.ProjectService#addProject(llcweb.com.domain.models.Project)
	 * 添加项目
	 */
	@Override
	public void addProject(Project project) {
		project.setId(null);
		projectService.addProject(project);

	}
	
	
	/* (non-Javadoc)
	 * @see llcweb.com.service.ProjectService#deleteProject(int)
	 * 根据项目id删除项目
	 */
	@Override
	public void deleteProject(int id) {
		// TODO Auto-generated method stub
		projectService.deleteProject(id);
	}

	
	/* (non-Javadoc)
	 * @see llcweb.com.service.ProjectService#modifyProject(llcweb.com.domain.models.Project)
	 * 修改项目
	 */
	@Override
	public void modifyProject(Project p) {
		// TODO Auto-generated method stub
		projectService.modifyProject(p);
	}

	/* (non-Javadoc)
	 * @see llcweb.com.service.ProjectService#getProjects(int)
	 * 获取前num个项目
	 */
	@Override
	public List<Project> getProjects(int num) {
		return projectService.getProjects(num);
	}
	

	@Override
	public Project getProjectById(Integer id) {
	
	 return projectService.getProjectById(id);
	}
	
	
	/* (non-Javadoc)
	 * @see llcweb.com.service.ProjectService#findAll(llcweb.com.domain.models.Project, int, int)
	 * 
	 */
	@Override
	public Page<Project> findAll(Project project, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		List<Sort.Order> orders = new ArrayList<Sort.Order>();
		if(project.getStartDate() != null) {
			orders.add(new Sort.Order(Sort.Direction.DESC, "startDate"));
		} 
		else if(project.getEndDate() != null) {
			orders.add(new Sort.Order(Sort.Direction.DESC, "endDate"));
		}
		else {
			orders.add(new Sort.Order(Sort.Direction.ASC, "id"));
		}
		
		Sort sort = new Sort(orders);
        Pageable pageable=new PageRequest(pageNum,pageSize,sort);
		
        Page<Project> projectList = projectRepository.findAll(new Specification<Project>() {

			@Override
			public Predicate toPredicate(Root<Project> root, CriteriaQuery<?> query, CriteriaBuilder cd) {
				 Predicate predicate = cd.conjunction();
				 if(project.getStatus() != null) {
					 predicate.getExpressions().add(cd.like(root.get("status"),"%" +  project.getStatus() + "%"));
				 }
				 if(project.getMoney() != null) {
					 predicate.getExpressions().add(cd.like(root.get("money"),"%" +  project.getMoney() + "%"));
				 }
				 if(project.getEndDate() != null) {
					 predicate.getExpressions().add(cd.like(root.get("endDate"),"%" +  project.getEndDate() + "%"));
				 }
				 if(project.getStartDate() != null) {
					 predicate.getExpressions().add(cd.like(root.get("startDate"),"%" +  project.getStartDate() + "%"));
				 }
				 if(project.getTitle() != null) {
					 predicate.getExpressions().add(cd.like(root.get("title"),"%" +  project.getTitle() + "%"));
				 }
				 if(project.getResponsiblePeople() != null) {
					 predicate.getExpressions().add(cd.like(root.get("responsiblePeople"),"%" +  project.getResponsiblePeople() + "%"));
				 }
				 if(project.getRequireNum() != null) {
					 predicate.getExpressions().add(cd.like(root.get("requireNum"),"%" +  project.getRequireNum() + "%"));
				 }
				 if(project.getProjectType() != null) {
					 predicate.getExpressions().add(cd.like(root.get("projectType"),"%" +  project.getProjectType() + "%"));
				 }
				 if(project.getProjectName() != null) {
					 predicate.getExpressions().add(cd.like(root.get("projectName"),"%" +  project.getProjectName() + "%"));
				 }
				 if(project.getMembers() != null) {
					 predicate.getExpressions().add(cd.like(root.get("members"),"%" +  project.getMembers() + "%"));
				 }
				 if(project.getTeam() != null) {
					 predicate.getExpressions().add(cd.like(root.get("team"),"%" +  project.getTeam() + "%"));
				 }
				 if(project.getProjectDes() != null) {
					 predicate.getExpressions().add(cd.like(root.get("projectDes"),"%" +  project.getProjectDes() + "%"));
				 }
				 if(project.getProjectAim() != null) {
					 predicate.getExpressions().add(cd.like(root.get("projectAim"),"%" +  project.getProjectAim() + "%"));
				 }
				 if(project.getHostUnit() != null) {
					 predicate.getExpressions().add(cd.like(root.get("hostUnit"),"%" +  project.getHostUnit() + "%"));
				 }
				 if(project.getCoUnit() != null) {
					 predicate.getExpressions().add(cd.like(root.get("coUnit"),"%" +  project.getCoUnit() + "%"));
				 }
				 if(project.getUndertakeUnit() != null) {
					 predicate.getExpressions().add(cd.like(root.get("undertakeUnit"),"%" +  project.getUndertakeUnit() + "%"));
				 }
				return predicate;
				
			}
        }, pageable);
		return projectList;
	}

	

}
