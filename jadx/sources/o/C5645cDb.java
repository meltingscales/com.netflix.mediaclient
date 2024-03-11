package o;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import o.C5645cDb;
import o.C5660cDq;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cDb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5645cDb extends C5660cDq {
    private Bitmap a;
    private Bitmap c;
    private Disposable e;
    private Disposable g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5645cDb(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, FrameLayout frameLayout, LayoutTimer layoutTimer, Map<String, ? extends Style> map, Map<String, ? extends Image> map2, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, frameLayout, layoutTimer, map, map2, f, interfaceC9638uF);
        Single a;
        Single a2;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) frameLayout, "");
        C8632dsu.c((Object) layoutTimer, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        LayoutTimer.SpriteSheetTimer spritesheet = layoutTimer.spritesheet();
        if (spritesheet != null) {
            ImageAssetId pass = spritesheet.pass();
            Image image = map2.get(pass != null ? pass.assetId() : null);
            if (image != null) {
                a2 = C5794cIp.a.a(interfaceC9638uF, frameLayout, image, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? 1.0f : f, (r16 & 32) != 0 ? null : moment);
                this.g = SubscribersKt.subscribeBy(a2, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.CatSpriteTimerInteractiveUIView$1$1$1
                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        a(th);
                        return dpR.c;
                    }

                    public final void a(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C5660cDq.e eVar = C5660cDq.b;
                    }
                }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.CatSpriteTimerInteractiveUIView$1$1$2
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                        c(aVar);
                        return dpR.c;
                    }

                    public final void c(GetImageRequest.a aVar) {
                        C8632dsu.c((Object) aVar, "");
                        C5645cDb.this.c = aVar.b();
                    }
                });
            }
            ImageAssetId fail = spritesheet.fail();
            Image image2 = map2.get(fail != null ? fail.assetId() : null);
            if (image2 != null) {
                a = C5794cIp.a.a(interfaceC9638uF, frameLayout, image2, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? 1.0f : f, (r16 & 32) != 0 ? null : moment);
                this.e = SubscribersKt.subscribeBy(a, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.CatSpriteTimerInteractiveUIView$1$2$1
                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        e(th);
                        return dpR.c;
                    }

                    public final void e(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C5660cDq.e eVar = C5660cDq.b;
                    }
                }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.CatSpriteTimerInteractiveUIView$1$2$2
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                        c(aVar);
                        return dpR.c;
                    }

                    public final void c(GetImageRequest.a aVar) {
                        C8632dsu.c((Object) aVar, "");
                        C5645cDb.this.a = aVar.b();
                    }
                });
            }
        }
    }

    @Override // o.AbstractC5649cDf
    public void e(boolean z) {
        super.e(z);
        NetflixImageView c = c();
        if (c != null) {
            c.setImageBitmap(z ? this.c : this.a);
        }
    }

    @Override // o.C5660cDq, o.AbstractC5649cDf
    public void f() {
        super.f();
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.g;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }
}
