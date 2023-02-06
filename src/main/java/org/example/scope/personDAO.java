package org.example.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
    public class personDAO {
    @Autowired
    JdbcConnection obj;

    public JdbcConnection getObj() {
        return obj;
    }

    public void setObj(JdbcConnection obj) {
        this.obj = obj;
    }



}
