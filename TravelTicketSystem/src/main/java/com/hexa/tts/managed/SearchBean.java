/**
 * 
 */
package com.hexa.tts.managed;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Transient;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hexa.tts.dto.PersonDto;
import com.hexa.tts.dto.SearchParamTO;
import com.hexa.tts.entities.Person;
import com.hexa.tts.services.impl.PersonService;

/**
 * @author fruaku
 * @date 03.01.2015 23:10:11
 */
@SuppressWarnings("serial")
@ManagedBean(name="searchBean")
@Scope("request")
public class SearchBean implements Serializable
{
  @Transient
	private SearchParamTO searchParamTO;

	@Inject
	private transient PersonService personService;

  //@PostConstruct
  private void init() {
  	searchParamTO = new SearchParamTO();
  	
  }
  
//  ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//      ServletContext servletContext = (ServletContext) externalContext.getContext();
//  WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext).
//                                 getAutowireCapableBeanFactory().
//                                 autowireBean(this);
//  }
//
//  private void readObject(ObjectInputStream ois) 
//                          throws ClassNotFoundException, IOException {
//      ois.defaultReadObject();
//      init();
//  }
	
//	public String search()
//	{
//		Person person = personService.fetchById(Long.valueOf(searchParamTO
//				.getUserNumber()));
//		person.toString();
//		return null;
//	}

	/**
	 * @return the searchParamTO
	 */
	public SearchParamTO getSearchParamTO()
	{
		return searchParamTO;
	}

	/**
	 * @param searchParamTO
	 *          the searchParamTO to set
	 */
	public void setSearchParamTO(SearchParamTO searchParamTO)
	{
		this.searchParamTO = searchParamTO;
	}

}
