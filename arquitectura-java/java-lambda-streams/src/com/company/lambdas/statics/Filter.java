package com.company.lambdas.statics;

public interface Filter<T> {

    boolean test(T t);

    default Filter<T> or(Filter<T> filter) {
        return (T t) -> test(t) || filter.test(t);
    }

}
