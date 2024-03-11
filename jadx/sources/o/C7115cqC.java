package o;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.model.leafs.social.multititle.NotificationCtaButton;
import com.netflix.model.leafs.social.multititle.NotificationGridModule;
import com.netflix.model.leafs.social.multititle.NotificationGridTitleAction;
import com.netflix.model.leafs.social.multititle.NotificationHeroModule;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;
import com.netflix.model.leafs.social.multititle.NotificationModule;
import com.netflix.model.leafs.social.multititle.NotificationModuleFilters;
import com.netflix.model.leafs.social.multititle.NotificationModuleList;
import com.netflix.model.leafs.social.multititle.NotificationModuleListTypeAdapter;
import com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule;
import com.netflix.model.leafs.social.multititle.NotificationTemplate;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.AbstractC7118cqF;
import o.C7115cqC;
import o.C7155cqq;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cqC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7115cqC extends AndroidViewModel {
    public static final d c = new d(null);
    private final MutableLiveData<List<AbstractC7118cqF>> a;
    private Disposable d;

    public final MutableLiveData<List<AbstractC7118cqF>> a() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7115cqC(Application application) {
        super(application);
        C8632dsu.c((Object) application, "");
        this.a = new MutableLiveData<>();
    }

    /* renamed from: o.cqC$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MultiTitleNotificationViewModel");
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
        this.d = null;
    }

    public final void a(NotificationLandingPage notificationLandingPage, HashMap<String, String> hashMap) {
        C8632dsu.c((Object) notificationLandingPage, "");
        String str = (hashMap == null || (str = hashMap.get("thumbs")) == null) ? "ratingInput" : "ratingInput";
        if (e(notificationLandingPage, str)) {
            d(a(notificationLandingPage, str));
        } else {
            d(e(notificationLandingPage));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final List<String> d(NotificationLandingPage notificationLandingPage, String str) {
        List<String> list;
        NotificationModuleFilters moduleFiltersForActions;
        NotificationModuleFilters moduleFiltersForActions2;
        NotificationModuleFilters moduleFiltersForActions3;
        List<String> i;
        NotificationModuleFilters moduleFiltersForActions4;
        switch (str.hashCode()) {
            case -1699402849:
                if (str.equals("thumbsDown") && (moduleFiltersForActions = notificationLandingPage.template().moduleFiltersForActions()) != null) {
                    list = moduleFiltersForActions.thumbsDownActionFilteredModules();
                    break;
                }
                list = null;
                break;
            case 384970797:
                if (str.equals("ratingInput") && (moduleFiltersForActions2 = notificationLandingPage.template().moduleFiltersForActions()) != null) {
                    list = moduleFiltersForActions2.ratingInputActionFilteredModules();
                    break;
                }
                list = null;
                break;
            case 1566945496:
                if (str.equals("thumbsUp") && (moduleFiltersForActions3 = notificationLandingPage.template().moduleFiltersForActions()) != null) {
                    list = moduleFiltersForActions3.thumbsUpActionFilteredModules();
                    break;
                }
                list = null;
                break;
            case 1660950217:
                if (str.equals("thumbsUpDouble") && (moduleFiltersForActions4 = notificationLandingPage.template().moduleFiltersForActions()) != null) {
                    list = moduleFiltersForActions4.thumbsUpDoubleActionFilteredModules();
                    break;
                }
                list = null;
                break;
            default:
                list = null;
                break;
        }
        if (list == null) {
            i = C8569dql.i();
            return i;
        }
        return list;
    }

    private final boolean e(NotificationLandingPage notificationLandingPage, String str) {
        ArrayList arrayList;
        List<NotificationModule> modules;
        NotificationModuleList modulesList = notificationLandingPage.template().modulesList();
        if (modulesList == null || (modules = modulesList.modules()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : modules) {
                if (obj instanceof NotificationRatingInfoModule) {
                    arrayList.add(obj);
                }
            }
        }
        return (!((arrayList == null || arrayList.isEmpty()) ^ true) || notificationLandingPage.template().moduleFiltersForActions() == null || d(notificationLandingPage, str).isEmpty()) ? false : true;
    }

    private final List<AbstractC7118cqF> e(NotificationLandingPage notificationLandingPage) {
        List<NotificationModule> modules;
        NotificationTemplate template = notificationLandingPage.template();
        ArrayList arrayList = new ArrayList();
        String headlineText = template != null ? template.headlineText() : null;
        String str = headlineText == null ? "" : headlineText;
        String bodyText = template != null ? template.bodyText() : null;
        arrayList.add(new C7158cqt(0, str, bodyText == null ? "" : bodyText, 1, null));
        NotificationModuleList modulesList = template.modulesList();
        if (modulesList != null && (modules = modulesList.modules()) != null) {
            for (NotificationModule notificationModule : modules) {
                if (notificationModule instanceof NotificationHeroModule) {
                    arrayList.add(new C7155cqq((NotificationHeroModule) notificationModule));
                } else if (notificationModule instanceof NotificationGridModule) {
                    NotificationGridModule notificationGridModule = (NotificationGridModule) notificationModule;
                    String headlineText2 = notificationGridModule.headlineText();
                    C8632dsu.a(headlineText2, "");
                    arrayList.add(new C7150cql(0, headlineText2, 1, null));
                    List<NotificationGridTitleAction> actions = notificationGridModule.actions();
                    C8632dsu.a(actions, "");
                    boolean z = true;
                    for (NotificationGridTitleAction notificationGridTitleAction : actions) {
                        C8632dsu.d(notificationGridTitleAction);
                        arrayList.add(new C7149cqk(0, notificationGridTitleAction, z, 1, null));
                        z = !z;
                    }
                }
            }
        }
        NotificationCtaButton ctaButton = template.ctaButton();
        String buttonText = ctaButton != null ? ctaButton.buttonText() : null;
        String str2 = buttonText == null ? "" : buttonText;
        NotificationCtaButton ctaButton2 = template.ctaButton();
        String action = ctaButton2 != null ? ctaButton2.action() : null;
        String str3 = action == null ? "" : action;
        NotificationCtaButton ctaButton3 = template.ctaButton();
        arrayList.add(new C7152cqn(0, str2, str3, CLv2Utils.b(ctaButton3 != null ? ctaButton3.trackingInfo() : null), 1, null));
        return arrayList;
    }

    private final List<AbstractC7118cqF> a(NotificationModule notificationModule, String str, List<String> list) {
        List<AbstractC7118cqF> i;
        List<AbstractC7118cqF> i2;
        List<AbstractC7118cqF> i3;
        List<AbstractC7118cqF> e;
        List<AbstractC7118cqF> e2;
        if (notificationModule instanceof NotificationRatingInfoModule) {
            e2 = C8566dqi.e(new C7124cqL(0, (NotificationRatingInfoModule) notificationModule, str, 1, null));
            return e2;
        } else if (notificationModule instanceof NotificationHeroModule) {
            NotificationHeroModule notificationHeroModule = (NotificationHeroModule) notificationModule;
            if (list.contains(notificationHeroModule.layout())) {
                e = C8566dqi.e(new C7155cqq(notificationHeroModule));
                return e;
            }
            i3 = C8569dql.i();
            return i3;
        } else if (notificationModule instanceof NotificationGridModule) {
            NotificationGridModule notificationGridModule = (NotificationGridModule) notificationModule;
            if (list.contains(notificationGridModule.layout())) {
                ArrayList arrayList = new ArrayList();
                String headlineText = notificationGridModule.headlineText();
                C8632dsu.a(headlineText, "");
                arrayList.add(new C7150cql(0, headlineText, 1, null));
                List<NotificationGridTitleAction> actions = notificationGridModule.actions();
                C8632dsu.a(actions, "");
                boolean z = true;
                for (NotificationGridTitleAction notificationGridTitleAction : actions) {
                    C8632dsu.d(notificationGridTitleAction);
                    arrayList.add(new C7149cqk(0, notificationGridTitleAction, z, 1, null));
                    z = !z;
                }
                return arrayList;
            }
            i2 = C8569dql.i();
            return i2;
        } else {
            i = C8569dql.i();
            return i;
        }
    }

    private final List<AbstractC7118cqF> a(NotificationLandingPage notificationLandingPage, String str) {
        List<NotificationModule> modules;
        NotificationTemplate template = notificationLandingPage.template();
        ArrayList arrayList = new ArrayList();
        List<String> d2 = d(notificationLandingPage, str);
        NotificationModuleList modulesList = template.modulesList();
        if (modulesList != null && (modules = modulesList.modules()) != null) {
            for (NotificationModule notificationModule : modules) {
                C8632dsu.d(notificationModule);
                arrayList.addAll(a(notificationModule, str, d2));
            }
        }
        if (d2.contains(NotificationModuleListTypeAdapter.LAYOUT_NAME_CTA_BUTTON)) {
            NotificationCtaButton ctaButton = template.ctaButton();
            String buttonText = ctaButton != null ? ctaButton.buttonText() : null;
            String str2 = buttonText == null ? "" : buttonText;
            NotificationCtaButton ctaButton2 = template.ctaButton();
            String action = ctaButton2 != null ? ctaButton2.action() : null;
            String str3 = action == null ? "" : action;
            NotificationCtaButton ctaButton3 = template.ctaButton();
            arrayList.add(new C7152cqn(0, str2, str3, CLv2Utils.b(ctaButton3 != null ? ctaButton3.trackingInfo() : null), 1, null));
        }
        return arrayList;
    }

    private final void d(final List<? extends AbstractC7118cqF> list) {
        List<AbstractC7118cqF> i;
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
        MutableLiveData<List<AbstractC7118cqF>> mutableLiveData = this.a;
        i = C8569dql.i();
        mutableLiveData.setValue(i);
        ArrayList<C7155cqq> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C7155cqq) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C7155cqq c7155cqq : arrayList) {
            C8571dqn.b(arrayList2, c7155cqq.b());
        }
        Completable concat = Completable.concat(arrayList2);
        C8632dsu.a(concat, "");
        this.d = SubscribersKt.subscribeBy(concat, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationViewModel$updateRows$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                C8632dsu.c((Object) th, "");
                C7115cqC.d dVar = C7115cqC.c;
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationViewModel$updateRows$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }

            public final void e() {
                List<AbstractC7118cqF> list2 = list;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    AbstractC7118cqF abstractC7118cqF = (AbstractC7118cqF) obj2;
                    if (!(abstractC7118cqF instanceof C7155cqq) || ((C7155cqq) abstractC7118cqF).e()) {
                        arrayList3.add(obj2);
                    }
                }
                C7115cqC.d dVar = C7115cqC.c;
                this.a().setValue(arrayList3);
            }
        });
    }
}
