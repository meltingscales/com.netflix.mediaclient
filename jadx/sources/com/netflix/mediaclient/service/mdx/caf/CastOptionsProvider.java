package com.netflix.mediaclient.service.mdx.caf;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import java.util.List;
import o.C1825aPq;
import o.C8168dfL;

/* loaded from: classes6.dex */
public class CastOptionsProvider implements OptionsProvider {
    private String d = "CA5E8412";

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    public CastOptions getCastOptions(Context context) {
        if (C8168dfL.h(C1825aPq.e(context))) {
            this.d = C1825aPq.e(context);
        }
        C1825aPq.e(context, this.d);
        return new CastOptions.Builder().setReceiverApplicationId(this.d).setCastMediaOptions(new CastMediaOptions.Builder().setMediaSessionEnabled(false).setNotificationOptions(null).build()).setEnableReconnectionService(true).build();
    }
}
