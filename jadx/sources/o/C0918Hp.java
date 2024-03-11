package o;

import android.database.sqlite.SQLiteStatement;

/* renamed from: o.Hp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0918Hp extends AbstractC0924Hv<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0918Hp(C0915Hm c0915Hm, String str, long j) {
        super(c0915Hm, str, j);
        C8632dsu.c((Object) c0915Hm, "");
        C8632dsu.c((Object) str, "");
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        b((C0918Hp) (str + "%"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0924Hv
    /* renamed from: e */
    public void d(SQLiteStatement sQLiteStatement, String str, long j) {
        C8632dsu.c((Object) sQLiteStatement, "");
        C8632dsu.c((Object) str, "");
        sQLiteStatement.bindString(1, str);
        sQLiteStatement.executeUpdateDelete();
    }
}
