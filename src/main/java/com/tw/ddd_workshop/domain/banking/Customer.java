package com.tw.ddd_workshop.domain.banking;

import java.util.List;
import java.util.UUID;

public class Customer {

    private UUID id;
    private Address address;
    private List<Account> accounts;

    public Customer(Address address, List<Account> accounts) {
        this.id = UUID.randomUUID();
        this.address = address;
        this.accounts = accounts;
    }

    public void updateAddress(Address address) {
        this.address = address;
        this.accounts.forEach(account -> account.updateAddress(address));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", address=" + address +
                ", accounts=" + accounts +
                '}';
    }
}
