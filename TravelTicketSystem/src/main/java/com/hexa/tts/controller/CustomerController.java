/**
 * 
 */
package com.hexa.tts.controller;

import java.util.HashMap;
import java.util.Map;
 




import javax.inject.Inject;
import javax.validation.Valid;
 




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hexa.tts.entities.Customer;
import com.hexa.tts.entities.Person;
import com.hexa.tts.services.ICustomerService;
 

/**
 * @author fruaku
 * @date 08.02.2015 17:58:29
 */
@Controller
public class CustomerController {
 
    private static final Logger logger = LoggerFactory
            .getLogger(CustomerController.class);
     
    private Map<String, Customer> customers = null;
    
    @Inject
    ICustomerService customerService;
     
    public CustomerController(){
        customers = new HashMap<String, Customer>();
    }
 
    @RequestMapping(value = "/cust/save", method = RequestMethod.GET)
    public String saveCustomerPage(Model model) {
        logger.info("Returning to custSave.jsp page");
        model.addAttribute("customer", new Customer());
        String r="";
        return "custSave";
    }
 
    @RequestMapping(value = "/cust/save.do", method = RequestMethod.POST)
    public String saveCustomerAction(
            @Valid Customer customer,
            BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            logger.info("Returning custSave.jsp page");
            return "custSave";
        }
        logger.info("Returning custSaveSuccess.jsp page");
        model.addAttribute("customer", customer);
        //customers.put(customer.getContactDetail().getEmail1(), customer);
        customerService.saveOrUpdate(customer);
        return "custSaveSuccess";
    }
 
}
