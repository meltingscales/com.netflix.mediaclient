package com.netflix.mediaclient.ui.home.impl.repository.graphql.transformers;

import android.os.Parcel;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import kotlin.NotImplementedError;
import o.C2405afd;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class GraphQLLolomoGenreItem implements GenreItem {
    private final C2405afd e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GraphQLLolomoGenreItem(C2405afd c2405afd) {
        C8632dsu.c((Object) c2405afd, "");
        this.e = c2405afd;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return String.valueOf(this.e.b());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public String getUnifiedEntityId() {
        return this.e.c();
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        return String.valueOf(this.e.e());
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return LoMoType.CATEGORIES;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(getTitle());
        parcel.writeString(getId());
        parcel.writeString(getGenreType().toString());
        parcel.writeInt(hasSubGenres() ? 1 : 0);
        parcel.writeInt(getTrackId());
        parcel.writeString(getUnifiedEntityId());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public GenreItem.GenreType getGenreType() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public boolean hasSubGenres() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public int getTrackId() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
    public String getParentPageUUID() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
