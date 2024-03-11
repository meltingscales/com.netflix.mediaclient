package com.netflix.model.leafs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import java.util.Locale;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8123deT;
import o.C8168dfL;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public class GenreItemImpl extends AbstractC0941Im implements GenreItem, InterfaceC0952Ix {
    public static final Parcelable.Creator<GenreItemImpl> CREATOR = new Parcelable.Creator<GenreItemImpl>() { // from class: com.netflix.model.leafs.GenreItemImpl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GenreItemImpl createFromParcel(Parcel parcel) {
            return new GenreItemImpl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GenreItemImpl[] newArray(int i) {
            return new GenreItemImpl[i];
        }
    };
    private static final String TAG = "GenreListItemImpl";
    public String genreId;
    public String genreName;
    public String genreType;
    protected boolean hasSubGenres;
    protected String parentPageUUID;
    protected int trackId;
    protected String unifiedEntityId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return this.genreId;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public String getParentPageUUID() {
        return this.parentPageUUID;
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        return this.genreName;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public int getTrackId() {
        return this.trackId;
    }

    public String getUnifiedEntityId() {
        return this.unifiedEntityId;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public boolean hasSubGenres() {
        return this.hasSubGenres;
    }

    public GenreItemImpl() {
        this.trackId = -220;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -1829241802:
                    if (key.equals("hasSubGenres")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1067396154:
                    if (key.equals("trackId")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -416615408:
                    if (key.equals("unifiedEntityId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -79774210:
                    if (key.equals("genreId")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 646545070:
                    if (key.equals("genreName")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 646746973:
                    if (key.equals("genreType")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.hasSubGenres = entry.getValue().getAsBoolean();
            } else if (c == 1) {
                this.trackId = C8123deT.c(entry.getValue());
            } else if (c == 2) {
                this.unifiedEntityId = entry.getValue().getAsString();
            } else if (c == 3) {
                this.genreId = entry.getValue().getAsString();
            } else if (c == 4) {
                this.genreName = C8168dfL.b(entry.getValue().getAsString());
            } else if (c == 5) {
                this.genreType = entry.getValue().getAsString();
            }
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public GenreItem.GenreType getGenreType() {
        String str = this.genreType;
        if (str == null) {
            return GenreItem.GenreType.LOLOMO;
        }
        return GenreItem.GenreType.valueOf(str.toUpperCase(Locale.ENGLISH));
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return LoMoType.STANDARD;
    }

    public GenreItemImpl(Parcel parcel) {
        this.trackId = -220;
        this.genreName = parcel.readString();
        this.genreId = parcel.readString();
        this.genreType = parcel.readString();
        this.hasSubGenres = parcel.readInt() != 0;
        this.trackId = parcel.readInt();
        this.unifiedEntityId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.genreName);
        parcel.writeString(this.genreId);
        parcel.writeString(this.genreType);
        parcel.writeInt(this.hasSubGenres ? 1 : 0);
        parcel.writeInt(this.trackId);
        parcel.writeString(this.unifiedEntityId);
    }

    public String toString() {
        return "GenreListItem [genreName=" + this.genreName + ", genreId=" + this.genreId + ", genreType=" + this.genreType + ", hasSubGenres=" + this.hasSubGenres + ", trackId=" + this.trackId + ", unifiedEntityId=" + this.unifiedEntityId + "]";
    }
}
