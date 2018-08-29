package llcweb.com.dao.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import llcweb.com.domain.models.Project;


/**
 * Created by:Tong
 * Description: 项目类的repository类
 * Date: 2018/8/24
 */

@Repository("ProjectRepository")
public interface ProjectRepository extends JpaRepository<Project,Integer>{
	
	public Page<Project> findAll(Specification<Project> specification, Pageable pageable);

}


