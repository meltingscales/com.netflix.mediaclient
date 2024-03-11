package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import o.AbstractC9459pw;
import o.C9322nR;
import o.C9439pc;

/* loaded from: classes5.dex */
public class TextNode extends ValueNode {
    static final TextNode b = new TextNode("");
    private static final long serialVersionUID = 2;
    protected final String e;

    @Override // o.AbstractC9454pr
    public String c() {
        return this.e;
    }

    @Override // o.AbstractC9454pr
    public String y() {
        return this.e;
    }

    public TextNode(String str) {
        this.e = str;
    }

    public static TextNode c(String str) {
        if (str == null) {
            return null;
        }
        return str.length() == 0 ? b : new TextNode(str);
    }

    @Override // o.AbstractC9454pr
    public JsonNodeType m() {
        return JsonNodeType.STRING;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.VALUE_STRING;
    }

    public byte[] c(Base64Variant base64Variant) {
        String trim = this.e.trim();
        C9439pc c9439pc = new C9439pc(((trim.length() * 3) >> 2) + 4);
        try {
            base64Variant.a(trim, c9439pc);
            return c9439pc.i();
        } catch (IllegalArgumentException e) {
            throw InvalidFormatException.c(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", e.getMessage()), trim, byte[].class);
        }
    }

    @Override // o.AbstractC9454pr
    public byte[] b() {
        return c(C9322nR.e());
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        String str = this.e;
        if (str == null) {
            jsonGenerator.k();
        } else {
            jsonGenerator.i(str);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj).e.equals(this.e);
        }
        return false;
    }

    public int hashCode() {
        return this.e.hashCode();
    }
}
