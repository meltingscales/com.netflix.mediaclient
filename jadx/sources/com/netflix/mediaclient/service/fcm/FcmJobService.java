package com.netflix.mediaclient.service.fcm;

import android.content.Context;
import android.os.Bundle;
import com.netflix.mediaclient.service.pushnotification.PushJobServiceUtils;
import o.AbstractServiceC9608st;
import o.C1044Mm;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC9606sr;

/* loaded from: classes6.dex */
public final class FcmJobService extends AbstractServiceC9608st {
    public static final d c = new d(null);

    @Override // o.AbstractServiceC9608st
    public boolean d(InterfaceC9606sr interfaceC9606sr) {
        C8632dsu.c((Object) interfaceC9606sr, "");
        return false;
    }

    @Override // o.AbstractServiceC9608st
    public boolean c(InterfaceC9606sr interfaceC9606sr) {
        C1044Mm.e("nf_fcm_job", "Performing long running task in scheduled job");
        if (interfaceC9606sr == null) {
            C1044Mm.d("nf_fcm_job", "job parameters null - drop");
            return false;
        }
        Bundle a = interfaceC9606sr.a();
        if (a == null || a.isEmpty()) {
            C1044Mm.d("nf_fcm_job", "bundle bad - drop");
            return false;
        }
        C1044Mm.e("nf_fcm_job", "binding to NetflixService from job service");
        Context applicationContext = getApplicationContext();
        PushJobServiceUtils.Companion companion = PushJobServiceUtils.Companion;
        C8632dsu.d(applicationContext);
        if (!applicationContext.bindService(companion.getNetflixServiceIntent(applicationContext), new PushJobServiceUtils.NetflixServiceConnection(a), 1)) {
            C1044Mm.d("nf_fcm_job", "FcmJobService could not bind to NetflixService!");
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
