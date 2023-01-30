package org.example;

import org.springframework.stereotype.Component;

@Component
public interface Human {
    void name();
    void profession();
    void age();
    default void HumanBeingGender(){};
}
