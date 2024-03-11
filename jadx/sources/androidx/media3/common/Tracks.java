package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.Bundleable;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleableUtil;
import androidx.media3.common.util.Util;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class Tracks implements Bundleable {
    private final ImmutableList<Group> groups;
    public static final Tracks EMPTY = new Tracks(ImmutableList.of());
    private static final String FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    public static final Bundleable.Creator<Tracks> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.Tracks$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            Tracks lambda$static$0;
            lambda$static$0 = Tracks.lambda$static$0(bundle);
            return lambda$static$0;
        }
    };

    public ImmutableList<Group> getGroups() {
        return this.groups;
    }

    /* loaded from: classes2.dex */
    public static final class Group implements Bundleable {
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACK_SUPPORT = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_SELECTED = Util.intToStringMaxRadix(3);
        private static final String FIELD_ADAPTIVE_SUPPORTED = Util.intToStringMaxRadix(4);
        public static final Bundleable.Creator<Group> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.Tracks$Group$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                Tracks.Group lambda$static$0;
                lambda$static$0 = Tracks.Group.lambda$static$0(bundle);
                return lambda$static$0;
            }
        };

        public Group(TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            int i = trackGroup.length;
            this.length = i;
            boolean z2 = true;
            Assertions.checkArgument(i == iArr.length && i == zArr.length);
            this.mediaTrackGroup = trackGroup;
            this.adaptiveSupported = (!z || i <= 1) ? false : z2;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public Format getTrackFormat(int i) {
            return this.mediaTrackGroup.getFormat(i);
        }

        public boolean isSelected() {
            return Booleans.contains(this.trackSelected, true);
        }

        public boolean isTrackSelected(int i) {
            return this.trackSelected[i];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Group.class != obj.getClass()) {
                return false;
            }
            Group group = (Group) obj;
            return this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected);
        }

        public int hashCode() {
            int hashCode = this.mediaTrackGroup.hashCode();
            boolean z = this.adaptiveSupported;
            return (((((hashCode * 31) + (z ? 1 : 0)) * 31) + Arrays.hashCode(this.trackSupport)) * 31) + Arrays.hashCode(this.trackSelected);
        }

        @Override // androidx.media3.common.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
            bundle.putIntArray(FIELD_TRACK_SUPPORT, this.trackSupport);
            bundle.putBooleanArray(FIELD_TRACK_SELECTED, this.trackSelected);
            bundle.putBoolean(FIELD_ADAPTIVE_SUPPORTED, this.adaptiveSupported);
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Group lambda$static$0(Bundle bundle) {
            TrackGroup fromBundle = TrackGroup.CREATOR.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP)));
            return new Group(fromBundle, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) MoreObjects.firstNonNull(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[fromBundle.length]), (boolean[]) MoreObjects.firstNonNull(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[fromBundle.length]));
        }
    }

    public Tracks(List<Group> list) {
        this.groups = ImmutableList.copyOf((Collection) list);
    }

    public boolean isTypeSelected(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            Group group = this.groups.get(i2);
            if (group.isSelected() && group.getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((Tracks) obj).groups);
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    @Override // androidx.media3.common.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleableUtil.toBundleArrayList(this.groups));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Tracks lambda$static$0(Bundle bundle) {
        ImmutableList fromBundleList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        if (parcelableArrayList == null) {
            fromBundleList = ImmutableList.of();
        } else {
            fromBundleList = BundleableUtil.fromBundleList(Group.CREATOR, parcelableArrayList);
        }
        return new Tracks(fromBundleList);
    }
}
