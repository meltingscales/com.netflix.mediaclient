package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

/* renamed from: o.dha  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8289dha implements InterfaceC8230dgU {
    private final Context a;

    @Inject
    public C8289dha(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.a = context;
    }

    @Override // o.InterfaceC8230dgU
    public boolean d() {
        return ConfigFastPropertyFeatureControlConfig.Companion.a();
    }

    @Override // o.InterfaceC8230dgU
    public boolean e() {
        return C8171dfO.e() || C8151dev.h();
    }

    @Override // o.InterfaceC8230dgU
    public void a() {
        C8157dfA.d(this.a, "avif_unsatisfied_link_error", true);
        C8157dfA.e.j(this.a);
    }

    @Override // o.InterfaceC8230dgU
    public boolean c() {
        return aQI.c.a();
    }
}
