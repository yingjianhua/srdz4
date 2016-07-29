package com.xiangshiguang.srdz.domain.sys;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Modules {

	@XmlElement(name="module")
	@XmlElementWrapper
	private List<Module> modules;

	public Modules(List<Module> modules) {
		super();
		this.modules = modules;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
}
