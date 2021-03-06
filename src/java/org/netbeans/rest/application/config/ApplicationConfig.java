/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Anas
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    public Set<Class<?>> getClasses() {
        return getRestResourceClasses();
    }

    /**
     * Do not modify this method. It is automatically generated by NetBeans REST support.
     */
    private Set<Class<?>> getRestResourceClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        resources.add(service.PrestataireFacadeREST.class);
        resources.add(service.CategorieFacadeREST.class);
        resources.add(service.DealFacadeREST.class);
        resources.add(service.NewsletterFacadeREST.class);
        resources.add(service.UtilisateurFacadeREST.class);
        resources.add(service.CommandeFacadeREST.class);
        resources.add(service.BonAchatFacadeREST.class);
        resources.add(service.CommentaireFacadeREST.class);
        return resources;
    }
    
}
