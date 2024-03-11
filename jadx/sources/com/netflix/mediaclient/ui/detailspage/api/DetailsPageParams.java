package com.netflix.mediaclient.ui.detailspage.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import o.C8632dsu;

/* loaded from: classes4.dex */
public abstract class DetailsPageParams {

    /* loaded from: classes4.dex */
    public static final class FullDp implements Parcelable {
        public static final Parcelable.Creator<FullDp> CREATOR = new Creator();
        private final String a;
        private final VideoType b;
        private final String c;
        private final PlayerExtras d;
        private final int e;
        private final String f;
        private final Bundle h;
        private final Long i;
        private final String j;

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<FullDp> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final FullDp createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return new FullDp(parcel.readString(), VideoType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), parcel.readString(), parcel.readBundle(FullDp.class.getClassLoader()), (PlayerExtras) parcel.readParcelable(FullDp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: d */
            public final FullDp[] newArray(int i) {
                return new FullDp[i];
            }
        }

        public final PlayerExtras a() {
            return this.d;
        }

        public final VideoType b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FullDp) {
                FullDp fullDp = (FullDp) obj;
                return C8632dsu.c((Object) this.a, (Object) fullDp.a) && this.b == fullDp.b && C8632dsu.c((Object) this.c, (Object) fullDp.c) && C8632dsu.c((Object) this.j, (Object) fullDp.j) && C8632dsu.c(this.i, fullDp.i) && this.e == fullDp.e && C8632dsu.c((Object) this.f, (Object) fullDp.f) && C8632dsu.c(this.h, fullDp.h) && C8632dsu.c(this.d, fullDp.d);
            }
            return false;
        }

        public final Bundle f() {
            return this.h;
        }

        public final String g() {
            return this.f;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = this.b.hashCode();
            String str = this.c;
            int hashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.j;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            Long l = this.i;
            int hashCode5 = l == null ? 0 : l.hashCode();
            int hashCode6 = Integer.hashCode(this.e);
            int hashCode7 = this.f.hashCode();
            int hashCode8 = this.h.hashCode();
            PlayerExtras playerExtras = this.d;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (playerExtras != null ? playerExtras.hashCode() : 0);
        }

        public final String i() {
            return this.j;
        }

        public final Long j() {
            return this.i;
        }

        public String toString() {
            String str = this.a;
            VideoType videoType = this.b;
            String str2 = this.c;
            String str3 = this.j;
            Long l = this.i;
            int i = this.e;
            String str4 = this.f;
            Bundle bundle = this.h;
            PlayerExtras playerExtras = this.d;
            return "FullDp(topLevelVideoId=" + str + ", topLevelVideoType=" + videoType + ", topLevelVideoTitle=" + str2 + ", trailerVideoId=" + str3 + ", trailerVideoBookmarkMs=" + l + ", launchedByModalViewId=" + i + ", trackingInfoHolderKey=" + str4 + ", trackingInfoHolderValue=" + bundle + ", playerExtras=" + playerExtras + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeString(this.a);
            parcel.writeString(this.b.name());
            parcel.writeString(this.c);
            parcel.writeString(this.j);
            Long l = this.i;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeBundle(this.h);
            parcel.writeParcelable(this.d, i);
        }

        public FullDp(String str, VideoType videoType, String str2, String str3, Long l, int i, String str4, Bundle bundle, PlayerExtras playerExtras) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) str4, "");
            C8632dsu.c((Object) bundle, "");
            this.a = str;
            this.b = videoType;
            this.c = str2;
            this.j = str3;
            this.i = l;
            this.e = i;
            this.f = str4;
            this.h = bundle;
            this.d = playerExtras;
        }
    }
}
