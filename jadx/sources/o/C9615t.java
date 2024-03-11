package o;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import o.InterfaceC9357o;

/* renamed from: o.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C9615t implements InterfaceC9145k {
    private final Cursor d;

    public C9615t(Cursor cursor, Long l) {
        C8632dsu.c((Object) cursor, "");
        this.d = cursor;
        if (Build.VERSION.SDK_INT < 28 || l == null || !(cursor instanceof AbstractWindowedCursor)) {
            return;
        }
        C9813x.e((AbstractWindowedCursor) cursor, l.longValue());
    }

    @Override // o.InterfaceC9145k
    public /* synthetic */ InterfaceC9357o c() {
        return InterfaceC9357o.d.d(a());
    }

    public Object a() {
        return InterfaceC9357o.d.a(Boolean.valueOf(this.d.moveToNext()));
    }

    @Override // o.InterfaceC9145k
    public String e(int i) {
        if (this.d.isNull(i)) {
            return null;
        }
        return this.d.getString(i);
    }

    @Override // o.InterfaceC9145k
    public Long b(int i) {
        if (this.d.isNull(i)) {
            return null;
        }
        return Long.valueOf(this.d.getLong(i));
    }
}
