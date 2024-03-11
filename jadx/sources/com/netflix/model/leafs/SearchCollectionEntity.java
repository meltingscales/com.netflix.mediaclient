package com.netflix.model.leafs;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import o.InterfaceC5279bvk;

@Deprecated
/* loaded from: classes5.dex */
public interface SearchCollectionEntity extends InterfaceC5279bvk {
    String getBoxartId();

    String getDisplayHeader();

    String getEntityType();

    String getImageUrl();

    boolean getIsPreRelease();

    Boolean getIsVideoAvailable();

    String getPreQueryBoxartId();

    String getPreQueryImgUrl();

    int getTrackId();

    String getUnifiedEntityId();

    String getVideoId();

    VideoType getVideoType();
}
