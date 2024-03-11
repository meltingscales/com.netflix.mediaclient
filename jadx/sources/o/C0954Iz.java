package o;

import android.text.TextUtils;
import android.util.Pair;
import com.netflix.falkor.BranchMap;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.branches.SummarizedList;
import com.netflix.model.leafs.LoLoMoSummaryImpl;
import com.netflix.model.leafs.Video;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import o.InterfaceC0943Io;

/* renamed from: o.Iz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0954Iz<T extends InterfaceC0943Io> extends AbstractC0947Is<T> {
    private void a(String str) {
    }

    public C0954Iz(T t, boolean z, InterfaceC0908Hf interfaceC0908Hf, InterfaceC0907He interfaceC0907He) {
        super(t, z, interfaceC0908Hf, interfaceC0907He);
    }

    /* renamed from: o.Iz$e */
    /* loaded from: classes3.dex */
    public static class e {
        public final LoMo a;
        public final String c;
        public final String e;

        e(String str, LoMo loMo, String str2) {
            this.c = str;
            this.a = loMo;
            this.e = str2;
        }
    }

    public Pair<String, String> c(LoMoType loMoType, String str) {
        Pair<LoMo, String> a = a(loMoType, str);
        return new Pair<>(a == null ? null : ((LoMo) a.first).getId(), a == null ? String.valueOf(-1) : (String) a.second);
    }

    public void d(String str) {
        C1044Mm.j("NetflixModelProxy", "calling setHomeLolomoId " + str);
        a().d("lolomo", new IF(IE.b("lolomos", str)));
    }

    public void c(String str, boolean z) {
        BranchMap branchMap = (BranchMap) a().b(SignupConstants.Field.VIDEOS);
        if (branchMap == null) {
            return;
        }
        C8329diN c8329diN = branchMap.b(str) instanceof C8329diN ? (C8329diN) branchMap.b(str) : null;
        if (c8329diN == null) {
            return;
        }
        Video.InQueue inQueue = c8329diN.b("inQueue") instanceof Video.InQueue ? (Video.InQueue) c8329diN.b("inQueue") : null;
        if (inQueue == null) {
            inQueue = new Video.InQueue();
        }
        inQueue.inQueue = z;
        c8329diN.d("inQueue", inQueue);
    }

    public void d(String str, boolean z) {
        BranchMap branchMap = (BranchMap) a().b(SignupConstants.Field.VIDEOS);
        if (branchMap == null) {
            return;
        }
        C8329diN c8329diN = branchMap.b(str) instanceof C8329diN ? (C8329diN) branchMap.b(str) : null;
        if (c8329diN == null) {
            return;
        }
        Video.InRemindMeQueue inRemindMeQueue = c8329diN.b("inRemindMeQueue") instanceof Video.InRemindMeQueue ? (Video.InRemindMeQueue) c8329diN.b("inRemindMeQueue") : null;
        if (inRemindMeQueue == null) {
            inRemindMeQueue = new Video.InRemindMeQueue();
        }
        inRemindMeQueue.inRemindMeQueue = z;
        c8329diN.d("inRemindMeQueue", inRemindMeQueue);
    }

    public void b(String str, boolean z) {
        BranchMap branchMap = (BranchMap) a().b("games");
        if (branchMap == null) {
            return;
        }
        C8327diL c8327diL = branchMap.b(str) instanceof C8327diL ? (C8327diL) branchMap.b(str) : null;
        if (c8327diL == null) {
            return;
        }
        Video.InQueue inQueue = c8327diL.b("inQueue") instanceof Video.InQueue ? (Video.InQueue) c8327diL.b("inQueue") : null;
        if (inQueue == null) {
            inQueue = new Video.InQueue();
        }
        inQueue.inQueue = z;
        c8327diL.d("inQueue", inQueue);
    }

    public String j() {
        synchronized (this) {
            a("getHomeLolomoId");
            IF r1 = (IF) b(IE.b("lolomo"));
            if (r1 == null) {
                return null;
            }
            InterfaceC1242Ud b = r1.b();
            if (b != null && b.e() >= 2) {
                return (String) b.d().get(1);
            }
            return null;
        }
    }

    public Pair<LoMo, String> a(LoMoType loMoType, String str) {
        IF r11;
        LoMo loMo;
        synchronized (this) {
            a("getCurrLomoByType");
            if (str == null) {
                C1044Mm.j("NetflixModelProxy", "getCurrLomoByType had lolomoId=null. Please provide a lolomoId");
                r11 = (IF) b(IE.b("lolomo"));
                if (r11 == null) {
                    return null;
                }
            } else {
                r11 = new IF(IE.b("lolomos", str));
            }
            BranchMap branchMap = (BranchMap) b(r11.b());
            if (branchMap == null) {
                return null;
            }
            try {
                for (String str2 : branchMap.keySet()) {
                    if (TextUtils.isDigitsOnly(str2) && (loMo = (LoMo) b(r11.b().d(IE.b(str2, "summary")))) != null && loMo.getType() == loMoType) {
                        return new Pair<>(loMo, str2);
                    }
                }
            } catch (ConcurrentModificationException e2) {
                InterfaceC1598aHf.a(new C1596aHd("SPY-13393: Catch CME in getCurrLomoByType").b(ErrorType.m).d(e2));
            }
            return null;
        }
    }

    List<e> d(String str, String str2) {
        ArrayList arrayList;
        e d;
        e d2;
        synchronized (this) {
            a("getListsByContext");
            arrayList = new ArrayList();
            try {
                if (TextUtils.isEmpty(str2)) {
                    BranchMap branchMap = (BranchMap) b(IE.b("lolomos"));
                    if (branchMap != null) {
                        for (String str3 : branchMap.keySet()) {
                            SummarizedList summarizedList = (SummarizedList) branchMap.b(str3);
                            if (summarizedList != null && (summarizedList.b() instanceof LoLoMoSummaryImpl) && ((LoLoMoSummaryImpl) summarizedList.b()).getExpiryTimeStamp() > System.currentTimeMillis() && (d2 = d(str3, summarizedList, str)) != null) {
                                arrayList.add(d2);
                            }
                        }
                    }
                } else {
                    SummarizedList summarizedList2 = (SummarizedList) b(IE.b("lolomos", str2));
                    if (summarizedList2 != null && (summarizedList2.b() instanceof LoLoMoSummaryImpl) && ((LoLoMoSummaryImpl) summarizedList2.b()).getExpiryTimeStamp() > System.currentTimeMillis() && (d = d(str2, summarizedList2, str)) != null) {
                        arrayList.add(d);
                    }
                }
            } catch (ConcurrentModificationException e2) {
                InterfaceC1598aHf.a(new C1596aHd("SPY-13393: Catch CME in getListsByContext").b(ErrorType.m).d(e2));
            }
        }
        return arrayList;
    }

    public LoMo e(String str) {
        a("getListByContextFromHomeLolomo");
        String j = j();
        List<e> d = d(str, (String) null);
        if (d != null) {
            for (e eVar : d) {
                if (TextUtils.equals(eVar.c, j)) {
                    return eVar.a;
                }
            }
        }
        return null;
    }

    private e d(String str, BranchMap<SummarizedList<IF, LoLoMoSummaryImpl>> branchMap, String str2) {
        IF r5;
        InterfaceC1242Ud b;
        InterfaceC1242Ud b2;
        synchronized (this) {
            LoLoMoSummaryImpl loLoMoSummaryImpl = (LoLoMoSummaryImpl) ((SummarizedList) branchMap).b();
            if (loLoMoSummaryImpl != null && loLoMoSummaryImpl.getExpiryTimeStamp() >= System.currentTimeMillis()) {
                InterfaceC8322diG b3 = branchMap.b(str2);
                if ((b3 instanceof IF) && ((IF) b3).b() != null && (b2 = ((IF) b3).b()) != null) {
                    InterfaceC8322diG b4 = b(b2.d(IE.b("summary")));
                    if (b4 instanceof LoMo) {
                        List<Object> d = b2.d();
                        return new e(str, (LoMo) b4, (String) d.get(d.size() - 1));
                    }
                }
                if (!LoMoType.CONTINUE_WATCHING.a().equals(str2) && !LoMoType.INSTANT_QUEUE.a().equals(str2)) {
                    for (String str3 : branchMap.keySet()) {
                        if (TextUtils.isDigitsOnly(str3) && (r5 = (IF) branchMap.b(str3)) != null && (b = r5.b()) != null) {
                            InterfaceC8322diG b5 = b(b.d(IE.b("summary")));
                            if (b5 instanceof LoMo) {
                                LoMo loMo = (LoMo) b5;
                                if (TextUtils.equals(loMo.getListContext(), str2)) {
                                    return new e(str, loMo, str3);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    public <LT extends LoMo> List<LT> c(int i, Collection<InterfaceC1242Ud> collection) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (InterfaceC1242Ud interfaceC1242Ud : collection) {
                int i2 = i;
                for (InterfaceC1242Ud interfaceC1242Ud2 : interfaceC1242Ud.c()) {
                    InterfaceC8322diG b = b(interfaceC1242Ud2);
                    if (b instanceof LoMo) {
                        LoMo loMo = (LoMo) b;
                        if (!TextUtils.isEmpty(loMo.getId())) {
                            loMo.setListPos(i2);
                            arrayList.add(loMo);
                            i2++;
                        } else {
                            C1044Mm.j("NetflixModelProxy", "got unidentified lomo - pql: %s, lomo: %s", interfaceC1242Ud2, loMo);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public InterfaceC8319diD a(InterfaceC1242Ud interfaceC1242Ud) {
        synchronized (this) {
            for (InterfaceC1242Ud interfaceC1242Ud2 : interfaceC1242Ud.c()) {
                Object b = b(interfaceC1242Ud2);
                if (b instanceof IF) {
                    b = ((IF) b).d(this, InterfaceC8319diD.class);
                }
                if (b instanceof InterfaceC8319diD) {
                    return (InterfaceC8319diD) b;
                }
            }
            return null;
        }
    }

    public void a(String str, long j, long j2) {
        if (C8168dfL.g(str)) {
            C1044Mm.j("NetflixModelProxy", "Can't update bookmark position - videoID is null");
            return;
        }
        C8329diN c8329diN = (C8329diN) a(IE.b(SignupConstants.Field.VIDEOS, str, "bookmark"));
        if (c8329diN == null) {
            return;
        }
        c8329diN.d(j, j2);
    }

    public void c(String str, VideoType videoType) {
        c(IE.b(videoType.getValue(), str, "episodes"));
    }

    public void f() {
        c(IE.b("searchPage", "search"));
        c(IE.b("searchPageV2", "search"));
    }

    public void g() {
        c(IE.b("searchPage", "preQuery"));
        c(IE.b("searchPageV2", "preQuery"));
    }
}
