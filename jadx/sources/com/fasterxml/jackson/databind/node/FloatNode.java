package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC9459pw;
import o.C9394ok;

/* loaded from: classes5.dex */
public class FloatNode extends NumericNode {
    protected final float d;

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean f() {
        float f = this.d;
        return f >= -2.14748365E9f && f <= 2.14748365E9f;
    }

    @Override // o.AbstractC9454pr
    public double h() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean j() {
        float f = this.d;
        return f >= -9.223372E18f && f <= 9.223372E18f;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public int o() {
        return (int) this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public long r() {
        return this.d;
    }

    public FloatNode(float f) {
        this.d = f;
    }

    public static FloatNode a(float f) {
        return new FloatNode(f);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9330nZ
    public JsonParser.NumberType a() {
        return JsonParser.NumberType.FLOAT;
    }

    @Override // o.AbstractC9454pr
    public Number s() {
        return Float.valueOf(this.d);
    }

    @Override // o.AbstractC9454pr
    public BigDecimal g() {
        return BigDecimal.valueOf(this.d);
    }

    @Override // o.AbstractC9454pr
    public BigInteger d() {
        return g().toBigInteger();
    }

    @Override // o.AbstractC9454pr
    public String c() {
        return C9394ok.d(this.d);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public boolean v() {
        return Float.isNaN(this.d) || Float.isInfinite(this.d);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.d(this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof FloatNode)) {
            return Float.compare(this.d, ((FloatNode) obj).d) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.d);
    }
}
