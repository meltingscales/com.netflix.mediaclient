package com.netflix.mediaclient.net;

import com.netflix.android.volley.VolleyError;
import java.io.IOException;

/* loaded from: classes3.dex */
public class WrappedVolleyIOException extends IOException {
    public WrappedVolleyIOException(VolleyError volleyError) {
        super(volleyError);
    }
}
