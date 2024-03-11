package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.service.preapp.PreAppAgentEventType;
import com.netflix.mediaclient.service.pservice.PDiskData;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import o.C1079Nx;
import o.C4926bpB;
import o.C4933bpI;
import o.InterfaceC8248dgm;

/* renamed from: o.bpB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4926bpB {
    private Context a;
    private aMF d;

    public C4926bpB(Context context, aMF amf) {
        this.a = context;
        this.d = amf;
    }

    private PDiskData e() {
        PDiskData pDiskData = new PDiskData();
        pDiskData.version = 3;
        b(pDiskData);
        return pDiskData;
    }

    public void d(final PreAppAgentEventType preAppAgentEventType) {
        final PDiskData e = e();
        final HashSet hashSet = new HashSet();
        e(hashSet, preAppAgentEventType);
        AbstractC1761aNg abstractC1761aNg = new AbstractC1761aNg() { // from class: o.bpB.1
            @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
            public void k(List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
                e.addNonMemberTrackingInfo();
                C4926bpB c4926bpB = C4926bpB.this;
                PDiskData pDiskData = e;
                PDiskData.ListType listType = PDiskData.ListType.NON_MEMBER;
                c4926bpB.c(pDiskData, list, listType);
                hashSet.remove(listType);
                if (hashSet.isEmpty()) {
                    C4926bpB.this.d(e, preAppAgentEventType);
                }
            }
        };
        if (PreAppAgentEventType.NON_MEMBER_UPDATED.equals(preAppAgentEventType)) {
            c(preAppAgentEventType, abstractC1761aNg, "PreAppAgent:NON_MEMBER_UPDATED");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final PDiskData pDiskData, final PreAppAgentEventType preAppAgentEventType) {
        a(new C4933bpI.d() { // from class: o.bpB.5
            @Override // o.C4933bpI.d
            public void d(PDiskData pDiskData2) {
                if (pDiskData2 == null) {
                    C1044Mm.e("nf_preappagentdatahandler", "data on disk is null, first time");
                }
                C4926bpB.this.d.getMainHandler().post(new AnonymousClass2(pDiskData2));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: o.bpB$5$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public class AnonymousClass2 implements Runnable {
                final /* synthetic */ PDiskData e;

                AnonymousClass2(PDiskData pDiskData) {
                    this.e = pDiskData;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    PDiskData e = C4926bpB.this.e(pDiskData, this.e, preAppAgentEventType);
                    C4926bpB.this.e(e);
                    C1044Mm.e("nf_preappagentdatahandler", "old not needed data on disk cleared - merged data is");
                    e.print();
                    final String jsonString = e.toJsonString();
                    new C1071Np().d(new C1079Nx.b() { // from class: o.bpD
                        @Override // o.C1079Nx.b
                        public final void run() {
                            C4926bpB.AnonymousClass5.AnonymousClass2.this.a(jsonString);
                        }
                    });
                    AnonymousClass5 anonymousClass52 = AnonymousClass5.this;
                    C4926bpB.this.a(e, preAppAgentEventType);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void a(String str) {
                    C1044Mm.e("nf_preappagentdatahandler", "saving merged data... ");
                    C4933bpI.d(C4926bpB.this.a, str, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final PDiskData pDiskData, final PreAppAgentEventType preAppAgentEventType) {
        boolean a = aSS.a(this.a);
        int urlFetchCount = pDiskData.getUrlFetchCount(a);
        C4940bpP c4940bpP = new C4940bpP(urlFetchCount, pDiskData) { // from class: o.bpB.2
            final /* synthetic */ int a;
            final /* synthetic */ PDiskData b;
            private int c;
            private final Object e = new Object();

            {
                this.a = urlFetchCount;
                this.b = pDiskData;
                this.c = urlFetchCount;
            }

            @Override // o.C4940bpP, o.InterfaceC4943bpS
            public void b(String str, String str2, Status status) {
                synchronized (this.e) {
                    int i = this.c - 1;
                    this.c = i;
                    C1044Mm.a("nf_preappagentdatahandler", "onResourceFetched mCount: %d, reqUrl: %s, localUrl: %s", Integer.valueOf(i), str, str2);
                    String c = C4935bpK.c(str);
                    if (C8168dfL.h(c) && C8168dfL.h(str2)) {
                        this.b.addToUrlMap(c, str2);
                    }
                }
            }
        };
        C1044Mm.e("nf_preappagentdatahandler", String.format("urlFetchCount=%d", Integer.valueOf(urlFetchCount)));
        if (urlFetchCount == 0) {
            C1044Mm.e("nf_preappagentdatahandler", "no images to fetch - store newData");
            b(pDiskData, preAppAgentEventType);
        } else {
            a(pDiskData, pDiskData.urlMap, PDiskData.ListType.BILLBOARD, a, c4940bpP);
            a(pDiskData, pDiskData.urlMap, PDiskData.ListType.CW, a, c4940bpP);
            a(pDiskData, pDiskData.urlMap, PDiskData.ListType.IQ, a, c4940bpP);
            a(pDiskData, pDiskData.urlMap, PDiskData.ListType.STANDARD_FIRST, a, c4940bpP);
            a(pDiskData, pDiskData.urlMap, PDiskData.ListType.STANDARD_SECOND, a, c4940bpP);
            a(pDiskData, pDiskData.urlMap, PDiskData.ListType.NON_MEMBER, a, c4940bpP);
        }
        this.d.getMainHandler().postDelayed(new Runnable() { // from class: o.bpB.4
            @Override // java.lang.Runnable
            public void run() {
                C1044Mm.e("nf_preappagentdatahandler", "expecting image fetches to be done.. proceed to notify");
                C4926bpB.this.b(pDiskData, preAppAgentEventType);
            }
        }, 10000L);
    }

    private void a(PDiskData pDiskData, Map<String, String> map, PDiskData.ListType listType, boolean z, C4940bpP c4940bpP) {
        for (C4934bpJ c4934bpJ : pDiskData.fetchUrlsOfList(map, listType, z)) {
            a(c4934bpJ.e(), c4934bpJ.c(), c4940bpP);
        }
    }

    private void a(String str, final String str2, final C4940bpP c4940bpP) {
        if (str2 != null) {
            new C1071Np().d(new C1079Nx.b() { // from class: o.bpE
                @Override // o.C1079Nx.b
                public final void run() {
                    C4926bpB.this.a(str2, c4940bpP);
                }
            });
        } else {
            C1044Mm.e("nf_preappagentdatahandler", String.format("video.id: %s, url is null", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, C4940bpP c4940bpP) {
        this.d.getResourceFetcher().c(str, AssetType.boxArt, Request.Priority.LOW, c4940bpP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final PDiskData pDiskData, PreAppAgentEventType preAppAgentEventType) {
        if (pDiskData == null) {
            C1044Mm.d("nf_preappagentdatahandler", "newData is null");
            return;
        }
        final InterfaceC8248dgm.c cVar = new InterfaceC8248dgm.c() { // from class: o.bpB.3
            @Override // o.InterfaceC8248dgm.c
            public void e(String str) {
                C1044Mm.e("nf_preappagentdatahandler", "onDataSaved");
            }
        };
        pDiskData.print();
        new C1071Np().d(new C1079Nx.b() { // from class: o.bpB.8
            @Override // o.C1079Nx.b
            public void run() {
                boolean z = new Random().nextInt(100) == 1;
                try {
                    C4933bpI.d(C4926bpB.this.a, pDiskData.toJsonString(), cVar);
                } catch (Exception e) {
                    if (z) {
                        throw e;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(PDiskData pDiskData, List<InterfaceC5222bug<InterfaceC5223buh>> list, PDiskData.ListType listType) {
        if (pDiskData == null || list == null) {
            return;
        }
        pDiskData.copyListIntoDiskData(list, listType);
    }

    private void e(Set<PDiskData.ListType> set, PreAppAgentEventType preAppAgentEventType) {
        if (PreAppAgentEventType.c(preAppAgentEventType)) {
            set.add(PDiskData.ListType.BILLBOARD);
        }
        if (PreAppAgentEventType.a(preAppAgentEventType)) {
            set.add(PDiskData.ListType.CW);
        }
        if (PreAppAgentEventType.d(preAppAgentEventType)) {
            set.add(PDiskData.ListType.IQ);
        }
        if (PreAppAgentEventType.b(preAppAgentEventType)) {
            set.add(PDiskData.ListType.STANDARD_FIRST);
        }
        if (PreAppAgentEventType.j(preAppAgentEventType)) {
            set.add(PDiskData.ListType.STANDARD_SECOND);
        }
        if (PreAppAgentEventType.e(preAppAgentEventType)) {
            set.add(PDiskData.ListType.NON_MEMBER);
        }
    }

    private void c(final PreAppAgentEventType preAppAgentEventType, final AbstractC1761aNg abstractC1761aNg, String str) {
        final InterfaceC1912aSw f = new C6004cQk().f();
        if (f == null || !f.isReady()) {
            C1044Mm.d("nf_preappagentdatahandler", "ignore fetchLists, browseAgent not ready!!");
        } else {
            new C1071Np().d(new C1079Nx.b() { // from class: o.bpG
                @Override // o.C1079Nx.b
                public final void run() {
                    C4926bpB.this.b(preAppAgentEventType, f, abstractC1761aNg);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(PreAppAgentEventType preAppAgentEventType, InterfaceC1912aSw interfaceC1912aSw, AbstractC1761aNg abstractC1761aNg) {
        if (PreAppAgentEventType.e(preAppAgentEventType)) {
            interfaceC1912aSw.d(a(this.a), true, (InterfaceC1757aNc) abstractC1761aNg);
        }
    }

    protected static int a(Context context) {
        return aSS.a(context) ? 80 : 12;
    }

    private void a(final C4933bpI.d dVar) {
        new C1071Np().d(new C1079Nx.b() { // from class: o.bpF
            @Override // o.C1079Nx.b
            public final void run() {
                C4926bpB.this.c(dVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(C4933bpI.d dVar) {
        C4933bpI.d(this.a, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PDiskData e(PDiskData pDiskData, PDiskData pDiskData2, PreAppAgentEventType preAppAgentEventType) {
        if (pDiskData2 == null) {
            return pDiskData;
        }
        C1044Mm.e("nf_preappagentdatahandler", String.format("mergeData updateType:%s", preAppAgentEventType));
        int i = AnonymousClass7.d[preAppAgentEventType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                pDiskData2.deepCopyList(pDiskData2.cwList, pDiskData.cwList);
            } else if (i == 3) {
                pDiskData2.deepCopyList(pDiskData2.iqList, pDiskData.iqList);
            } else if (i == 4) {
                pDiskData2.addLoLoMaps(pDiskData);
                pDiskData2.deepCopyList(pDiskData2.nonMemberList, pDiskData.nonMemberList);
            }
            pDiskData = pDiskData2;
        } else {
            pDiskData.deepCopyList(pDiskData.nonMemberList, pDiskData2.nonMemberList);
            pDiskData.deepCopyUrlMap(pDiskData2.urlMap);
        }
        C1044Mm.e("nf_preappagentdatahandler", "merged data:");
        pDiskData.print();
        return pDiskData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(PDiskData pDiskData) {
        pDiskData.clearOldImages();
    }

    private void b(PDiskData pDiskData) {
        String K = this.d.getConfigurationAgent().K();
        if (C8168dfL.g(K)) {
            K = "default";
        }
        pDiskData.preAppPartnerExperience = K;
        String Q = this.d.getConfigurationAgent().Q();
        pDiskData.preAppWidgetExperience = C8168dfL.g(Q) ? "default" : Q;
    }

    public void a(final PreAppAgentEventType preAppAgentEventType) {
        if (!PreAppAgentEventType.f(preAppAgentEventType)) {
            C1044Mm.j("nf_preappagentdatahandler", String.format("skip clearing data - invalid updateType= %s", preAppAgentEventType));
        } else {
            a(new C4933bpI.d() { // from class: o.bpB.6
                @Override // o.C4933bpI.d
                public void d(final PDiskData pDiskData) {
                    if (pDiskData == null) {
                        C1044Mm.e("nf_preappagentdatahandler", "data on disk is null, first time");
                    }
                    C4926bpB.this.d.getMainHandler().post(new Runnable() { // from class: o.bpB.6.3
                        @Override // java.lang.Runnable
                        public void run() {
                            if (pDiskData != null) {
                                C4933bpI.a(C4926bpB.this.a);
                                pDiskData.clearMemberLists();
                                C4926bpB.this.e(pDiskData);
                                C1044Mm.e("nf_preappagentdatahandler", "preapp member data cleared. storing rest of data?");
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                C4926bpB.this.b(pDiskData, preAppAgentEventType);
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bpB$7  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[PDiskData.ImageType.values().length];
            c = iArr;
            try {
                iArr[PDiskData.ImageType.TITLE_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[PDiskData.ImageType.TRICKPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[PDiskData.ImageType.HORIZONTAL_ART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PreAppAgentEventType.values().length];
            d = iArr2;
            try {
                iArr2[PreAppAgentEventType.ALL_MEMBER_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[PreAppAgentEventType.CW_UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[PreAppAgentEventType.IQ_UPDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[PreAppAgentEventType.NON_MEMBER_UPDATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
