package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: o.aVg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1976aVg {
    public static /* synthetic */ List e(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
