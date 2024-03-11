package o;

import androidx.sqlite.db.SupportSQLiteStatement;

/* renamed from: o.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9516r implements InterfaceC9866y {
    private final SupportSQLiteStatement a;

    public C9516r(SupportSQLiteStatement supportSQLiteStatement) {
        C8632dsu.c((Object) supportSQLiteStatement, "");
        this.a = supportSQLiteStatement;
    }

    @Override // o.InterfaceC9463q
    public void e(int i, String str) {
        if (str == null) {
            this.a.bindNull(i + 1);
        } else {
            this.a.bindString(i + 1, str);
        }
    }

    @Override // o.InterfaceC9866y
    public <R> R e(drM<? super InterfaceC9145k, ? extends InterfaceC9357o<R>> drm) {
        C8632dsu.c((Object) drm, "");
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC9866y
    public long a() {
        return this.a.executeUpdateDelete();
    }

    @Override // o.InterfaceC9866y
    public void c() {
        this.a.close();
    }
}
