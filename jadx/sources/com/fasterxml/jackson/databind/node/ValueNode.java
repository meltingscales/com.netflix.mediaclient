package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;

/* loaded from: classes5.dex */
public abstract class ValueNode extends BaseJsonNode {
    private static final long serialVersionUID = 1;

    @Override // o.AbstractC9454pr
    public final AbstractC9454pr a(String str) {
        return null;
    }

    public abstract JsonToken e();

    @Override // o.InterfaceC9451po
    public void b(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(this, e()));
        a(jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, b);
    }
}
