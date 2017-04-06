/**
 * 
 */
package hub.site.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Home 
 * Mar 8, 2017
 * CRUD Operations
 */

@Controller
public class ApiController {

	@RequestMapping(value ="/welcome", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)	
	public @ResponseBody ModelAndView create() {
		ModelAndView mview = new ModelAndView("welcome");
		mview.addObject("hello"	, "creation operation in REST API");
		return mview;
		
	}
	
	@RequestMapping(value ="/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<?> retreive() {
		return null;
		
	}
	
	@RequestMapping(value="/students/{id}", method = RequestMethod.PUT,  produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Integer update() {
		return null;
		
	}
	
	@RequestMapping(value="/students/{id}", method = RequestMethod.DELETE,  produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Integer delete() {
		return null;
		
	}
}

