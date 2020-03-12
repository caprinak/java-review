package com.capri.sample;

import java.util.TreeSet;

public class TreeSetDemo {
	 public static void main(String args[]) {
	      // Tao mot tree set
	      TreeSet ts = new TreeSet();
	      // them cac phan tu toi tree set
	      ts.add("C");
	      ts.add("A");
	      ts.add("B");
	      ts.add("E");
	      ts.add("F");
	      ts.add("D");
	      System.out.println(ts);
	      System.out.println(ts.pollFirst());
	      
		/*
		 * Lớp TreeSet trong Java cung cấp một sự triển khai của Set Interface mà sử
		 * dụng một tree cho lưu giữ. Các đối tượng được lưu giữ được xếp thứ tự tăng
		 * dần.
		 * 
		 * Thời gian truy cập và thu nhận dữ liệu là khá nhanh, làm cho TreeSet như là
		 * một lựa chọn tuyệt vời khi lưu giữ một lượng lớn thông tin đã xếp thứ tự mà
		 * phải được tìm kiếm một cách nhanh chóng.
		 */
	      	   }
}
