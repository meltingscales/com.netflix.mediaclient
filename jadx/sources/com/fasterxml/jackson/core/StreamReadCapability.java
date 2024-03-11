package com.fasterxml.jackson.core;

import o.InterfaceC9383oZ;

/* loaded from: classes2.dex */
public enum StreamReadCapability implements InterfaceC9383oZ {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false),
    EXACT_FLOATS(false);
    
    private final int i = 1 << ordinal();
    private final boolean j;

    @Override // o.InterfaceC9383oZ
    public int a() {
        return this.i;
    }

    @Override // o.InterfaceC9383oZ
    public boolean b() {
        return this.j;
    }

    StreamReadCapability(boolean z) {
        this.j = z;
    }
}
