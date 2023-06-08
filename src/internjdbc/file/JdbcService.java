package com.example.internjdbc.file;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JdbcService {

	@Autowired
	JdbcTemplate jt;

	public int insert(Jdbcpojo jp) {
		int e_id = jp.getE_id();
		long e_phone = jp.getE_phone();
		int e_age = jp.getE_age();
		String e_desg = jp.getE_role();
		String e_name = jp.getE_lname();
		String sql = "insert into employee values (?,?,?,?,?,?,?,?,?)";
		int i = jt.update(sql, e_id, e_name, e_age, e_desg, e_phone);
		return i;
	}
	
	public int delete(int e_id)
	{
		String sql = "delete from employee where e_id = ?";
		int j = jt.update(sql,e_id);
		return j;
	}

	 public int update(int e_age,int e_id) {
		 String sql = "update employee set e_age = ? where e_id = ? ";
		 int q = jt.update(sql,e_age,e_id);
		return q;
	}
	 
	 
	 public List selectQuery()
	 {
		 List l = new ArrayList<>();		 
		 HashMap hs = null;
		 List<Map<String,Object>> data = new ArrayList<Map<String,Object>>();
		 String sql = "select * from employee where e_id = ?";
		 data = jt.queryForList(sql);
		 for(Map m : data)
		 {
			hs = new HashMap();
			hs.put("e_id",m.get("e_id"));
			hs.put("e_fname",m.get("e_fname"));
			hs.put("e_lname",m.get("e_lname"));
			hs.put("e_age",m.get("e_age"));
			hs.put("e_role",m.get("e_role"));
			hs.put("e_phone",m.get("e_phone"));
			hs.put("e_email",m.get("e_email"));
			hs.put("e_username",m.get("e_username"));
			hs.put("e_password",m.get("e_password"));
			
			l.add(m);
		 }
		 
		 
		 return l;
		 
	 }
	 
	 public List selectQueryUsingQuery(Jdbcpojo jp)
	 {
		 int id = jp.getE_id();
		 List l = new ArrayList<>();		 
		 HashMap hs = null;
		 List<Map<String,Object>> data = new ArrayList<Map<String,Object>>();
		 String sql = "select * from employee where e_id = ?";
		 data = jt.queryForList(sql,id);
		 for(Map m : data)
		 {
			hs = new HashMap();
			hs.put("e_id",m.get("e_id"));
			hs.put("e_fname",m.get("e_fname"));
			hs.put("e_lname",m.get("e_lname"));
			hs.put("e_age",m.get("e_age"));
			hs.put("e_role",m.get("e_role"));
			hs.put("e_phone",m.get("e_phone"));
			hs.put("e_email",m.get("e_email"));
			hs.put("e_username",m.get("e_username"));
			hs.put("e_password",m.get("e_password"));
			
			l.add(m);
		 }
		 
		 
		 return l;
	 }
	 
	 
}
