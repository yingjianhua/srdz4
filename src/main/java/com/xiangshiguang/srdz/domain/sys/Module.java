package com.xiangshiguang.srdz.domain.sys;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.persistence.TypedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="sys_module")
@XmlRootElement
public class Module {
	@Id
	@Column(length=20)
	private String pkey; 
	@Column(length=100)
	private String name; 
	private Integer licenses;
	@Column(length=100)
	private String menus; 
	private Short rowVersion;
	
	public String getPkey() {
		return pkey;
	}
	public void setPkey(String pkey) {
		this.pkey = pkey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLicenses() {
		return licenses;
	}
	public void setLicenses(Integer licenses) {
		this.licenses = licenses;
	}
	public String getMenus() {
		return menus;
	}
	public void setMenus(String menus) {
		this.menus = menus;
	}
	public Short getRowVersion() {
		return rowVersion;
	}
	public void setRowVersion(Short rowVersion) {
		this.rowVersion = rowVersion;
	}
	@Override
	public String toString() {
		return "Module [pkey=" + pkey + ", name=" + name + ", licenses=" + licenses + ", menus=" + menus
				+ ", rowVersion=" + rowVersion + "]";
	}
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
		System.out.println(emf);
		// obtain EntityManager
		EntityManager em = emf.createEntityManager();
		System.out.println(em);
		Module module = em.find(Module.class, "Wx");
		System.out.println(module);
		TypedQuery<Module> tq = em.createQuery("select e from Module e", Module.class);
		List<Module> list = tq.getResultList();
		for(Module line:list) {
			System.out.println(line);
		}
		
	}
}
