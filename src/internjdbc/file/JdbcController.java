package com.example.internjdbc.file;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {

	@Autowired
	JdbcService js;

	@PostMapping("/insert")
	public String insert(@RequestBody Jdbcpojo jp) {
		int i = js.insert(jp);
		if (i > 0) {
			return "Data Inserted";
		} else {
			return "Data not inserted";
		}

	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam int e_id) {
		int j = js.delete(e_id);
		if(j>0) {
			return "deleted";
		}
		else
		{
			return "Not Deleted";
		}
	}
	
	@PostMapping("/update")
	public String update(@RequestParam int e_age,@RequestParam int e_id)
	{
		int q = js.update(e_age,e_id);
		if(q > 0) {
			return "Updated";
		}
		else
		{
			return "Not Updated";
		}
		
	}
	
	@GetMapping("/fetch")
	public List data()
	{
		
		return js.selectQuery();
		
	}
	
	
//	@GetMapping("/select")
//	public List selectData(@RequestParam int e_id) //@QueryParam
//	{
//		return js.selectQueryUsingQuery(e_id);
//	}
//	
	
//	@GetMapping("/getdata/{e_id}")
//	public List selectData(@PathVariable int e_id) //Pathparam
//	{
//		return js.selectQueryUsingQuery(e_id);
//	}
	
	@GetMapping("/getdata")
	public List selectData(@RequestBody Jdbcpojo jp)
	{
		return js.selectQueryUsingQuery(jp);
	}
	
}
