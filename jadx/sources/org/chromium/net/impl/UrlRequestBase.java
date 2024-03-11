package org.chromium.net.impl;

import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes5.dex */
public abstract class UrlRequestBase extends ExperimentalUrlRequest {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void addHeader(String str, String str2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void setHttpMethod(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);

    public static int convertLoadState(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
            default:
                throw new IllegalArgumentException("No request status found.");
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
        }
    }
}
