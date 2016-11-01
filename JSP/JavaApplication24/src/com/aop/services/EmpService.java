
package com.aop.services;

import com.aop.model.Accountant;
import com.aop.model.Manager;

public class EmpService {
    private Manager manager;
    private Accountant accountat;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Accountant getAccountat() {
        return accountat;
    }

    public void setAccountat(Accountant accountat) {
        this.accountat = accountat;
    }
    
   
}
