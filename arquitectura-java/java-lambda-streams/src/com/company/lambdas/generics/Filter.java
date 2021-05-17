package com.company.lambdas.generics;

public interface Filter<T> {

    public boolean test(T t);

    default public Filter<T> or(Filter<T> filter) {
        return (T t) -> {
            return test(t) || filter.test(t);
        };
    }

}
