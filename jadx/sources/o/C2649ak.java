package o;

import androidx.collection.LongSparseArray;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.ak  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2649ak {
    private final LongSparseArray<AbstractC3073as<?>> b;
    private final AbstractC3073as<?> c;

    C2649ak(List<? extends AbstractC3073as<?>> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Models must not be empty");
        }
        int size = list.size();
        if (size == 1) {
            this.c = list.get(0);
            this.b = null;
            return;
        }
        this.c = null;
        this.b = new LongSparseArray<>(size);
        for (AbstractC3073as<?> abstractC3073as : list) {
            this.b.put(abstractC3073as.b(), abstractC3073as);
        }
    }

    public C2649ak(AbstractC3073as<?> abstractC3073as) {
        this(Collections.singletonList(abstractC3073as));
    }

    public static AbstractC3073as<?> a(List<Object> list, long j) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            C2649ak c2649ak = (C2649ak) it.next();
            AbstractC3073as<?> abstractC3073as = c2649ak.c;
            if (abstractC3073as != null) {
                if (abstractC3073as.b() == j) {
                    return c2649ak.c;
                }
            } else {
                AbstractC3073as<?> abstractC3073as2 = c2649ak.b.get(j);
                if (abstractC3073as2 != null) {
                    return abstractC3073as2;
                }
            }
        }
        return null;
    }
}
