package o;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;

/* renamed from: o.jb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9120jb extends AbstractC9054iO {
    private final InterfaceC9569s e;

    public C9120jb(InterfaceC9569s interfaceC9569s) {
        C8632dsu.c((Object) interfaceC9569s, "");
        this.e = interfaceC9569s;
    }

    public /* synthetic */ C9120jb(Context context, String str, SupportSQLiteOpenHelper.Factory factory, boolean z, int i, C8627dsp c8627dsp) {
        this(context, (i & 2) != 0 ? "apollo.db" : str, (i & 4) != 0 ? new FrameworkSQLiteOpenHelperFactory() : factory, (i & 8) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9120jb(android.content.Context r13, java.lang.String r14, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r15, boolean r16) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            r1 = r13
            o.C8632dsu.c(r13, r0)
            r5 = r15
            o.C8632dsu.c(r15, r0)
            o.p r2 = o.C9125jg.c()
            android.content.Context r3 = r13.getApplicationContext()
            o.C8632dsu.a(r3, r0)
            o.u r0 = new o.u
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 176(0xb0, float:2.47E-43)
            r11 = 0
            r1 = r0
            r4 = r14
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r12
            r12.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9120jb.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$Factory, boolean):void");
    }

    @Override // o.AbstractC9054iO
    public AbstractC9055iP b() {
        return new C9119ja(C9125jg.e(this.e));
    }
}
