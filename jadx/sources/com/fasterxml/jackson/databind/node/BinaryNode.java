package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import java.util.Arrays;
import o.AbstractC9459pw;
import o.C9322nR;

/* loaded from: classes5.dex */
public class BinaryNode extends ValueNode {
    static final BinaryNode d = new BinaryNode(new byte[0]);
    private static final long serialVersionUID = 2;
    protected final byte[] b;

    @Override // o.AbstractC9454pr
    public byte[] b() {
        return this.b;
    }

    public BinaryNode(byte[] bArr) {
        this.b = bArr;
    }

    public static BinaryNode b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? d : new BinaryNode(bArr);
    }

    @Override // o.AbstractC9454pr
    public JsonNodeType m() {
        return JsonNodeType.BINARY;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, o.InterfaceC9330nZ
    public JsonToken e() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // o.AbstractC9454pr
    public String c() {
        return C9322nR.e().a(this.b, false);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC9451po
    public final void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Base64Variant i = abstractC9459pw.c().i();
        byte[] bArr = this.b;
        jsonGenerator.e(i, bArr, 0, bArr.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BinaryNode)) {
            return Arrays.equals(((BinaryNode) obj).b, this.b);
        }
        return false;
    }

    public int hashCode() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }
}
