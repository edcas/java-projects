package com.company.interfaces.bifunction.defaultMethod;

public interface Versionable<T extends Versionable<T>> {

    int getVersion();

    default T isGreater(T element) {
        if(this.getVersion() > element.getVersion()) {
            return (T) this;
        }

        return element;
    }

}
