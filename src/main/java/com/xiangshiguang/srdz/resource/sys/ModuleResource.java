package com.xiangshiguang.srdz.resource.sys;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiangshiguang.srdz.domain.sys.Module;
import com.xiangshiguang.srdz.domain.sys.Modules;
import com.xiangshiguang.srdz.service.sys.ModuleService;

@Path("modules")
public class ModuleResource {

	@Autowired
	private ModuleService moduleService;

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Modules findAll() {
		System.out.println("findAll");
		Modules modules = new Modules(moduleService.findAll());
		for(Module line:modules.getModules()) {
			System.out.println(line);
		}
		return modules;
	}
	@GET
	@Path("/{moduleId:[a-zA-Z]*}")
	public Module findById(@PathParam("moduleId") final String moduleId) {
		System.out.println("findById");
		return moduleService.findById(moduleId);
	}
}
