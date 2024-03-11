package com.netflix.mediaclient.media;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes6.dex */
public final class BookmarkStoreRoom_Factory implements Factory<BookmarkStoreRoom> {
    private final Provider<Context> contextProvider;

    public BookmarkStoreRoom_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public BookmarkStoreRoom get() {
        return newInstance(this.contextProvider.get());
    }

    public static BookmarkStoreRoom_Factory create(Provider<Context> provider) {
        return new BookmarkStoreRoom_Factory(provider);
    }

    public static BookmarkStoreRoom newInstance(Context context) {
        return new BookmarkStoreRoom(context);
    }
}
