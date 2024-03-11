package o;

import android.content.Context;
import com.netflix.mediaclient.ui.lightbox.api.LightBoxItem;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;

/* renamed from: o.bZo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4190bZo {
    public static final c e = c.a;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.bZo$d */
    /* loaded from: classes4.dex */
    public interface d {
        InterfaceC4190bZo Y();
    }

    void b(Context context, ArrayList<LightBoxItem> arrayList, int i);

    /* renamed from: o.bZo$c */
    /* loaded from: classes4.dex */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        public final InterfaceC4190bZo d(Context context) {
            C8632dsu.c((Object) context, "");
            return ((d) EntryPointAccessors.fromApplication(context, d.class)).Y();
        }
    }
}
