package com.codingdojo.enrutar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
    public String index(@RequestParam(value="q", required=false) String searchQuery) {
        return "Ha buscado:  ";
    }
	
	@RequestMapping(value="/dojo", method=RequestMethod.GET)
    public String dojo(@RequestParam(value="q", required=false) String searchQuery) {
        return "¡El Dojo es increíble!";
    }

	@RequestMapping(value="/burbank-dojo", method=RequestMethod.GET)
    public String burbank(@RequestParam(value="q", required=false) String searchQuery) {
        return "El Dojo Burbank está localizado al sur de California";
    }
	
	@RequestMapping(value="/san-jose", method=RequestMethod.GET)
    public String sanjose(@RequestParam(value="q", required=false) String searchQuery) {
        return "El Dojo SJ es el cuartel general" ;
    }
}
