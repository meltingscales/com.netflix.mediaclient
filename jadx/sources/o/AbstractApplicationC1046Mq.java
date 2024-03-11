package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@SuppressLint({"Registered"})
/* renamed from: o.Mq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractApplicationC1046Mq extends NetflixApplication {
    @Override // com.netflix.mediaclient.NetflixApplication, o.AbstractApplicationC1040Mh, android.app.Application
    public void onCreate() {
        super.onCreate();
        if (k()) {
            N();
            P();
        }
    }

    private final void P() {
        C7017coI.c.d(AbstractC1608aHp.c.e());
        InterfaceC5958cOs.b.d().a();
        C5375bxa.b.c();
        C6854clE.c.a();
    }

    @Override // com.netflix.mediaclient.NetflixApplication
    public void c(ExternalCrashReporter externalCrashReporter) {
        C8632dsu.c((Object) externalCrashReporter, "");
        super.c(externalCrashReporter);
        externalCrashReporter.d("versionCode", "50626");
    }

    @Override // com.netflix.mediaclient.NetflixApplication
    public void e(Map<String, String> map) {
        C8632dsu.c((Object) map, "");
        super.e(map);
        map.put("code", "50626");
        map.put("name", "8.105.0 build 15 50626");
    }

    private final void N() {
        Schedulers.computation().scheduleDirect(new Runnable() { // from class: o.Mt
            @Override // java.lang.Runnable
            public final void run() {
                AbstractApplicationC1046Mq.S();
            }
        }, C8120deQ.a() ? 8000 : 2000, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S() {
        try {
            Object obj = C1043Ml.p.get(-1153234225);
            if (obj == null) {
                obj = ((Class) C1043Ml.c((char) 0, 4, 4)).getDeclaredMethod("a", null);
                C1043Ml.p.put(-1153234225, obj);
            }
            ((Method) obj).invoke(null, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
