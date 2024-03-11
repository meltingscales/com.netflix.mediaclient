package o;

import android.content.ContentValues;
import android.net.Uri;

/* loaded from: classes3.dex */
public abstract class aIZ<T> extends aIX {
    protected final T b;

    protected abstract String c();

    protected abstract String e(T t);

    public aIZ(AbstractC1647aJa abstractC1647aJa, T t) {
        super(abstractC1647aJa);
        this.b = t;
    }

    public void d() {
        this.a.execute(new Runnable() { // from class: o.aIY
            @Override // java.lang.Runnable
            public final void run() {
                aIZ.this.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        final String c = c();
        final String e = e(this.b);
        for (final Uri uri : a()) {
            this.a.execute(new Runnable() { // from class: o.aIW
                @Override // java.lang.Runnable
                public final void run() {
                    aIZ.this.e(uri, c, e);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void e(Uri uri, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str, str2);
        try {
            b().getContentResolver().update(uri, contentValues, null, null);
        } catch (Exception unused) {
        }
    }
}
