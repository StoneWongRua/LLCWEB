package llcweb.com.mapper;

import java.util.List;

import org.springframework.data.repository.query.Param;

import llcweb.com.domain.models.Project;
import llcweb.com.domain.models.ProjectExample;

/** 自定义的ProjectMapper
 * @author 15845
 *
 */
public interface ProjectMapper {

    int countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
    
	// 获取按时间排序的前num个项目
	List<Project> findProjects(int num);
	
	public int countProjectByTeam(String team);
}
