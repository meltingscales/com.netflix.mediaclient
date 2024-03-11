package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import java.util.BitSet;
import o.AbstractC9434pX;

/* renamed from: o.qb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9491qb {
    protected final Object[] a;
    protected Object b;
    protected final DeserializationContext c;
    protected final ObjectIdReader d;
    protected AbstractC9434pX e;
    protected final JsonParser g;
    protected final BitSet h;
    protected int i;
    protected int j;

    public AbstractC9434pX c() {
        return this.e;
    }

    public C9491qb(JsonParser jsonParser, DeserializationContext deserializationContext, int i, ObjectIdReader objectIdReader) {
        this.g = jsonParser;
        this.c = deserializationContext;
        this.j = i;
        this.d = objectIdReader;
        this.a = new Object[i];
        if (i < 32) {
            this.h = null;
        } else {
            this.h = new BitSet();
        }
    }

    public Object[] a(SettableBeanProperty[] settableBeanPropertyArr) {
        if (this.j > 0) {
            if (this.h == null) {
                int i = this.i;
                int length = this.a.length;
                int i2 = 0;
                while (i2 < length) {
                    if ((i & 1) == 0) {
                        this.a[i2] = a(settableBeanPropertyArr[i2]);
                    }
                    i2++;
                    i >>= 1;
                }
            } else {
                int length2 = this.a.length;
                int i3 = 0;
                while (true) {
                    int nextClearBit = this.h.nextClearBit(i3);
                    if (nextClearBit >= length2) {
                        break;
                    }
                    this.a[nextClearBit] = a(settableBeanPropertyArr[nextClearBit]);
                    i3 = nextClearBit + 1;
                }
            }
        }
        if (this.c.d(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i4 = 0; i4 < settableBeanPropertyArr.length; i4++) {
                if (this.a[i4] == null) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i4];
                    this.c.a(settableBeanProperty, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_FOR_CREATOR_PARAMETERS` enabled", settableBeanProperty.a(), Integer.valueOf(settableBeanPropertyArr[i4].i()));
                }
            }
        }
        return this.a;
    }

    protected Object a(SettableBeanProperty settableBeanProperty) {
        if (settableBeanProperty.g() != null) {
            return this.c.c(settableBeanProperty.g(), settableBeanProperty, (Object) null);
        }
        if (settableBeanProperty.q()) {
            this.c.a(settableBeanProperty, "Missing required creator property '%s' (index %d)", settableBeanProperty.a(), Integer.valueOf(settableBeanProperty.i()));
        }
        if (this.c.d(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            this.c.a(settableBeanProperty, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", settableBeanProperty.a(), Integer.valueOf(settableBeanProperty.i()));
        }
        Object c = settableBeanProperty.m().c(this.c);
        return c != null ? c : settableBeanProperty.o().c(this.c);
    }

    public boolean a(String str) {
        ObjectIdReader objectIdReader = this.d;
        if (objectIdReader == null || !str.equals(objectIdReader.b.c())) {
            return false;
        }
        this.b = this.d.c(this.g, this.c);
        return true;
    }

    public Object a(DeserializationContext deserializationContext, Object obj) {
        ObjectIdReader objectIdReader = this.d;
        if (objectIdReader != null) {
            Object obj2 = this.b;
            if (obj2 != null) {
                deserializationContext.d(obj2, objectIdReader.e, objectIdReader.j).d(obj);
                SettableBeanProperty settableBeanProperty = this.d.d;
                if (settableBeanProperty != null) {
                    return settableBeanProperty.c(obj, this.b);
                }
            } else {
                deserializationContext.e(objectIdReader, obj);
            }
        }
        return obj;
    }

    public boolean a(SettableBeanProperty settableBeanProperty, Object obj) {
        int i = settableBeanProperty.i();
        this.a[i] = obj;
        BitSet bitSet = this.h;
        if (bitSet == null) {
            int i2 = this.i;
            int i3 = (1 << i) | i2;
            if (i2 != i3) {
                this.i = i3;
                int i4 = this.j - 1;
                this.j = i4;
                if (i4 <= 0) {
                    return this.d == null || this.b != null;
                }
            }
        } else if (!bitSet.get(i)) {
            this.h.set(i);
            this.j--;
        }
        return false;
    }

    public void b(SettableBeanProperty settableBeanProperty, Object obj) {
        this.e = new AbstractC9434pX.a(this.e, obj, settableBeanProperty);
    }

    public void b(SettableAnyProperty settableAnyProperty, String str, Object obj) {
        this.e = new AbstractC9434pX.b(this.e, obj, settableAnyProperty, str);
    }

    public void b(Object obj, Object obj2) {
        this.e = new AbstractC9434pX.c(this.e, obj2, obj);
    }
}
