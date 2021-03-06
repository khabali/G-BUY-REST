/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.rest.ressources.Prestataire;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Anas
 */
@Stateless
@Path("prestataires")
public class PrestataireFacadeREST extends AbstractFacade<Prestataire> {
    @PersistenceContext(unitName = "G-BUY-RESTPU")
    private EntityManager em;

    public PrestataireFacadeREST() {
        super(Prestataire.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Prestataire entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(Prestataire entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Prestataire find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Prestataire> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Prestataire> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    /**
     * 
     * @param nom
     * @return 
     */
    @GET
    @Path("prestataire/{nom}")
    @Produces({"application/xml", "application/json"})
    public Prestataire findByNom(@PathParam("nom") String nom) {
        Query q = em.createNamedQuery("Prestataire.findByNom");
        q.setParameter("nom", nom);
        List<Prestataire> list = q.getResultList();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }
}
