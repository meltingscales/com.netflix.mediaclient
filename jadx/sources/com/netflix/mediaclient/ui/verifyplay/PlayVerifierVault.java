package com.netflix.mediaclient.ui.verifyplay;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public final class PlayVerifierVault implements Parcelable {
    private final String a;
    private final boolean b;
    private boolean d;
    private final boolean e;
    private final VideoType f;
    private final PlayerExtras g;
    private final String h;
    private final String i;
    private final PlayContext j;
    public static final c c = new c(null);
    public static final Parcelable.Creator<PlayVerifierVault> CREATOR = new Creator();

    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<PlayVerifierVault> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final PlayVerifierVault createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new PlayVerifierVault(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : VideoType.valueOf(parcel.readString()), parcel.readInt() != 0, (PlayContext) parcel.readParcelable(PlayVerifierVault.class.getClassLoader()), parcel.readString(), (PlayerExtras) parcel.readParcelable(PlayVerifierVault.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public final PlayVerifierVault[] newArray(int i) {
            return new PlayVerifierVault[i];
        }
    }

    public final String a() {
        return this.i;
    }

    public final String b() {
        return this.a;
    }

    public final PlayContext c() {
        return this.j;
    }

    public final String d() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final PlayerExtras e() {
        return this.g;
    }

    public final boolean f() {
        return this.b;
    }

    public final VideoType g() {
        return this.f;
    }

    public final boolean h() {
        return this.d;
    }

    public final boolean i() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.a);
        parcel.writeString(this.h);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        VideoType videoType = this.f;
        if (videoType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(videoType.name());
        }
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.j, i);
        parcel.writeString(this.i);
        parcel.writeParcelable(this.g, i);
    }

    public PlayVerifierVault(String str, String str2, boolean z, boolean z2, VideoType videoType, boolean z3, PlayContext playContext, String str3, PlayerExtras playerExtras) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) playerExtras, "");
        this.a = str;
        this.h = str2;
        this.d = z;
        this.e = z2;
        this.f = videoType;
        this.b = z3;
        this.j = playContext;
        this.i = str3;
        this.g = playerExtras;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PlayVerifierVault(java.lang.String r32, java.lang.String r33) {
        /*
            r31 = this;
            java.lang.String r0 = ""
            r2 = r32
            o.C8632dsu.c(r2, r0)
            r9 = r33
            o.C8632dsu.c(r9, r0)
            com.netflix.mediaclient.util.PlayContext r8 = com.netflix.mediaclient.clutils.PlayContextImp.j
            o.C8632dsu.a(r8, r0)
            com.netflix.mediaclient.ui.player.PlayerExtras r0 = new com.netflix.mediaclient.ui.player.PlayerExtras
            r10 = r0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 32767(0x7fff, float:4.5916E-41)
            r30 = 0
            r10.<init>(r11, r13, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayVerifierVault(String str, String str2, boolean z, boolean z2, VideoType videoType, boolean z3, PlayContext playContext, PlayerExtras playerExtras) {
        this(str, str2, z, z2, videoType, z3, playContext, null, playerExtras);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) playerExtras, "");
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    public String toString() {
        String str = this.a;
        String str2 = this.h;
        boolean z = this.b;
        String str3 = this.i;
        PlayContext playContext = this.j;
        PlayerExtras playerExtras = this.g;
        return "PinDialogVault [pinVerificationRequestedBy=" + str + ", mVideoId=" + str2 + ", mRemotePlayback=" + z + ", mUuid=" + str3 + ", mPlayContext" + playContext + ", playerExtras" + playerExtras + "]";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class RequestedBy {
        public static final b d;
        private static final /* synthetic */ RequestedBy[] h;
        private static final /* synthetic */ InterfaceC8598drn j;
        private final String g;
        public static final RequestedBy e = new RequestedBy("MDX", 0, "mdx");
        public static final RequestedBy c = new RequestedBy("PLAYER", 1, "player");
        public static final RequestedBy a = new RequestedBy("PLAY_LAUNCHER", 2, "launcher");
        public static final RequestedBy b = new RequestedBy("OFFLINE_DOWNLOAD", 3, "offline_download");
        public static final RequestedBy i = new RequestedBy("UNKNOWN", 4, "");

        private static final /* synthetic */ RequestedBy[] a() {
            return new RequestedBy[]{e, c, a, b, i};
        }

        public static RequestedBy valueOf(String str) {
            return (RequestedBy) Enum.valueOf(RequestedBy.class, str);
        }

        public static RequestedBy[] values() {
            return (RequestedBy[]) h.clone();
        }

        public final String c() {
            return this.g;
        }

        private RequestedBy(String str, int i2, String str2) {
            this.g = str2;
        }

        static {
            RequestedBy[] a2 = a();
            h = a2;
            j = C8600drp.e(a2);
            d = new b(null);
        }

        /* loaded from: classes5.dex */
        public static final class b {
            public /* synthetic */ b(C8627dsp c8627dsp) {
                this();
            }

            private b() {
            }
        }
    }
}
