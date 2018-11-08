/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexAbogado.notaria.webService;

import com.lexAbogado.notaria.bussines.convert.DaoToJpa;
import com.lexAbogado.notaria.dato.controllers.ClientNotariaControllers;
import com.lexAbogado.notaria.dato.entity.Cliente;
import com.lexAbogado.notaria.domain.ClienteNotaria;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Joaquin
 */
@Path("notariaClient")
public class NotariaClient {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of NotariaClient
     */
    public NotariaClient() {
    }

    /**
     * Retrieves representation of an instance of com.lexAbogado.notaria.webService.NotariaClient
     * @return an instance of com.lexAbogado.notaria.domain.ClienteNotaria
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ClienteNotaria getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of NotariaClient
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(ClienteNotaria content) {
    }
    
    
    @POST
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("newClient")
    public Cliente newClient(ClienteNotaria newClient) {
        Cliente  result = new Cliente();
        try{
            result = DaoToJpa.convertClienteNotariaToCliente(newClient);
            ClientNotariaControllers.insertarNewClient(result);
        }
        catch(Exception e){
            throw new UnsupportedOperationException();
        }
        return result;
        //throw new UnsupportedOperationException();
    }
    @POST
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("obtenerClientByRut")
    public Cliente obtenerClientByRut(ClienteNotaria newClient) {
        Cliente  result = new Cliente();
        try{
            result = DaoToJpa.convertClienteNotariaToCliente(newClient);
            ClientNotariaControllers.searchClientByRut(result);
        }
        catch(Exception e){
            throw new UnsupportedOperationException();
        }
        return result;
        //throw new UnsupportedOperationException();
    }
}