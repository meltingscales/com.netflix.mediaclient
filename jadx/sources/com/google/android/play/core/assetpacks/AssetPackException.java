package com.google.android.play.core.assetpacks;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes5.dex */
public class AssetPackException extends ApiException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AssetPackException(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Asset Pack Download Error(%d): %s", Integer.valueOf(i), com.google.android.play.core.assetpacks.model.a.a(i))));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
