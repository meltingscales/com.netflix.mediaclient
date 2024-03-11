package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.lZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9224lZ implements InterfaceC9164kS {
    public static final b c = new b(null);
    private final SharedPreferences a;

    public C9224lZ(Context context) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.getSharedPreferences("com.bugsnag.android", 0);
        } catch (RuntimeException unused) {
            sharedPreferences = null;
        }
        this.a = sharedPreferences;
    }

    @Override // o.InterfaceC9164kS
    public String c(boolean z) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("install.iud", null);
    }

    public final C9294mq c(String str) {
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences == null ? null : sharedPreferences.getString("user.id", str);
        SharedPreferences sharedPreferences2 = this.a;
        String string2 = sharedPreferences2 == null ? null : sharedPreferences2.getString("user.email", null);
        SharedPreferences sharedPreferences3 = this.a;
        return new C9294mq(string, string2, sharedPreferences3 != null ? sharedPreferences3.getString("user.name", null) : null);
    }

    public final boolean a() {
        SharedPreferences sharedPreferences = this.a;
        return C8632dsu.c(sharedPreferences == null ? null : Boolean.valueOf(sharedPreferences.contains("install.iud")), Boolean.TRUE);
    }

    @SuppressLint({"ApplySharedPref"})
    public final void b() {
        SharedPreferences.Editor clear;
        if (a()) {
            SharedPreferences sharedPreferences = this.a;
            SharedPreferences.Editor edit = sharedPreferences == null ? null : sharedPreferences.edit();
            if (edit == null || (clear = edit.clear()) == null) {
                return;
            }
            clear.commit();
        }
    }

    /* renamed from: o.lZ$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
