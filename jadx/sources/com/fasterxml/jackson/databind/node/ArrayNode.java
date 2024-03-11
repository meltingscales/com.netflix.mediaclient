package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;

/* loaded from: classes5.dex */
public class ArrayNode extends ContainerNode<ArrayNode> implements Serializable {
    private static final long serialVersionUID = 1;
    private final List<AbstractC9454pr> d;

    @Override // o.AbstractC9454pr
    public AbstractC9454pr a(String str) {
        return null;
    }

    @Override // o.AbstractC9454pr
    public boolean l() {
        return true;
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this.d = new ArrayList();
    }

    @Override // o.InterfaceC9451po.b
    public boolean e(AbstractC9459pw abstractC9459pw) {
        return this.d.isEmpty();
    }

    @Override // o.AbstractC9454pr
    public JsonNodeType m() {
        return JsonNodeType.ARRAY;
    }

    @Override // o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, o.AbstractC9454pr
    public int u() {
        return this.d.size();
    }

    @Override // o.AbstractC9454pr
    public Iterator<AbstractC9454pr> i() {
        return this.d.iterator();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        List<AbstractC9454pr> list = this.d;
        int size = list.size();
        jsonGenerator.e(this, size);
        for (int i = 0; i < size; i++) {
            ((BaseJsonNode) list.get(i)).a(jsonGenerator, abstractC9459pw);
        }
        jsonGenerator.i();
    }

    @Override // o.InterfaceC9451po
    public void b(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(this, JsonToken.START_ARRAY));
        Iterator<AbstractC9454pr> it = this.d.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).a(jsonGenerator, abstractC9459pw);
        }
        abstractC9544rb.c(jsonGenerator, b);
    }

    public ArrayNode a(AbstractC9454pr abstractC9454pr) {
        if (abstractC9454pr == null) {
            abstractC9454pr = v();
        }
        e(abstractC9454pr);
        return this;
    }

    public ArrayNode w() {
        e(v());
        return this;
    }

    public ArrayNode c(String str) {
        if (str == null) {
            return w();
        }
        return e(b(str));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this.d.equals(((ArrayNode) obj).d);
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    protected ArrayNode e(AbstractC9454pr abstractC9454pr) {
        this.d.add(abstractC9454pr);
        return this;
    }
}
