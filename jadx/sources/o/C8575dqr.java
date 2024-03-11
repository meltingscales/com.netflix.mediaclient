package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dqr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8575dqr extends C8573dqp {
    public static <T extends Comparable<? super T>> void s(List<T> list) {
        C8632dsu.c((Object) list, "");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void c(List<T> list, Comparator<? super T> comparator) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) comparator, "");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
