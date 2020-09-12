package com.matsoan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.matsoan.dao.ClienteDAO;
import com.matsoan.dao.ProfesionalDAO;
import com.matsoan.model.Cliente;
import com.matsoan.model.Profesional;

@Controller
public class SprController {
	@Autowired
	ProfesionalDAO profDao;
	@Autowired
	ClienteDAO clDao;

	@RequestMapping("/viewProf")
	public String viewProf(Model model) {
		List<Profesional> listaProf = profDao.list();
		model.addAttribute("listaProf", listaProf);
		return "viewProf";

	}

	@RequestMapping("/formProf")
	public String showform(Model m) {
		m.addAttribute("command", new Profesional());
		return "formProf";
	}

	@RequestMapping(value = "/Guardar Profesional", method = RequestMethod.POST)
	public String save(@ModelAttribute("prof") Profesional prof) {
		profDao.save(prof);
		return "redirect:/viewProf";// will redirect to viewemp request mapping
	}

	@RequestMapping(value = "/editProf/{pr_rut}")
	public String edit(@PathVariable String pr_rut, Model m) {
		Profesional prof = profDao.getProfbyRut(pr_rut);

		m.addAttribute("command", prof);
		return "editProfForm";
	}

	@RequestMapping(value = "/saveUpdateProf", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("pr_rut") Profesional prof) {
		profDao.update(prof);
		return "redirect:/viewProf";
	}

	@RequestMapping(value = "/deleteProf/{pr_rut}", method = RequestMethod.GET)
	public String delete(@PathVariable String pr_rut) {
		profDao.delete(pr_rut);
		return "redirect:/viewProf";
	}

	
	
	
	///-----------CLIENT METHODS------------------
	
	
	
	@RequestMapping("/viewClient")
	public String viewClient(Model model) {
		List<Cliente> listaClient = clDao.list();
		model.addAttribute("listaClient", listaClient);
		return "viewClient";

	}

	@RequestMapping("/formClient")
	public String showformClient(Model m) {
		m.addAttribute("command", new Cliente());
		return "formClient";
	}

	@RequestMapping(value = "/Guardar Cliente", method = RequestMethod.POST)
	public String saveClient(@ModelAttribute("client") Cliente client) {
		clDao.save(client);
		return "redirect:/viewClient";
	}

	@RequestMapping(value = "/editClient/{cl_rut}")
	public String editClient(@PathVariable String cl_rut, Model m) {
		Cliente client = clDao.getClientbyRut(cl_rut);

		m.addAttribute("command", client);
		return "editClientForm";
	}
	
	@RequestMapping(value = "/saveUpdateClient", method = RequestMethod.POST)
	public String editsaveClient(@ModelAttribute("cl_rut") Cliente client) {
		clDao.update(client);
		return "redirect:/viewClient";
	}
	
	@RequestMapping(value = "/deleteClient/{cl_rut}", method = RequestMethod.GET)
	public String deleteClient(@PathVariable String cl_rut) {
		clDao.delete(cl_rut);
		return "redirect:/viewClient";
	}
}
