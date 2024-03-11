package com.fasterxml.jackson.core;

import o.InterfaceC9383oZ;

/* loaded from: classes2.dex */
public enum StreamWriteCapability implements InterfaceC9383oZ {
    CAN_WRITE_BINARY_NATIVELY(false),
    CAN_WRITE_FORMATTED_NUMBERS(false);
    
    private final int a = 1 << ordinal();
    private final boolean e;

    @Override // o.InterfaceC9383oZ
    public int a() {
        return this.a;
    }

    @Override // o.InterfaceC9383oZ
    public boolean b() {
        return this.e;
    }

    StreamWriteCapability(boolean z) {
        this.e = z;
    }
}
