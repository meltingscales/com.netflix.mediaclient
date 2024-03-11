package o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.bsM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5096bsM {
    @SerializedName("mBookmarkUpdateTimeInUTCMs")
    public final long a;
    @SerializedName("mVideoId")
    public final String b;
    @SerializedName("mBookmarkMs")
    public final long c;

    public C5096bsM(long j, long j2, String str) {
        this.c = j;
        this.a = j2;
        this.b = str;
    }

    public static C5096bsM b(String str, long j) {
        if (C8168dfL.g(str)) {
            return null;
        }
        return new C5096bsM(j, System.currentTimeMillis(), str);
    }
}
