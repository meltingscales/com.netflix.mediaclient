package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC9459pw;
import o.C9394ok;

/* loaded from: classes5.dex */
public class IntNode extends NumericNode {
    private static final IntNode[] d = new IntNode[12];
    protected final int a;

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean f() {
        return true;
    }

    @Override // o.AbstractC9454pr
    public double h() {
        return this.a;
    }

    public int hashCode() {
        return this.a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public boolean j() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public int o() {
        return this.a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, o.AbstractC9454pr
    public long r() {
        return this.a;
    }

    static {
        for (int i = 0; i < 12; i++) {
            d[i] = new IntNode(i - 1);
        }
    }

    public IntNode(int i) {
        this.a = i;
    }

    public static IntNode d(int i) {
        if (i > 10 || i < -1) {
            return new IntNode(i);
        }
        return d[i + 1];
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9330nZ
    public JsonParser.NumberType a() {
        return JsonParser.NumberType.INT;
    }

    @Override // o.AbstractC9454pr
    public Number s() {
        return Integer.valueOf(this.a);
    }

    @Override // o.AbstractC9454pr
    public BigDecimal g() {
        return BigDecimal.valueOf(this.a);
    }

    @Override // o.AbstractC9454pr
    public BigInteger d() {
        return BigInteger.valueOf(this.a);
    }

    @Override // o.AbstractC9454pr
    public String c() {
        return C9394ok.c(this.a);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.c(this.a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof IntNode) && ((IntNode) obj).a == this.a;
    }
}
