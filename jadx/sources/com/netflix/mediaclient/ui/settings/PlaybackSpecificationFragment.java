package com.netflix.mediaclient.ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.settings.PlaybackSpecificationFragment;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.AbstractApplicationC1040Mh;
import o.C1596aHd;
import o.C1613aHu;
import o.C1645aIz;
import o.C1834aPz;
import o.C1842aQg;
import o.C4369bdH;
import o.C4394bdg;
import o.C4400bdm;
import o.C8139dej;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC8598drn;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class PlaybackSpecificationFragment extends NetflixFrag {
    public static final d b = new d(null);

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(R.i.aZ, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.g.eI);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new a());
        ((Button) inflate.findViewById(R.g.cx)).setOnClickListener(new View.OnClickListener() { // from class: o.cUL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaybackSpecificationFragment.b(PlaybackSpecificationFragment.this, view);
            }
        });
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(PlaybackSpecificationFragment playbackSpecificationFragment, View view) {
        C8632dsu.c((Object) playbackSpecificationFragment, "");
        playbackSpecificationFragment.c("https://help.netflix.com/support/23939");
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            bj_.endRenderNavigationLevelSession(IClientLogging.CompletionReason.success, null);
        }
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        ServiceManager bl_ = bl_();
        if (bl_ != null) {
            return !bl_.c();
        }
        return false;
    }

    /* loaded from: classes4.dex */
    static final class c extends RecyclerView.ViewHolder {
        private final TextView d;

        public final TextView c() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            C8632dsu.c((Object) view, "");
            View findViewById = view.findViewById(R.g.eA);
            C8632dsu.a(findViewById, "");
            this.d = (TextView) findViewById;
        }
    }

    /* loaded from: classes4.dex */
    static class e extends RecyclerView.ViewHolder {
        private final TextView c;
        private final TextView e;

        public final TextView c() {
            return this.e;
        }

        public final TextView d() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(view);
            C8632dsu.c((Object) view, "");
            View findViewById = view.findViewById(R.g.eD);
            C8632dsu.a(findViewById, "");
            this.c = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.g.eE);
            C8632dsu.a(findViewById2, "");
            this.e = (TextView) findViewById2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class VideoResolution {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ VideoResolution[] i;
        public static final VideoResolution c = new VideoResolution("UNKNOWN", 0);
        public static final VideoResolution b = new VideoResolution("SD", 1);
        public static final VideoResolution d = new VideoResolution("HD_720P", 2);
        public static final VideoResolution e = new VideoResolution("HD_1080P", 3);

        private static final /* synthetic */ VideoResolution[] e() {
            return new VideoResolution[]{c, b, d, e};
        }

        public static VideoResolution valueOf(String str) {
            return (VideoResolution) Enum.valueOf(VideoResolution.class, str);
        }

        public static VideoResolution[] values() {
            return (VideoResolution[]) i.clone();
        }

        private VideoResolution(String str, int i2) {
        }

        static {
            VideoResolution[] e2 = e();
            i = e2;
            a = C8600drp.e(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {
        private final String a;
        private final drO<String> b;
        private final int d;

        public final int b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final drO<String> d() {
            return this.b;
        }

        public b(int i, String str, drO<String> dro) {
            C8632dsu.c((Object) str, "");
            this.d = i;
            this.a = str;
            this.b = dro;
        }

        public /* synthetic */ b(int i, String str, drO dro, int i2, C8627dsp c8627dsp) {
            this(i, str, (i2 & 4) != 0 ? null : dro);
        }
    }

    /* loaded from: classes4.dex */
    final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private Map<String, String> a;
        private List<b> e;
        private VideoResolution j = VideoResolution.c;
        private String d = "";
        private CryptoProvider g = CryptoProvider.LEGACY;
        private String b = "";

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final CryptoProvider d() {
            return this.g;
        }

        public final VideoResolution e() {
            return this.j;
        }

        public a() {
            Map<String, String> d;
            List<b> i;
            d = dqE.d();
            this.a = d;
            i = C8569dql.i();
            this.e = i;
            C1645aIz.a(PlaybackSpecificationFragment.this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.settings.PlaybackSpecificationFragment$PlaybackSpecificationAdapter$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    c(serviceManager);
                    return dpR.c;
                }

                public final void c(ServiceManager serviceManager) {
                    C8632dsu.c((Object) serviceManager, "");
                    PlaybackSpecificationFragment.a.this.a(serviceManager);
                }
            });
        }

        private final void g() {
            ArrayList arrayList = new ArrayList();
            final PlaybackSpecificationFragment playbackSpecificationFragment = PlaybackSpecificationFragment.this;
            String string = playbackSpecificationFragment.getString(R.o.cX);
            C8632dsu.a(string, "");
            arrayList.add(new b(0, string, null, 4, null));
            String string2 = playbackSpecificationFragment.getString(R.o.f30do);
            C8632dsu.a(string2, "");
            arrayList.add(new b(1, string2, new drO<String>() { // from class: com.netflix.mediaclient.ui.settings.PlaybackSpecificationFragment$PlaybackSpecificationAdapter$populateListItems$1$1

                /* loaded from: classes4.dex */
                public final /* synthetic */ class b {
                    public static final /* synthetic */ int[] a;

                    static {
                        int[] iArr = new int[CryptoProvider.values().length];
                        try {
                            iArr[CryptoProvider.LEGACY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CryptoProvider.WIDEVINE_L1.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[CryptoProvider.WIDEVINE_L3.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        a = iArr;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: b */
                public final String invoke() {
                    int i = b.a[PlaybackSpecificationFragment.a.this.d().ordinal()];
                    if (i == 1) {
                        String string3 = playbackSpecificationFragment.getString(R.o.gS);
                        C8632dsu.a(string3, "");
                        return string3;
                    } else if (i != 2) {
                        if (i != 3) {
                            String string4 = playbackSpecificationFragment.getString(R.o.gH);
                            C8632dsu.a(string4, "");
                            return string4;
                        }
                        return "L3";
                    } else {
                        return "L1";
                    }
                }
            }));
            final String str = this.a.get("version");
            if (!TextUtils.isEmpty(str)) {
                String string3 = playbackSpecificationFragment.getString(R.o.dn);
                C8632dsu.a(string3, "");
                arrayList.add(new b(1, string3, new drO<String>() { // from class: com.netflix.mediaclient.ui.settings.PlaybackSpecificationFragment$PlaybackSpecificationAdapter$populateListItems$1$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    /* renamed from: a */
                    public final String invoke() {
                        String str2 = str;
                        C8632dsu.d((Object) str2);
                        return str2;
                    }
                }));
            }
            final String str2 = this.a.get(NetflixMediaDrm.PROPERTY_SYSTEM_ID);
            if (!TextUtils.isEmpty(str2)) {
                String string4 = playbackSpecificationFragment.getString(R.o.dm);
                C8632dsu.a(string4, "");
                arrayList.add(new b(1, string4, new drO<String>() { // from class: com.netflix.mediaclient.ui.settings.PlaybackSpecificationFragment$PlaybackSpecificationAdapter$populateListItems$1$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    /* renamed from: e */
                    public final String invoke() {
                        String str3 = str2;
                        C8632dsu.d((Object) str3);
                        return str3;
                    }
                }));
            }
            String string5 = playbackSpecificationFragment.getString(R.o.fH);
            C8632dsu.a(string5, "");
            arrayList.add(new b(0, string5, null, 4, null));
            String string6 = playbackSpecificationFragment.getString(R.o.ej);
            C8632dsu.a(string6, "");
            arrayList.add(new b(2, string6, new drO<String>() { // from class: com.netflix.mediaclient.ui.settings.PlaybackSpecificationFragment$PlaybackSpecificationAdapter$populateListItems$1$4

                /* loaded from: classes4.dex */
                public final /* synthetic */ class d {
                    public static final /* synthetic */ int[] a;

                    static {
                        int[] iArr = new int[PlaybackSpecificationFragment.VideoResolution.values().length];
                        try {
                            iArr[PlaybackSpecificationFragment.VideoResolution.b.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[PlaybackSpecificationFragment.VideoResolution.d.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[PlaybackSpecificationFragment.VideoResolution.e.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        a = iArr;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: c */
                public final String invoke() {
                    int i = d.a[PlaybackSpecificationFragment.a.this.e().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                String string7 = playbackSpecificationFragment.getString(R.o.gH);
                                C8632dsu.a(string7, "");
                                return string7;
                            }
                            return "Full HD";
                        }
                        return "HD";
                    }
                    return "SD";
                }
            }));
            String string7 = playbackSpecificationFragment.getString(R.o.gw);
            C8632dsu.a(string7, "");
            arrayList.add(new b(2, string7, new drO<String>() { // from class: com.netflix.mediaclient.ui.settings.PlaybackSpecificationFragment$PlaybackSpecificationAdapter$populateListItems$1$5
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: a */
                public final String invoke() {
                    return PlaybackSpecificationFragment.a.this.b();
                }
            }));
            String string8 = playbackSpecificationFragment.getString(R.o.dN);
            C8632dsu.a(string8, "");
            arrayList.add(new b(2, string8, new drO<String>() { // from class: com.netflix.mediaclient.ui.settings.PlaybackSpecificationFragment$PlaybackSpecificationAdapter$populateListItems$1$6
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: a */
                public final String invoke() {
                    return PlaybackSpecificationFragment.a.this.c();
                }
            }));
            this.e = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            C8632dsu.c((Object) viewGroup, "");
            if (i == 1) {
                View inflate = PlaybackSpecificationFragment.this.getLayoutInflater().inflate(R.i.bf, viewGroup, false);
                C8632dsu.a(inflate, "");
                return new e(inflate);
            } else if (i == 2) {
                View inflate2 = PlaybackSpecificationFragment.this.getLayoutInflater().inflate(R.i.be, viewGroup, false);
                C8632dsu.a(inflate2, "");
                return new e(inflate2);
            } else {
                View inflate3 = PlaybackSpecificationFragment.this.getLayoutInflater().inflate(R.i.bb, viewGroup, false);
                C8632dsu.a(inflate3, "");
                return new c(inflate3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.e.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return this.e.get(i).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            C8632dsu.c((Object) viewHolder, "");
            if (getItemViewType(i) == 0) {
                ((c) viewHolder).c().setText(this.e.get(i).c());
                return;
            }
            e eVar = (e) viewHolder;
            eVar.d().setText(this.e.get(i).c());
            TextView c = eVar.c();
            drO<String> d = this.e.get(i).d();
            c.setText(d != null ? d.invoke() : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(ServiceManager serviceManager) {
            f();
            a();
            Context requireContext = PlaybackSpecificationFragment.this.requireContext();
            C8632dsu.a(requireContext, "");
            C4394bdg c4394bdg = new C4394bdg(serviceManager.g(), serviceManager.u(), null);
            ConnectivityUtils.NetType netType = ConnectivityUtils.NetType.mobile;
            String c = C1613aHu.c(AbstractApplicationC1040Mh.d());
            C8632dsu.a(c, "");
            C4400bdm c4400bdm = new C4400bdm(requireContext, c4394bdg, netType, c);
            c(c4400bdm);
            d(c4400bdm);
            b(c4400bdm);
            g();
            notifyDataSetChanged();
        }

        private final void a() {
            HashMap hashMap = new HashMap();
            C1842aQg c1842aQg = C1842aQg.a;
            hashMap.put("version", c1842aQg.g());
            hashMap.put(NetflixMediaDrm.PROPERTY_SYSTEM_ID, c1842aQg.h());
            this.a = hashMap;
        }

        private final void f() {
            CryptoProvider a = C1834aPz.a.a();
            C8632dsu.d(a);
            this.g = a;
        }

        private final void d(C4400bdm c4400bdm) {
            VideoResolution videoResolution;
            if (c4400bdm.c()) {
                videoResolution = VideoResolution.e;
            } else if (c4400bdm.i()) {
                videoResolution = VideoResolution.d;
            } else {
                videoResolution = VideoResolution.b;
            }
            this.j = videoResolution;
        }

        private final void c(C4400bdm c4400bdm) {
            boolean z;
            StringBuilder sb = new StringBuilder();
            boolean z2 = true;
            if (c4400bdm.D()) {
                sb.append("VP9");
                if (this.g == CryptoProvider.WIDEVINE_L1 && C4369bdH.j()) {
                    sb.append(PlaybackSpecificationFragment.this.getString(R.o.gj));
                }
                z = true;
            } else {
                z = false;
            }
            if (c4400bdm.y()) {
                if (z) {
                    sb.append("\n");
                }
                sb.append("AVC-High");
                if (this.g == CryptoProvider.WIDEVINE_L1 && C4369bdH.f()) {
                    sb.append(PlaybackSpecificationFragment.this.getString(R.o.gj));
                }
                z = true;
            }
            if (c4400bdm.A()) {
                if (z) {
                    sb.append("\n");
                }
                sb.append("HEVC");
                if (this.g == CryptoProvider.WIDEVINE_L1 && C4369bdH.g()) {
                    sb.append(PlaybackSpecificationFragment.this.getString(R.o.gj));
                }
            } else {
                z2 = z;
            }
            if (c4400bdm.u()) {
                if (z2) {
                    sb.append("\n");
                }
                sb.append("AV1");
                if (this.g == CryptoProvider.WIDEVINE_L1 && C4369bdH.i()) {
                    sb.append(PlaybackSpecificationFragment.this.getString(R.o.gj));
                }
            }
            if (!z2) {
                sb.append(PlaybackSpecificationFragment.this.getString(R.o.eG));
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            this.d = sb2;
        }

        private final void b(C4400bdm c4400bdm) {
            boolean z;
            StringBuilder sb = new StringBuilder();
            if (c4400bdm.x()) {
                sb.append("HDR 10 - HEVC");
                z = true;
            } else {
                z = false;
            }
            if (c4400bdm.v()) {
                if (z) {
                    sb.append("\n");
                }
                sb.append("Dolby vision");
            } else if (!z) {
                sb.append(PlaybackSpecificationFragment.this.getString(R.o.eG));
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            this.b = sb2;
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(0, ((NetflixFrag) this).d, 0, this.h);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            String string = getString(R.o.fP);
            C8632dsu.a(string, "");
            bj_.setTitle(string);
            NetflixActionBar netflixActionBar = bj_.getNetflixActionBar();
            if (netflixActionBar != null) {
                netflixActionBar.c(bj_.getActionBarStateBuilder().e((CharSequence) string).l(true).b(false).c());
                return true;
            }
        }
        return false;
    }

    private final void c(String str) {
        Map d2;
        Map k;
        Throwable th;
        Intent data = new Intent("android.intent.action.VIEW").setData(C8139dej.b.a(AbstractApplicationC1040Mh.d(), str));
        C8632dsu.a(data, "");
        try {
            startActivity(data);
        } catch (Exception unused) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str2 = "SPY-16740: Exception occurred when launching URL: " + str;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str2, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
