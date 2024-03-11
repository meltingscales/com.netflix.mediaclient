package o;

import android.content.Context;
import com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever;

/* renamed from: o.cfC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6534cfC implements InterfaceC5346bwy {
    @Override // o.InterfaceC5346bwy
    public int b(boolean z) {
        return z ? com.netflix.mediaclient.ui.R.o.er : com.netflix.mediaclient.ui.R.o.hM;
    }

    @Override // o.InterfaceC5346bwy
    public aWY a(Context context, boolean z, MdxNotificationIntentRetriever mdxNotificationIntentRetriever, TV tv, InterfaceC1820aPl interfaceC1820aPl, boolean z2) {
        return new C6615cge(new C6613cgc(context, z, mdxNotificationIntentRetriever, tv), interfaceC1820aPl, z2);
    }

    @Override // o.InterfaceC5346bwy
    public String e(Context context, String str, int i, String str2, boolean z, boolean z2) {
        if (z2 || C8168dfL.g(str)) {
            return context.getString(com.netflix.mediaclient.ui.R.o.du, str2);
        }
        return context.getString(com.netflix.mediaclient.ui.R.o.ds, str, Integer.valueOf(i), str2);
    }
}
