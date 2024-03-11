package o;

import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.vU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9706vU {
    public static final C9706vU d = new C9706vU();

    private C9706vU() {
    }

    /* renamed from: o.vU$c */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Function<Object[], List<? extends T>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: e */
        public List<T> apply(Object[] objArr) {
            C8632dsu.c((Object) objArr, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArr) {
                arrayList.add(obj);
            }
            return arrayList;
        }
    }
}
