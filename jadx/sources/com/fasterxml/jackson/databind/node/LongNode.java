package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC9459pw;
import o.C9394ok;

/* loaded from: classes5.dex */
public class LongNode extends NumericNode {
    protected final long d;

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean f() {
        long j = this.d;
        return j >= -2147483648L && j <= 2147483647L;
    }

    @Override // o.AbstractC9454pr
    public double h() {
        return this.d;
    }

    public int hashCode() {
        long j = this.d;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean j() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public int o() {
        return (int) this.d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public long r() {
        return this.d;
    }

    public LongNode(long j) {
        this.d = j;
    }

    public static LongNode b(long j) {
        return new LongNode(j);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9330nZ
    public JsonParser.NumberType a() {
        return JsonParser.NumberType.LONG;
    }

    @Override // o.AbstractC9454pr
    public Number s() {
        return Long.valueOf(this.d);
    }

    @Override // o.AbstractC9454pr
    public BigDecimal g() {
        return BigDecimal.valueOf(this.d);
    }

    @Override // o.AbstractC9454pr
    public BigInteger d() {
        return BigInteger.valueOf(this.d);
    }

    @Override // o.AbstractC9454pr
    public String c() {
        return C9394ok.e(this.d);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.b(this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof LongNode) && ((LongNode) obj).d == this.d;
    }
}
