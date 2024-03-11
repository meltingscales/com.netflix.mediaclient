package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleableUtil;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class CueDecoder {
    public CuesWithTiming decode(long j, byte[] bArr, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i, i2);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new CuesWithTiming(BundleableUtil.fromBundleList(Cue.CREATOR, (ArrayList) Assertions.checkNotNull(readBundle.getParcelableArrayList("c"))), j, readBundle.getLong("d"));
    }
}
