package com.netflix.mediaclient.acquisition.lib.screens;

import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import o.C8632dsu;

/* loaded from: classes3.dex */
public abstract class AbstractNetworkViewModel2 {
    private final MutableLiveData<String> displayedError;
    private final String moneyBallActionModeOverride;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;

    public final MutableLiveData<String> getDisplayedError() {
        return this.displayedError;
    }

    public String getMoneyBallActionModeOverride() {
        return this.moneyBallActionModeOverride;
    }

    public final SignupNetworkManager getSignupNetworkManager() {
        return this.signupNetworkManager;
    }

    public AbstractNetworkViewModel2(SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ErrorMessageViewModel errorMessageViewModel) {
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.signupNetworkManager = signupNetworkManager;
        this.stringProvider = stringProvider;
        this.displayedError = new MutableLiveData<>(errorMessageViewModel.getText());
    }

    public static /* synthetic */ void performAction$default(AbstractNetworkViewModel2 abstractNetworkViewModel2, ActionField actionField, MutableLiveData mutableLiveData, NetworkRequestResponseListener networkRequestResponseListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performAction");
        }
        if ((i & 4) != 0) {
            networkRequestResponseListener = null;
        }
        abstractNetworkViewModel2.performAction(actionField, mutableLiveData, networkRequestResponseListener);
    }

    public final void performAction(ActionField actionField, final MutableLiveData<Boolean> mutableLiveData, NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) mutableLiveData, "");
        Boolean value = mutableLiveData.getValue();
        Boolean bool = Boolean.TRUE;
        if (C8632dsu.c(value, bool) || actionField == null) {
            return;
        }
        mutableLiveData.setValue(bool);
        this.signupNetworkManager.performActionRequest(actionField, getMoneyBallActionModeOverride(), networkRequestResponseListener, new NetworkRequestResponseListener() { // from class: com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2$performAction$1$1
            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onBeforeNetworkAction(Request request) {
                C8632dsu.c((Object) request, "");
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
                if (r3 == null) goto L16;
             */
            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onAfterNetworkAction(com.netflix.mediaclient.acquisition.lib.Response r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r3, r0)
                    com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2 r0 = com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2.this
                    com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData r1 = r3.getMoneyballData()
                    if (r1 == 0) goto L12
                    java.lang.String r1 = r1.getMode()
                    goto L13
                L12:
                    r1 = 0
                L13:
                    boolean r0 = com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2.access$isSwitchFlowMode(r0, r1)
                    if (r0 != 0) goto L20
                    androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r2
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    r0.setValue(r1)
                L20:
                    boolean r0 = r3.isValidState()
                    if (r0 != 0) goto L4d
                    com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2 r0 = com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2.this
                    androidx.lifecycle.MutableLiveData r0 = r0.getDisplayedError()
                    java.lang.String r3 = r3.getResErrorKey()
                    if (r3 == 0) goto L3e
                    com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2 r1 = com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2.this
                    com.netflix.mediaclient.acquisition.lib.services.StringProvider r1 = com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2.access$getStringProvider$p(r1)
                    java.lang.String r3 = r1.getString(r3)
                    if (r3 != 0) goto L4a
                L3e:
                    com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2 r3 = com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2.this
                    com.netflix.mediaclient.acquisition.lib.services.StringProvider r3 = com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2.access$getStringProvider$p(r3)
                    int r1 = com.netflix.mediaclient.acquisition.lib.R.string.generic_retryable_failure
                    java.lang.String r3 = r3.getString(r1)
                L4a:
                    r0.setValue(r3)
                L4d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2$performAction$1$1.onAfterNetworkAction(com.netflix.mediaclient.acquisition.lib.Response):void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSwitchFlowMode(String str) {
        return C8632dsu.c((Object) str, (Object) SignupConstants.Mode.SWITCH_FLOW);
    }
}
