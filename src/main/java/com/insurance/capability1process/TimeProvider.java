package com.insurance.capability1process;

import java.time.Instant;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TimeProvider implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private Instant currentInstant;

    public TimeProvider() {
        
        public Instant getCurrentInstant() {
            return Instant.now();
        }
        
    }




}