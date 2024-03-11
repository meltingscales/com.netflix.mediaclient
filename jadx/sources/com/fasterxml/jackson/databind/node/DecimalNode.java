package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC9459pw;

/* loaded from: classes5.dex */
public class DecimalNode extends NumericNode {
    protected final BigDecimal d;
    public static final DecimalNode b = new DecimalNode(BigDecimal.ZERO);
    private static final BigDecimal e = BigDecimal.valueOf(-2147483648L);
    private static final BigDecimal a = BigDecimal.valueOf(2147483647L);
    private static final BigDecimal h = BigDecimal.valueOf(Long.MIN_VALUE);
    private static final BigDecimal c = BigDecimal.valueOf(Long.MAX_VALUE);

    @Override // o.AbstractC9454pr
    public BigDecimal g() {
        return this.d;
    }

    @Override // o.AbstractC9454pr
    public Number s() {
        return this.d;
    }

    public DecimalNode(BigDecimal bigDecimal) {
        this.d = bigDecimal;
    }

    public static DecimalNode e(BigDecimal bigDecimal) {
        return new DecimalNode(bigDecimal);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9330nZ
    public JsonParser.NumberType a() {
        return JsonParser.NumberType.BIG_DECIMAL;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean f() {
        return this.d.compareTo(e) >= 0 && this.d.compareTo(a) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean j() {
        return this.d.compareTo(h) >= 0 && this.d.compareTo(c) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public int o() {
        return this.d.intValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public long r() {
        return this.d.longValue();
    }

    @Override // o.AbstractC9454pr
    public BigInteger d() {
        return this.d.toBigInteger();
    }

    @Override // o.AbstractC9454pr
    public double h() {
        return this.d.doubleValue();
    }

    @Override // o.AbstractC9454pr
    public String c() {
        return this.d.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.b(this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof DecimalNode) && ((DecimalNode) obj).d.compareTo(this.d) == 0;
    }

    public int hashCode() {
        return Double.valueOf(h()).hashCode();
    }
}
