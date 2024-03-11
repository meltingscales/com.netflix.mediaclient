package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dur  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8683dur {
    public static <T> void b(Appendable appendable, T t, drM<? super T, ? extends CharSequence> drm) {
        C8632dsu.c((Object) appendable, "");
        if (drm != null) {
            appendable.append(drm.invoke(t));
        } else if (t == null || (t instanceof CharSequence)) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
