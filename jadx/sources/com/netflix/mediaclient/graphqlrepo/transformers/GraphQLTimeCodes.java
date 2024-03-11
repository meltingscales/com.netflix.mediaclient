package com.netflix.mediaclient.graphqlrepo.transformers;

import android.os.Parcel;
import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLTimeCodes;
import com.netflix.model.leafs.TimeCodesData;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.blades.SkipContentData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.C2630ajh;
import o.C2637ajo;
import o.C8572dqo;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class GraphQLTimeCodes implements VideoInfo.TimeCodes {
    private final C2630ajh a;
    private final C2637ajo d;

    public GraphQLTimeCodes(C2637ajo c2637ajo, C2630ajh c2630ajh) {
        C8632dsu.c((Object) c2630ajh, "");
        this.d = c2637ajo;
        this.a = c2630ajh;
    }

    @Override // com.netflix.model.leafs.VideoInfo.TimeCodes
    public TimeCodesData getTimeCodesData() {
        return new GraphQLTimeCodesData(this.d, this.a);
    }

    /* loaded from: classes3.dex */
    public static final class GraphQLTimeCodesData extends TimeCodesData {
        private final C2630ajh a;
        private final C2637ajo c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public GraphQLTimeCodesData(C2637ajo c2637ajo, C2630ajh c2630ajh) {
            C8632dsu.c((Object) c2630ajh, "");
            this.c = c2637ajo;
            this.a = c2630ajh;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeParcelable(creditMarks(), i);
            parcel.writeList(skipContent());
            parcel.writeInt(videoId());
        }

        @Override // com.netflix.model.leafs.TimeCodesData
        public CreditMarks creditMarks() {
            return new CreditMarks() { // from class: com.netflix.mediaclient.graphqlrepo.transformers.GraphQLTimeCodes$GraphQLTimeCodesData$creditMarks$1
                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
                    C8632dsu.c((Object) parcel, "");
                    parcel.writeInt(startCredit());
                    parcel.writeInt(endCredit());
                    parcel.writeInt(startRecap());
                    parcel.writeInt(endRecap());
                }

                @Override // com.netflix.model.leafs.blades.CreditMarks
                public int startCredit() {
                    C2637ajo c2637ajo;
                    Integer c;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    c2637ajo = GraphQLTimeCodes.GraphQLTimeCodesData.this.c;
                    return (int) timeUnit.toMillis((c2637ajo == null || (c = c2637ajo.c()) == null) ? 0 : c.intValue());
                }

                @Override // com.netflix.model.leafs.blades.CreditMarks
                public int endCredit() {
                    C2637ajo c2637ajo;
                    Integer e;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    c2637ajo = GraphQLTimeCodes.GraphQLTimeCodesData.this.c;
                    return (int) timeUnit.toMillis((c2637ajo == null || (e = c2637ajo.e()) == null) ? 0 : e.intValue());
                }

                @Override // com.netflix.model.leafs.blades.CreditMarks
                public int startRecap() {
                    C2637ajo c2637ajo;
                    Integer d;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    c2637ajo = GraphQLTimeCodes.GraphQLTimeCodesData.this.c;
                    return (int) timeUnit.toMillis((c2637ajo == null || (d = c2637ajo.d()) == null) ? 0 : d.intValue());
                }

                @Override // com.netflix.model.leafs.blades.CreditMarks
                public int endRecap() {
                    C2637ajo c2637ajo;
                    Integer a;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    c2637ajo = GraphQLTimeCodes.GraphQLTimeCodesData.this.c;
                    return (int) timeUnit.toMillis((c2637ajo == null || (a = c2637ajo.a()) == null) ? 0 : a.intValue());
                }
            };
        }

        @Override // com.netflix.model.leafs.TimeCodesData
        public List<SkipContentData> skipContent() {
            List<C2637ajo.d> b;
            int d;
            C2637ajo c2637ajo = this.c;
            if (c2637ajo == null || (b = c2637ajo.b()) == null) {
                return null;
            }
            d = C8572dqo.d(b, 10);
            ArrayList arrayList = new ArrayList(d);
            for (final C2637ajo.d dVar : b) {
                arrayList.add(new SkipContentData() { // from class: com.netflix.mediaclient.graphqlrepo.transformers.GraphQLTimeCodes$GraphQLTimeCodesData$skipContent$1$1
                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int i) {
                        C8632dsu.c((Object) parcel, "");
                        parcel.writeInt(start());
                        parcel.writeInt(end());
                        parcel.writeString(label());
                    }

                    @Override // com.netflix.model.leafs.blades.SkipContentData
                    public int start() {
                        Integer c = C2637ajo.d.this.c();
                        if (c != null) {
                            return c.intValue();
                        }
                        return 0;
                    }

                    @Override // com.netflix.model.leafs.blades.SkipContentData
                    public int end() {
                        Integer d2 = C2637ajo.d.this.d();
                        if (d2 != null) {
                            return d2.intValue();
                        }
                        return 0;
                    }

                    @Override // com.netflix.model.leafs.blades.SkipContentData
                    public String label() {
                        String b2 = C2637ajo.d.this.b();
                        return b2 == null ? "" : b2;
                    }
                });
            }
            return arrayList;
        }

        @Override // com.netflix.model.leafs.TimeCodesData
        public int videoId() {
            return this.a.e();
        }
    }
}
