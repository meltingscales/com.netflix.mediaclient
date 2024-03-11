package o;

import android.text.TextUtils;
import android.util.Base64;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o.InterfaceC7281ctJ;

/* renamed from: o.ctM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7284ctM implements InterfaceC7281ctJ {
    private static byte e$ss2$258 = 24;
    private static int f = 0;
    private static int i = 1;
    private boolean a;
    private List<C7460cwd> e = new ArrayList();
    private List<InterfaceC7464cwh> d = new ArrayList();
    private List<OfflineAdapterData> c = new ArrayList();
    private final Set<InterfaceC7281ctJ.a> b = new CopyOnWriteArraySet();
    private Map<String, InterfaceC5206buQ> j = new HashMap();
    private Map<String, C7460cwd> h = new HashMap();

    @Override // o.InterfaceC7281ctJ
    public List<OfflineAdapterData> a() {
        return this.c;
    }

    @Override // o.InterfaceC7281ctJ
    public void e(InterfaceC7281ctJ.a aVar) {
        this.b.add(aVar);
    }

    @Override // o.InterfaceC7281ctJ
    public void c(InterfaceC7281ctJ.a aVar) {
        this.b.remove(aVar);
    }

    @Override // o.InterfaceC8163dfG
    public int c() {
        return this.c.size();
    }

    @Override // o.InterfaceC8163dfG
    /* renamed from: a */
    public OfflineAdapterData c(int i2) {
        return this.c.get(i2);
    }

    @Override // o.InterfaceC7281ctJ
    public C7460cwd e(String str) {
        return this.h.get(str);
    }

    @Override // o.InterfaceC7281ctJ
    public long b(int i2) {
        if (i2 >= this.c.size()) {
            InterfaceC1598aHf.a("getCurrentSpace index mismatch, " + i2 + " vs " + this.c.size());
            return 0L;
        }
        OfflineAdapterData offlineAdapterData = this.c.get(i2);
        if (offlineAdapterData != null) {
            return offlineAdapterData.a(this.j);
        }
        return 0L;
    }

    @Override // o.InterfaceC7281ctJ
    public int f() {
        return d((InterfaceC5283bvo) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ctM$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[OfflineAdapterData.ViewType.values().length];
            e = iArr;
            try {
                iArr[OfflineAdapterData.ViewType.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[OfflineAdapterData.ViewType.MOVIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // o.InterfaceC7281ctJ
    public int d(InterfaceC5283bvo interfaceC5283bvo) {
        List<OfflineAdapterData> list = this.c;
        int i2 = 0;
        if (list == null) {
            return 0;
        }
        for (OfflineAdapterData offlineAdapterData : list) {
            int i3 = AnonymousClass4.e[offlineAdapterData.a().b.ordinal()];
            if (i3 == 1 || i3 == 2) {
                if (interfaceC5283bvo == null || offlineAdapterData.a().a == null || TextUtils.equals(offlineAdapterData.a().a.ay(), interfaceC5283bvo.getProfileGuid())) {
                    if (offlineAdapterData.a().a == null) {
                        InterfaceC1598aHf.a("adapterData.getVideoAndProfileData().video not supposed to be null but found null");
                    }
                    i2++;
                }
            }
        }
        return i2;
    }

    @Override // o.InterfaceC7281ctJ
    public int e() {
        Map<String, InterfaceC5206buQ> map = this.j;
        int i2 = 0;
        if (map == null) {
            return 0;
        }
        for (InterfaceC5206buQ interfaceC5206buQ : map.values()) {
            if (interfaceC5206buQ.au_() == DownloadState.InProgress) {
                i2++;
            }
        }
        return i2;
    }

    @Override // o.InterfaceC7281ctJ
    public int g() {
        Map<String, InterfaceC5206buQ> map = this.j;
        int i2 = 0;
        if (map == null) {
            return 0;
        }
        for (InterfaceC5206buQ interfaceC5206buQ : map.values()) {
            if (interfaceC5206buQ.au_() != DownloadState.Complete) {
                i2++;
            }
        }
        return i2;
    }

    @Override // o.InterfaceC7281ctJ
    public InterfaceC5206buQ c(String str) {
        Map<String, InterfaceC5206buQ> map = this.j;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // o.InterfaceC7281ctJ
    public Collection<InterfaceC5206buQ> d() {
        return this.j.values();
    }

    @Override // o.InterfaceC7281ctJ
    public void c(Map<String, InterfaceC5206buQ> map, List<C7460cwd> list, List<InterfaceC7464cwh> list2) {
        C1044Mm.a("OfflinePlayableUiListImpl", "regenerate");
        this.e = list;
        this.d = list2;
        j();
        HashMap hashMap = new HashMap();
        for (C7460cwd c7460cwd : this.e) {
            hashMap.put(c7460cwd.getId(), c7460cwd);
        }
        this.j = map;
        this.h = hashMap;
        for (InterfaceC7281ctJ.a aVar : this.b) {
            aVar.W();
        }
        C1044Mm.c("OfflinePlayableUiListImpl", "regenerate %d %d %d", Integer.valueOf(this.j.size()), Integer.valueOf(this.c.size()), Integer.valueOf(this.h.size()));
    }

    @Override // o.InterfaceC7281ctJ
    public void b(boolean z) {
        this.a = z;
        j();
    }

    private void j() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7464cwh interfaceC7464cwh : this.d) {
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            if (!this.a || interfaceC7464cwh.b()) {
                for (C7460cwd c7460cwd : C7322cty.e(interfaceC7464cwh.a(), this.e)) {
                    if (c7460cwd.V() == VideoType.EPISODE.getKey()) {
                        String aO_ = c7460cwd.aE_().aO_();
                        C7460cwd b = C7322cty.b(aO_, this.e);
                        if (b != null && !hashSet.contains(aO_)) {
                            arrayList2.add(new OfflineAdapterData(b, C7322cty.b(interfaceC7464cwh.a(), this.e, aO_), interfaceC7464cwh.a()));
                            hashSet.add(aO_);
                        }
                    } else {
                        arrayList2.add(new OfflineAdapterData(c7460cwd, null, interfaceC7464cwh.a()));
                    }
                }
                arrayList.addAll(arrayList2);
                hashSet.clear();
            }
        }
        this.c = arrayList;
        C1044Mm.c("OfflinePlayableUiListImpl", "updateUiPlayableList %d %d %d", Integer.valueOf(this.j.size()), Integer.valueOf(this.c.size()), Integer.valueOf(this.h.size()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    @Override // o.InterfaceC7281ctJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.C5207buR c(android.content.Context r25, o.InterfaceC4208baF r26) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7284ctM.c(android.content.Context, o.baF):o.buR");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    @Override // o.InterfaceC7281ctJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i() {
        /*
            r4 = this;
            java.util.Map<java.lang.String, o.buQ> r0 = r4.j
            if (r0 == 0) goto L2a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            o.buQ r1 = (o.InterfaceC5206buQ) r1
            com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState r2 = r1.au_()
            com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState r3 = com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState.Creating
            if (r2 == r3) goto L28
            com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState r1 = r1.au_()
            com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState r2 = com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState.CreateFailed
            if (r1 != r2) goto Lc
        L28:
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7284ctM.i():boolean");
    }

    @Override // o.InterfaceC7281ctJ
    public int b() {
        Map<String, InterfaceC5206buQ> map = this.j;
        int i2 = 0;
        if (map != null) {
            for (InterfaceC5206buQ interfaceC5206buQ : map.values()) {
                if (interfaceC5206buQ.au_() == DownloadState.Creating || interfaceC5206buQ.au_() == DownloadState.CreateFailed) {
                    i2++;
                }
            }
        }
        return i2;
    }

    private static boolean d(InterfaceC5206buQ interfaceC5206buQ) {
        return interfaceC5206buQ.au_() == DownloadState.Complete;
    }

    private static boolean a(InterfaceC5206buQ interfaceC5206buQ) {
        return !C7353cuc.b(interfaceC5206buQ) && interfaceC5206buQ.au_() == DownloadState.Stopped;
    }

    private InterfaceC5206buQ h() {
        Map<String, InterfaceC5206buQ> map = this.j;
        if (map != null) {
            for (InterfaceC5206buQ interfaceC5206buQ : map.values()) {
                if (interfaceC5206buQ.au_() == DownloadState.InProgress) {
                    return interfaceC5206buQ;
                }
            }
        }
        return null;
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$258);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
