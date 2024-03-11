package com.netflix.model.leafs;

/* loaded from: classes.dex */
public interface Bookmark {
    long getBookmarkPositionMs();

    Integer getInteractiveProgress();

    long getLastModified();

    void setBookmarkPositionMs(long j);

    void setLastModified(long j);
}
