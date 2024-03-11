package o;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9738w implements SupportSQLiteQuery, InterfaceC9866y {
    private final int a;
    private final List<drM<SupportSQLiteProgram, dpR>> b;
    private final String c;
    private final SupportSQLiteDatabase d;
    private final Long e;

    @Override // o.InterfaceC9866y
    public void c() {
    }

    public int e() {
        return this.a;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        return this.c;
    }

    public C9738w(String str, SupportSQLiteDatabase supportSQLiteDatabase, int i, Long l) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        this.c = str;
        this.d = supportSQLiteDatabase;
        this.a = i;
        this.e = l;
        int e = e();
        ArrayList arrayList = new ArrayList(e);
        for (int i2 = 0; i2 < e; i2++) {
            arrayList.add(null);
        }
        this.b = arrayList;
    }

    @Override // o.InterfaceC9866y
    public /* synthetic */ long a() {
        return ((Number) b()).longValue();
    }

    @Override // o.InterfaceC9463q
    public void e(final int i, final String str) {
        this.b.set(i, new drM<SupportSQLiteProgram, dpR>() { // from class: app.cash.sqldelight.driver.android.AndroidQuery$bindString$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(SupportSQLiteProgram supportSQLiteProgram) {
                C8632dsu.c((Object) supportSQLiteProgram, "");
                String str2 = str;
                if (str2 == null) {
                    supportSQLiteProgram.bindNull(i + 1);
                } else {
                    supportSQLiteProgram.bindString(i + 1, str2);
                }
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(SupportSQLiteProgram supportSQLiteProgram) {
                a(supportSQLiteProgram);
                return dpR.c;
            }
        });
    }

    public Void b() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC9866y
    public <R> R e(drM<? super InterfaceC9145k, ? extends InterfaceC9357o<R>> drm) {
        C8632dsu.c((Object) drm, "");
        Cursor query = this.d.query(this);
        try {
            R d = drm.invoke(new C9615t(query, this.e)).d();
            C8608drx.a(query, null);
            return d;
        } finally {
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        C8632dsu.c((Object) supportSQLiteProgram, "");
        for (drM<SupportSQLiteProgram, dpR> drm : this.b) {
            C8632dsu.d(drm);
            drm.invoke(supportSQLiteProgram);
        }
    }

    public String toString() {
        return getSql();
    }
}
