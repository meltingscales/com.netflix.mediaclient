package o;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.qw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9512qw implements Iterable<AnnotatedMethod> {
    protected Map<C9467qD, AnnotatedMethod> d;

    public C9512qw() {
    }

    public C9512qw(Map<C9467qD, AnnotatedMethod> map) {
        this.d = map;
    }

    public AnnotatedMethod c(String str, Class<?>[] clsArr) {
        Map<C9467qD, AnnotatedMethod> map = this.d;
        if (map == null) {
            return null;
        }
        return map.get(new C9467qD(str, clsArr));
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotatedMethod> iterator() {
        Map<C9467qD, AnnotatedMethod> map = this.d;
        if (map == null) {
            return Collections.emptyIterator();
        }
        return map.values().iterator();
    }
}
