package jpabook.jpashop.domain;

import lombok.Getter;
import org.apache.catalina.filters.AddDefaultCharsetFilter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipCode;

    protected Address() {

    }

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
}
