package o;

/* renamed from: o.fK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8891fK {
    public static final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> S c(Class<? extends VM> cls, AbstractC8979gt abstractC8979gt) {
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) abstractC8979gt, "");
        Class a = C8964ge.a(cls);
        if (a != null) {
            try {
                return (S) a.getMethod("initialState", AbstractC8979gt.class).invoke(C8964ge.e(a), abstractC8979gt);
            } catch (NoSuchMethodException unused) {
                return (S) cls.getMethod("initialState", AbstractC8979gt.class).invoke(null, abstractC8979gt);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <VM extends o.AbstractC8899fS<S>, S extends o.InterfaceC8888fH> S b(java.lang.Class<? extends VM> r10, java.lang.Class<? extends S> r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8891fK.b(java.lang.Class, java.lang.Class, java.lang.Object):o.fH");
    }
}
