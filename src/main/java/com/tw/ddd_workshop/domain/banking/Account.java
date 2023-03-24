package com.tw.ddd_workshop.domain.banking;

public class Account {

    private Address address;

    public Account(Address address) {
        this.address = address;
    }

    protected void updateAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "address=" + address +
                '}';
    }
}
