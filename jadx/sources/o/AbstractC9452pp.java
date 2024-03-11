package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Collection;

/* renamed from: o.pp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9452pp<T> implements InterfaceC9428pR {
    public Boolean a(DeserializationConfig deserializationConfig) {
        return null;
    }

    public ObjectIdReader b() {
        return null;
    }

    public abstract T b(JsonParser jsonParser, DeserializationContext deserializationContext);

    public Class<?> c() {
        return null;
    }

    public Collection<Object> d() {
        return null;
    }

    public AbstractC9452pp<T> d(NameTransformer nameTransformer) {
        return this;
    }

    @Deprecated
    public T e() {
        return null;
    }

    public boolean i() {
        return false;
    }

    public T e(JsonParser jsonParser, DeserializationContext deserializationContext, T t) {
        deserializationContext.b((AbstractC9452pp<?>) this);
        return b(jsonParser, deserializationContext);
    }

    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.b(jsonParser, deserializationContext);
    }

    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra, T t) {
        deserializationContext.b((AbstractC9452pp<?>) this);
        return a(jsonParser, deserializationContext, abstractC9543ra);
    }

    @Override // o.InterfaceC9428pR
    public T c(DeserializationContext deserializationContext) {
        return e();
    }

    public AccessPattern a() {
        return AccessPattern.DYNAMIC;
    }

    public Object d(DeserializationContext deserializationContext) {
        return c(deserializationContext);
    }

    public SettableBeanProperty c(String str) {
        throw new IllegalArgumentException("Cannot handle managed/back reference '" + str + "': type: value deserializer of type " + getClass().getName() + " does not support them");
    }

    /* renamed from: o.pp$d */
    /* loaded from: classes5.dex */
    public static abstract class d extends AbstractC9452pp<Object> {
        private d() {
        }
    }
}
