package com.google.firebase.encoders;

import java.io.Writer;

/* loaded from: classes5.dex */
public interface DataEncoder {
    String encode(Object obj);

    void encode(Object obj, Writer writer);
}
