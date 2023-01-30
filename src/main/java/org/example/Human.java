package org.example;

import org.springframework.stereotype.Component;

@Component
public interface Human {
    void name();
    void profession();
    void age();

    void Gender();
    default void Date_of_Birth(){};
}
