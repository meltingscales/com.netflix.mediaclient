package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import java.io.Serializable;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.C9561rs;

/* loaded from: classes.dex */
public abstract class BaseJsonNode extends AbstractC9454pr implements Serializable {
    private static final long serialVersionUID = 1;

    @Override // o.InterfaceC9330nZ
    public JsonParser.NumberType a() {
        return null;
    }

    @Override // o.InterfaceC9451po
    public abstract void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw);

    Object writeReplace() {
        return NodeSerialization.d(this);
    }

    public String toString() {
        return C9561rs.d(this);
    }
}
