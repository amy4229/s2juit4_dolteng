package com.sample.form;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.seasar.framework.beans.util.Beans;
import com.sample.entity.Dept;

public class DeptForm {
	
	public String id = "";

	public String deptNo = "";

	public String deptName = "";

	public String loc = "";

	public String versionNo = "";


	public String offset = "0";
	
	public String count = "0";
	
	public String isNextPage = "true";
	
	public String isPrevPage = "true";

	public String totalNumber = "0";
	
	public String currentPageIndex = "0";
	
	public String totalPageIndex = "0";















	public List<Map<String, Object>> deptItems = new ArrayList<Map<String, Object>>();
	
	public void initializeMeisai() {
		for (int i = 0; i < 5; i++) {
			Map<String, Object> m = new HashMap<String, Object>();
			m.put("id", "");
			m.put("deptNo", "");
			m.put("deptName", "");
			m.put("loc", "");
			m.put("versionNo", "");
			deptItems.add(m);
		}
	}
	
	public void initializeMeisai(List<Dept> deptList) {
		for (int i = 0; i < deptList.size(); i++) {
			@SuppressWarnings("unchecked")
			Map<String, Object> m = Beans.createAndCopy(Map.class, deptList.get(i)).dateConverter("yyyy-MM-dd").execute();
			deptItems.add(m);
		}
	}
}