package org.rest.sec.client.template.test;

import org.rest.common.client.IEntityOperations;
import org.rest.sec.client.template.RoleClientRESTTemplate;
import org.rest.sec.model.Role;
import org.rest.sec.model.RoleEntityOpsImpl;
import org.rest.sec.test.SecClientSortAndPaginationRESTIntegrationTest;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleClientSortAndPaginationRESTIntegrationTest extends SecClientSortAndPaginationRESTIntegrationTest<Role> {

    @Autowired
    private RoleClientRESTTemplate clientTemplate;
    @Autowired
    private RoleEntityOpsImpl entityOps;

    public RoleClientSortAndPaginationRESTIntegrationTest() {
        super();
    }

    // tests

    // template method

    @Override
    protected final RoleClientRESTTemplate getAPI() {
        return clientTemplate;
    }

    @Override
    protected final IEntityOperations<Role> getEntityOps() {
        return entityOps;
    }

}
