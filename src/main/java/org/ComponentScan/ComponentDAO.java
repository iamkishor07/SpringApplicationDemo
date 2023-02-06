package org.ComponentScan;

import org.example.scope.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
    public class ComponentDAO {
    @Autowired
    ComponentJdbcConnection obj;

    public ComponentJdbcConnection getObj() {
        return obj;
    }

    public void setObj(ComponentJdbcConnection obj) {
        this.obj = obj;
    }



}
