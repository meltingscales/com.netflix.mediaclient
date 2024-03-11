package com.netflix.mediaclient.ui.commander.impl.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import com.slack.circuit.runtime.screen.Screen;
import o.C1293Wc;
import o.C8632dsu;
import o.InterfaceC8491dno;

/* loaded from: classes4.dex */
public final class AudioSubtitlesScreen implements Screen {
    public static final AudioSubtitlesScreen a = new AudioSubtitlesScreen();
    public static final Parcelable.Creator<AudioSubtitlesScreen> CREATOR = new Creator();

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<AudioSubtitlesScreen> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AudioSubtitlesScreen[] newArray(int i) {
            return new AudioSubtitlesScreen[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final AudioSubtitlesScreen createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            parcel.readInt();
            return AudioSubtitlesScreen.a;
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

    private AudioSubtitlesScreen() {
    }

    /* loaded from: classes4.dex */
    public interface e extends InterfaceC8491dno {
        boolean b();

        /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.AudioSubtitlesScreen$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0056e implements e {
            private final boolean d;

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.AudioSubtitlesScreen.e
            public boolean b() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0056e) && this.d == ((C0056e) obj).d;
            }

            public int hashCode() {
                return Boolean.hashCode(this.d);
            }

            public String toString() {
                boolean z = this.d;
                return "Error(showOverlay=" + z + ")";
            }

            public C0056e(boolean z) {
                this.d = z;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements e {
            private final boolean b;
            private final C1293Wc c;

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.AudioSubtitlesScreen.e
            public boolean b() {
                return this.b;
            }

            public final C1293Wc e() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return C8632dsu.c(this.c, aVar.c) && this.b == aVar.b;
                }
                return false;
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + Boolean.hashCode(this.b);
            }

            public String toString() {
                C1293Wc c1293Wc = this.c;
                boolean z = this.b;
                return "Success(trackData=" + c1293Wc + ", showOverlay=" + z + ")";
            }

            public a(C1293Wc c1293Wc, boolean z) {
                C8632dsu.c((Object) c1293Wc, "");
                this.c = c1293Wc;
                this.b = z;
            }
        }
    }
}
