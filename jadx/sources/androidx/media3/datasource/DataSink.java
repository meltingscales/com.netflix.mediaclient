package androidx.media3.datasource;

/* loaded from: classes2.dex */
public interface DataSink {
    void close();

    void open(DataSpec dataSpec);

    void write(byte[] bArr, int i, int i2);
}
