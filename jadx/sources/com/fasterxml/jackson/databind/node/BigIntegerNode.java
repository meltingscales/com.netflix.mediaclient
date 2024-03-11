package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC9459pw;

/* loaded from: classes5.dex */
public class BigIntegerNode extends NumericNode {
    protected final BigInteger e;
    private static final BigInteger c = BigInteger.valueOf(-2147483648L);
    private static final BigInteger b = BigInteger.valueOf(2147483647L);
    private static final BigInteger d = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);

    @Override // o.AbstractC9454pr
    public BigInteger d() {
        return this.e;
    }

    @Override // o.AbstractC9454pr
    public Number s() {
        return this.e;
    }

    public BigIntegerNode(BigInteger bigInteger) {
        this.e = bigInteger;
    }

    public static BigIntegerNode a(BigInteger bigInteger) {
        return new BigIntegerNode(bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9330nZ
    public JsonParser.NumberType a() {
        return JsonParser.NumberType.BIG_INTEGER;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean f() {
        return this.e.compareTo(c) >= 0 && this.e.compareTo(b) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean j() {
        return this.e.compareTo(d) >= 0 && this.e.compareTo(a) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public int o() {
        return this.e.intValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public long r() {
        return this.e.longValue();
    }

    @Override // o.AbstractC9454pr
    public double h() {
        return this.e.doubleValue();
    }

    @Override // o.AbstractC9454pr
    public BigDecimal g() {
        return new BigDecimal(this.e);
    }

    @Override // o.AbstractC9454pr
    public String c() {
        return this.e.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.e(this.e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BigIntegerNode)) {
            return ((BigIntegerNode) obj).e.equals(this.e);
        }
        return false;
    }

    public int hashCode() {
        return this.e.hashCode();
    }
}
