package com.netflix.mediaclient.servicemgr.interface_.genre;

import android.os.Parcelable;
import o.InterfaceC5178btp;

/* loaded from: classes4.dex */
public interface GenreItem extends InterfaceC5178btp, Parcelable {

    /* loaded from: classes4.dex */
    public enum GenreType {
        GALLERY,
        LOLOMO,
        UNKNOWN
    }

    GenreType getGenreType();

    String getParentPageUUID();

    int getTrackId();

    String getUnifiedEntityId();

    boolean hasSubGenres();
}
