package Reservation;

public class ReservBean {

	private String id;// ���̵�
	private String parking_code;
	private String phoneNum;// ��ȭ��ȣ
	private String location;// ��ġ
	private String carType;// ����
	private String useTime;// ���ð�
	private String beginTime;// ���۽ð�
	private String endTime;// ����ð�
	private int cost;// ��

	public String getParking_code() {
		return parking_code;
	}

	public void setParking_code(String parking_code) {
		this.parking_code = parking_code;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getPay() {
		return cost;
	}

	public void setPay(int cost) {
		this.cost = cost;
	}

}
