package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes2.dex */
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, InterfaceC8585dra<? super T> interfaceC8585dra);

    Object writeTo(T t, OutputStream outputStream, InterfaceC8585dra<? super dpR> interfaceC8585dra);
}
