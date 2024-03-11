package o;

import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public interface aMN {

    /* loaded from: classes.dex */
    public interface e {
        int a();

        SplitInstallSessionState b();

        long c();

        int d();

        long e();
    }

    Observable<e> a(d dVar);

    Set<String> a();

    void b(List<Locale> list);

    void b(e eVar, Activity activity, int i);

    Observable<e> c(Collection<Locale> collection);

    boolean c(d dVar);

    void e(d dVar);

    /* loaded from: classes.dex */
    public static class d {
        private final String a;
        public static d c = new d("voip");
        public static d e = new d("partnermodule");
        public static d d = new d("languages");

        public String a() {
            return this.a;
        }

        public d(String str) {
            this.a = str;
        }

        public String d() {
            return a();
        }
    }
}
