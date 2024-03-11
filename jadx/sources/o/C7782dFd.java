package o;

/* renamed from: o.dFd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7782dFd extends C7784dFf {
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7782dFd(dFD dfd, boolean z) {
        super(dfd);
        C8632dsu.c((Object) dfd, "");
        this.e = z;
    }

    @Override // o.C7784dFf
    public void c(String str) {
        C8632dsu.c((Object) str, "");
        if (this.e) {
            super.c(str);
        } else {
            super.d(str);
        }
    }
}
