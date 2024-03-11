package o;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.ext.NioPathSerializer;

/* renamed from: o.qi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9498qi extends AbstractC9493qd {
    private final Class<?> b = C9499qj.e();

    @Override // o.AbstractC9493qd
    public AbstractC9452pp<?> d(Class<?> cls) {
        if (cls == this.b) {
            return new NioPathDeserializer();
        }
        return null;
    }

    @Override // o.AbstractC9493qd
    public AbstractC9453pq<?> c(Class<?> cls) {
        if (this.b.isAssignableFrom(cls)) {
            return new NioPathSerializer();
        }
        return null;
    }
}
