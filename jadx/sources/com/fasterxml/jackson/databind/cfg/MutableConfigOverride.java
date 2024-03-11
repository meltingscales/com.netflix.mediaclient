package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import o.AbstractC9413pC;

/* loaded from: classes5.dex */
public class MutableConfigOverride extends AbstractC9413pC implements Serializable {
    private static final long serialVersionUID = 1;

    public MutableConfigOverride() {
    }

    protected MutableConfigOverride(MutableConfigOverride mutableConfigOverride) {
        super(mutableConfigOverride);
    }

    public MutableConfigOverride i() {
        return new MutableConfigOverride(this);
    }
}
