package com.xiangshiguang.srdz.dao.sys;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.xiangshiguang.srdz.domain.sys.Module;

@Repository
public class ModuleDao {
	public ModuleDao() {
		System.out.println("ModuleDao");
	}
	 @PersistenceContext
	 private EntityManager entityManager;
	 
	 public List<Module> findAll(){
		 System.out.println("entityManager:"+entityManager);
		 TypedQuery<Module> tq = entityManager.createQuery("select m from Module m", Module.class);
		 return tq.getResultList();
	 }
	 
	 public Module findById(final String id) {
		 return entityManager.find(Module.class, id);
	 }
}
