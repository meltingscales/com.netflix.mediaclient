package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.EdgeStack;
import dagger.hilt.android.EntryPointAccessors;

/* renamed from: o.aPh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1816aPh {
    public static final EdgeStack b(Context context) {
        EdgeStack edgeStack;
        C8632dsu.c((Object) context, "");
        if (e(context)) {
            edgeStack = EdgeStack.PROD;
        } else {
            edgeStack = EdgeStack.STAGING;
        }
        C1044Mm.a("EndpointUtils", "edgeStack : %s", edgeStack);
        return edgeStack;
    }

    public static final boolean e(Context context) {
        C8632dsu.c((Object) context, "");
        return ((aIL) EntryPointAccessors.fromApplication(context, aIL.class)).r().c();
    }
}
