package androidx.navigation;

import android.content.Context;
import android.util.TypedValue;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class NavInflater {
    public static final Companion Companion = new Companion(null);
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();
    private final Context context;
    private final NavigatorProvider navigatorProvider;

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) navigatorProvider, "");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
