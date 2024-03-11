package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import o.AbstractC9459pw;
import o.AbstractC9544rb;

/* loaded from: classes5.dex */
public final class MissingNode extends ValueNode {
    private static final MissingNode c = new MissingNode();
    private static final long serialVersionUID = 1;

    public static MissingNode v() {
        return c;
    }

    @Override // o.AbstractC9454pr
    public String c() {
        return "";
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    protected Object readResolve() {
        return c;
    }

    protected MissingNode() {
    }

    @Override // o.AbstractC9454pr
    public JsonNodeType m() {
        return JsonNodeType.MISSING;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.NOT_AVAILABLE;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.k();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9451po
    public void b(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        jsonGenerator.k();
    }

    public int hashCode() {
        return JsonNodeType.MISSING.ordinal();
    }
}
