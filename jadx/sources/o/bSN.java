package o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.home.api.Params;
import com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment;
import com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment;
import com.netflix.mediaclient.ui.home.impl.mynetflix.MyNetflixFragment;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;
import com.netflix.model.leafs.GenreItemImpl;
import dagger.Lazy;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import o.AbstractC1608aHp;
import o.C7017coI;
import o.C8171dfO;
import o.C8632dsu;
import o.InterfaceC3643bFl;
import o.InterfaceC4005bSs;
import o.InterfaceC5223buh;
import o.bSN;
import o.dpR;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class bSN implements InterfaceC3993bSg {
    public static final d a = new d(null);
    private final Lazy<InterfaceC4005bSs> b;
    private final Context d;

    @Inject
    public bSN(final InterfaceC3643bFl interfaceC3643bFl, @ApplicationContext Context context, Lazy<InterfaceC4005bSs> lazy) {
        C8632dsu.c((Object) interfaceC3643bFl, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) lazy, "");
        this.d = context;
        this.b = lazy;
        C7017coI.a aVar = C7017coI.c;
        aVar.e().b(AbstractC1608aHp.d.b, new drM<C7017coI.e<NetflixActivity, AbstractC1608aHp.d.b>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeImpl$1

            /* loaded from: classes4.dex */
            public final /* synthetic */ class a {
                public static final /* synthetic */ int[] b;

                static {
                    int[] iArr = new int[VideoType.values().length];
                    try {
                        iArr[VideoType.CHARACTERS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[VideoType.GAMES.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    b = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7017coI.e<NetflixActivity, AbstractC1608aHp.d.b> eVar) {
                c(eVar);
                return dpR.c;
            }

            public final void c(C7017coI.e<NetflixActivity, AbstractC1608aHp.d.b> eVar) {
                C8632dsu.c((Object) eVar, "");
                NetflixActivity e = eVar.e();
                AbstractC1608aHp.d.b d2 = eVar.d();
                InterfaceC5223buh c = d2.c();
                TrackingInfoHolder b = d2.b();
                String d3 = d2.d();
                if (c.getType() == VideoType.GAMES) {
                    CLv2Utils.INSTANCE.b(AppView.boxArt, CommandValue.ViewGameDetailsCommand, (TrackingInfo) null);
                } else {
                    CLv2Utils.INSTANCE.b(new Focus(AppView.boxArt, b.c((JSONObject) null)), new ViewDetailsCommand(), !C8171dfO.c());
                }
                VideoType type = c.getType();
                int i = type == null ? -1 : a.b[type.ordinal()];
                if (i == 1) {
                    bSN.this.b(interfaceC3643bFl, c, e, b, d3);
                } else if (i != 2) {
                    bSN.this.d(interfaceC3643bFl, c, e, b, d3);
                } else {
                    bSN.this.a(interfaceC3643bFl, c, e, b, d3);
                }
            }
        });
        aVar.e().b(AbstractC1608aHp.c.a, new drM<C7017coI.e<Context, AbstractC1608aHp.c.e>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeImpl$2

            /* loaded from: classes4.dex */
            public final /* synthetic */ class a {
                public static final /* synthetic */ int[] d;

                static {
                    int[] iArr = new int[VideoType.values().length];
                    try {
                        iArr[VideoType.CHARACTERS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    d = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7017coI.e<Context, AbstractC1608aHp.c.e> eVar) {
                b(eVar);
                return dpR.c;
            }

            public final void b(C7017coI.e<Context, AbstractC1608aHp.c.e> eVar) {
                Context context2;
                Context context3;
                C8632dsu.c((Object) eVar, "");
                AbstractC1608aHp.c.e d2 = eVar.d();
                String b = d2.b();
                VideoType d3 = d2.d();
                TrackingInfoHolder a2 = d2.a();
                String e = d2.e();
                String c = d2.c();
                if (a.d[d3.ordinal()] == 1) {
                    InterfaceC3643bFl interfaceC3643bFl2 = InterfaceC3643bFl.this;
                    context3 = this.d;
                    interfaceC3643bFl2.c(context3, d3, b, e, a2, c, new Bundle());
                    return;
                }
                InterfaceC3643bFl interfaceC3643bFl3 = InterfaceC3643bFl.this;
                context2 = this.d;
                interfaceC3643bFl3.c(context2, d3, b, e, a2, c, null);
            }
        });
        C1332Xp.d(InterfaceC5841cKi.class, new C4020bTg(), true);
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("HomeImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC3643bFl interfaceC3643bFl, InterfaceC5223buh interfaceC5223buh, NetflixActivity netflixActivity, TrackingInfoHolder trackingInfoHolder, String str) {
        interfaceC3643bFl.d(netflixActivity, interfaceC5223buh, trackingInfoHolder, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(InterfaceC3643bFl interfaceC3643bFl, InterfaceC5223buh interfaceC5223buh, NetflixActivity netflixActivity, TrackingInfoHolder trackingInfoHolder, String str) {
        if (C8171dfO.c()) {
            QuickDrawDialogFrag.d dVar = QuickDrawDialogFrag.e;
            String id = interfaceC5223buh.getId();
            C8632dsu.a(id, "");
            QuickDrawDialogFrag.d.a(dVar, netflixActivity, id, trackingInfoHolder, true, null, 16, null);
            return;
        }
        interfaceC3643bFl.d(netflixActivity, interfaceC5223buh, trackingInfoHolder, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(InterfaceC3643bFl interfaceC3643bFl, InterfaceC5223buh interfaceC5223buh, NetflixActivity netflixActivity, TrackingInfoHolder trackingInfoHolder, String str) {
        interfaceC3643bFl.d(netflixActivity, interfaceC5223buh, trackingInfoHolder, str, new Bundle());
    }

    @Override // o.InterfaceC3993bSg
    public Fragment a(Params.Lolomo lolomo) {
        C8632dsu.c((Object) lolomo, "");
        String c = lolomo.c();
        if (c != null) {
            C6452cda.e(c);
        } else {
            lolomo.d();
        }
        GenreItem d2 = lolomo.d();
        C8632dsu.c((Object) (d2 != null ? d2.getId() : null), (Object) "queue");
        GenreItem d3 = lolomo.d();
        boolean c2 = C8632dsu.c((Object) (d3 != null ? d3.getId() : null), (Object) "mobileFeeds");
        if (C1875aRm.a.d() && c2) {
            FeedLolomoFragment feedLolomoFragment = new FeedLolomoFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.netflix.mediaclient.ui.home.impl.lolomo.Params.Lolomo", lolomo);
            feedLolomoFragment.setArguments(bundle);
            return feedLolomoFragment;
        }
        bTK btk = new bTK();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("com.netflix.mediaclient.ui.home.impl.lolomo.Params.Lolomo", lolomo);
        btk.setArguments(bundle2);
        return btk;
    }

    @Override // o.InterfaceC3993bSg
    public Fragment d(String str) {
        FeedLolomoFragment feedLolomoFragment = new FeedLolomoFragment();
        GenreItemImpl genreItemImpl = new GenreItemImpl() { // from class: com.netflix.mediaclient.ui.home.impl.HomeImpl$createFeedLolomoFragment$1$genreItem$1
            {
                this.genreId = "mobileFeeds";
            }

            @Override // com.netflix.model.leafs.GenreItemImpl, com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem
            public String getUnifiedEntityId() {
                String str2 = this.genreId;
                return "Collection:" + str2;
            }
        };
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.netflix.mediaclient.ui.home.impl.lolomo.Params.Lolomo", new Params.Lolomo("mobileFeeds", "mobileFeeds", genreItemImpl, AppView.newsFeed, false, false));
        if (str != null) {
            bundle.putString("initial_list_context_extra", str);
        }
        feedLolomoFragment.setArguments(bundle);
        return feedLolomoFragment;
    }

    @Override // o.InterfaceC3993bSg
    public Fragment e(String str) {
        C8632dsu.c((Object) str, "");
        GamesLolomoFragment gamesLolomoFragment = new GamesLolomoFragment();
        Bundle bundle = new Bundle();
        GenreItem.GenreType genreType = GenreItem.GenreType.LOLOMO;
        bundle.putParcelable("com.netflix.mediaclient.ui.home.impl.lolomo.Params.Lolomo", new Params.Lolomo(str, str, new DefaultGenreItem("", str, genreType, "Collection:" + str, null), AppView.home, false, false, 32, null));
        gamesLolomoFragment.setArguments(bundle);
        return gamesLolomoFragment;
    }

    @Override // o.InterfaceC3993bSg
    public Fragment a() {
        MyNetflixFragment myNetflixFragment = new MyNetflixFragment();
        Bundle bundle = new Bundle();
        GenreItem.GenreType genreType = GenreItem.GenreType.LOLOMO;
        bundle.putParcelable("com.netflix.mediaclient.ui.home.impl.lolomo.Params.Lolomo", new Params.Lolomo("myProfile", "myProfile", new DefaultGenreItem("", "myProfile", genreType, "Collection:myProfile", null), AppView.home, false, false, 32, null));
        myNetflixFragment.setArguments(bundle);
        return myNetflixFragment;
    }

    @Override // o.InterfaceC3993bSg
    public void d(Activity activity, drO<dpR> dro) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) dro, "");
        C4138bXq.b.c(activity.findViewById(com.netflix.mediaclient.ui.R.g.cu), activity, dro);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // o.InterfaceC3993bSg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(int r5, int r6, o.InterfaceC8585dra<? super o.C4003bSq> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.netflix.mediaclient.ui.home.impl.HomeImpl$fetchCollectTasteTitles$1
            if (r0 == 0) goto L13
            r0 = r7
            com.netflix.mediaclient.ui.home.impl.HomeImpl$fetchCollectTasteTitles$1 r0 = (com.netflix.mediaclient.ui.home.impl.HomeImpl$fetchCollectTasteTitles$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.home.impl.HomeImpl$fetchCollectTasteTitles$1 r0 = new com.netflix.mediaclient.ui.home.impl.HomeImpl$fetchCollectTasteTitles$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            o.C8556dpz.d(r7)
            dagger.Lazy<o.bSs> r7 = r4.b
            java.lang.Object r7 = r7.get()
            o.bSs r7 = (o.InterfaceC4005bSs) r7
            io.reactivex.Single r5 = r7.a(r5, r6)
            r0.c = r3
            java.lang.Object r7 = o.dAU.d(r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.lang.String r5 = ""
            o.C8632dsu.a(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bSN.a(int, int, o.dra):java.lang.Object");
    }

    @Override // o.InterfaceC3993bSg
    public Object e(String str, int i, int i2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dAU.b(this.b.get().d(str, i, i2), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // o.InterfaceC3993bSg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(int r5, boolean r6, o.InterfaceC8585dra<? super o.C4003bSq> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.netflix.mediaclient.ui.home.impl.HomeImpl$getContinueWatchingTitles$1
            if (r0 == 0) goto L13
            r0 = r7
            com.netflix.mediaclient.ui.home.impl.HomeImpl$getContinueWatchingTitles$1 r0 = (com.netflix.mediaclient.ui.home.impl.HomeImpl$getContinueWatchingTitles$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.home.impl.HomeImpl$getContinueWatchingTitles$1 r0 = new com.netflix.mediaclient.ui.home.impl.HomeImpl$getContinueWatchingTitles$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.e
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.a
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            o.C8556dpz.d(r7)
            dagger.Lazy<o.bSs> r7 = r4.b
            java.lang.Object r7 = r7.get()
            o.bSs r7 = (o.InterfaceC4005bSs) r7
            io.reactivex.Single r5 = r7.b(r5, r6)
            r0.a = r3
            java.lang.Object r7 = o.dAU.d(r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.lang.String r5 = ""
            o.C8632dsu.a(r7, r5)
            java.util.Optional r7 = (java.util.Optional) r7
            java.lang.Object r5 = o.dsO.e(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bSN.e(int, boolean, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // o.InterfaceC3993bSg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(int r5, boolean r6, o.InterfaceC8585dra<? super o.C4003bSq> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.netflix.mediaclient.ui.home.impl.HomeImpl$getGamesRow$1
            if (r0 == 0) goto L13
            r0 = r7
            com.netflix.mediaclient.ui.home.impl.HomeImpl$getGamesRow$1 r0 = (com.netflix.mediaclient.ui.home.impl.HomeImpl$getGamesRow$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.home.impl.HomeImpl$getGamesRow$1 r0 = new com.netflix.mediaclient.ui.home.impl.HomeImpl$getGamesRow$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            o.C8556dpz.d(r7)
            dagger.Lazy<o.bSs> r7 = r4.b
            java.lang.Object r7 = r7.get()
            o.bSs r7 = (o.InterfaceC4005bSs) r7
            io.reactivex.Single r5 = r7.c(r5, r6)
            r0.d = r3
            java.lang.Object r7 = o.dAU.d(r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.lang.String r5 = ""
            o.C8632dsu.a(r7, r5)
            java.util.Optional r7 = (java.util.Optional) r7
            java.lang.Object r5 = o.dsO.e(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bSN.a(int, boolean, o.dra):java.lang.Object");
    }

    @Override // o.InterfaceC3993bSg
    public Object d(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        InterfaceC4005bSs interfaceC4005bSs = this.b.get();
        C8632dsu.a(interfaceC4005bSs, "");
        Object b = dAU.b(InterfaceC4005bSs.a.d(interfaceC4005bSs, 1, null, false, false, false, 30, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // o.InterfaceC3993bSg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(o.InterfaceC8585dra<? super java.util.Optional<o.InterfaceC5155btS>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.netflix.mediaclient.ui.home.impl.HomeImpl$getLatestLolomoSummary$1
            if (r0 == 0) goto L13
            r0 = r5
            com.netflix.mediaclient.ui.home.impl.HomeImpl$getLatestLolomoSummary$1 r0 = (com.netflix.mediaclient.ui.home.impl.HomeImpl$getLatestLolomoSummary$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.home.impl.HomeImpl$getLatestLolomoSummary$1 r0 = new com.netflix.mediaclient.ui.home.impl.HomeImpl$getLatestLolomoSummary$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r5)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            o.C8556dpz.d(r5)
            dagger.Lazy<o.bSs> r5 = r4.b
            java.lang.Object r5 = r5.get()
            o.bSs r5 = (o.InterfaceC4005bSs) r5
            io.reactivex.Single r5 = r5.c()
            r0.e = r3
            java.lang.Object r5 = o.dAU.d(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.util.Optional r5 = java.util.Optional.ofNullable(r5)
            java.lang.String r0 = ""
            o.C8632dsu.a(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bSN.a(o.dra):java.lang.Object");
    }
}
