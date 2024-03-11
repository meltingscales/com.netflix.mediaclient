package o;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dqv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8579dqv extends C8571dqn {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(List<?> list, int i) {
        int t;
        int t2;
        int t3;
        t = C8569dql.t(list);
        if (new C8654dtp(0, t).a(i)) {
            t3 = C8569dql.t(list);
            return t3 - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        t2 = C8569dql.t(list);
        sb.append(new C8654dtp(0, t2));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(List<?> list, int i) {
        if (new C8654dtp(0, list.size()).a(i)) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C8654dtp(0, list.size()) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(List<?> list, int i) {
        int t;
        t = C8569dql.t(list);
        return t - i;
    }

    public static <T> List<T> w(List<T> list) {
        C8632dsu.c((Object) list, "");
        return new dqJ(list);
    }
}
