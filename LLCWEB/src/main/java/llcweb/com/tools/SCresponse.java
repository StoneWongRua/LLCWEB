package llcweb.com.tools;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;

public class SCresponse {
	private int totalPage;//总页数
	private List<T> resultList;//结果集合
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getResultList() {
		return resultList;
	}
	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
}
