package com.netflix.mediaclient.acquisition.api.sms;

import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes3.dex */
public interface SMSRetriever {
    public static final Companion Companion = Companion.$$INSTANCE;

    String extractOTPFromSMS(String str);

    void listenForSMS(drM<? super String, dpR> drm, drO<dpR> dro, drO<dpR> dro2);

    /* loaded from: classes3.dex */
    public static final class Companion {
        private static final String DEBUG_APP_HASH = "wCHSIr5kZUF";
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String RELEASE_APP_HASH = "eWrKTgiY0ui";
        private static final String APP_HASH = RELEASE_APP_HASH;

        public final String getAPP_HASH() {
            return APP_HASH;
        }

        private Companion() {
        }
    }
}
