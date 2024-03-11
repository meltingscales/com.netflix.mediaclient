package com.netflix.mediaclient.clutils;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.SearchPageEntity;
import com.netflix.model.leafs.SearchSectionSummary;
import com.netflix.model.leafs.UpNextFeedListItem;
import com.netflix.model.leafs.UpNextFeedVideoEvidence;
import java.util.Iterator;
import o.C1281Vq;
import o.C1283Vs;
import o.C1596aHd;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5143btG;
import o.InterfaceC5155btS;
import o.InterfaceC5223buh;
import o.InterfaceC5224bui;
import o.InterfaceC5281bvm;
import o.InterfaceC8366diy;
import o.dqF;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class TrackingInfoHolder implements Parcelable {
    private final CLListTrackingInfoBase b;
    private final CLLolomoTrackingInfoBase c;
    private final PlayLocationType e;
    private final CLItemTrackingInfoBase i;
    public static final c a = new c(null);
    public static final Parcelable.Creator<TrackingInfoHolder> CREATOR = new Creator();
    private static final TrackingInfoHolder d = new TrackingInfoHolder(PlayLocationType.UNKNOWN);

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<TrackingInfoHolder> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final TrackingInfoHolder[] newArray(int i) {
            return new TrackingInfoHolder[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public final TrackingInfoHolder createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new TrackingInfoHolder(PlayLocationType.valueOf(parcel.readString()), (CLLolomoTrackingInfoBase) parcel.readParcelable(TrackingInfoHolder.class.getClassLoader()), (CLListTrackingInfoBase) parcel.readParcelable(TrackingInfoHolder.class.getClassLoader()), (CLItemTrackingInfoBase) parcel.readParcelable(TrackingInfoHolder.class.getClassLoader()));
        }
    }

    public static /* synthetic */ TrackingInfoHolder b(TrackingInfoHolder trackingInfoHolder, PlayLocationType playLocationType, CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase, CLListTrackingInfoBase cLListTrackingInfoBase, CLItemTrackingInfoBase cLItemTrackingInfoBase, int i, Object obj) {
        if ((i & 1) != 0) {
            playLocationType = trackingInfoHolder.e;
        }
        if ((i & 2) != 0) {
            cLLolomoTrackingInfoBase = trackingInfoHolder.c;
        }
        if ((i & 4) != 0) {
            cLListTrackingInfoBase = trackingInfoHolder.b;
        }
        if ((i & 8) != 0) {
            cLItemTrackingInfoBase = trackingInfoHolder.i;
        }
        return trackingInfoHolder.d(playLocationType, cLLolomoTrackingInfoBase, cLListTrackingInfoBase, cLItemTrackingInfoBase);
    }

    public final TrackingInfoHolder d(PlayLocationType playLocationType, CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase, CLListTrackingInfoBase cLListTrackingInfoBase, CLItemTrackingInfoBase cLItemTrackingInfoBase) {
        C8632dsu.c((Object) playLocationType, "");
        return new TrackingInfoHolder(playLocationType, cLLolomoTrackingInfoBase, cLListTrackingInfoBase, cLItemTrackingInfoBase);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final CLListTrackingInfoBase e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrackingInfoHolder) {
            TrackingInfoHolder trackingInfoHolder = (TrackingInfoHolder) obj;
            return this.e == trackingInfoHolder.e && C8632dsu.c(this.c, trackingInfoHolder.c) && C8632dsu.c(this.b, trackingInfoHolder.b) && C8632dsu.c(this.i, trackingInfoHolder.i);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        int hashCode2 = cLLolomoTrackingInfoBase == null ? 0 : cLLolomoTrackingInfoBase.hashCode();
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        int hashCode3 = cLListTrackingInfoBase == null ? 0 : cLListTrackingInfoBase.hashCode();
        CLItemTrackingInfoBase cLItemTrackingInfoBase = this.i;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cLItemTrackingInfoBase != null ? cLItemTrackingInfoBase.hashCode() : 0);
    }

    public String toString() {
        PlayLocationType playLocationType = this.e;
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        CLItemTrackingInfoBase cLItemTrackingInfoBase = this.i;
        return "TrackingInfoHolder(originalView=" + playLocationType + ", trackableLolomo=" + cLLolomoTrackingInfoBase + ", trackableList=" + cLListTrackingInfoBase + ", trackableVideo=" + cLItemTrackingInfoBase + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeString(this.e.name());
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.i, i);
    }

    public TrackingInfoHolder(PlayLocationType playLocationType, CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase, CLListTrackingInfoBase cLListTrackingInfoBase, CLItemTrackingInfoBase cLItemTrackingInfoBase) {
        C8632dsu.c((Object) playLocationType, "");
        this.e = playLocationType;
        this.c = cLLolomoTrackingInfoBase;
        this.b = cLListTrackingInfoBase;
        this.i = cLItemTrackingInfoBase;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackingInfoHolder(PlayLocationType playLocationType) {
        this(playLocationType, null, null, null);
        C8632dsu.c((Object) playLocationType, "");
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final TrackingInfoHolder b() {
            return TrackingInfoHolder.d;
        }
    }

    public final TrackingInfoHolder b(InterfaceC5155btS interfaceC5155btS) {
        C8632dsu.c((Object) interfaceC5155btS, "");
        return b(this, null, new LolomoCLTrackingInfo(interfaceC5155btS), null, null, 13, null);
    }

    public final TrackingInfoHolder c(String str) {
        C8632dsu.c((Object) str, "");
        return b(this, null, new LolomoCLTrackingInfo(str), null, null, 13, null);
    }

    public final TrackingInfoHolder a(InterfaceC5281bvm interfaceC5281bvm) {
        C8632dsu.c((Object) interfaceC5281bvm, "");
        return b(this, null, null, new ListSummaryCLTrackingInfo(interfaceC5281bvm), null, 11, null);
    }

    public final TrackingInfoHolder e(SearchSectionSummary searchSectionSummary, int i) {
        C8632dsu.c((Object) searchSectionSummary, "");
        return b(this, null, null, new SearchSuggestionSectionCLTrackingInfo(searchSectionSummary, i), null, 11, null);
    }

    public final TrackingInfoHolder e(InterfaceC5223buh interfaceC5223buh, int i) {
        C8632dsu.c((Object) interfaceC5223buh, "");
        return b(this, null, null, null, new VideoSummaryCLTrackingInfo(interfaceC5223buh, i), 7, null);
    }

    public final TrackingInfoHolder c(InterfaceC5143btG interfaceC5143btG, int i) {
        C8632dsu.c((Object) interfaceC5143btG, "");
        return b(this, null, null, null, new CategoryCLTrackingInfo(interfaceC5143btG, i), 7, null);
    }

    public final TrackingInfoHolder d(UpNextFeedListItem upNextFeedListItem, int i) {
        C8632dsu.c((Object) upNextFeedListItem, "");
        InterfaceC8366diy video = upNextFeedListItem.getVideo();
        if (video != null) {
            int a2 = C1283Vs.a(video);
            InterfaceC8366diy video2 = upNextFeedListItem.getVideo();
            String unifiedEntityId = video2 != null ? video2.getUnifiedEntityId() : null;
            UpNextFeedVideoEvidence itemEvidence = upNextFeedListItem.getItemEvidence();
            TrackingInfoHolder b = b(this, null, null, null, new VideoSummaryCLTrackingInfo(a2, unifiedEntityId, null, i, itemEvidence != null ? itemEvidence.videoMerchComputeId() : null), 7, null);
            if (b != null) {
                return b;
            }
        }
        return this;
    }

    public final TrackingInfoHolder b(InterfaceC5224bui interfaceC5224bui, int i) {
        C8632dsu.c((Object) interfaceC5224bui, "");
        return b(this, null, null, null, new TrailerVideoCLTrackinginfo(interfaceC5224bui, i), 7, null);
    }

    public final TrackingInfoHolder b(InterfaceC5223buh interfaceC5223buh, String str, int i) {
        C8632dsu.c((Object) interfaceC5223buh, "");
        return b(this, null, null, null, new VideoSummaryCLTrackingInfo(interfaceC5223buh, str, i), 7, null);
    }

    public static /* synthetic */ TrackingInfoHolder c(TrackingInfoHolder trackingInfoHolder, SearchPageEntity searchPageEntity, int i, boolean z, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = null;
        }
        return trackingInfoHolder.c(searchPageEntity, i, z, str);
    }

    public final TrackingInfoHolder c(SearchPageEntity searchPageEntity, int i, boolean z, String str) {
        C8632dsu.c((Object) searchPageEntity, "");
        return b(this, null, null, null, new SearchSuggestionCLTrackingInfo(searchPageEntity, i, z, str), 7, null);
    }

    public final TrackingInfoHolder d(int i, PlayContext playContext) {
        C8632dsu.c((Object) playContext, "");
        String a2 = playContext.a();
        LolomoCLTrackingInfo lolomoCLTrackingInfo = a2 != null ? new LolomoCLTrackingInfo(a2) : null;
        String requestId = playContext.getRequestId();
        C8632dsu.a(requestId, "");
        ListSummaryCLTrackingInfo listSummaryCLTrackingInfo = new ListSummaryCLTrackingInfo(requestId, playContext.getListId(), playContext.getSectionUid(), playContext.getTrackId(), null, null, playContext.getListPos());
        String f = playContext.f();
        String d2 = playContext.d();
        if (d2 == null) {
            d2 = "missingImageKey";
        }
        return b(this, null, lolomoCLTrackingInfo, listSummaryCLTrackingInfo, new VideoSummaryCLTrackingInfo(i, f, d2, playContext.i(), playContext.h()), 1, null);
    }

    public static /* synthetic */ TrackingInfo a(TrackingInfoHolder trackingInfoHolder, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return trackingInfoHolder.c(str, str2, str3);
    }

    public final TrackingInfo c(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        if (cLLolomoTrackingInfoBase != null) {
            cLLolomoTrackingInfoBase.c(jSONObject);
        }
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        if (cLListTrackingInfoBase != null) {
            cLListTrackingInfoBase.c(jSONObject);
        }
        CLItemTrackingInfoBase cLItemTrackingInfoBase = this.i;
        if (cLItemTrackingInfoBase != null) {
            cLItemTrackingInfoBase.c(jSONObject);
        }
        if (str != null && str.length() > 0) {
            jSONObject.put("imageKey", str);
        }
        if (str2 != null && str2.length() > 0) {
            jSONObject.put("evidenceKey", str2);
        }
        if (str3 != null && str3.length() > 0) {
            jSONObject.put("badge", str3);
        }
        return C1281Vq.d(jSONObject);
    }

    public static /* synthetic */ TrackingInfo e(TrackingInfoHolder trackingInfoHolder, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = null;
        }
        return trackingInfoHolder.c(jSONObject);
    }

    public final TrackingInfo c(JSONObject jSONObject) {
        Iterator keys;
        Throwable th;
        JSONObject jSONObject2 = new JSONObject();
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        if (cLLolomoTrackingInfoBase != null) {
            cLLolomoTrackingInfoBase.c(jSONObject2);
        }
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        if (cLListTrackingInfoBase != null) {
            cLListTrackingInfoBase.c(jSONObject2);
        }
        CLItemTrackingInfoBase cLItemTrackingInfoBase = this.i;
        if (cLItemTrackingInfoBase != null) {
            cLItemTrackingInfoBase.c(jSONObject2);
        }
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String str = (String) keys.next();
                try {
                    jSONObject2.put(str, jSONObject.get(str));
                } catch (JSONException e) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    C1596aHd c1596aHd = new C1596aHd("toPresentationTrackingInfo parsing error", e, null, true, dqF.d(dqF.c()), false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }
        return C1281Vq.d(jSONObject2);
    }

    public final TrackingInfo c() {
        Throwable th;
        JSONObject jSONObject = new JSONObject();
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        if (cLLolomoTrackingInfoBase != null) {
            cLLolomoTrackingInfoBase.c(jSONObject);
        }
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        if (cLListTrackingInfoBase != null) {
            cLListTrackingInfoBase.c(jSONObject);
        }
        if (this.i != null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            CLListTrackingInfoBase cLListTrackingInfoBase2 = this.b;
            Integer valueOf = cLListTrackingInfoBase2 != null ? Integer.valueOf(cLListTrackingInfoBase2.e()) : null;
            C1596aHd c1596aHd = new C1596aHd("toNoRowTrackingInfo() had trackableVide for trackId " + valueOf, null, null, true, dqF.d(dqF.c()), false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        jSONObject.put(SignupConstants.Field.VIDEO_ID, -1);
        jSONObject.put("rank", -1);
        return C1281Vq.d(jSONObject);
    }

    public final TrackingInfo j() {
        JSONObject jSONObject = new JSONObject();
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        if (cLListTrackingInfoBase != null) {
            cLListTrackingInfoBase.b(jSONObject);
        }
        return C1281Vq.d(jSONObject);
    }

    public final TrackingInfo g() {
        JSONObject jSONObject = new JSONObject();
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        if (cLLolomoTrackingInfoBase != null) {
            cLLolomoTrackingInfoBase.d(jSONObject);
        }
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        if (cLListTrackingInfoBase != null) {
            cLListTrackingInfoBase.d(jSONObject);
        }
        CLItemTrackingInfoBase cLItemTrackingInfoBase = this.i;
        if (cLItemTrackingInfoBase != null) {
            cLItemTrackingInfoBase.d(jSONObject);
        }
        return C1281Vq.d(jSONObject);
    }

    public static /* synthetic */ TrackingInfo a(TrackingInfoHolder trackingInfoHolder, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = null;
        }
        return trackingInfoHolder.d(jSONObject);
    }

    public final TrackingInfo d(JSONObject jSONObject) {
        Iterator keys;
        Throwable th;
        JSONObject jSONObject2 = new JSONObject();
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        if (cLLolomoTrackingInfoBase != null) {
            cLLolomoTrackingInfoBase.c(jSONObject2);
        }
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        if (cLListTrackingInfoBase != null) {
            cLListTrackingInfoBase.c(jSONObject2);
        }
        CLItemTrackingInfoBase cLItemTrackingInfoBase = this.i;
        if (cLItemTrackingInfoBase != null) {
            cLItemTrackingInfoBase.c(jSONObject2);
        }
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String str = (String) keys.next();
                try {
                    jSONObject2.put(str, jSONObject.get(str));
                } catch (JSONException e) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    C1596aHd c1596aHd = new C1596aHd("toPresentationTrackingInfo parsing error", e, null, true, dqF.d(dqF.c()), false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }
        jSONObject2.remove("row");
        jSONObject2.remove("rank");
        return C1281Vq.d(jSONObject2);
    }

    public final int a() {
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        if (cLListTrackingInfoBase != null) {
            return cLListTrackingInfoBase.e();
        }
        return -1;
    }

    public final String b() {
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        if (cLLolomoTrackingInfoBase != null) {
            return cLLolomoTrackingInfoBase.b();
        }
        return null;
    }

    public static /* synthetic */ PlayContextImp b(TrackingInfoHolder trackingInfoHolder, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return trackingInfoHolder.d(z);
    }

    public final PlayContextImp d(boolean z) {
        return d(this.e, z);
    }

    public static /* synthetic */ PlayContextImp b(TrackingInfoHolder trackingInfoHolder, PlayLocationType playLocationType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return trackingInfoHolder.d(playLocationType, z);
    }

    public final PlayContextImp d(PlayLocationType playLocationType, boolean z) {
        C8632dsu.c((Object) playLocationType, "");
        return c(playLocationType, z, -1);
    }

    public final PlayContextImp c(PlayLocationType playLocationType, boolean z, int i) {
        Throwable th;
        CLItemTrackingInfoBase cLItemTrackingInfoBase;
        C8632dsu.c((Object) playLocationType, "");
        if (this.b == null || this.i == null) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            String value = playLocationType.getValue();
            CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
            CLItemTrackingInfoBase cLItemTrackingInfoBase2 = this.i;
            aVar.a("playLocate=" + value + ", trackableList=" + cLListTrackingInfoBase + ", trackableVideo=" + cLItemTrackingInfoBase2);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd c1596aHd = new C1596aHd("toPlayContext is missing data", null, null, true, dqF.d(dqF.c()), false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        String a3 = (!z || (cLItemTrackingInfoBase = this.i) == null) ? null : cLItemTrackingInfoBase.a();
        CLListTrackingInfoBase cLListTrackingInfoBase2 = this.b;
        String b2 = cLListTrackingInfoBase2 != null ? cLListTrackingInfoBase2.b() : null;
        CLListTrackingInfoBase cLListTrackingInfoBase3 = this.b;
        String a4 = cLListTrackingInfoBase3 != null ? cLListTrackingInfoBase3.a() : null;
        int i2 = i;
        if (i2 <= -1) {
            CLListTrackingInfoBase cLListTrackingInfoBase4 = this.b;
            i2 = cLListTrackingInfoBase4 != null ? cLListTrackingInfoBase4.e() : -1;
        }
        CLListTrackingInfoBase cLListTrackingInfoBase5 = this.b;
        int d2 = cLListTrackingInfoBase5 != null ? cLListTrackingInfoBase5.d() : 0;
        CLItemTrackingInfoBase cLItemTrackingInfoBase3 = this.i;
        int d3 = cLItemTrackingInfoBase3 != null ? cLItemTrackingInfoBase3.d() : 0;
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        String b3 = cLLolomoTrackingInfoBase != null ? cLLolomoTrackingInfoBase.b() : null;
        CLListTrackingInfoBase cLListTrackingInfoBase6 = this.b;
        String c3 = cLListTrackingInfoBase6 != null ? cLListTrackingInfoBase6.c() : null;
        String value2 = playLocationType.getValue();
        CLItemTrackingInfoBase cLItemTrackingInfoBase4 = this.i;
        String b4 = cLItemTrackingInfoBase4 != null ? cLItemTrackingInfoBase4.b() : null;
        CLItemTrackingInfoBase cLItemTrackingInfoBase5 = this.i;
        String e = cLItemTrackingInfoBase5 != null ? cLItemTrackingInfoBase5.e() : null;
        CLListTrackingInfoBase cLListTrackingInfoBase7 = this.b;
        CLTrackingInfoWithSourceVideoId cLTrackingInfoWithSourceVideoId = cLListTrackingInfoBase7 instanceof CLTrackingInfoWithSourceVideoId ? (CLTrackingInfoWithSourceVideoId) cLListTrackingInfoBase7 : null;
        return new PlayContextImp(b2, a4, i2, d2, d3, playLocationType, b3, c3, value2, b4, a3, e, cLTrackingInfoWithSourceVideoId != null ? Integer.valueOf(cLTrackingInfoWithSourceVideoId.g()) : null);
    }

    public static /* synthetic */ PlayContextImp b(TrackingInfoHolder trackingInfoHolder, PlayLocationType playLocationType, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return trackingInfoHolder.c(playLocationType, str, z);
    }

    public final PlayContextImp c(PlayLocationType playLocationType, String str, boolean z) {
        Throwable th;
        CLItemTrackingInfoBase cLItemTrackingInfoBase;
        C8632dsu.c((Object) playLocationType, "");
        if (this.b == null || this.i == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd c1596aHd = new C1596aHd("toPlayContext is missing data", null, null, true, dqF.d(dqF.c()), false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        String a3 = (!z || (cLItemTrackingInfoBase = this.i) == null) ? null : cLItemTrackingInfoBase.a();
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        String b2 = cLListTrackingInfoBase != null ? cLListTrackingInfoBase.b() : null;
        CLListTrackingInfoBase cLListTrackingInfoBase2 = this.b;
        String a4 = cLListTrackingInfoBase2 != null ? cLListTrackingInfoBase2.a() : null;
        CLListTrackingInfoBase cLListTrackingInfoBase3 = this.b;
        int e = cLListTrackingInfoBase3 != null ? cLListTrackingInfoBase3.e() : -1;
        CLListTrackingInfoBase cLListTrackingInfoBase4 = this.b;
        int d2 = cLListTrackingInfoBase4 != null ? cLListTrackingInfoBase4.d() : 0;
        CLItemTrackingInfoBase cLItemTrackingInfoBase2 = this.i;
        int d3 = cLItemTrackingInfoBase2 != null ? cLItemTrackingInfoBase2.d() : 0;
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        String b3 = cLLolomoTrackingInfoBase != null ? cLLolomoTrackingInfoBase.b() : null;
        CLListTrackingInfoBase cLListTrackingInfoBase5 = this.b;
        String c3 = cLListTrackingInfoBase5 != null ? cLListTrackingInfoBase5.c() : null;
        CLItemTrackingInfoBase cLItemTrackingInfoBase3 = this.i;
        String b4 = cLItemTrackingInfoBase3 != null ? cLItemTrackingInfoBase3.b() : null;
        CLItemTrackingInfoBase cLItemTrackingInfoBase4 = this.i;
        String e2 = cLItemTrackingInfoBase4 != null ? cLItemTrackingInfoBase4.e() : null;
        CLListTrackingInfoBase cLListTrackingInfoBase6 = this.b;
        CLTrackingInfoWithSourceVideoId cLTrackingInfoWithSourceVideoId = cLListTrackingInfoBase6 instanceof CLTrackingInfoWithSourceVideoId ? (CLTrackingInfoWithSourceVideoId) cLListTrackingInfoBase6 : null;
        return new PlayContextImp(b2, a4, e, d2, d3, playLocationType, b3, c3, str, b4, a3, e2, cLTrackingInfoWithSourceVideoId != null ? Integer.valueOf(cLTrackingInfoWithSourceVideoId.g()) : null);
    }

    public final TrackingInfo d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        CLLolomoTrackingInfoBase cLLolomoTrackingInfoBase = this.c;
        if (cLLolomoTrackingInfoBase != null) {
            cLLolomoTrackingInfoBase.c(jSONObject);
        }
        CLListTrackingInfoBase cLListTrackingInfoBase = this.b;
        if (cLListTrackingInfoBase != null) {
            cLListTrackingInfoBase.c(jSONObject);
        }
        CLItemTrackingInfoBase cLItemTrackingInfoBase = this.i;
        if (cLItemTrackingInfoBase != null) {
            cLItemTrackingInfoBase.c(jSONObject);
        }
        if (str != null && str.length() > 0) {
            jSONObject.put("bulkRaterRatedTitleId", str);
        }
        if (str2 != null && str2.length() > 0) {
            jSONObject.put("bulkRaterIsPayOff", str2);
        }
        return C1281Vq.d(jSONObject);
    }
}
