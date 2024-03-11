package com.netflix.mediaclient.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.util.PlayContext;
import o.C1044Mm;
import o.C1596aHd;
import o.C8054ddD;
import o.InterfaceC1598aHf;

/* loaded from: classes4.dex */
public class BackStackData implements Parcelable {
    public static final Parcelable.Creator<BackStackData> CREATOR = new Parcelable.Creator<BackStackData>() { // from class: com.netflix.mediaclient.ui.details.BackStackData.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public BackStackData createFromParcel(Parcel parcel) {
            return new BackStackData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public BackStackData[] newArray(int i) {
            return new BackStackData[i];
        }
    };
    public final PlayContext a;
    public final String b;
    private boolean c;
    public Parcelable d;
    public final String e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BackStackData(String str, PlayContext playContext, Parcelable parcelable, String str2) {
        this.e = str;
        this.a = playContext;
        this.d = parcelable;
        this.b = str2;
    }

    private BackStackData(Parcel parcel) {
        this.e = parcel.readString();
        this.a = (PlayContext) parcel.readParcelable(PlayContextImp.class.getClassLoader());
        try {
            this.d = parcel.readParcelable(C8054ddD.b(GridLayoutManager.class));
        } catch (Throwable th) {
            C1044Mm.e("BackStackData", "SPY-8852: Failed to load layout manager state", th);
            InterfaceC1598aHf.a(new C1596aHd().d(th).b(false));
        }
        this.c = parcel.readByte() == 1;
        this.b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.d, 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.b);
    }

    public String toString() {
        return "BackStackData [mVideoId=" + this.e + ", playContext=" + this.a + ", layoutManagerState=" + this.d + ", videoTypeValue=" + this.b + "]";
    }
}
