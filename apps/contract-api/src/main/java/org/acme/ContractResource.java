package org.acme;

import java.net.URI;
import java.util.List;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/contracts")
public class ContractResource {

    @POST
    @Transactional
    public Response createContract(String name) {
        Contract contract = new Contract();
        contract.name = name;
        contract.persist();
        return Response.created(URI.create("/contracts/" + contract.id)).build();
    }

    @GET
    public List<Contract> getContracts() {
        return Contract.listAll();
    }
}
