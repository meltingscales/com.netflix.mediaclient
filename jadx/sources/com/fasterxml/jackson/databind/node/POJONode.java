package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import o.AbstractC9459pw;
import o.InterfaceC9451po;

/* loaded from: classes5.dex */
public class POJONode extends ValueNode {
    private static final long serialVersionUID = 2;
    protected final Object b;

    public Object x() {
        return this.b;
    }

    public POJONode(Object obj) {
        this.b = obj;
    }

    @Override // o.AbstractC9454pr
    public JsonNodeType m() {
        return JsonNodeType.POJO;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // o.AbstractC9454pr
    public byte[] b() {
        Object obj = this.b;
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return super.b();
    }

    @Override // o.AbstractC9454pr
    public String c() {
        Object obj = this.b;
        return obj == null ? "null" : obj.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object obj = this.b;
        if (obj == null) {
            abstractC9459pw.a(jsonGenerator);
        } else if (obj instanceof InterfaceC9451po) {
            ((InterfaceC9451po) obj).a(jsonGenerator, abstractC9459pw);
        } else {
            abstractC9459pw.b(obj, jsonGenerator);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof POJONode)) {
            return c((POJONode) obj);
        }
        return false;
    }

    protected boolean c(POJONode pOJONode) {
        Object obj = this.b;
        if (obj == null) {
            return pOJONode.b == null;
        }
        return obj.equals(pOJONode.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
