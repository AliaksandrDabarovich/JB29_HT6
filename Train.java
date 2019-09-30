package by.ad.les09_4;

public class Train  {
	private String punkt;
	private int num;
	private int time;
	private int minutes;

	/*
	 * public void setPunkt (String _punkt) { this.punkt=_punkt; } public void
	 * setNum (int _num) { this.num=_num; } public void setTime (String [] _time) {
	 * this.time=_time; }
	 */

	public Train(String _punkt, int _num, int _time, int _minutes) {
		this.punkt = _punkt;
		this.num = _num;
		this.time = _time;
		this.minutes = _minutes;
	}

	public int getNum() {
		return num;
	}

	public String getPunkt() {
		return punkt;
	}
	public int getTime() {
		return time;
	}
	public int getMin() {
		return minutes;
	}

	@Override
	public String toString() {
		return "Train [punkt=" + punkt + ", num=" + num + ", time=" + time + ", minutes=" + minutes + "]";
	}

	/*
	 * @Override public int compareTo(Train T) { if (this.getNum() > T.getNum()) {
	 * return 1; } else { return -1; } }
	 */

}
