package com.sample.service;

import com.sample.entity.Dept;

public class SampleService {


	public DeptService deptService;


	/**
	 * 部署情報検索処理c
	 * @param  id 部署ID
	 * @return deptInfodeptInfo 部署情報
	 * @throws Exception
	 */
	public Dept findDept(int id ) throws Exception {
		Dept deptInfo =null;
		//1.パラメーターチェック
		if(deptService.getCount()==0) {
			throw new Exception("マスタテーブル「DEP」にデータが０件です。DB管理者に連絡してください。");
		}

		//2. 検索結果チェック
		deptInfo=deptService.findById(id);
		if(deptInfo==null) {
			throw new Exception("該当部署が存在しません。部署IDを確認してください。");
		}

		return deptInfo;
	}
}
