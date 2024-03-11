package o;

/* loaded from: classes5.dex */
final class dwL {
    public final Object a;
    public final AbstractC8744dwy b;
    public final drM<Throwable, dpR> c;
    public final Object d;
    public final Throwable e;

    public static /* synthetic */ dwL d(dwL dwl, Object obj, AbstractC8744dwy abstractC8744dwy, drM drm, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = dwl.d;
        }
        if ((i & 2) != 0) {
            abstractC8744dwy = dwl.b;
        }
        AbstractC8744dwy abstractC8744dwy2 = abstractC8744dwy;
        drM<Throwable, dpR> drm2 = drm;
        if ((i & 4) != 0) {
            drm2 = dwl.c;
        }
        drM drm3 = drm2;
        if ((i & 8) != 0) {
            obj2 = dwl.a;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = dwl.e;
        }
        return dwl.d(obj, abstractC8744dwy2, drm3, obj4, th);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final dwL d(Object obj, AbstractC8744dwy abstractC8744dwy, drM<? super Throwable, dpR> drm, Object obj2, Throwable th) {
        return new dwL(obj, abstractC8744dwy, drm, obj2, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dwL) {
            dwL dwl = (dwL) obj;
            return C8632dsu.c(this.d, dwl.d) && C8632dsu.c(this.b, dwl.b) && C8632dsu.c(this.c, dwl.c) && C8632dsu.c(this.a, dwl.a) && C8632dsu.c(this.e, dwl.e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.d;
        int hashCode = obj == null ? 0 : obj.hashCode();
        AbstractC8744dwy abstractC8744dwy = this.b;
        int hashCode2 = abstractC8744dwy == null ? 0 : abstractC8744dwy.hashCode();
        drM<Throwable, dpR> drm = this.c;
        int hashCode3 = drm == null ? 0 : drm.hashCode();
        Object obj2 = this.a;
        int hashCode4 = obj2 == null ? 0 : obj2.hashCode();
        Throwable th = this.e;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.d + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.a + ", cancelCause=" + this.e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dwL(Object obj, AbstractC8744dwy abstractC8744dwy, drM<? super Throwable, dpR> drm, Object obj2, Throwable th) {
        this.d = obj;
        this.b = abstractC8744dwy;
        this.c = drm;
        this.a = obj2;
        this.e = th;
    }

    public /* synthetic */ dwL(Object obj, AbstractC8744dwy abstractC8744dwy, drM drm, Object obj2, Throwable th, int i, C8627dsp c8627dsp) {
        this(obj, (i & 2) != 0 ? null : abstractC8744dwy, (i & 4) != 0 ? null : drm, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    public final void c(C8741dwv<?> c8741dwv, Throwable th) {
        AbstractC8744dwy abstractC8744dwy = this.b;
        if (abstractC8744dwy != null) {
            c8741dwv.c(abstractC8744dwy, th);
        }
        drM<Throwable, dpR> drm = this.c;
        if (drm != null) {
            c8741dwv.d(drm, th);
        }
    }
}
