package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC9459pw;
import o.C9394ok;

/* loaded from: classes5.dex */
public class DoubleNode extends NumericNode {
    protected final double b;

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean f() {
        double d = this.b;
        return d >= -2.147483648E9d && d <= 2.147483647E9d;
    }

    @Override // o.AbstractC9454pr
    public double h() {
        return this.b;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean j() {
        double d = this.b;
        return d >= -9.223372036854776E18d && d <= 9.223372036854776E18d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public int o() {
        return (int) this.b;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public long r() {
        return (long) this.b;
    }

    public DoubleNode(double d) {
        this.b = d;
    }

    public static DoubleNode b(double d) {
        return new DoubleNode(d);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9330nZ
    public JsonParser.NumberType a() {
        return JsonParser.NumberType.DOUBLE;
    }

    @Override // o.AbstractC9454pr
    public Number s() {
        return Double.valueOf(this.b);
    }

    @Override // o.AbstractC9454pr
    public BigDecimal g() {
        return BigDecimal.valueOf(this.b);
    }

    @Override // o.AbstractC9454pr
    public BigInteger d() {
        return g().toBigInteger();
    }

    @Override // o.AbstractC9454pr
    public String c() {
        return C9394ok.d(this.b);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public boolean v() {
        return Double.isNaN(this.b) || Double.isInfinite(this.b);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.e(this.b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof DoubleNode)) {
            return Double.compare(this.b, ((DoubleNode) obj).b) == 0;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return ((int) (doubleToLongBits >> 32)) ^ ((int) doubleToLongBits);
    }
}
