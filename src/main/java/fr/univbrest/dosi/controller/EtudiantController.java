package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
=======
>>>>>>> 94e600bd4f03dc2cab1e86e30f4d2c272b76f2c3
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.business.EtudiantBusiness;


@RestController
@CrossOrigin
@RequestMapping("/etudiants")
public class EtudiantController {

	private EtudiantBusiness business;

	@Autowired
	public EtudiantController(EtudiantBusiness business) {
		this.business = business;
	}

	@RequestMapping(method = RequestMethod.POST)
	public Etudiant CreateEtudiant(@RequestBody Etudiant etud) {

		return business.CreateEtudiant(etud);
	}

	@RequestMapping(method = RequestMethod.GET)

	public List<Etudiant> GetAllEtudiants() {

		//return null;
		return business.GetAllEtudiants();

	}

	@RequestMapping(method = RequestMethod.GET , value="/{NO_ETUDIANT}" )
        public void deleteEtudiant (@PathVariable("NO_ETUDIANT") String CNE ) {
        	
        	//this.business.deleteEtudiant(CNE);
        }
	


}
