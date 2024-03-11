package o;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bo  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4871bo {
    private static final Map<Class, Integer> c = new HashMap();
    AbstractC3073as<?> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e(AbstractC3073as<?> abstractC3073as) {
        this.e = abstractC3073as;
        return c(abstractC3073as);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(AbstractC3073as<?> abstractC3073as) {
        int Z_ = abstractC3073as.Z_();
        if (Z_ != 0) {
            return Z_;
        }
        Class<?> cls = abstractC3073as.getClass();
        Map<Class, Integer> map = c;
        Integer num = map.get(cls);
        if (num == null) {
            num = Integer.valueOf((-map.size()) - 1);
            map.put(cls, num);
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3073as<?> c(Z z, int i) {
        AbstractC3073as<?> abstractC3073as = this.e;
        if (abstractC3073as == null || c(abstractC3073as) != i) {
            z.d(new IllegalStateException("Last model did not match expected view type"));
            for (AbstractC3073as<?> abstractC3073as2 : z.d()) {
                if (c(abstractC3073as2) == i) {
                    return abstractC3073as2;
                }
            }
            C1943aU c1943aU = new C1943aU();
            if (i == c1943aU.Z_()) {
                return c1943aU;
            }
            throw new IllegalStateException("Could not find model for view type: " + i);
        }
        return this.e;
    }
}
