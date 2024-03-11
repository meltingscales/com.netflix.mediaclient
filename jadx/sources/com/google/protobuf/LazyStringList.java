package com.google.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    Object getRaw(int i);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();
}
