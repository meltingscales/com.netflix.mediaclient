package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import o.AbstractC9454pr;
import o.AbstractC9543ra;
import o.C9540rX;

/* loaded from: classes5.dex */
abstract class BaseNodeDeserializer<T extends AbstractC9454pr> extends StdDeserializer<T> {
    protected final Boolean b;

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return this.b;
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return true;
    }

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this.b = bool;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.b(jsonParser, deserializationContext);
    }

    protected void c(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, AbstractC9454pr abstractC9454pr, AbstractC9454pr abstractC9454pr2) {
        if (deserializationContext.d(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.b(AbstractC9454pr.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ObjectNode i(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        AbstractC9454pr i;
        ObjectNode a = jsonNodeFactory.a();
        String R = jsonParser.R();
        while (R != null) {
            JsonToken Q = jsonParser.Q();
            if (Q == null) {
                Q = JsonToken.NOT_AVAILABLE;
            }
            int c = Q.c();
            if (c == 1) {
                i = i(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (c == 3) {
                i = a(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (c == 6) {
                i = jsonNodeFactory.c(jsonParser.A());
            } else if (c == 7) {
                i = e(jsonParser, deserializationContext, jsonNodeFactory);
            } else {
                switch (c) {
                    case 9:
                        i = jsonNodeFactory.e(true);
                        break;
                    case 10:
                        i = jsonNodeFactory.e(false);
                        break;
                    case 11:
                        i = jsonNodeFactory.e();
                        break;
                    case 12:
                        i = d(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                    default:
                        i = c(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            }
            AbstractC9454pr abstractC9454pr = i;
            AbstractC9454pr b = a.b(R, abstractC9454pr);
            if (b != null) {
                c(jsonParser, deserializationContext, jsonNodeFactory, R, a, b, abstractC9454pr);
            }
            R = jsonParser.R();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ObjectNode f(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        AbstractC9454pr i;
        ObjectNode a = jsonNodeFactory.a();
        String l = jsonParser.l();
        while (l != null) {
            JsonToken Q = jsonParser.Q();
            if (Q == null) {
                Q = JsonToken.NOT_AVAILABLE;
            }
            int c = Q.c();
            if (c == 1) {
                i = i(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (c == 3) {
                i = a(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (c == 6) {
                i = jsonNodeFactory.c(jsonParser.A());
            } else if (c == 7) {
                i = e(jsonParser, deserializationContext, jsonNodeFactory);
            } else {
                switch (c) {
                    case 9:
                        i = jsonNodeFactory.e(true);
                        break;
                    case 10:
                        i = jsonNodeFactory.e(false);
                        break;
                    case 11:
                        i = jsonNodeFactory.e();
                        break;
                    case 12:
                        i = d(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                    default:
                        i = c(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            }
            AbstractC9454pr abstractC9454pr = i;
            AbstractC9454pr b = a.b(l, abstractC9454pr);
            if (b != null) {
                c(jsonParser, deserializationContext, jsonNodeFactory, l, a, b, abstractC9454pr);
            }
            l = jsonParser.R();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC9454pr b(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) {
        String l;
        AbstractC9454pr i;
        if (jsonParser.K()) {
            l = jsonParser.R();
        } else if (!jsonParser.a(JsonToken.FIELD_NAME)) {
            return (AbstractC9454pr) b(jsonParser, deserializationContext);
        } else {
            l = jsonParser.l();
        }
        while (l != null) {
            JsonToken Q = jsonParser.Q();
            AbstractC9454pr a = objectNode.a(l);
            if (a != null) {
                if (a instanceof ObjectNode) {
                    AbstractC9454pr b = b(jsonParser, deserializationContext, (ObjectNode) a);
                    if (b != a) {
                        objectNode.c(l, b);
                    }
                } else if (a instanceof ArrayNode) {
                    AbstractC9454pr b2 = b(jsonParser, deserializationContext, (ArrayNode) a);
                    if (b2 != a) {
                        objectNode.c(l, b2);
                    }
                }
                l = jsonParser.R();
            }
            if (Q == null) {
                Q = JsonToken.NOT_AVAILABLE;
            }
            JsonNodeFactory o2 = deserializationContext.o();
            int c = Q.c();
            if (c == 1) {
                i = i(jsonParser, deserializationContext, o2);
            } else if (c == 3) {
                i = a(jsonParser, deserializationContext, o2);
            } else if (c == 6) {
                i = o2.c(jsonParser.A());
            } else if (c == 7) {
                i = e(jsonParser, deserializationContext, o2);
            } else {
                switch (c) {
                    case 9:
                        i = o2.e(true);
                        break;
                    case 10:
                        i = o2.e(false);
                        break;
                    case 11:
                        i = o2.e();
                        break;
                    case 12:
                        i = d(jsonParser, deserializationContext, o2);
                        break;
                    default:
                        i = c(jsonParser, deserializationContext, o2);
                        break;
                }
            }
            AbstractC9454pr abstractC9454pr = i;
            if (a != null) {
                c(jsonParser, deserializationContext, o2, l, objectNode, a, abstractC9454pr);
            }
            objectNode.c(l, abstractC9454pr);
            l = jsonParser.R();
        }
        return objectNode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayNode a(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        ArrayNode c = jsonNodeFactory.c();
        while (true) {
            switch (jsonParser.Q().c()) {
                case 1:
                    c.a(i(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 2:
                case 5:
                case 8:
                default:
                    c.a(c(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 3:
                    c.a(a(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 4:
                    return c;
                case 6:
                    c.a(jsonNodeFactory.c(jsonParser.A()));
                    break;
                case 7:
                    c.a(e(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 9:
                    c.a(jsonNodeFactory.e(true));
                    break;
                case 10:
                    c.a(jsonNodeFactory.e(false));
                    break;
                case 11:
                    c.a(jsonNodeFactory.e());
                    break;
                case 12:
                    c.a(d(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC9454pr b(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) {
        JsonNodeFactory o2 = deserializationContext.o();
        while (true) {
            switch (jsonParser.Q().c()) {
                case 1:
                    arrayNode.a(i(jsonParser, deserializationContext, o2));
                    break;
                case 2:
                case 5:
                case 8:
                default:
                    arrayNode.a(c(jsonParser, deserializationContext, o2));
                    break;
                case 3:
                    arrayNode.a(a(jsonParser, deserializationContext, o2));
                    break;
                case 4:
                    return arrayNode;
                case 6:
                    arrayNode.a(o2.c(jsonParser.A()));
                    break;
                case 7:
                    arrayNode.a(e(jsonParser, deserializationContext, o2));
                    break;
                case 9:
                    arrayNode.a(o2.e(true));
                    break;
                case 10:
                    arrayNode.a(o2.e(false));
                    break;
                case 11:
                    arrayNode.a(o2.e());
                    break;
                case 12:
                    arrayNode.a(d(jsonParser, deserializationContext, o2));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC9454pr c(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        int j = jsonParser.j();
        if (j == 2) {
            return jsonNodeFactory.a();
        }
        switch (j) {
            case 5:
                return f(jsonParser, deserializationContext, jsonNodeFactory);
            case 6:
                return jsonNodeFactory.c(jsonParser.A());
            case 7:
                return e(jsonParser, deserializationContext, jsonNodeFactory);
            case 8:
                return b(jsonParser, deserializationContext, jsonNodeFactory);
            case 9:
                return jsonNodeFactory.e(true);
            case 10:
                return jsonNodeFactory.e(false);
            case 11:
                return jsonNodeFactory.e();
            case 12:
                return d(jsonParser, deserializationContext, jsonNodeFactory);
            default:
                return (AbstractC9454pr) deserializationContext.e(c(), jsonParser);
        }
    }

    protected final AbstractC9454pr e(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        JsonParser.NumberType v;
        int k = deserializationContext.k();
        if ((StdDeserializer.D & k) != 0) {
            if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.a(k)) {
                v = JsonParser.NumberType.BIG_INTEGER;
            } else if (DeserializationFeature.USE_LONG_FOR_INTS.a(k)) {
                v = JsonParser.NumberType.LONG;
            } else {
                v = jsonParser.v();
            }
        } else {
            v = jsonParser.v();
        }
        if (v == JsonParser.NumberType.INT) {
            return jsonNodeFactory.c(jsonParser.u());
        }
        if (v == JsonParser.NumberType.LONG) {
            return jsonNodeFactory.b(jsonParser.w());
        }
        return jsonNodeFactory.e(jsonParser.h());
    }

    protected final AbstractC9454pr b(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        JsonParser.NumberType v = jsonParser.v();
        if (v == JsonParser.NumberType.BIG_DECIMAL) {
            return jsonNodeFactory.e(jsonParser.r());
        }
        if (deserializationContext.d(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            if (jsonParser.P()) {
                return jsonNodeFactory.b(jsonParser.p());
            }
            return jsonNodeFactory.e(jsonParser.r());
        } else if (v == JsonParser.NumberType.FLOAT) {
            return jsonNodeFactory.a(jsonParser.s());
        } else {
            return jsonNodeFactory.b(jsonParser.p());
        }
    }

    protected final AbstractC9454pr d(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        Object q = jsonParser.q();
        if (q == null) {
            return jsonNodeFactory.e();
        }
        if (q.getClass() == byte[].class) {
            return jsonNodeFactory.a((byte[]) q);
        }
        if (q instanceof C9540rX) {
            return jsonNodeFactory.d((C9540rX) q);
        }
        if (q instanceof AbstractC9454pr) {
            return (AbstractC9454pr) q;
        }
        return jsonNodeFactory.a(q);
    }
}
