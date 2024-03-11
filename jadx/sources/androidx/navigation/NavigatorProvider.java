package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;
import o.dqE;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes5.dex */
public class NavigatorProvider {
    public static final Companion Companion = new Companion(null);
    private static final Map<Class<?>, String> annotationNames = new LinkedHashMap();
    private final Map<String, Navigator<? extends NavDestination>> _navigators = new LinkedHashMap();

    public final Map<String, Navigator<? extends NavDestination>> getNavigators() {
        Map<String, Navigator<? extends NavDestination>> l;
        l = dqE.l(this._navigators);
        return l;
    }

    public final <T extends Navigator<?>> T getNavigator(Class<T> cls) {
        C8632dsu.c((Object) cls, "");
        return (T) getNavigator(Companion.getNameForNavigator$navigation_common_release(cls));
    }

    public <T extends Navigator<?>> T getNavigator(String str) {
        C8632dsu.c((Object) str, "");
        if (!Companion.validateName$navigation_common_release(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        Navigator<? extends NavDestination> navigator = this._navigators.get(str);
        if (navigator != null) {
            return navigator;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Navigator<? extends NavDestination> addNavigator(Navigator<? extends NavDestination> navigator) {
        C8632dsu.c((Object) navigator, "");
        return addNavigator(Companion.getNameForNavigator$navigation_common_release(navigator.getClass()), navigator);
    }

    public Navigator<? extends NavDestination> addNavigator(String str, Navigator<? extends NavDestination> navigator) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) navigator, "");
        if (!Companion.validateName$navigation_common_release(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        Navigator<? extends NavDestination> navigator2 = this._navigators.get(str);
        if (C8632dsu.c(navigator2, navigator)) {
            return navigator;
        }
        if (!(!(navigator2 != null && navigator2.isAttached()))) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        } else if (!(!navigator.isAttached())) {
            throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
        } else {
            return this._navigators.put(str, navigator);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final boolean validateName$navigation_common_release(String str) {
            return str != null && str.length() > 0;
        }

        public final String getNameForNavigator$navigation_common_release(Class<? extends Navigator<?>> cls) {
            C8632dsu.c((Object) cls, "");
            String str = (String) NavigatorProvider.annotationNames.get(cls);
            if (str == null) {
                Navigator.Name name = (Navigator.Name) cls.getAnnotation(Navigator.Name.class);
                str = name != null ? name.value() : null;
                if (!validateName$navigation_common_release(str)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
                NavigatorProvider.annotationNames.put(cls, str);
            }
            C8632dsu.d((Object) str);
            return str;
        }
    }
}
