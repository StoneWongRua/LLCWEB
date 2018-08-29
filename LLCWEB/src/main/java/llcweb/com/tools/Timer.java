package llcweb.com.tools;

import java.sql.Date;

public class Timer {
	private Date start;//开始时间
	private Date end;//结束时间
	
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
}
