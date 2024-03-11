package com.netflix.mediaclient.media;

import android.content.Context;
import com.netflix.model.leafs.Bookmark;
import java.util.List;
import o.C5096bsM;
import o.InterfaceC5160btX;
import o.InterfaceC5198buI;
import o.InterfaceC5283bvo;

/* loaded from: classes.dex */
public interface BookmarkStore {
    void createOrUpdateBookmark(InterfaceC5198buI interfaceC5198buI, String str);

    C5096bsM getBookmark(String str, String str2);

    boolean init(Context context);

    void onPlayablesFetched(List<? extends InterfaceC5160btX> list, String str);

    void setBookmark(String str, C5096bsM c5096bsM);

    void updateBookmarkIfExists(String str, Bookmark bookmark, String str2);

    void updateValidProfiles(List<? extends InterfaceC5283bvo> list);
}
