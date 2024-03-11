package com.netflix.mediaclient.graphqlrepo.transformers;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;
import o.C2412afk;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class GraphQLInteractiveSummaryFeatures extends InteractiveSummary.Features {
    public static final Parcelable.Creator<GraphQLInteractiveSummaryFeatures> CREATOR = new Creator();
    private final C2412afk.e e;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<GraphQLInteractiveSummaryFeatures> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final GraphQLInteractiveSummaryFeatures[] newArray(int i) {
            return new GraphQLInteractiveSummaryFeatures[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final GraphQLInteractiveSummaryFeatures createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new GraphQLInteractiveSummaryFeatures((C2412afk.e) parcel.readValue(GraphQLInteractiveSummaryFeatures.class.getClassLoader()));
        }
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public String appUpdateDialogMessage() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeValue(this.e);
    }

    public GraphQLInteractiveSummaryFeatures(C2412afk.e eVar) {
        this.e = eVar;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean playbackGraph() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.m(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean videoMoments() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.s(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean ipp() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.g(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean prePlay() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.o(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean customBookmark() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.b(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean fallbackTutorial() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.d(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean interactiveTrailer() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.h(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean hideDetailedDurations() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.c(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean interactiveAppUpdateDialogue() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.f(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean resetUserState() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.p(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean playerControlsSnapshots() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.n(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean choicePointDebugMenu() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.e(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public List<String> supportedErrorDialogs() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return eVar.t();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean pollingToggle() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.k(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public Double bookmarkOverrideSeconds() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean hideSubtitlesMenuDuringPlayback() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.j(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary.Features
    public boolean playerControlsPersistPlayPause() {
        C2412afk.e eVar = this.e;
        if (eVar != null) {
            return C8632dsu.c(eVar.l(), Boolean.TRUE);
        }
        return false;
    }
}
