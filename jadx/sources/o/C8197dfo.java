package o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.dfo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8197dfo {
    private SharedPreferences c;
    private SharedPreferences.Editor e;

    public C8197dfo() {
        e();
    }

    private boolean e() {
        try {
            SharedPreferences sharedPreferences = ((Context) C1332Xp.b(Context.class)).getSharedPreferences("nfxpref", 0);
            this.c = sharedPreferences;
            this.e = sharedPreferences.edit();
            return true;
        } catch (Throwable th) {
            C1044Mm.e("nfxpref", "Failed to get preferences!", th);
            return false;
        }
    }

    public boolean a(String str, boolean z) {
        if (e(str)) {
            try {
                this.e.putBoolean(str, z);
                return true;
            } catch (Throwable th) {
                C1044Mm.e("nfxpref", "Failed to save to preferences!", th);
                return false;
            }
        }
        return false;
    }

    public boolean a(String str, int i) {
        if (e(str)) {
            try {
                this.e.putInt(str, i);
                return true;
            } catch (Throwable th) {
                C1044Mm.e("nfxpref", "Failed to save to preferences!", th);
                return false;
            }
        }
        return false;
    }

    public boolean b(String str, String str2) {
        if (e(str)) {
            try {
                this.e.putString(str, str2);
                return true;
            } catch (Throwable th) {
                C1044Mm.e("nfxpref", "Failed to save to preferences!", th);
                return false;
            }
        }
        return false;
    }

    public boolean d(String str, long j) {
        if (e(str)) {
            try {
                this.e.putLong(str, j);
                return true;
            } catch (Throwable th) {
                C1044Mm.e("nfxpref", "Failed to save to preferences!", th);
                return false;
            }
        }
        return false;
    }

    public boolean a(String str) {
        if (e(str)) {
            try {
                this.e.remove(str);
                return true;
            } catch (Throwable th) {
                C1044Mm.e("nfxpref", "Failed to save to preferences!", th);
                return false;
            }
        }
        return false;
    }

    private boolean e(String str) {
        if (C8168dfL.g(str)) {
            C1044Mm.j("nfxpref", "Name is null!");
            return false;
        }
        return true;
    }

    public boolean d() {
        try {
            return this.e.commit();
        } catch (Throwable th) {
            C1044Mm.e("nfxpref", "Failed to save to preferences!", th);
            return false;
        }
    }

    public void a() {
        this.e.apply();
    }
}
