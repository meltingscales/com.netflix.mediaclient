package o;

import android.app.Activity;
import java.util.Locale;

/* loaded from: classes.dex */
public interface bXE {
    public static final c a_ = c.a;
    public static final String e = "com.netflix.mediaclient.intent.action.LANGUAGES_INSTALLED_INTENT_ACTION";

    void a(int i);

    void a(Activity activity);

    boolean a();

    boolean a(Locale locale);

    void c();

    void c(Activity activity);

    boolean c(Locale locale);

    /* loaded from: classes.dex */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }
    }
}
