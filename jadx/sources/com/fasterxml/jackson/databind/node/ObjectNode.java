package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;

/* loaded from: classes.dex */
public class ObjectNode extends ContainerNode<ObjectNode> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Map<String, AbstractC9454pr> b;

    @Override // o.AbstractC9454pr
    public final boolean p() {
        return true;
    }

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this.b = new LinkedHashMap();
    }

    @Override // o.InterfaceC9451po.b
    public boolean e(AbstractC9459pw abstractC9459pw) {
        return this.b.isEmpty();
    }

    @Override // o.AbstractC9454pr
    public JsonNodeType m() {
        return JsonNodeType.OBJECT;
    }

    @Override // o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, o.AbstractC9454pr
    public int u() {
        return this.b.size();
    }

    @Override // o.AbstractC9454pr
    public Iterator<AbstractC9454pr> i() {
        return this.b.values().iterator();
    }

    @Override // o.AbstractC9454pr
    public AbstractC9454pr a(String str) {
        return this.b.get(str);
    }

    @Override // o.AbstractC9454pr
    public Iterator<Map.Entry<String, AbstractC9454pr>> k() {
        return this.b.entrySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        boolean z = (abstractC9459pw == null || abstractC9459pw.d(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? false : true;
        jsonGenerator.i(this);
        for (Map.Entry<String, AbstractC9454pr> entry : this.b.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.l() || !baseJsonNode.e(abstractC9459pw)) {
                jsonGenerator.a(entry.getKey());
                baseJsonNode.a(jsonGenerator, abstractC9459pw);
            }
        }
        jsonGenerator.o();
    }

    @Override // o.InterfaceC9451po
    public void b(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        boolean z = (abstractC9459pw == null || abstractC9459pw.d(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? false : true;
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(this, JsonToken.START_OBJECT));
        for (Map.Entry<String, AbstractC9454pr> entry : this.b.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.l() || !baseJsonNode.e(abstractC9459pw)) {
                jsonGenerator.a(entry.getKey());
                baseJsonNode.a(jsonGenerator, abstractC9459pw);
            }
        }
        abstractC9544rb.c(jsonGenerator, b);
    }

    public <T extends AbstractC9454pr> T c(String str, AbstractC9454pr abstractC9454pr) {
        if (abstractC9454pr == null) {
            abstractC9454pr = v();
        }
        this.b.put(str, abstractC9454pr);
        return this;
    }

    public AbstractC9454pr b(String str, AbstractC9454pr abstractC9454pr) {
        if (abstractC9454pr == null) {
            abstractC9454pr = v();
        }
        return this.b.put(str, abstractC9454pr);
    }

    public ArrayNode e(String str) {
        ArrayNode x = x();
        a(str, x);
        return x;
    }

    public ObjectNode c(String str, String str2) {
        AbstractC9454pr b;
        if (str2 == null) {
            b = v();
        } else {
            b = b(str2);
        }
        return a(str, b);
    }

    public ObjectNode c(String str, boolean z) {
        return a(str, b(z));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return a((ObjectNode) obj);
        }
        return false;
    }

    protected boolean a(ObjectNode objectNode) {
        return this.b.equals(objectNode.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    protected ObjectNode a(String str, AbstractC9454pr abstractC9454pr) {
        this.b.put(str, abstractC9454pr);
        return this;
    }
}
