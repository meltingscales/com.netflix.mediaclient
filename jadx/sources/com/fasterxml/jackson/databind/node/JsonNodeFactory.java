package com.fasterxml.jackson.databind.node;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC9454pr;
import o.C9540rX;

/* loaded from: classes.dex */
public class JsonNodeFactory implements Serializable {
    public static final JsonNodeFactory a;
    private static final JsonNodeFactory b;
    private static final JsonNodeFactory c;
    private static final long serialVersionUID = 1;
    private final boolean d;

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        b = jsonNodeFactory;
        c = new JsonNodeFactory(true);
        a = jsonNodeFactory;
    }

    public JsonNodeFactory(boolean z) {
        this.d = z;
    }

    protected JsonNodeFactory() {
        this(false);
    }

    public BooleanNode e(boolean z) {
        return z ? BooleanNode.v() : BooleanNode.w();
    }

    public NullNode e() {
        return NullNode.w();
    }

    public AbstractC9454pr b() {
        return MissingNode.v();
    }

    public NumericNode c(int i) {
        return IntNode.d(i);
    }

    public NumericNode b(long j) {
        return LongNode.b(j);
    }

    public ValueNode e(BigInteger bigInteger) {
        if (bigInteger == null) {
            return e();
        }
        return BigIntegerNode.a(bigInteger);
    }

    public NumericNode a(float f) {
        return FloatNode.a(f);
    }

    public NumericNode b(double d) {
        return DoubleNode.b(d);
    }

    public ValueNode e(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return e();
        }
        if (this.d) {
            return DecimalNode.e(bigDecimal);
        }
        return bigDecimal.compareTo(BigDecimal.ZERO) == 0 ? DecimalNode.b : DecimalNode.e(bigDecimal.stripTrailingZeros());
    }

    public TextNode c(String str) {
        return TextNode.c(str);
    }

    public BinaryNode a(byte[] bArr) {
        return BinaryNode.b(bArr);
    }

    public ArrayNode c() {
        return new ArrayNode(this);
    }

    public ObjectNode a() {
        return new ObjectNode(this);
    }

    public ValueNode a(Object obj) {
        return new POJONode(obj);
    }

    public ValueNode d(C9540rX c9540rX) {
        return new POJONode(c9540rX);
    }
}
