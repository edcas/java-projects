package com.company.examples.generics.equality;

import java.util.Objects;

public class Cookie {

    private String flavor;

    public Cookie(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cookie cookie = (Cookie) o;
        return Objects.equals(flavor, cookie.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor);
    }
}
