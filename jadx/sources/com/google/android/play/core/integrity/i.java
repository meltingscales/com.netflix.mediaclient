package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;

/* loaded from: classes2.dex */
public final class i implements k {
    @Override // com.google.android.play.core.integrity.k
    public final ApiException a(Bundle bundle) {
        int i = bundle.getInt(UmaAlert.ICON_ERROR);
        if (i == 0) {
            return null;
        }
        return new IntegrityServiceException(i, null);
    }
}
