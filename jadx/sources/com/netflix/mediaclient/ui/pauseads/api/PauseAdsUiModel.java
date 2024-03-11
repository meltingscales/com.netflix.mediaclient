package com.netflix.mediaclient.ui.pauseads.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drO;

/* loaded from: classes4.dex */
public final class PauseAdsUiModel implements Parcelable {
    private final String b;
    private final String c;
    private final String d;
    private final int f;
    private final String g;
    private final String h;
    private final String i;
    private final drO<dpR> j;

    /* renamed from: o  reason: collision with root package name */
    private final String f13298o;
    public static final a a = new a(null);
    public static final Parcelable.Creator<PauseAdsUiModel> CREATOR = new Creator();
    private static final PauseAdsUiModel e = new PauseAdsUiModel("", "", "", "", "odio", "platea", 20, "equidem", new drO<dpR>() { // from class: com.netflix.mediaclient.ui.pauseads.api.PauseAdsUiModel$Companion$MOCK_DATA$1
        public final void e() {
        }

        @Override // o.drO
        public /* synthetic */ dpR invoke() {
            e();
            return dpR.c;
        }
    });

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<PauseAdsUiModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final PauseAdsUiModel createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new PauseAdsUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), (drO) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public final PauseAdsUiModel[] newArray(int i) {
            return new PauseAdsUiModel[i];
        }
    }

    public final String a() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PauseAdsUiModel) {
            PauseAdsUiModel pauseAdsUiModel = (PauseAdsUiModel) obj;
            return C8632dsu.c((Object) this.d, (Object) pauseAdsUiModel.d) && C8632dsu.c((Object) this.c, (Object) pauseAdsUiModel.c) && C8632dsu.c((Object) this.i, (Object) pauseAdsUiModel.i) && C8632dsu.c((Object) this.b, (Object) pauseAdsUiModel.b) && C8632dsu.c((Object) this.f13298o, (Object) pauseAdsUiModel.f13298o) && C8632dsu.c((Object) this.h, (Object) pauseAdsUiModel.h) && this.f == pauseAdsUiModel.f && C8632dsu.c((Object) this.g, (Object) pauseAdsUiModel.g) && C8632dsu.c(this.j, pauseAdsUiModel.j);
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((((this.d.hashCode() * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + this.b.hashCode()) * 31) + this.f13298o.hashCode()) * 31) + this.h.hashCode()) * 31) + Integer.hashCode(this.f)) * 31) + this.g.hashCode()) * 31) + this.j.hashCode();
    }

    public final String i() {
        return this.f13298o;
    }

    public String toString() {
        String str = this.d;
        String str2 = this.c;
        String str3 = this.i;
        String str4 = this.b;
        String str5 = this.f13298o;
        String str6 = this.h;
        int i = this.f;
        String str7 = this.g;
        drO<dpR> dro = this.j;
        return "PauseAdsUiModel(adUrl=" + str + ", adContentDescription=" + str2 + ", boxArtUrl=" + str3 + ", boxArtContentDescription=" + str4 + ", title=" + str5 + ", subtitle=" + str6 + ", playProgress=" + i + ", playButtonContentDescription=" + str7 + ", onPlayButtonClick=" + dro + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.d);
        parcel.writeString(this.c);
        parcel.writeString(this.i);
        parcel.writeString(this.b);
        parcel.writeString(this.f13298o);
        parcel.writeString(this.h);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeSerializable((Serializable) this.j);
    }

    public PauseAdsUiModel(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, drO<dpR> dro) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) str5, "");
        C8632dsu.c((Object) str6, "");
        C8632dsu.c((Object) str7, "");
        C8632dsu.c((Object) dro, "");
        this.d = str;
        this.c = str2;
        this.i = str3;
        this.b = str4;
        this.f13298o = str5;
        this.h = str6;
        this.f = i;
        this.g = str7;
        this.j = dro;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final PauseAdsUiModel b() {
            return PauseAdsUiModel.e;
        }
    }
}
