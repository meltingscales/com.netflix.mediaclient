package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import o.AbstractC9452pp;
import o.AbstractC9454pr;
import o.AbstractC9543ra;

/* loaded from: classes5.dex */
public class JsonNodeDeserializer extends BaseNodeDeserializer<AbstractC9454pr> {
    private static final JsonNodeDeserializer d = new JsonNodeDeserializer();

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, o.AbstractC9452pp
    public /* bridge */ /* synthetic */ Boolean a(DeserializationConfig deserializationConfig) {
        return super.a(deserializationConfig);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public /* bridge */ /* synthetic */ Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return super.a(jsonParser, deserializationContext, abstractC9543ra);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, o.AbstractC9452pp
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    protected JsonNodeDeserializer() {
        super(AbstractC9454pr.class, null);
    }

    public static AbstractC9452pp<? extends AbstractC9454pr> e(Class<?> cls) {
        if (cls == ObjectNode.class) {
            return ObjectDeserializer.h();
        }
        return cls == ArrayNode.class ? ArrayDeserializer.h() : d;
    }

    @Override // o.AbstractC9452pp, o.InterfaceC9428pR
    /* renamed from: a */
    public AbstractC9454pr c(DeserializationContext deserializationContext) {
        return deserializationContext.o().e();
    }

    @Override // o.AbstractC9452pp
    /* renamed from: d */
    public AbstractC9454pr b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int j = jsonParser.j();
        if (j != 1) {
            if (j == 3) {
                return a(jsonParser, deserializationContext, deserializationContext.o());
            }
            return c(jsonParser, deserializationContext, deserializationContext.o());
        }
        return i(jsonParser, deserializationContext, deserializationContext.o());
    }

    /* loaded from: classes5.dex */
    static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        protected static final ObjectDeserializer a = new ObjectDeserializer();
        private static final long serialVersionUID = 1;

        public static ObjectDeserializer h() {
            return a;
        }

        protected ObjectDeserializer() {
            super(ObjectNode.class, Boolean.TRUE);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: d */
        public ObjectNode b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.K()) {
                return i(jsonParser, deserializationContext, deserializationContext.o());
            }
            if (jsonParser.a(JsonToken.FIELD_NAME)) {
                return f(jsonParser, deserializationContext, deserializationContext.o());
            }
            if (jsonParser.a(JsonToken.END_OBJECT)) {
                return deserializationContext.o().a();
            }
            return (ObjectNode) deserializationContext.e(ObjectNode.class, jsonParser);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public ObjectNode e(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) {
            if (jsonParser.K() || jsonParser.a(JsonToken.FIELD_NAME)) {
                return (ObjectNode) b(jsonParser, deserializationContext, objectNode);
            }
            return (ObjectNode) deserializationContext.e(ObjectNode.class, jsonParser);
        }
    }

    /* loaded from: classes5.dex */
    static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        protected static final ArrayDeserializer a = new ArrayDeserializer();
        private static final long serialVersionUID = 1;

        public static ArrayDeserializer h() {
            return a;
        }

        protected ArrayDeserializer() {
            super(ArrayNode.class, Boolean.TRUE);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: d */
        public ArrayNode b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.J()) {
                return a(jsonParser, deserializationContext, deserializationContext.o());
            }
            return (ArrayNode) deserializationContext.e(ArrayNode.class, jsonParser);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public ArrayNode e(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) {
            if (jsonParser.J()) {
                return (ArrayNode) b(jsonParser, deserializationContext, arrayNode);
            }
            return (ArrayNode) deserializationContext.e(ArrayNode.class, jsonParser);
        }
    }
}
