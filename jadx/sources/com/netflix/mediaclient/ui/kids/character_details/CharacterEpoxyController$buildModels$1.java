package com.netflix.mediaclient.ui.kids.character_details;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.epoxy.models.HorizontalGravity;
import com.netflix.mediaclient.ui.kids.character_details.CharacterEpoxyController;
import com.netflix.mediaclient.ui.kids.character_details.CharacterEpoxyController$buildModels$1;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3073as;
import o.AbstractC3776bKf;
import o.AbstractC4163bYo;
import o.C1332Xp;
import o.C3744bJa;
import o.C3774bKd;
import o.C3805bLh;
import o.C3814bLq;
import o.C4156bYh;
import o.C4169bYu;
import o.C4170bYv;
import o.C4171bYw;
import o.C8004dcG;
import o.C8126deW;
import o.C8150deu;
import o.C8178dfV;
import o.C8569dql;
import o.C8632dsu;
import o.C8927fu;
import o.C9834xU;
import o.InterfaceC1610aHr;
import o.InterfaceC3656bFy;
import o.InterfaceC4467bf;
import o.InterfaceC4732bk;
import o.InterfaceC5194buE;
import o.InterfaceC5195buF;
import o.InterfaceC5198buI;
import o.InterfaceC5206buQ;
import o.InterfaceC5223buh;
import o.InterfaceC5227bul;
import o.InterfaceC5230buo;
import o.InterfaceC5298bwC;
import o.InterfaceC7303ctf;
import o.InterfaceC8366diy;
import o.bIN;
import o.bIQ;
import o.bIS;
import o.bIX;
import o.bLG;
import o.bXZ;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class CharacterEpoxyController$buildModels$1 extends Lambda implements drX<InterfaceC5230buo, InterfaceC5198buI, dpR> {
    final /* synthetic */ C4171bYw a;
    final /* synthetic */ C4156bYh b;
    final /* synthetic */ CharacterEpoxyController c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacterEpoxyController$buildModels$1(CharacterEpoxyController characterEpoxyController, C4171bYw c4171bYw, C4156bYh c4156bYh) {
        super(2);
        this.c = characterEpoxyController;
        this.a = c4171bYw;
        this.b = c4156bYh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CharacterEpoxyController characterEpoxyController, InterfaceC5230buo interfaceC5230buo, InterfaceC5198buI interfaceC5198buI, C4170bYv c4170bYv, AbstractC4163bYo.b bVar, int i) {
        C8632dsu.c((Object) characterEpoxyController, "");
        C8632dsu.c((Object) interfaceC5230buo, "");
        C8632dsu.c((Object) interfaceC5198buI, "");
        if (i == 2) {
            characterEpoxyController.getEventBusFactory().b(C4169bYu.e.class, new C4169bYu.e.C0106e(interfaceC5230buo, interfaceC5198buI));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(CharacterEpoxyController characterEpoxyController, InterfaceC5230buo interfaceC5230buo, InterfaceC5198buI interfaceC5198buI, View view) {
        C8632dsu.c((Object) characterEpoxyController, "");
        C8632dsu.c((Object) interfaceC5230buo, "");
        C8632dsu.c((Object) interfaceC5198buI, "");
        characterEpoxyController.getEventBusFactory().b(bXZ.class, new bXZ.e(interfaceC5230buo, interfaceC5198buI));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CharacterEpoxyController characterEpoxyController, InterfaceC5230buo interfaceC5230buo, InterfaceC5223buh interfaceC5223buh, int i, View view) {
        C8632dsu.c((Object) characterEpoxyController, "");
        C8632dsu.c((Object) interfaceC5230buo, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        characterEpoxyController.getEventBusFactory().b(bXZ.class, new bXZ.a(interfaceC5230buo, interfaceC5223buh, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CharacterEpoxyController characterEpoxyController, InterfaceC5230buo interfaceC5230buo, InterfaceC5223buh interfaceC5223buh, int i, C3744bJa c3744bJa, bLG.a aVar, int i2) {
        C8632dsu.c((Object) characterEpoxyController, "");
        C8632dsu.c((Object) interfaceC5230buo, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        if (i2 == 2) {
            characterEpoxyController.getEventBusFactory().b(C4169bYu.e.class, new C4169bYu.e.c(interfaceC5230buo, interfaceC5223buh, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CharacterEpoxyController characterEpoxyController, View view) {
        C8632dsu.c((Object) characterEpoxyController, "");
        characterEpoxyController.getEventBusFactory().b(bXZ.class, new bXZ.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CharacterEpoxyController characterEpoxyController, InterfaceC5230buo interfaceC5230buo, InterfaceC5227bul interfaceC5227bul, int i, View view) {
        C8632dsu.c((Object) characterEpoxyController, "");
        C8632dsu.c((Object) interfaceC5230buo, "");
        C8632dsu.c((Object) interfaceC5227bul, "");
        characterEpoxyController.getEventBusFactory().b(bXZ.class, new bXZ.b(interfaceC5230buo, interfaceC5227bul, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CharacterEpoxyController characterEpoxyController, InterfaceC5230buo interfaceC5230buo, InterfaceC5227bul interfaceC5227bul, int i, bIX bix, bIQ.c cVar, int i2) {
        C8632dsu.c((Object) characterEpoxyController, "");
        C8632dsu.c((Object) interfaceC5230buo, "");
        C8632dsu.c((Object) interfaceC5227bul, "");
        if (i2 == 2) {
            characterEpoxyController.getEventBusFactory().b(C4169bYu.e.class, new C4169bYu.e.a(interfaceC5230buo, interfaceC5227bul, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CharacterEpoxyController characterEpoxyController, View view) {
        C8632dsu.c((Object) characterEpoxyController, "");
        characterEpoxyController.getEventBusFactory().b(bXZ.class, new bXZ.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(List list, int i, int i2, int i3) {
        return i - (list.size() % i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CharacterEpoxyController characterEpoxyController, C3774bKd c3774bKd, AbstractC3776bKf.e eVar, int i) {
        C8632dsu.c((Object) characterEpoxyController, "");
        characterEpoxyController.getEventBusFactory().b(bXZ.class, new bXZ.c());
    }

    @Override // o.drX
    /* renamed from: a */
    public final dpR invoke(final InterfaceC5230buo interfaceC5230buo, final InterfaceC5198buI interfaceC5198buI) {
        HorizontalGravity horizontalGravity;
        C8632dsu.c((Object) interfaceC5230buo, "");
        C8632dsu.c((Object) interfaceC5198buI, "");
        final CharacterEpoxyController characterEpoxyController = this.c;
        C4170bYv c4170bYv = new C4170bYv();
        c4170bYv.b((CharSequence) interfaceC5230buo.getId());
        c4170bYv.h(interfaceC5198buI.getId());
        c4170bYv.f(interfaceC5198buI.getTitle());
        if (interfaceC5230buo.J() != null) {
            c4170bYv.d(interfaceC5230buo.J());
        } else {
            c4170bYv.d(interfaceC5198buI.U());
        }
        c4170bYv.i(interfaceC5198buI.ae());
        List<Advisory> e = interfaceC5198buI.e();
        boolean z = true;
        if (e != null) {
            C8632dsu.d(e);
            ArrayList<ContentAdvisory> arrayList = new ArrayList();
            for (Object obj : e) {
                if (obj instanceof ContentAdvisory) {
                    arrayList.add(obj);
                }
            }
            for (ContentAdvisory contentAdvisory : arrayList) {
                C1332Xp c1332Xp = C1332Xp.b;
                Drawable b = ((InterfaceC1610aHr) C1332Xp.b(InterfaceC1610aHr.class)).b(contentAdvisory, true);
                if (b != null) {
                    c4170bYv.c(b);
                    c4170bYv.a(contentAdvisory.getI18nRating());
                    break;
                }
            }
        }
        c4170bYv.b(interfaceC5198buI.k());
        c4170bYv.c(interfaceC5198buI.aE_().aI_());
        if (interfaceC5198buI.aE_().aI_() != null) {
            c4170bYv.g(interfaceC5198buI.aE_().aI_());
        } else if (interfaceC5198buI.getType() == VideoType.SHOW && (interfaceC5198buI instanceof InterfaceC5194buE)) {
            InterfaceC5194buE interfaceC5194buE = (InterfaceC5194buE) interfaceC5198buI;
            if (interfaceC5194buE.V() > 0) {
                c4170bYv.g(interfaceC5194buE.W());
            }
        } else if (interfaceC5198buI instanceof InterfaceC8366diy) {
            InterfaceC8366diy interfaceC8366diy = (InterfaceC8366diy) interfaceC5198buI;
            if (interfaceC8366diy.g() > 0) {
                c4170bYv.g(C8178dfV.d(interfaceC8366diy.g(), characterEpoxyController.getNetflixActivity()));
            }
        }
        if (C8150deu.h()) {
            horizontalGravity = HorizontalGravity.c;
        } else {
            horizontalGravity = HorizontalGravity.a;
        }
        c4170bYv.a(horizontalGravity);
        c4170bYv.e(new InterfaceC4732bk() { // from class: o.bXT
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj2, int i) {
                CharacterEpoxyController$buildModels$1.d(CharacterEpoxyController.this, interfaceC5230buo, interfaceC5198buI, (C4170bYv) abstractC3073as, (AbstractC4163bYo.b) obj2, i);
            }
        });
        c4170bYv.e(interfaceC5198buI.getBoxartId());
        c4170bYv.d(new AbstractC3073as.b() { // from class: o.bXY
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int g;
                g = CharacterEpoxyController$buildModels$1.g(i, i2, i3);
                return g;
            }
        });
        c4170bYv.a(new View.OnClickListener() { // from class: o.bYa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharacterEpoxyController$buildModels$1.b(CharacterEpoxyController.this, interfaceC5230buo, interfaceC5198buI, view);
            }
        });
        characterEpoxyController.add(c4170bYv);
        List<InterfaceC5195buF> c = this.a.d().c();
        List<InterfaceC5223buh> e2 = this.b.e();
        if (e2 != null) {
            C4156bYh c4156bYh = this.b;
            final CharacterEpoxyController characterEpoxyController2 = this.c;
            C4171bYw c4171bYw = this.a;
            if (!CharacterEpoxyController.Companion.a(c4156bYh)) {
                if (C8150deu.h()) {
                    r10 = C8150deu.s(characterEpoxyController2.getNetflixActivity()) ? 6 : 4;
                }
                characterEpoxyController2.requestedColumnNum = r10;
                final int i = 0;
                for (Object obj2 : e2) {
                    if (i < 0) {
                        C8569dql.h();
                    }
                    final InterfaceC5223buh interfaceC5223buh = (InterfaceC5223buh) obj2;
                    C3744bJa c3744bJa = new C3744bJa();
                    c3744bJa.b((CharSequence) interfaceC5223buh.getId());
                    c3744bJa.d(interfaceC5223buh.getTitle());
                    c3744bJa.c(interfaceC5223buh.getBoxshotUrl());
                    c3744bJa.b(new View.OnClickListener() { // from class: o.bYd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CharacterEpoxyController$buildModels$1.e(CharacterEpoxyController.this, interfaceC5230buo, interfaceC5223buh, i, view);
                        }
                    });
                    c3744bJa.d(new InterfaceC4732bk() { // from class: o.bYb
                        @Override // o.InterfaceC4732bk
                        public final void b(AbstractC3073as abstractC3073as, Object obj3, int i2) {
                            CharacterEpoxyController$buildModels$1.c(CharacterEpoxyController.this, interfaceC5230buo, interfaceC5223buh, i, (C3744bJa) abstractC3073as, (bLG.a) obj3, i2);
                        }
                    });
                    characterEpoxyController2.add(c3744bJa);
                    i++;
                }
            } else if (c != null && (!c.isEmpty())) {
                InterfaceC5195buF interfaceC5195buF = c.get(c4171bYw.g());
                if (c.size() > 1) {
                    C3805bLh c3805bLh = new C3805bLh();
                    String id = interfaceC5198buI.getId();
                    c3805bLh.e((CharSequence) ("season-selector-" + id));
                    c3805bLh.c(R.i.A);
                    c3805bLh.b((CharSequence) interfaceC5195buF.getTitle());
                    c3805bLh.e(Integer.valueOf(C9834xU.j.B));
                    c3805bLh.e(new AbstractC3073as.b() { // from class: o.bYc
                        @Override // o.AbstractC3073as.b
                        public final int b(int i2, int i3, int i4) {
                            int b2;
                            b2 = CharacterEpoxyController$buildModels$1.b(i2, i3, i4);
                            return b2;
                        }
                    });
                    c3805bLh.b(new View.OnClickListener() { // from class: o.bXS
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CharacterEpoxyController$buildModels$1.a(CharacterEpoxyController.this, view);
                        }
                    });
                    characterEpoxyController2.add(c3805bLh);
                } else {
                    C3814bLq c3814bLq = new C3814bLq();
                    String id2 = interfaceC5198buI.getId();
                    c3814bLq.b((CharSequence) ("season-selector-" + id2));
                    c3814bLq.d(R.i.C);
                    c3814bLq.d((CharSequence) interfaceC5195buF.getTitle());
                    c3814bLq.d(new AbstractC3073as.b() { // from class: o.bXQ
                        @Override // o.AbstractC3073as.b
                        public final int b(int i2, int i3, int i4) {
                            int h;
                            h = CharacterEpoxyController$buildModels$1.h(i2, i3, i4);
                            return h;
                        }
                    });
                    characterEpoxyController2.add(c3814bLq);
                }
                final List<InterfaceC5227bul> b2 = c4171bYw.b();
                if (b2 == null) {
                    characterEpoxyController2.addFillingLoadingModel("loading-empty-episodes", 400L);
                } else {
                    characterEpoxyController2.requestedColumnNum = C8150deu.s(characterEpoxyController2.getNetflixActivity()) ? 3 : 2;
                    C1332Xp c1332Xp2 = C1332Xp.b;
                    InterfaceC5298bwC interfaceC5298bwC = (InterfaceC5298bwC) C1332Xp.b(InterfaceC5298bwC.class);
                    String b3 = C8126deW.b(characterEpoxyController2.getNetflixActivity());
                    final int i2 = 0;
                    for (Object obj3 : b2) {
                        if (i2 < 0) {
                            C8569dql.h();
                        }
                        final InterfaceC5227bul interfaceC5227bul = (InterfaceC5227bul) obj3;
                        bIX bix = new bIX();
                        String id3 = interfaceC5227bul.getId();
                        bix.d((CharSequence) ("episode-" + id3));
                        bix.e(InterfaceC3656bFy.d.e(characterEpoxyController2.getNetflixActivity()).e(interfaceC5227bul, characterEpoxyController2.getNetflixActivity()));
                        bix.e(interfaceC5227bul.ca_());
                        bix.e(C8632dsu.c((Object) interfaceC5227bul.getId(), (Object) c4171bYw.e()));
                        bix.c(LoMoUtils.c(characterEpoxyController2.getNetflixActivity(), interfaceC5227bul.ce_()));
                        bix.e(C8004dcG.e.a(interfaceC5227bul, b3));
                        bix.c(z);
                        bIN bin = new bIN(interfaceC5227bul.aE_().aH_(), interfaceC5227bul.aE_().aY_(), interfaceC5227bul.aE_().d(), interfaceC5227bul.aE_().isPlayable());
                        bix.e(bin);
                        InterfaceC5206buQ c2 = interfaceC5298bwC.c(bin.aH_());
                        bix.d(interfaceC5227bul.isAvailableToPlay() && !InterfaceC7303ctf.c.a(characterEpoxyController2.getNetflixActivity()).e(c2));
                        bix.b(DownloadButton.b(c2, bin));
                        bix.c(c2 != null ? c2.aD_() : 0);
                        bix.b(new View.OnClickListener() { // from class: o.bXR
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                CharacterEpoxyController$buildModels$1.a(CharacterEpoxyController.this, interfaceC5230buo, interfaceC5227bul, i2, view);
                            }
                        });
                        bix.a(new InterfaceC4732bk() { // from class: o.bXW
                            @Override // o.InterfaceC4732bk
                            public final void b(AbstractC3073as abstractC3073as, Object obj4, int i3) {
                                CharacterEpoxyController$buildModels$1.d(CharacterEpoxyController.this, interfaceC5230buo, interfaceC5227bul, i2, (bIX) abstractC3073as, (bIQ.c) obj4, i3);
                            }
                        });
                        characterEpoxyController2.add(bix);
                        i2++;
                        z = true;
                    }
                    if (interfaceC5195buF.D_() > b2.size()) {
                        if (c4171bYw.a() instanceof C8927fu) {
                            bIS bis = new bIS();
                            bis.b((CharSequence) "filling-retry-button");
                            bis.c(new AbstractC3073as.b() { // from class: o.bXP
                                @Override // o.AbstractC3073as.b
                                public final int b(int i3, int i4, int i5) {
                                    int f;
                                    f = CharacterEpoxyController$buildModels$1.f(i3, i4, i5);
                                    return f;
                                }
                            });
                            bis.e(new View.OnClickListener() { // from class: o.bXU
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    CharacterEpoxyController$buildModels$1.c(CharacterEpoxyController.this, view);
                                }
                            });
                            characterEpoxyController2.add(bis);
                        } else {
                            C3774bKd c3774bKd = new C3774bKd();
                            int size = b2.size();
                            c3774bKd.c((CharSequence) ("loading-" + size));
                            c3774bKd.b(400L);
                            c3774bKd.d(new AbstractC3073as.b() { // from class: o.bXV
                                @Override // o.AbstractC3073as.b
                                public final int b(int i3, int i4, int i5) {
                                    int a;
                                    a = CharacterEpoxyController$buildModels$1.a(b2, i3, i4, i5);
                                    return a;
                                }
                            });
                            c3774bKd.a(new InterfaceC4467bf() { // from class: o.bXX
                                @Override // o.InterfaceC4467bf
                                public final void c(AbstractC3073as abstractC3073as, Object obj4, int i3) {
                                    CharacterEpoxyController$buildModels$1.c(CharacterEpoxyController.this, (C3774bKd) abstractC3073as, (AbstractC3776bKf.e) obj4, i3);
                                }
                            });
                            characterEpoxyController2.add(c3774bKd);
                        }
                    }
                }
            }
            return dpR.c;
        }
        return null;
    }
}
