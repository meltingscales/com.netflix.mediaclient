package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.baU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4223baU {
    public final int a;
    public final long b;
    public final String d;

    public C4223baU(String str, int i, long j) {
        this.d = str;
        this.a = i;
        this.b = j;
    }

    public static void a(List<C4223baU> list) {
        Collections.sort(list, new Comparator<C4223baU>() { // from class: o.baU.2
            @Override // java.util.Comparator
            /* renamed from: d */
            public int compare(C4223baU c4223baU, C4223baU c4223baU2) {
                return c4223baU.a - c4223baU2.a;
            }
        });
    }
}
