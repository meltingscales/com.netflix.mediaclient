package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.qc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9492qc {
    protected final List<SettableBeanProperty> b;

    public C9492qc() {
        this.b = new ArrayList();
    }

    protected C9492qc(List<SettableBeanProperty> list) {
        this.b = list;
    }

    public void b(SettableBeanProperty settableBeanProperty) {
        this.b.add(settableBeanProperty);
    }

    public C9492qc a(NameTransformer nameTransformer) {
        AbstractC9452pp<Object> d;
        ArrayList arrayList = new ArrayList(this.b.size());
        for (SettableBeanProperty settableBeanProperty : this.b) {
            SettableBeanProperty e = settableBeanProperty.e(nameTransformer.c(settableBeanProperty.a()));
            AbstractC9452pp<Object> o2 = e.o();
            if (o2 != null && (d = o2.d(nameTransformer)) != o2) {
                e = e.d(d);
            }
            arrayList.add(e);
        }
        return new C9492qc(arrayList);
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, C9542rZ c9542rZ) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            JsonParser m = c9542rZ.m();
            m.Q();
            this.b.get(i).d(m, deserializationContext, obj);
        }
        return obj;
    }
}
