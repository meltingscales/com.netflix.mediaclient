package o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: o.fy  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8931fy {
    public static final <T extends Fragment> Object a(T t) {
        C8632dsu.c((Object) t, "");
        Bundle arguments = t.getArguments();
        if (arguments != null) {
            return arguments.get("mavericks:arg");
        }
        return null;
    }
}
