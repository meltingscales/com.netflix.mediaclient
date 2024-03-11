package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;
import o.InterfaceC9428pR;

/* loaded from: classes5.dex */
public class NullsConstantProvider implements InterfaceC9428pR, Serializable {
    private static final long serialVersionUID = 1;
    protected final AccessPattern c;
    protected final Object e;
    private static final NullsConstantProvider d = new NullsConstantProvider(null);
    private static final NullsConstantProvider a = new NullsConstantProvider(null);

    public static NullsConstantProvider b() {
        return a;
    }

    public static boolean c(InterfaceC9428pR interfaceC9428pR) {
        return interfaceC9428pR == d;
    }

    public static NullsConstantProvider d() {
        return d;
    }

    @Override // o.InterfaceC9428pR
    public Object c(DeserializationContext deserializationContext) {
        return this.e;
    }

    protected NullsConstantProvider(Object obj) {
        this.e = obj;
        this.c = obj == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
    }

    public static NullsConstantProvider a(Object obj) {
        return obj == null ? a : new NullsConstantProvider(obj);
    }
}
