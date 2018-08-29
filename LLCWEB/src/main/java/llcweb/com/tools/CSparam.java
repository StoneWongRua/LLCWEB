package llcweb.com.tools;

/**
 * @author 15845
 * 分页代码的实现
 * @param <T>
 */
public class CSparam<T> {

	private int currentPage;//当前页
	private int pageSize;//页面大小
	private T paramObj;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public T getParamObj() {
		return paramObj;
	}
	public void setParamObj(T paramObj) {
		this.paramObj = paramObj;
	}
}
