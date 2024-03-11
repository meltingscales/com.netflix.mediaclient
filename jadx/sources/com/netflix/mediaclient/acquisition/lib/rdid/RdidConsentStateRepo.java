package com.netflix.mediaclient.acquisition.lib.rdid;

import java.util.List;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes3.dex */
public interface RdidConsentStateRepo {
    Object getRdidCtaConsentStates(InterfaceC8585dra<? super List<RdidCtaConsentState>> interfaceC8585dra);

    Object getRdidDeviceConsentState(InterfaceC8585dra<? super RdidDeviceConsentState> interfaceC8585dra);

    Object maybeRecordRdid(InterfaceC8585dra<? super dpR> interfaceC8585dra);

    Object storeRdidCtaConsentState(RdidCtaConsentState rdidCtaConsentState, InterfaceC8585dra<? super dpR> interfaceC8585dra);
}
