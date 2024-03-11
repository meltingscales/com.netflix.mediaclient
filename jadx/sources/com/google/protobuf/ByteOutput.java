package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class ByteOutput {
    public abstract void writeLazy(ByteBuffer byteBuffer);

    public abstract void writeLazy(byte[] bArr, int i, int i2);
}
