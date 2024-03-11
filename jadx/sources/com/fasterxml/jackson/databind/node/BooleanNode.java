package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import o.AbstractC9459pw;

/* loaded from: classes5.dex */
public class BooleanNode extends ValueNode {
    public static final BooleanNode c = new BooleanNode(true);
    public static final BooleanNode d = new BooleanNode(false);
    private static final long serialVersionUID = 2;
    private final boolean a;

    public static BooleanNode v() {
        return c;
    }

    public static BooleanNode w() {
        return d;
    }

    @Override // o.AbstractC9454pr
    public String c() {
        return this.a ? "true" : "false";
    }

    public int hashCode() {
        return this.a ? 3 : 1;
    }

    protected Object readResolve() {
        return this.a ? c : d;
    }

    protected BooleanNode(boolean z) {
        this.a = z;
    }

    @Override // o.AbstractC9454pr
    public JsonNodeType m() {
        return JsonNodeType.BOOLEAN;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return this.a ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.a(this.a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof BooleanNode) && this.a == ((BooleanNode) obj).a;
    }
}
