package com.netflix.mediaclient.ui.commander.impl.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import com.slack.circuit.runtime.screen.Screen;
import java.util.List;
import o.C1291Wa;
import o.C8632dsu;
import o.InterfaceC8491dno;
import o.VW;

/* loaded from: classes4.dex */
public final class EpisodesScreen implements Screen {
    public static final EpisodesScreen b = new EpisodesScreen();
    public static final Parcelable.Creator<EpisodesScreen> CREATOR = new Creator();

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<EpisodesScreen> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final EpisodesScreen[] newArray(int i) {
            return new EpisodesScreen[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public final EpisodesScreen createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            parcel.readInt();
            return EpisodesScreen.b;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeInt(1);
    }

    private EpisodesScreen() {
    }

    /* loaded from: classes4.dex */
    public interface d extends InterfaceC8491dno {
        boolean b();

        /* loaded from: classes4.dex */
        public static final class e implements d {
            private final boolean b;

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.EpisodesScreen.d
            public boolean b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.b == ((e) obj).b;
            }

            public int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public String toString() {
                boolean z = this.b;
                return "Error(showOverlay=" + z + ")";
            }

            public e(boolean z) {
                this.b = z;
            }
        }

        /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.EpisodesScreen$d$d  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0061d implements d {
            private final boolean a;
            private final int b;
            private final List<VW> c;
            private final List<C1291Wa> d;
            private final String e;
            private final boolean i;

            public final int a() {
                return this.b;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.EpisodesScreen.d
            public boolean b() {
                return this.a;
            }

            public final List<VW> c() {
                return this.c;
            }

            public final String d() {
                return this.e;
            }

            public final List<C1291Wa> e() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0061d) {
                    C0061d c0061d = (C0061d) obj;
                    return C8632dsu.c(this.d, c0061d.d) && this.b == c0061d.b && C8632dsu.c((Object) this.e, (Object) c0061d.e) && C8632dsu.c(this.c, c0061d.c) && this.a == c0061d.a && this.i == c0061d.i;
                }
                return false;
            }

            public int hashCode() {
                return (((((((((this.d.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.i);
            }

            public final boolean j() {
                return this.i;
            }

            public String toString() {
                List<C1291Wa> list = this.d;
                int i = this.b;
                String str = this.e;
                List<VW> list2 = this.c;
                boolean z = this.a;
                boolean z2 = this.i;
                return "Success(seasonList=" + list + ", currentSeasonNumber=" + i + ", currentSeasonTitle=" + str + ", currentSeasonEpisodesList=" + list2 + ", showOverlay=" + z + ", showSeasonOverlay=" + z2 + ")";
            }

            public C0061d(List<C1291Wa> list, int i, String str, List<VW> list2, boolean z, boolean z2) {
                C8632dsu.c((Object) list, "");
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) list2, "");
                this.d = list;
                this.b = i;
                this.e = str;
                this.c = list2;
                this.a = z;
                this.i = z2;
            }
        }
    }
}
