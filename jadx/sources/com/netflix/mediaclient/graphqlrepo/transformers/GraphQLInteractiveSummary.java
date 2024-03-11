package com.netflix.mediaclient.graphqlrepo.transformers;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.Map;
import o.C2412afk;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class GraphQLInteractiveSummary extends InteractiveSummary {
    public static final Parcelable.Creator<GraphQLInteractiveSummary> CREATOR = new Creator();
    private final C2412afk c;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<GraphQLInteractiveSummary> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final GraphQLInteractiveSummary[] newArray(int i) {
            return new GraphQLInteractiveSummary[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public final GraphQLInteractiveSummary createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new GraphQLInteractiveSummary((C2412afk) parcel.readValue(GraphQLInteractiveSummary.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary
    public Map<String, String> nextSegmentRedirects() {
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeValue(this.c);
    }

    public GraphQLInteractiveSummary(C2412afk c2412afk) {
        this.c = c2412afk;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveSummary
    public InteractiveSummary.Features features() {
        C2412afk.c e;
        C2412afk c2412afk = this.c;
        return new GraphQLInteractiveSummaryFeatures((c2412afk == null || (e = c2412afk.e()) == null) ? null : e.d());
    }
}
