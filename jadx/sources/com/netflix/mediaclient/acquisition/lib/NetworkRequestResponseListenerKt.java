package com.netflix.mediaclient.acquisition.lib;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class NetworkRequestResponseListenerKt {
    public static final /* synthetic */ boolean access$isWarnUserMode(MoneyballData moneyballData) {
        return isWarnUserMode(moneyballData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isWarnUserMode(MoneyballData moneyballData) {
        return C8632dsu.c((Object) (moneyballData != null ? moneyballData.getMode() : null), (Object) SignupConstants.Mode.WARN_USER);
    }
}
