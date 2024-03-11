package com.netflix.mediaclient.ui.offline;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.C1333Xq;
import o.C5096bsM;
import o.C7172crG;
import o.C7178crM;
import o.C7270csz;
import o.C7275ctD;
import o.C7347cuW;
import o.C7348cuX;
import o.C7353cuc;
import o.C7359cui;
import o.C7372cuv;
import o.C7400cvW;
import o.C7460cwd;
import o.C7461cwe;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;
import o.InterfaceC4208baF;
import o.InterfaceC4209baG;
import o.InterfaceC5151btO;
import o.InterfaceC5206buQ;
import o.InterfaceC5283bvo;
import o.InterfaceC5298bwC;
import o.InterfaceC5345bwx;
import o.InterfaceC5844cKl;
import o.InterfaceC7216cry;
import o.InterfaceC7221csC;
import o.InterfaceC7281ctJ;
import o.InterfaceC7303ctf;
import o.InterfaceC7365cuo;
import o.cUS;

/* loaded from: classes4.dex */
public final class OfflineApiImpl implements InterfaceC7303ctf {
    private final InterfaceC7221csC a;
    private final Context d;
    private final Class<? extends NetflixActivity> e;
    private final OfflineVideoImageUtil f;
    private final Lazy<InterfaceC5844cKl> j;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface OfflineApiModule {
        @Binds
        InterfaceC7303ctf c(OfflineApiImpl offlineApiImpl);
    }

    @Override // o.InterfaceC7303ctf
    public Class<? extends NetflixActivity> d() {
        return this.e;
    }

    @Inject
    public OfflineApiImpl(OfflineVideoImageUtil offlineVideoImageUtil, Lazy<InterfaceC5844cKl> lazy, @ApplicationContext Context context, InterfaceC7221csC interfaceC7221csC) {
        C8632dsu.c((Object) offlineVideoImageUtil, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC7221csC, "");
        this.f = offlineVideoImageUtil;
        this.j = lazy;
        this.d = context;
        this.a = interfaceC7221csC;
        this.e = OfflineActivityV2.b.c();
    }

    @Override // o.InterfaceC7303ctf
    public List<C7461cwe> d(String str) {
        int d;
        C8632dsu.c((Object) str, "");
        List<OfflineAdapterData> b = b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            OfflineAdapterData offlineAdapterData = (OfflineAdapterData) obj;
            if (offlineAdapterData.a().a != null && C8632dsu.c((Object) offlineAdapterData.a().c, (Object) str)) {
                arrayList.add(obj);
            }
        }
        d = C8572dqo.d(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(d);
        int i = 0;
        for (Object obj2 : arrayList) {
            if (i < 0) {
                C8569dql.h();
            }
            OfflineAdapterData offlineAdapterData2 = (OfflineAdapterData) obj2;
            C7460cwd c7460cwd = offlineAdapterData2.a().a;
            C8632dsu.d(c7460cwd);
            arrayList2.add(new C7461cwe(c7460cwd, null, i, offlineAdapterData2));
            i++;
        }
        return arrayList2;
    }

    @Override // o.InterfaceC7303ctf
    public Intent e(Context context) {
        C8632dsu.c((Object) context, "");
        return OfflineActivityV2.b.d(context, true);
    }

    @Override // o.InterfaceC7303ctf
    public Intent a(Context context, String str, String str2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return OfflineActivityV2.b.a(context, str, str2, false);
    }

    @Override // o.InterfaceC7303ctf
    public void e(Context context, String str, VideoType videoType, PlayContext playContext) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playContext, "");
        C7353cuc.c(context, str, videoType, playContext);
    }

    @Override // o.InterfaceC7303ctf
    public InterfaceC5345bwx b(Object obj) {
        C8632dsu.c(obj, "");
        FragmentHelper fragmentHelper = (FragmentHelper) obj;
        C7275ctD c7275ctD = new C7275ctD(fragmentHelper);
        fragmentHelper.b(c7275ctD);
        return c7275ctD;
    }

    @Override // o.InterfaceC7303ctf
    public boolean c(String str) {
        return C7353cuc.c(str);
    }

    @Override // o.InterfaceC7303ctf
    public InterfaceC5206buQ b(String str) {
        return C7353cuc.d(str);
    }

    @Override // o.InterfaceC7303ctf
    public boolean e(InterfaceC5206buQ interfaceC5206buQ) {
        return C7353cuc.h(interfaceC5206buQ);
    }

    @Override // o.InterfaceC7303ctf
    public boolean e() {
        return C7353cuc.e();
    }

    @Override // o.InterfaceC7303ctf
    public C5096bsM b(String str, String str2) {
        return C7353cuc.a(str, str2);
    }

    @Override // o.InterfaceC7303ctf
    public void e(String str, C5096bsM c5096bsM) {
        C7353cuc.d(str, c5096bsM);
    }

    @Override // o.InterfaceC7303ctf
    public InterfaceC7281ctJ a() {
        InterfaceC7281ctJ a = C7353cuc.a();
        C8632dsu.a(a, "");
        return a;
    }

    @Override // o.InterfaceC7303ctf
    public int d(Activity activity, long j) {
        return C7353cuc.d(activity instanceof NetflixActivity ? (NetflixActivity) activity : null, j);
    }

    @Override // o.InterfaceC7303ctf
    public boolean d(InterfaceC5206buQ interfaceC5206buQ) {
        return C7353cuc.c(interfaceC5206buQ);
    }

    @Override // o.InterfaceC7303ctf
    public C7460cwd e(String str) {
        return C7353cuc.e(str);
    }

    @Override // o.InterfaceC7303ctf
    public boolean b(C7460cwd c7460cwd) {
        return C7353cuc.c(c7460cwd);
    }

    @Override // o.InterfaceC7303ctf
    public void a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        C7353cuc.e((NetflixActivity) activity);
    }

    @Override // o.InterfaceC7303ctf
    public void e(Activity activity, int i, String[] strArr, int[] iArr) {
        C8632dsu.c((Object) strArr, "");
        C8632dsu.c((Object) iArr, "");
        C8632dsu.d(activity);
        C7353cuc.b((NetflixActivity) activity, i, strArr, iArr);
    }

    @Override // o.InterfaceC7303ctf
    public InterfaceC5283bvo d(Activity activity, String str) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        return C7353cuc.a((NetflixActivity) activity, str);
    }

    @Override // o.InterfaceC7303ctf
    public void a(Context context, String str, InterfaceC7365cuo interfaceC7365cuo) {
        C8632dsu.c((Object) interfaceC7365cuo, "");
        C7372cuv.a.c(context, str, interfaceC7365cuo);
    }

    @Override // o.InterfaceC7303ctf
    public Dialog b(Context context, DialogInterface.OnClickListener onClickListener, String str) {
        C8632dsu.c((Object) context, "");
        Dialog a = C7178crM.a(context, onClickListener, str);
        C8632dsu.a(a, "");
        return a;
    }

    @Override // o.InterfaceC7303ctf
    public InterfaceC7216cry d(ViewGroup viewGroup, boolean z) {
        C8632dsu.c((Object) viewGroup, "");
        return new C7172crG(viewGroup, z);
    }

    @Override // o.InterfaceC7303ctf
    public String c(C7460cwd c7460cwd) {
        C8632dsu.c((Object) c7460cwd, "");
        OfflineVideoImageUtil offlineVideoImageUtil = this.f;
        String id = c7460cwd.getId();
        C8632dsu.a(id, "");
        OfflineVideoImageUtil.ImageType imageType = OfflineVideoImageUtil.ImageType.a;
        if (offlineVideoImageUtil.c(id, imageType)) {
            return c7460cwd.W().u;
        }
        OfflineVideoImageUtil offlineVideoImageUtil2 = this.f;
        String id2 = c7460cwd.getId();
        C8632dsu.a(id2, "");
        return offlineVideoImageUtil2.b(id2, imageType);
    }

    @Override // o.InterfaceC7303ctf
    public void a(Activity activity, ServiceManager serviceManager) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) serviceManager, "");
        new C7400cvW(this.d).e((cUS) activity, serviceManager);
    }

    @Override // o.InterfaceC7303ctf
    public boolean c() {
        InterfaceC4208baF c = C7353cuc.c();
        if (c == null) {
            return true;
        }
        return c.o();
    }

    @Override // o.InterfaceC7303ctf
    public InterfaceC4209baG a(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new C7348cuX(viewGroup, false);
    }

    @Override // o.InterfaceC7303ctf
    public InterfaceC4209baG a(Activity activity, ViewGroup viewGroup) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) viewGroup, "");
        if (!(activity instanceof NetflixActivity)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C7347cuW c7347cuW = new C7347cuW(viewGroup, false, this.j, this.a);
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull((NetflixActivity) activity);
        if (offlineAgentOrNull != null) {
            C7347cuW c7347cuW2 = (C7347cuW) offlineAgentOrNull.e((InterfaceC4208baF) c7347cuW);
        }
        return c7347cuW;
    }

    @Override // o.InterfaceC7303ctf
    public InterfaceC5298bwC b(Context context) {
        C8632dsu.c((Object) context, "");
        return new C7359cui(context, this.a);
    }

    @Override // o.InterfaceC7303ctf
    public boolean a(InterfaceC5206buQ interfaceC5206buQ) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        return C7353cuc.b(interfaceC5206buQ);
    }

    @Override // o.InterfaceC7303ctf
    public boolean c(Activity activity, InterfaceC5151btO interfaceC5151btO) {
        C8632dsu.c((Object) interfaceC5151btO, "");
        return interfaceC5151btO.isAvailableForDownload() && c(activity);
    }

    @Override // o.InterfaceC7303ctf
    public boolean c(Activity activity) {
        return C7353cuc.a(activity instanceof NetflixActivity ? (NetflixActivity) activity : null);
    }

    @Override // o.InterfaceC7303ctf
    public boolean a(Activity activity, String str, String str2, Integer num, VideoType videoType) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) videoType, "");
        String c = videoType == VideoType.EPISODE ? C1333Xq.d(R.o.dr).d("episodeNumber", String.valueOf(num)).c() : null;
        if (activity instanceof NetflixActivity) {
            return ((NetflixActivity) activity).showFullScreenDialog(ErrorDownloadSheetFragment.e.b(str, c, str2));
        }
        return false;
    }

    private final List<OfflineAdapterData> b() {
        List<OfflineAdapterData> a = a().a();
        C8632dsu.a(a, "");
        return new C7270csz(a, ConnectivityUtils.n(this.d)).b();
    }
}
