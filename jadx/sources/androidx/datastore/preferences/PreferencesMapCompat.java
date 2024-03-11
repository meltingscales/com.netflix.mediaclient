package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class PreferencesMapCompat {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final PreferencesProto.PreferenceMap readFrom(InputStream inputStream) {
            C8632dsu.c((Object) inputStream, "");
            try {
                PreferencesProto.PreferenceMap parseFrom = PreferencesProto.PreferenceMap.parseFrom(inputStream);
                C8632dsu.a(parseFrom, "");
                return parseFrom;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }
    }
}
