package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.node.ContainerNode;

/* loaded from: classes5.dex */
public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode {
    private static final long serialVersionUID = 1;
    protected final JsonNodeFactory a;

    @Override // o.AbstractC9454pr
    public String c() {
        return "";
    }

    @Override // o.AbstractC9454pr
    public abstract int u();

    /* JADX INFO: Access modifiers changed from: protected */
    public ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this.a = jsonNodeFactory;
    }

    protected ContainerNode() {
        this.a = null;
    }

    public final BooleanNode b(boolean z) {
        return this.a.e(z);
    }

    public final NullNode v() {
        return this.a.e();
    }

    public final ArrayNode x() {
        return this.a.c();
    }

    public final ObjectNode B() {
        return this.a.a();
    }

    public final TextNode b(String str) {
        return this.a.c(str);
    }
}
