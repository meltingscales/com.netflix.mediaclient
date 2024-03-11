package com.netflix.mediaclient.ui.lightbox.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes4.dex */
public abstract class LightBoxItem implements Parcelable {
    public /* synthetic */ LightBoxItem(C8627dsp c8627dsp) {
        this();
    }

    private LightBoxItem() {
    }

    /* loaded from: classes4.dex */
    public static final class Image extends LightBoxItem {
        public static final Parcelable.Creator<Image> CREATOR = new Creator();
        private final String a;

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<Image> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Image createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return new Image(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Image[] newArray(int i) {
                return new Image[i];
            }
        }

        public final String a() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && C8632dsu.c((Object) this.a, (Object) ((Image) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "Image(url=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeString(this.a);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.a = str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Video extends LightBoxItem {
        public static final Parcelable.Creator<Video> CREATOR = new Creator();
        private final int b;
        private final String c;
        private final TrackingInfoHolder d;
        private final String e;

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<Video> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Video[] newArray(int i) {
                return new Video[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: d */
            public final Video createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return new Video(parcel.readString(), parcel.readString(), parcel.readInt(), (TrackingInfoHolder) parcel.readParcelable(Video.class.getClassLoader()));
            }
        }

        public final TrackingInfoHolder b() {
            return this.d;
        }

        public final int c() {
            return this.b;
        }

        public final String d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Video) {
                Video video = (Video) obj;
                return C8632dsu.c((Object) this.e, (Object) video.e) && C8632dsu.c((Object) this.c, (Object) video.c) && this.b == video.b && C8632dsu.c(this.d, video.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.c;
            return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.b)) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.c;
            int i = this.b;
            TrackingInfoHolder trackingInfoHolder = this.d;
            return "Video(videoId=" + str + ", imageUrl=" + str2 + ", runtime=" + i + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeString(this.e);
            parcel.writeString(this.c);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.d, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Video(String str, String str2, int i, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.e = str;
            this.c = str2;
            this.b = i;
            this.d = trackingInfoHolder;
        }
    }
}
