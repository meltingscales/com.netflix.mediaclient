package com.netflix.mediaclient.android.app;

import com.netflix.mediaclient.StatusCode;
import java.io.Serializable;

/* loaded from: classes.dex */
public interface Status extends Serializable {

    /* loaded from: classes3.dex */
    public enum ErrorGroup {
        NetworkError,
        HttpError,
        MslError,
        DrmError,
        PlayApiError,
        ManifestError,
        SubtitleError
    }

    String b();

    StatusCode c();

    ErrorGroup d();

    Throwable e();

    boolean f();

    boolean g();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    String l();
}
