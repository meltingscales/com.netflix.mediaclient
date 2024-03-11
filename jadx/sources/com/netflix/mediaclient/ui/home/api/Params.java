package com.netflix.mediaclient.ui.home.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes4.dex */
public abstract class Params {

    /* loaded from: classes4.dex */
    public static final class Lolomo implements Parcelable {
        public static final Parcelable.Creator<Lolomo> CREATOR = new Creator();
        private final boolean a;
        private final String b;
        private final GenreItem c;
        private final String d;
        private final boolean e;
        private final AppView g;

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<Lolomo> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Lolomo createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return new Lolomo(parcel.readString(), parcel.readString(), (GenreItem) parcel.readParcelable(Lolomo.class.getClassLoader()), AppView.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Lolomo[] newArray(int i) {
                return new Lolomo[i];
            }
        }

        public static /* synthetic */ Lolomo b(Lolomo lolomo, String str, String str2, GenreItem genreItem, AppView appView, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lolomo.b;
            }
            if ((i & 2) != 0) {
                str2 = lolomo.d;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                genreItem = lolomo.c;
            }
            GenreItem genreItem2 = genreItem;
            if ((i & 8) != 0) {
                appView = lolomo.g;
            }
            AppView appView2 = appView;
            if ((i & 16) != 0) {
                z = lolomo.e;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                z2 = lolomo.a;
            }
            return lolomo.a(str, str3, genreItem2, appView2, z3, z2);
        }

        public final Lolomo a(String str, String str2, GenreItem genreItem, AppView appView, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) appView, "");
            return new Lolomo(str, str2, genreItem, appView, z, z2);
        }

        public final boolean a() {
            return this.a;
        }

        public final String c() {
            return this.d;
        }

        public final GenreItem d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Lolomo) {
                Lolomo lolomo = (Lolomo) obj;
                return C8632dsu.c((Object) this.b, (Object) lolomo.b) && C8632dsu.c((Object) this.d, (Object) lolomo.d) && C8632dsu.c(this.c, lolomo.c) && this.g == lolomo.g && this.e == lolomo.e && this.a == lolomo.a;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            GenreItem genreItem = this.c;
            return (((((((((hashCode * 31) + hashCode2) * 31) + (genreItem != null ? genreItem.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.a);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            GenreItem genreItem = this.c;
            AppView appView = this.g;
            boolean z = this.e;
            boolean z2 = this.a;
            return "Lolomo(lolomoId=" + str + ", filterGenreId=" + str2 + ", genre=" + genreItem + ", navigationSource=" + appView + ", isColdStart=" + z + ", forceNewLolomo=" + z2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeString(this.b);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.g.name());
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public Lolomo(String str, String str2, GenreItem genreItem, AppView appView, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) appView, "");
            this.b = str;
            this.d = str2;
            this.c = genreItem;
            this.g = appView;
            this.e = z;
            this.a = z2;
        }

        public /* synthetic */ Lolomo(String str, String str2, GenreItem genreItem, AppView appView, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? null : str2, genreItem, appView, z, (i & 32) != 0 ? false : z2);
        }
    }
}
