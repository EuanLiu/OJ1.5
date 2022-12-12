package com.oj.serviceimpl;

import java.util.List;

import com.oj.daoimpl.ContestDaoImpl;
import com.oj.entity.Contest;
import com.oj.service.ContestService;

/** 
* 类说明:关于比赛服务的具体实现方法
*/
public class ContestServiceImpl implements ContestService{
	private ContestDaoImpl contestdao = new ContestDaoImpl();
	
	//获取比赛信息
	public  Contest getContest(int id) {
		Contest contest = contestdao.getContest(id);
		return contest;
	}
	
	//获取所有比赛信息
	public List<Contest> getContestList(){
		return contestdao.getContestList();
	}
	
}
