package dagger.hilt.android;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class EntryPointAccessors {
    public static final EntryPointAccessors INSTANCE = new EntryPointAccessors();

    private EntryPointAccessors() {
    }

    public static final <T> T fromApplication(Context context, Class<T> cls) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) cls, "");
        return (T) EntryPoints.get(Contexts.getApplication(context.getApplicationContext()), cls);
    }

    public final /* synthetic */ <T> T fromApplication(Context context) {
        C8632dsu.c((Object) context, "");
        C8632dsu.a(4, "T");
        return (T) fromApplication(context, Object.class);
    }

    public static final <T> T fromActivity(Activity activity, Class<T> cls) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) cls, "");
        return (T) EntryPoints.get(activity, cls);
    }

    public final /* synthetic */ <T> T fromActivity(Activity activity) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.a(4, "T");
        return (T) fromActivity(activity, Object.class);
    }

    public static final <T> T fromFragment(Fragment fragment, Class<T> cls) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) cls, "");
        return (T) EntryPoints.get(fragment, cls);
    }

    public final /* synthetic */ <T> T fromFragment(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.a(4, "T");
        return (T) fromFragment(fragment, Object.class);
    }

    public static final <T> T fromView(View view, Class<T> cls) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) cls, "");
        return (T) EntryPoints.get(view, cls);
    }

    public final /* synthetic */ <T> T fromView(View view) {
        C8632dsu.c((Object) view, "");
        C8632dsu.a(4, "T");
        return (T) fromView(view, Object.class);
    }
}
