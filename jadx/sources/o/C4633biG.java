package o;

import androidx.media3.datasource.DataSink;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSink;

/* renamed from: o.biG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4633biG implements DataSink {
    private final CacheDataSink a;
    private final int b;
    private boolean e;

    public C4633biG(Cache cache, int i) {
        this.a = new CacheDataSink(cache, 5242880L);
        this.b = i;
    }

    @Override // androidx.media3.datasource.DataSink
    public void open(DataSpec dataSpec) {
        boolean isFlagSet = dataSpec.isFlagSet(this.b);
        this.e = isFlagSet;
        if (isFlagSet) {
            this.a.open(dataSpec);
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public void write(byte[] bArr, int i, int i2) {
        if (this.e) {
            this.a.write(bArr, i, i2);
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public void close() {
        if (this.e) {
            this.a.close();
        }
    }
}
