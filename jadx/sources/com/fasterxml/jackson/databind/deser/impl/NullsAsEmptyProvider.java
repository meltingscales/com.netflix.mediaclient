package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.Serializable;
import o.AbstractC9452pp;
import o.InterfaceC9428pR;

/* loaded from: classes5.dex */
public class NullsAsEmptyProvider implements InterfaceC9428pR, Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC9452pp<?> c;

    public NullsAsEmptyProvider(AbstractC9452pp<?> abstractC9452pp) {
        this.c = abstractC9452pp;
    }

    @Override // o.InterfaceC9428pR
    public Object c(DeserializationContext deserializationContext) {
        return this.c.d(deserializationContext);
    }
}
