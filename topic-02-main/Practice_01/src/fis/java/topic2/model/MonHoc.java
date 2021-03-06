package fis.java.topic2.model;

import java.util.ArrayList;
import java.util.List;

public class MonHoc {
	
	private String ten;
	private int tcLT;
	private int tcTH;
	
	public static class Builder{
		private String ten = "";
		private int tcLT = 0;
		private int tcTH = 0;
		
		public MonHoc.Builder ten(String ten){
			this.ten = ten;
			return this;
		}
		public MonHoc.Builder tcLT(int tcLT){
			this.tcLT = tcLT;
			return this;
		}
		public MonHoc.Builder tcTH(int tcTH){
			this.tcTH = tcTH;
			return this;
		}
		
		public MonHoc build() {
			return new MonHoc(this);
		}
	}

	private MonHoc() {		
	}
	
	private MonHoc(MonHoc.Builder builder) {
		this.ten = builder.ten;
		this.tcLT = builder.tcLT;
		this.tcTH = builder.tcTH;
	}

	public String getTen() {
		return ten;
	}

	public int getTcLT() {
		return tcLT;
	}

	public int getTcTH() {
		return tcTH;
	}

	
	
	@Override
	public String toString() {
		return "MonHoc [ten=" + ten + ", tcLT=" + tcLT + ", tcTH=" + tcTH + "]";
	}

	//public method
	public int tongTc() {
		return tcLT + tcTH;
	}
	
	public boolean equals(Object that) {
		// Hai mon duoc goi la bang nhau neu cung ten mon
		if (that instanceof MonHoc) {
			return ((MonHoc) that).ten.equals(this.ten);
		}
		return false;
	}
	
	public static List<MonHoc> createShortList(){
		List<MonHoc> list = new ArrayList<>();
		
		list.add(new MonHoc.Builder()
				.ten("Toán cao cấp")
				.tcLT(2)
				.tcTH(1)
				.build());
		
		list.add(new MonHoc.Builder()
				.ten("Giải tích")
				.tcLT(2)
				.tcTH(1)
				.build());
		
		list.add(new MonHoc.Builder()
				.ten("Nhập môn LT")
				.tcLT(2)
				.tcTH(1)
				.build());
		
		list.add(new MonHoc.Builder()
				.ten("CTDL&GT")
				.tcLT(2)
				.tcTH(1)
				.build());
		
		return list;
	}
}
