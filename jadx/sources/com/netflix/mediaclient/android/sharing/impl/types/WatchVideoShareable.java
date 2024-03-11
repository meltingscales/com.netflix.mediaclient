package com.netflix.mediaclient.android.sharing.impl.types;

import com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable;
import com.netflix.mediaclient.clutils.PlayContextImp;
import o.C8632dsu;
import o.QI;
import o.bEY;

/* loaded from: classes3.dex */
public final class WatchVideoShareable extends VideoDetailsShareable {
    private final VideoDetailsShareable.VideoDetailsParcelable b;
    private final int c;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchVideoShareable(String str, int i, VideoDetailsShareable.VideoDetailsParcelable videoDetailsParcelable) {
        super(videoDetailsParcelable);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoDetailsParcelable, "");
        this.e = str;
        this.c = i;
        this.b = videoDetailsParcelable;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable, com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public String d(bEY bey, QI<VideoDetailsShareable.VideoDetailsParcelable> qi) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) qi, "");
        String b = this.b.b();
        int i = PlayContextImp.y;
        return bEY.c.a(bey, "watch", b, qi.d(), String.valueOf(i), null, this.c, 16, null);
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable, com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public CharSequence b(bEY bey, QI<VideoDetailsShareable.VideoDetailsParcelable> qi) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) qi, "");
        String str = this.e;
        String d = d(bey, qi);
        return str + " " + d;
    }
}
