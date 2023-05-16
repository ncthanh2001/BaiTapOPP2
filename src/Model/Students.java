package Model;


public class Students {
	private String Id;
	private String name;
	private Double AVG;
	
	public Students() {
		super();
	}

	public Students(String id, String name, Double aVG) {
		super();
		Id = id;
		this.name = name;
		AVG = aVG;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAVG() {
		return AVG;
	}

	public void setAVG(Double aVG) {
		AVG = aVG;
	}
	
	public String ranked() {
		if(this.AVG == 10) {
			return "Xuất xắc";
		}else if(this.AVG >=8 && this.AVG < 10) {
			return "Giỏi";
		}else if(this.AVG >= 5 && this.AVG < 8) {
			return "Khá";
		}else if(this.AVG >= 3 && this.AVG <5 ) {
			return "Trung Bình";
		}
		return "Yếu";
	}

	@Override
	public String toString() {
		return "Students [Id=" + Id + ", name=" + name + ", AVG=" + AVG +", Xếp Loại : "+ranked()+ "]";
	}
	
}
