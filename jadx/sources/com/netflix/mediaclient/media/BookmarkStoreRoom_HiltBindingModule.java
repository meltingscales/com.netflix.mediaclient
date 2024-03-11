package com.netflix.mediaclient.media;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@OriginatingElement(topLevelClass = BookmarkStoreRoom.class)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface BookmarkStoreRoom_HiltBindingModule {
    @Binds
    BookmarkStore bind(BookmarkStoreRoom bookmarkStoreRoom);
}
