package com.netflix.mediaclient.ui.home;

import android.content.Context;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.util.Map;
import javax.inject.Inject;
import o.InterfaceC3994bSh;
import o.InterfaceC5155btS;
import o.bRZ;

/* loaded from: classes4.dex */
public abstract class HomeFragment extends NetflixFrag implements bRZ {
    private InterfaceC5155btS b;
    @Inject
    public InterfaceC3994bSh homeTracking;

    @Override // o.bRZ
    public void a(int i, int i2, String str) {
    }

    @Override // o.bRZ
    public void a(boolean z) {
    }

    @Override // o.bRZ
    public final InterfaceC5155btS ag_() {
        return this.b;
    }

    @Override // o.bRZ
    public void a(Context context, Map<String, String> map) {
        this.homeTracking.e(this.b, map);
    }

    @Override // o.bRZ
    public void G() {
        ServiceManager bl_ = bl_();
        if (bl_ != null) {
            if (ConfigFastPropertyFeatureControlConfig.Companion.f()) {
                bl_.a(true, (String) null, (String) null);
            } else {
                bl_.N();
            }
        }
    }
}
