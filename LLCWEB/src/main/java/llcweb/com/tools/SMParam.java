package llcweb.com.tools;

import org.apache.poi.ss.formula.functions.T;

/**
 * @author tong
 *用于分页各层之间传递参数
 * @param <T>
 */
public class SMParam<T> {
	
	private int pageSize;//页面大小
	private int startNum;//需要记录的最小的编号
	private T paramObj;//需要限制的参数对象
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	public T getParamObj() {
		return paramObj;
	}
	public void setParamObj(T paramObj) {
		this.paramObj = paramObj;
	}
	
}
