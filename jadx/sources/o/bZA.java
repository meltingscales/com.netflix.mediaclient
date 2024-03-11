package o;

import android.content.Context;
import com.netflix.mediaclient.ui.lightbox.api.LightBoxItem;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class bZA implements InterfaceC4190bZo {
    public static final c a = new c(null);

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("LightboxImpl");
        }
    }

    @Override // o.InterfaceC4190bZo
    public void b(Context context, ArrayList<LightBoxItem> arrayList, int i) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) arrayList, "");
        ActivityC4195bZt.a.c(context, arrayList, i);
    }
}
