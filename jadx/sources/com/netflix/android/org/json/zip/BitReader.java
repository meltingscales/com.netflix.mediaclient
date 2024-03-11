package com.netflix.android.org.json.zip;

/* loaded from: classes5.dex */
public interface BitReader {
    boolean bit();

    long nrBits();

    boolean pad(int i);

    int read(int i);
}
