package o;

import androidx.media3.common.Metadata;

/* renamed from: o.beo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4455beo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Metadata.Entry> T d(Metadata metadata, Class<T> cls) {
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            T t = (T) metadata.get(i);
            C8632dsu.a(t, "");
            if (cls.isInstance(t)) {
                return t;
            }
        }
        return null;
    }
}
