package o;

import com.fasterxml.jackson.core.JsonLocation;

/* renamed from: o.pT  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9430pT {
    private final Object b;
    private final Class<?> c;
    private final JsonLocation d;

    public C9430pT(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.b = obj;
        this.c = cls;
        this.d = jsonLocation;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", this.b, C9537rU.u(this.c), this.d);
    }
}
