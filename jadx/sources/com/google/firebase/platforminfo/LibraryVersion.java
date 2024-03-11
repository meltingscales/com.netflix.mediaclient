package com.google.firebase.platforminfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class LibraryVersion {
    public abstract String getLibraryName();

    public abstract String getVersion();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LibraryVersion create(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }
}
