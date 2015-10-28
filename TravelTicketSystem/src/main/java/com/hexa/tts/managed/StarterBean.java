/**
 * 
 */
package com.hexa.tts.managed;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Component;

/**
 * @author fruaku
 * @date 03.01.2015 22:44:28
 */
@Component
@ManagedBean
@ViewScoped
public class StarterBean implements Serializable
{
	
	
public String search(){
	return "search";
}

public String register(){
	return "register";
}
}
