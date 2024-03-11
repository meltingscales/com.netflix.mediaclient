package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.InlineMe;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class C {
    public static final UUID UUID_NIL = new UUID(0, 0);
    public static final UUID COMMON_PSSH_UUID = new UUID(1186680826959645954L, -5988876978535335093L);
    public static final UUID CLEARKEY_UUID = new UUID(-2129748144642739255L, 8654423357094679310L);
    public static final UUID WIDEVINE_UUID = new UUID(-1301668207276963122L, -6645017420763422227L);
    public static final UUID PLAYREADY_UUID = new UUID(-7348484286925749626L, -6083546864340672619L);

    @InlineMe(imports = {"androidx.media3.common.util.Util"}, replacement = "Util.usToMs(timeUs)")
    @Deprecated
    public static long usToMs(long j) {
        return Util.usToMs(j);
    }

    @InlineMe(imports = {"androidx.media3.common.util.Util"}, replacement = "Util.msToUs(timeMs)")
    @Deprecated
    public static long msToUs(long j) {
        return Util.msToUs(j);
    }
}
