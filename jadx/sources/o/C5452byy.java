package o;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.bulkrater.impl.view.PagerViewHolder$bind$1;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import o.C5437byj;
import o.C5448byu;
import o.C5451byx;
import o.C5452byy;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.byy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5452byy extends RecyclerView.ViewHolder {
    private final Observable<dpR> a;
    private InterfaceC5367bxS b;
    private final View c;
    private final C5448byu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5452byy(View view, Observable<dpR> observable) {
        super(view);
        C8632dsu.c((Object) view, "");
        this.c = view;
        this.a = observable;
        C5448byu e = C5448byu.e(view);
        C8632dsu.a(e, "");
        this.e = e;
        view.setClipToOutline(true);
        view.setOutlineProvider(new ViewOutlineProvider(this) { // from class: o.byy.1
            private final float e;

            {
                this.e = this.c.getResources().getDimension(C5437byj.a.e);
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                C8632dsu.c((Object) view2, "");
                C8632dsu.c((Object) outline, "");
                int width = view2.getWidth();
                int height = view2.getHeight();
                float f = this.e;
                outline.setRoundRect(0, 0, width, height + ((int) f), f);
            }
        });
        C5434byg c5434byg = e.c;
    }

    public final void c(int i, InterfaceC5367bxS interfaceC5367bxS, final C5451byx c5451byx) {
        C8632dsu.c((Object) interfaceC5367bxS, "");
        C8632dsu.c((Object) c5451byx, "");
        if (C8632dsu.c(this.b, interfaceC5367bxS)) {
            return;
        }
        this.b = interfaceC5367bxS;
        if (i == 0 && c5451byx.e() && interfaceC5367bxS.b() != null) {
            this.e.c.setYBias(1.0f);
            this.e.c.showImage(new ShowImageRequest().a(interfaceC5367bxS.b()).a(true).a(new C5449byv(new PagerViewHolder$bind$1(c5451byx, this))));
        } else {
            this.e.c.animate().cancel();
            this.e.c.setYBias(0.0f);
            this.e.c.showImage(new ShowImageRequest().a((i != 0 || interfaceC5367bxS.b() == null) ? interfaceC5367bxS.a() : interfaceC5367bxS.b()).a(true));
        }
        if (i == 0 && c5451byx.c()) {
            this.e.b.setAlpha(0.0f);
            this.e.b.showImage(new ShowImageRequest().a(interfaceC5367bxS.e()).a(true).a(new C5449byv(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.view.PagerViewHolder$bind$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    C5448byu c5448byu;
                    C5448byu c5448byu2;
                    C5448byu c5448byu3;
                    C5448byu c5448byu4;
                    if (C5451byx.this.c()) {
                        c5448byu4 = this.e;
                        NetflixImageView netflixImageView = c5448byu4.b;
                        C8632dsu.a(netflixImageView, "");
                        OneShotPreDrawListener.add(netflixImageView, new d(netflixImageView, this));
                        return;
                    }
                    c5448byu = this.e;
                    c5448byu.b.animate().cancel();
                    c5448byu2 = this.e;
                    c5448byu2.b.setTranslationY(0.0f);
                    c5448byu3 = this.e;
                    c5448byu3.b.setAlpha(1.0f);
                }

                /* loaded from: classes4.dex */
                public static final class d implements Runnable {
                    final /* synthetic */ View a;
                    final /* synthetic */ C5452byy c;

                    public d(View view, C5452byy c5452byy) {
                        this.a = view;
                        this.c = c5452byy;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C5448byu c5448byu;
                        C5448byu c5448byu2;
                        C5448byu c5448byu3;
                        Observable observable;
                        Observable take;
                        c5448byu = this.c.e;
                        c5448byu.b.setAlpha(1.0f);
                        c5448byu2 = this.c.e;
                        NetflixImageView netflixImageView = c5448byu2.b;
                        c5448byu3 = this.c.e;
                        netflixImageView.setTranslationY(c5448byu3.b.getHeight() / 4);
                        observable = this.c.a;
                        if (observable == null || (take = observable.take(1L)) == null) {
                            return;
                        }
                        final C5452byy c5452byy = this.c;
                        take.subscribe(new Consumer(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: INVOKE  
                              (r0v8 'take' io.reactivex.Observable)
                              (wrap: io.reactivex.functions.Consumer : 0x0040: CONSTRUCTOR  (r1v8 io.reactivex.functions.Consumer A[REMOVE]) = 
                              (wrap: o.drM<o.dpR, o.dpR> : 0x003d: CONSTRUCTOR  (r2v0 o.drM<o.dpR, o.dpR> A[REMOVE]) = (r3v0 'c5452byy' o.byy A[DONT_INLINE]) call: com.netflix.mediaclient.ui.bulkrater.impl.view.PagerViewHolder$bind$2$1$1.<init>(o.byy):void type: CONSTRUCTOR)
                             call: o.byy.d.<init>(o.drM):void type: CONSTRUCTOR)
                             type: VIRTUAL call: io.reactivex.Observable.subscribe(io.reactivex.functions.Consumer):io.reactivex.disposables.Disposable in method: com.netflix.mediaclient.ui.bulkrater.impl.view.PagerViewHolder$bind$2.d.run():void, file: classes4.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.netflix.mediaclient.ui.bulkrater.impl.view.PagerViewHolder$bind$2$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:802)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 19 more
                            */
                        /*
                            this = this;
                            o.byy r0 = r4.c
                            o.byu r0 = o.C5452byy.e(r0)
                            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r0.b
                            r1 = 1065353216(0x3f800000, float:1.0)
                            r0.setAlpha(r1)
                            o.byy r0 = r4.c
                            o.byu r0 = o.C5452byy.e(r0)
                            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r0.b
                            o.byy r1 = r4.c
                            o.byu r1 = o.C5452byy.e(r1)
                            com.netflix.mediaclient.android.widget.NetflixImageView r1 = r1.b
                            int r1 = r1.getHeight()
                            int r1 = r1 / 4
                            float r1 = (float) r1
                            r0.setTranslationY(r1)
                            o.byy r0 = r4.c
                            io.reactivex.Observable r0 = o.C5452byy.c(r0)
                            if (r0 == 0) goto L46
                            r1 = 1
                            io.reactivex.Observable r0 = r0.take(r1)
                            if (r0 == 0) goto L46
                            o.byy$d r1 = new o.byy$d
                            com.netflix.mediaclient.ui.bulkrater.impl.view.PagerViewHolder$bind$2$1$1 r2 = new com.netflix.mediaclient.ui.bulkrater.impl.view.PagerViewHolder$bind$2$1$1
                            o.byy r3 = r4.c
                            r2.<init>(r3)
                            r1.<init>(r2)
                            r0.subscribe(r1)
                        L46:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.bulkrater.impl.view.PagerViewHolder$bind$2.d.run():void");
                    }
                }
            })));
            return;
        }
        this.e.b.setTranslationY(0.0f);
        this.e.b.setAlpha(1.0f);
        this.e.b.showImage(new ShowImageRequest().a(interfaceC5367bxS.e()).a(true));
    }
}
