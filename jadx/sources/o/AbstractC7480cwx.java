package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.PlanUpgradeType;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.ConfirmPlanUpgrade;
import com.netflix.cl.model.event.session.action.SelectPlan;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipProductChoice;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.util.PlayContext;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import o.AbstractC7480cwx;
import org.json.JSONObject;

/* renamed from: o.cwx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7480cwx extends NetflixDialogFrag {
    private static final List<String> b;
    private Long d;
    private Long e;
    private b f;
    private MembershipChoicesResponse.BundleInfo g;
    private boolean h;
    private MembershipProductChoice i;
    private List<MembershipProductChoice> j;
    private Long k;
    private Long l;
    private Long m;

    /* renamed from: o  reason: collision with root package name */
    private PlayContext f13784o;
    public static final a c = new a(null);
    public static final int a = 8;

    public static final AbstractC7480cwx e(C4611bhl c4611bhl, PlayContext playContext, InterfaceC7441cwK interfaceC7441cwK) {
        return c.e(c4611bhl, playContext, interfaceC7441cwK);
    }

    public abstract int a();

    public abstract void b();

    public abstract String d();

    public abstract PlanUpgradeType e();

    public abstract void f();

    public abstract boolean j();

    public final PlayContext k() {
        return this.f13784o;
    }

    public final MembershipProductChoice o() {
        return this.i;
    }

    public AbstractC7480cwx() {
        List<MembershipProductChoice> emptyList = Collections.emptyList();
        C8632dsu.a(emptyList, "");
        this.j = emptyList;
    }

    private final boolean m() {
        boolean b2;
        List<String> list = b;
        ServiceManager serviceManager = getServiceManager();
        b2 = C8576dqs.b((Iterable<? extends String>) list, serviceManager != null ? C7434cwD.c(serviceManager) : null);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.cwx$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private final bER c;
        private final bEV d;

        public final bER c() {
            return this.c;
        }

        public final bEV e() {
            return this.d;
        }

        public b(bER ber, bEV bev) {
            C8632dsu.c((Object) ber, "");
            C8632dsu.c((Object) bev, "");
            this.c = ber;
            this.d = bev;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        return layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.aY, viewGroup, false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        bER c2 = bER.c(view);
        C8632dsu.a(c2, "");
        bEV d2 = bEV.d(view.findViewById(com.netflix.mediaclient.ui.R.g.af));
        C8632dsu.a(d2, "");
        this.f = new b(c2, d2);
        Bundle arguments = getArguments();
        List<MembershipProductChoice> parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("choices") : null;
        if (parcelableArrayList == null) {
            parcelableArrayList = Collections.emptyList();
            C8632dsu.a(parcelableArrayList, "");
        }
        this.j = parcelableArrayList;
        this.i = c.b(parcelableArrayList);
        Bundle arguments2 = getArguments();
        this.f13784o = arguments2 != null ? (PlayContext) arguments2.getParcelable("play_context") : null;
        Bundle arguments3 = getArguments();
        this.g = arguments3 != null ? (MembershipChoicesResponse.BundleInfo) arguments3.getParcelable("bundleInfo") : null;
        if (j()) {
            this.l = Logger.INSTANCE.startSession(new Presentation(h(), n()));
        }
        q();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f = null;
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b l() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, holder is null".toString());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C8632dsu.c((Object) dialogInterface, "");
        super.onCancel(dialogInterface);
        r();
        b();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Long l = this.l;
        if (l != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
            this.l = null;
        }
        Long l2 = this.m;
        if (l2 != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l2.longValue()));
            this.m = null;
        }
        Long l3 = this.k;
        if (l3 != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l3.longValue()));
            this.k = null;
        }
        Long l4 = this.d;
        if (l4 != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l4.longValue()));
            this.d = null;
        }
        Long l5 = this.e;
        if (l5 != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l5.longValue()));
            this.e = null;
        }
    }

    private final void q() {
        l().e().a.setOnClickListener(new View.OnClickListener() { // from class: o.cwF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC7480cwx.b(AbstractC7480cwx.this, view);
            }
        });
        if (BrowseExperience.a()) {
            l().e().c.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC7480cwx abstractC7480cwx, View view) {
        C8632dsu.c((Object) abstractC7480cwx, "");
        abstractC7480cwx.r();
        abstractC7480cwx.b();
    }

    public final void a(String str, String str2, String str3) {
        View view;
        int i;
        Long newBillingDate;
        MembershipChoicesResponse.BundleInfo bundleInfo;
        String partnerDisplayName;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        Long l = this.l;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
            this.l = null;
        }
        Logger logger = Logger.INSTANCE;
        this.m = logger.startSession(new Presentation(g(), n()));
        logger.logEvent(new Selected(h(), null, CommandValue.AcceptPlanUpgradeOfferCommand, null));
        b l2 = l();
        l2.c().e.setVisibility(8);
        l2.e().b.setVisibility(8);
        l2.c().k.setVisibility(8);
        l2.c().a.setVisibility(8);
        l2.c().l.setVisibility(0);
        l2.c().h.setVisibility(0);
        l2.c().i.setVisibility(0);
        l2.c().h.setText(str);
        l2.c().j.setText(str2);
        MembershipChoicesResponse.BundleInfo bundleInfo2 = this.g;
        if (bundleInfo2 != null && bundleInfo2.isOnBundle() && (bundleInfo = this.g) != null && bundleInfo.getCanChangePlan()) {
            MembershipProductChoice.MembershipDuration membershipDuration = MembershipProductChoice.MembershipDuration.WEEK;
            MembershipProductChoice membershipProductChoice = this.i;
            C1333Xq d2 = C1333Xq.d(membershipDuration == (membershipProductChoice != null ? membershipProductChoice.getPriceDuration() : null) ? com.netflix.mediaclient.ui.R.o.jJ : com.netflix.mediaclient.ui.R.o.jG);
            MembershipProductChoice membershipProductChoice2 = this.i;
            String c2 = d2.d("additionalAmountOverCurrent", membershipProductChoice2 != null ? membershipProductChoice2.getAdditionalAmountOverCurrentFormatted() : null).c();
            MembershipProductChoice membershipProductChoice3 = this.i;
            if (membershipProductChoice3 != null && C8632dsu.c(membershipProductChoice3.getShouldShowPreTaxInPrice(), Boolean.TRUE)) {
                CharSequence text = requireContext().getText(com.netflix.mediaclient.ui.R.o.jN);
                c2 = c2 + " " + ((Object) text);
            }
            l2.c().g.setText(c2);
            MembershipChoicesResponse.BundleInfo bundleInfo3 = this.g;
            if (bundleInfo3 != null && (partnerDisplayName = bundleInfo3.getPartnerDisplayName()) != null) {
                l2.e().e.setVisibility(0);
                l2.e().e.setText(C1333Xq.d(com.netflix.mediaclient.ui.R.o.jT).d("partnerName", partnerDisplayName).c());
            }
        } else {
            MembershipProductChoice.MembershipDuration membershipDuration2 = MembershipProductChoice.MembershipDuration.WEEK;
            MembershipProductChoice membershipProductChoice4 = this.i;
            C1333Xq d3 = C1333Xq.d(membershipDuration2 == (membershipProductChoice4 != null ? membershipProductChoice4.getPriceDuration() : null) ? com.netflix.mediaclient.ui.R.o.jM : com.netflix.mediaclient.ui.R.o.jL);
            MembershipProductChoice membershipProductChoice5 = this.i;
            String c3 = d3.d("formatted_localized_price", membershipProductChoice5 != null ? membershipProductChoice5.getPriceFormatted() : null).c();
            MembershipProductChoice membershipProductChoice6 = this.i;
            if (membershipProductChoice6 != null && C8632dsu.c(membershipProductChoice6.getShouldShowPreTaxInPrice(), Boolean.TRUE)) {
                CharSequence text2 = requireContext().getText(com.netflix.mediaclient.ui.R.o.jN);
                c3 = c3 + " " + ((Object) text2);
            }
            l2.c().g.setText(c3);
        }
        MembershipProductChoice membershipProductChoice7 = this.i;
        if ((membershipProductChoice7 != null ? membershipProductChoice7.getNewBillingDate() : null) != null) {
            CharSequence text3 = l2.c().g.getText();
            DateFormat dateInstance = DateFormat.getDateInstance(3, C4984bqG.b.e().c());
            MembershipProductChoice membershipProductChoice8 = this.i;
            String format = dateInstance.format(new Date((membershipProductChoice8 == null || (newBillingDate = membershipProductChoice8.getNewBillingDate()) == null) ? 0L : newBillingDate.longValue()));
            MembershipProductChoice membershipProductChoice9 = this.i;
            boolean c4 = membershipProductChoice9 != null ? C8632dsu.c(membershipProductChoice9.isNewBillingDateApproximate(), Boolean.TRUE) : false;
            Typeface e = C1336Xt.e(getActivity());
            C1204Sr c1204Sr = l2.c().b;
            C8632dsu.a(c1204Sr, "");
            c1204Sr.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C8145dep c8145dep = new C8145dep(e);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) C1333Xq.d(com.netflix.mediaclient.ui.R.o.jR).c());
            spannableStringBuilder.setSpan(c8145dep, length, spannableStringBuilder.length(), 17);
            MembershipProductChoice membershipProductChoice10 = this.i;
            if (membershipProductChoice10 != null && C8632dsu.c(membershipProductChoice10.getRevokesUouOffer(), Boolean.TRUE) && c4) {
                i = com.netflix.mediaclient.ui.R.o.jO;
            } else {
                MembershipProductChoice membershipProductChoice11 = this.i;
                i = (membershipProductChoice11 == null || !C8632dsu.c(membershipProductChoice11.getRevokesUouOffer(), Boolean.TRUE)) ? c4 ? com.netflix.mediaclient.ui.R.o.jS : com.netflix.mediaclient.ui.R.o.jK : com.netflix.mediaclient.ui.R.o.jQ;
            }
            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) C1333Xq.d(i).d("price_per_period", text3).d("billing_date", format).c());
            if (m()) {
                append.append((CharSequence) " ").append((CharSequence) C1333Xq.d(com.netflix.mediaclient.ui.R.o.jE).c());
            }
            l2.c().b.setText(append);
        } else {
            C1204Sr c1204Sr2 = l2.c().b;
            C8632dsu.a(c1204Sr2, "");
            c1204Sr2.setVisibility(m() ? 0 : 8);
        }
        C1204Sr c1204Sr3 = l2.c().b;
        C8632dsu.a(c1204Sr3, "");
        if (c1204Sr3.getVisibility() == 0 && (view = getView()) != null) {
            float f = 8;
            C1332Xp c1332Xp = C1332Xp.b;
            view.setPadding(view.getPaddingLeft(), (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), view.getPaddingRight(), (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        }
        l2.e().c.setText(str3);
        l2.e().c.setOnClickListener(new View.OnClickListener() { // from class: o.cwE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC7480cwx.a(AbstractC7480cwx.this, view2);
            }
        });
        this.h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC7480cwx abstractC7480cwx, View view) {
        C8632dsu.c((Object) abstractC7480cwx, "");
        abstractC7480cwx.e(abstractC7480cwx.i);
    }

    private final void e(MembershipProductChoice membershipProductChoice) {
        if (getNetflixActivity() == null || membershipProductChoice == null) {
            return;
        }
        Long l = this.m;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
            this.m = null;
        }
        Logger logger = Logger.INSTANCE;
        this.k = logger.startSession(new Presentation(i(), n()));
        setCancelable(false);
        b l2 = l();
        l2.c().f.setVisibility(0);
        l2.c().l.setVisibility(8);
        l2.c().h.setVisibility(8);
        l2.c().i.setVisibility(8);
        l2.e().a.setVisibility(8);
        l2.e().b.setVisibility(8);
        l2.e().c.setVisibility(8);
        l2.c().b.setVisibility(8);
        this.e = logger.startSession(new SelectPlan(null, null, String.valueOf(membershipProductChoice.getPlanId()), null, null));
        this.d = logger.startSession(new ConfirmPlanUpgrade(h(), null, e(), CommandValue.ConfirmPlanUpgradeAcceptCommand, null));
        boolean z = membershipProductChoice.getNewBillingDate() != null;
        ServiceManager serviceManager = getServiceManager();
        if (serviceManager != null) {
            serviceManager.e(membershipProductChoice.getPlanId(), membershipProductChoice.getPriceTier(), d(), Boolean.valueOf(z), new d());
        }
    }

    /* renamed from: o.cwx$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC5164btb {
        d() {
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void c(UpdateProductChoiceResponse updateProductChoiceResponse, Status status) {
            AbstractC7480cwx.this.b(status);
        }
    }

    private final void r() {
        CommandValue commandValue;
        Logger logger = Logger.INSTANCE;
        AppView h = h();
        if (this.h) {
            commandValue = CommandValue.ConfirmPlanUpgradeCancellationCommand;
        } else {
            commandValue = CommandValue.CancelPlanUpgradeOfferCommand;
        }
        logger.logEvent(new Selected(h, null, commandValue, null));
    }

    public final TrackingInfo n() {
        a aVar = c;
        return aVar.c(this.f13784o, d(), aVar.d(this.j));
    }

    public final void b(Status status) {
        if (getActivity() == null) {
            return;
        }
        C1044Mm.a("PlanUpgradeDialogFragment", "onUpdateResult: " + status);
        if (status != null && status.j()) {
            Long l = this.k;
            if (l != null) {
                Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
                this.k = null;
            }
            Long l2 = this.d;
            if (l2 != null) {
                Logger.INSTANCE.endSession(Long.valueOf(l2.longValue()));
                this.d = null;
            }
            Long l3 = this.e;
            if (l3 != null) {
                Logger.INSTANCE.endSession(Long.valueOf(l3.longValue()));
                this.e = null;
            }
            C8054ddD.c(getContext(), a(), 0);
            f();
            return;
        }
        Long l4 = this.k;
        if (l4 != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l4.longValue()));
            this.k = null;
        }
        Long l5 = this.d;
        if (l5 != null) {
            ExtLogger.INSTANCE.failedAction(Long.valueOf(l5.longValue()), C8169dfM.b(status));
            this.d = null;
        }
        Long l6 = this.e;
        if (l6 != null) {
            ExtLogger.INSTANCE.failedAction(Long.valueOf(l6.longValue()), C8169dfM.b(status));
            this.e = null;
        }
        C8054ddD.c(getContext(), com.netflix.mediaclient.ui.R.o.jY, 0);
        b();
    }

    public final AppView h() {
        return AppView.planUpgradeGate;
    }

    public final AppView g() {
        return AppView.planUpgradeConfirmationPrompt;
    }

    public final AppView i() {
        return AppView.upgradingPlan;
    }

    /* renamed from: o.cwx$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final JSONObject b(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return jSONObject;
        }

        private a() {
        }

        public final AbstractC7480cwx e(C4611bhl c4611bhl, PlayContext playContext, InterfaceC7441cwK interfaceC7441cwK) {
            List<MembershipChoicesResponse.CurrentViewing> currentViewings;
            ArrayList arrayList;
            ArrayList arrayList2;
            List<MembershipChoicesResponse.CurrentViewing> currentViewings2;
            int d;
            List<MembershipChoicesResponse.CurrentViewing> currentViewings3;
            int d2;
            C8632dsu.c((Object) c4611bhl, "");
            C8632dsu.c((Object) playContext, "");
            C8632dsu.c((Object) interfaceC7441cwK, "");
            C7442cwL c7442cwL = new C7442cwL();
            c7442cwL.setStyle(2, 0);
            c7442cwL.b(interfaceC7441cwK);
            Bundle bundle = new Bundle();
            bundle.putParcelable("play_context", playContext);
            MembershipChoicesResponse j = c4611bhl.j();
            if (j != null && (currentViewings = j.getCurrentViewings()) != null && (!currentViewings.isEmpty())) {
                MembershipChoicesResponse j2 = c4611bhl.j();
                if (j2 == null || (currentViewings3 = j2.getCurrentViewings()) == null) {
                    arrayList = null;
                } else {
                    d2 = C8572dqo.d(currentViewings3, 10);
                    arrayList = new ArrayList(d2);
                    for (MembershipChoicesResponse.CurrentViewing currentViewing : currentViewings3) {
                        arrayList.add(currentViewing.getDevice());
                    }
                }
                MembershipChoicesResponse j3 = c4611bhl.j();
                if (j3 == null || (currentViewings2 = j3.getCurrentViewings()) == null) {
                    arrayList2 = null;
                } else {
                    d = C8572dqo.d(currentViewings2, 10);
                    arrayList2 = new ArrayList(d);
                    for (MembershipChoicesResponse.CurrentViewing currentViewing2 : currentViewings2) {
                        arrayList2.add(currentViewing2.getVideo());
                    }
                }
                bundle.putStringArrayList("devices", new ArrayList<>(arrayList));
                bundle.putStringArrayList("streams", new ArrayList<>(arrayList2));
            }
            MembershipChoicesResponse j4 = c4611bhl.j();
            if (j4 != null && !j4.isFallback()) {
                MembershipChoicesResponse j5 = c4611bhl.j();
                bundle.putParcelableArrayList("choices", new ArrayList<>(j5 != null ? j5.getChoices() : null));
                MembershipChoicesResponse j6 = c4611bhl.j();
                bundle.putParcelable("bundleInfo", j6 != null ? j6.getBundleInfo() : null);
            }
            c7442cwL.setArguments(bundle);
            return c7442cwL;
        }

        public final MembershipProductChoice b(List<MembershipProductChoice> list) {
            Iterable X;
            Object obj;
            Iterable X2;
            Object obj2;
            C8632dsu.c((Object) list, "");
            X = C8576dqs.X(list);
            Iterator it = X.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MembershipProductChoice) ((C8578dqu) obj).c()).isCurrent()) {
                    break;
                }
            }
            C8578dqu c8578dqu = (C8578dqu) obj;
            if (c8578dqu == null) {
                return null;
            }
            int e = c8578dqu.e();
            MembershipProductChoice membershipProductChoice = (MembershipProductChoice) c8578dqu.b();
            X2 = C8576dqs.X(list);
            Iterator it2 = X2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                C8578dqu c8578dqu2 = (C8578dqu) obj2;
                int e2 = c8578dqu2.e();
                MembershipProductChoice membershipProductChoice2 = (MembershipProductChoice) c8578dqu2.b();
                if (e2 > e && membershipProductChoice2.getPlanChangeType() == MembershipProductChoice.MembershipPlanChangeType.IMMEDIATE && membershipProductChoice2.getMaxStreams() > membershipProductChoice.getMaxStreams()) {
                    break;
                }
            }
            C8578dqu c8578dqu3 = (C8578dqu) obj2;
            if (c8578dqu3 != null) {
                return (MembershipProductChoice) c8578dqu3.c();
            }
            return null;
        }

        public final TrackingInfo c(PlayContext playContext, String str, int i) {
            C8632dsu.c((Object) str, "");
            final JSONObject jSONObject = new JSONObject();
            if (playContext != null) {
                jSONObject.put("trackId", playContext.getTrackId());
            }
            jSONObject.put("upgradeType", str);
            jSONObject.put("currentPlanId", i);
            return new TrackingInfo() { // from class: o.cwC
                @Override // com.netflix.cl.model.JsonSerializer
                public final JSONObject toJSONObject() {
                    JSONObject b;
                    b = AbstractC7480cwx.a.b(JSONObject.this);
                    return b;
                }
            };
        }

        public final int d(List<MembershipProductChoice> list) {
            Object obj;
            C8632dsu.c((Object) list, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MembershipProductChoice) obj).getPlanStatus() == MembershipProductChoice.MembershipPlanStatus.CURRENT) {
                    break;
                }
            }
            MembershipProductChoice membershipProductChoice = (MembershipProductChoice) obj;
            if (membershipProductChoice != null) {
                return membershipProductChoice.getPlanId();
            }
            return -1;
        }
    }

    static {
        List<String> e;
        e = C8566dqi.e(SignupConstants.Field.REGION_US);
        b = e;
    }
}
