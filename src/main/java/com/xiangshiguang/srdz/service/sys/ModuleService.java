package com.xiangshiguang.srdz.service.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiangshiguang.srdz.dao.sys.ModuleDao;
import com.xiangshiguang.srdz.domain.sys.Module;

@Service
public class ModuleService {

	@Autowired
	private ModuleDao moduleDao;
	
	public List<Module> findAll() {
		return moduleDao.findAll();
	}
	public Module findById(final String id) {
		return moduleDao.findById(id);
	}
}
