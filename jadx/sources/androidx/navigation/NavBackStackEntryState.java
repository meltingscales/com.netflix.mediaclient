package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import o.C8627dsp;
import o.C8632dsu;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes5.dex */
public final class NavBackStackEntryState implements Parcelable {
    private final Bundle args;
    private final int destinationId;
    private final String id;
    private final Bundle savedState;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new Parcelable.Creator<NavBackStackEntryState>() { // from class: androidx.navigation.NavBackStackEntryState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new NavBackStackEntryState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final String getId() {
        return this.id;
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        C8632dsu.c((Object) navBackStackEntry, "");
        this.id = navBackStackEntry.getId();
        this.destinationId = navBackStackEntry.getDestination().getId();
        this.args = navBackStackEntry.getArguments();
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        navBackStackEntry.saveState(bundle);
    }

    public NavBackStackEntryState(Parcel parcel) {
        C8632dsu.c((Object) parcel, "");
        String readString = parcel.readString();
        C8632dsu.d((Object) readString);
        this.id = readString;
        this.destinationId = parcel.readInt();
        this.args = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        C8632dsu.d(readBundle);
        this.savedState = readBundle;
    }

    public final NavBackStackEntry instantiate(Context context, NavDestination navDestination, Lifecycle.State state, NavControllerViewModel navControllerViewModel) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) navDestination, "");
        C8632dsu.c((Object) state, "");
        Bundle bundle = this.args;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return NavBackStackEntry.Companion.create(context, navDestination, bundle, state, navControllerViewModel, this.id, this.savedState);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
