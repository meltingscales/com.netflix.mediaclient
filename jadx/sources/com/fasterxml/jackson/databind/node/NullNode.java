package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import o.AbstractC9459pw;

/* loaded from: classes5.dex */
public class NullNode extends ValueNode {
    public static final NullNode d = new NullNode();
    private static final long serialVersionUID = 1;

    public static NullNode w() {
        return d;
    }

    @Override // o.AbstractC9454pr
    public String c() {
        return "null";
    }

    protected Object readResolve() {
        return d;
    }

    protected NullNode() {
    }

    @Override // o.AbstractC9454pr
    public JsonNodeType m() {
        return JsonNodeType.NULL;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.VALUE_NULL;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        abstractC9459pw.a(jsonGenerator);
    }

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof NullNode);
    }

    public int hashCode() {
        return JsonNodeType.NULL.ordinal();
    }
}
