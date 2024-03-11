package com.fasterxml.jackson.databind.node;

/* loaded from: classes5.dex */
public abstract class NumericNode extends ValueNode {
    private static final long serialVersionUID = 1;

    @Override // o.AbstractC9454pr
    public abstract boolean f();

    @Override // o.AbstractC9454pr
    public abstract boolean j();

    @Override // o.AbstractC9454pr
    public abstract int o();

    @Override // o.AbstractC9454pr
    public abstract long r();

    public boolean v() {
        return false;
    }

    @Override // o.AbstractC9454pr
    public final JsonNodeType m() {
        return JsonNodeType.NUMBER;
    }
}
