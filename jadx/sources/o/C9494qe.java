package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: o.qe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9494qe {
    protected InterfaceC9317nM a;
    protected final ObjectIdGenerator.IdKey b;
    protected Object c;
    protected LinkedList<d> d;

    public void b(InterfaceC9317nM interfaceC9317nM) {
        this.a = interfaceC9317nM;
    }

    public boolean d(DeserializationContext deserializationContext) {
        return false;
    }

    public ObjectIdGenerator.IdKey e() {
        return this.b;
    }

    public C9494qe(ObjectIdGenerator.IdKey idKey) {
        this.b = idKey;
    }

    public void e(d dVar) {
        if (this.d == null) {
            this.d = new LinkedList<>();
        }
        this.d.add(dVar);
    }

    public void d(Object obj) {
        this.a.b(this.b, obj);
        this.c = obj;
        Object obj2 = this.b.a;
        LinkedList<d> linkedList = this.d;
        if (linkedList != null) {
            Iterator<d> it = linkedList.iterator();
            this.d = null;
            while (it.hasNext()) {
                it.next().c(obj2, obj);
            }
        }
    }

    public Object b() {
        Object b = this.a.b(this.b);
        this.c = b;
        return b;
    }

    public boolean c() {
        LinkedList<d> linkedList = this.d;
        return (linkedList == null || linkedList.isEmpty()) ? false : true;
    }

    public Iterator<d> d() {
        LinkedList<d> linkedList = this.d;
        if (linkedList == null) {
            return Collections.emptyList().iterator();
        }
        return linkedList.iterator();
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    /* renamed from: o.qe$d */
    /* loaded from: classes5.dex */
    public static abstract class d {
        private final UnresolvedForwardReference b;
        private final Class<?> c;

        public Class<?> c() {
            return this.c;
        }

        public abstract void c(Object obj, Object obj2);

        public d(UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            this.b = unresolvedForwardReference;
            this.c = cls;
        }

        public d(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this.b = unresolvedForwardReference;
            this.c = javaType.h();
        }

        public JsonLocation d() {
            return this.b.b();
        }

        public boolean d(Object obj) {
            return obj.equals(this.b.f());
        }
    }
}
