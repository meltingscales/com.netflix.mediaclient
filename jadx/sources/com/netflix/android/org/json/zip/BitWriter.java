package com.netflix.android.org.json.zip;

/* loaded from: classes5.dex */
public interface BitWriter {
    long nrBits();

    void one();

    void pad(int i);

    void write(int i, int i2);

    void zero();
}
