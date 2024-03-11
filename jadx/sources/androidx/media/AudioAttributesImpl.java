package androidx.media;

import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: classes2.dex */
public interface AudioAttributesImpl extends VersionedParcelable {

    /* loaded from: classes2.dex */
    public interface Builder {
        AudioAttributesImpl build();

        Builder setLegacyStreamType(int i);
    }

    int getLegacyStreamType();
}
