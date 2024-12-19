package edu.upc.dsa.services;


import edu.upc.dsa.models.FAQs;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Api(value = "/faq", description = "Endpoint to faq Service")
@Path("/faq")
public class FAQsService {

    //private static final Logger logger = Logger.getLogger(FAQs.class.getName());


    //Get all faqs
    @GET
    @ApiOperation(value = "get all faqs ", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = FAQs.class, responseContainer = "List"),
            //@ApiResponse(code = 404, message = "User not found")
    })
    @Path("/PR")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFAQs() {

        List<FAQs> faqs = new ArrayList<>();

        FAQs faq1 = new FAQs("2024-11-11", "SE PUEDE PAGAR A PLAZOS?", "SI QUE PUEDES", "victor arjona");
        faqs.add(faq1);
        FAQs faq2 = new FAQs("2014-12-11", "LOS PAQUETES SUELEN LLEGAR EN BUEN ESTADO?", "SI, Y SINO SE TE DEVUELVE EL DINERO", "LEO");
        faqs.add(faq2);


        if (faqs == null) {
            return Response.status(404).build();
        } else {
            GenericEntity<List<FAQs>> entity = new GenericEntity<List<FAQs>>(faqs) {};
            return Response.status(201).entity(entity).build()  ;


            //return Response.status(201).entity(faqs).build();




        }

    }
}





