package com.netflix.mediaclient.servicemgr.interface_.genre;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import java.util.Locale;

/* loaded from: classes4.dex */
public class DefaultGenreItem implements GenreItem {
    public static final Parcelable.Creator<DefaultGenreItem> CREATOR = new Parcelable.Creator<DefaultGenreItem>() { // from class: com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DefaultGenreItem createFromParcel(Parcel parcel) {
            return new DefaultGenreItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public DefaultGenreItem[] newArray(int i) {
            return new DefaultGenreItem[i];
        }
    };
    protected String a;
    protected boolean b;
    protected String d;
    protected String e;
    protected int f;
    protected String h;
    protected String i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return this.a;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public String getParentPageUUID() {
        return this.i;
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        return this.d;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public int getTrackId() {
        return this.f;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public String getUnifiedEntityId() {
        return this.h;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public boolean hasSubGenres() {
        return this.b;
    }

    public DefaultGenreItem() {
        this.f = -220;
    }

    public DefaultGenreItem(String str, String str2, GenreItem.GenreType genreType, String str3, String str4) {
        this(str, str2, genreType, -220, str3, str4);
    }

    public DefaultGenreItem(String str, String str2, GenreItem.GenreType genreType, int i, String str3, String str4) {
        this.f = -220;
        this.d = str;
        this.a = str2;
        this.e = genreType.toString();
        this.f = i;
        this.b = false;
        this.h = str3;
        this.i = str4;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public GenreItem.GenreType getGenreType() {
        String str = this.e;
        if (str == null) {
            return GenreItem.GenreType.LOLOMO;
        }
        return GenreItem.GenreType.valueOf(str.toUpperCase(Locale.ENGLISH));
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return LoMoType.STANDARD;
    }

    public DefaultGenreItem(Parcel parcel) {
        this.f = -220;
        this.f = parcel.readInt();
        this.d = parcel.readString();
        this.a = parcel.readString();
        this.e = parcel.readString();
        this.b = parcel.readInt() != 0;
        this.h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeString(this.d);
        parcel.writeString(this.a);
        parcel.writeString(this.e);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.h);
    }

    public String toString() {
        return "DefaultGenreList [genreName=" + this.d + ", genreId=" + this.a + ", genreType=" + this.e + ", hasSubGenres=" + this.b + ", unifiedEntityId=" + this.h + "]";
    }
}
