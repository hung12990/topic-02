package fis.java.topic2.view;

import java.util.Calendar;
import java.util.List;

import fis.java.topic2.common.DataForTest;
import fis.java.topic2.controller.DotDangKyHocPhan;
import fis.java.topic2.controller.PhieuDangKyHocPhan;
import fis.java.topic2.model.BangDiem;
import fis.java.topic2.model.ChuongTrinhHoc;
import fis.java.topic2.model.MonHoc;
import fis.java.topic2.model.SinhVien;

public class MainApplication {
	public static void main(String[] args) {
		DataForTest dataForTest = new DataForTest();
		List<SinhVien> listSV = dataForTest.createListSinhVien();
		List<MonHoc> listMH = dataForTest.createListMonHoc();
		
		DotDangKyHocPhan dotDangKyHocPhan = new DotDangKyHocPhan("DKHP01", 
				Calendar.getInstance(), 
				Calendar.getInstance());
		
		SinhVien ntphuoc = new SinhVien.Builder()
				.masv("0001")
				.ten("Nguyen Thanh Phuoc")
				.bangDiem(new BangDiem())
				.build();
		
		PhieuDangKyHocPhan phieu = new PhieuDangKyHocPhan(listSV.get(0), dotDangKyHocPhan);
		phieu.setDsMonHoc(listMH);
		System.out.println(phieu.laHopLe());
	}
}
