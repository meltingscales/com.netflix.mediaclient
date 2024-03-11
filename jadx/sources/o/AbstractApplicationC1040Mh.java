package o;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.work.Configuration;
import io.reactivex.subjects.CompletableSubject;
import java.util.Locale;

/* renamed from: o.Mh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractApplicationC1040Mh extends Application implements Configuration.Provider {
    public static AbstractApplicationC1040Mh b;
    public static boolean c;
    public long d;
    protected Intent e;

    public static Application a() {
        return b;
    }

    public static Context d() {
        return b;
    }

    public static boolean e() {
        return c;
    }

    public static AbstractApplicationC1040Mh getInstance() {
        return b;
    }

    public abstract void a(Context context);

    public abstract void a(Locale locale);

    public abstract void b();

    public void c(Intent intent) {
        this.e = intent;
    }

    public abstract void d(Context context, String str);

    public Intent f() {
        return this.e;
    }

    public abstract long g();

    public abstract InterfaceC1929aTm h();

    public abstract C1052Mw i();

    public abstract CompletableSubject j();

    public boolean k() {
        return true;
    }

    public void l() {
        this.e = null;
    }

    public abstract void m();

    public abstract boolean n();

    public abstract NC o();

    public abstract void t();

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        b = this;
        this.d = System.currentTimeMillis();
    }

    public Long c() {
        return Long.valueOf(System.currentTimeMillis() - this.d);
    }

    @Override // androidx.work.Configuration.Provider
    public Configuration getWorkManagerConfiguration() {
        return new Configuration.Builder().build();
    }
}
