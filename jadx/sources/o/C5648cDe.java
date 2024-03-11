package o;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.cIE;

/* renamed from: o.cDe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5648cDe extends AbstractC5656cDm {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5648cDe(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, View view, Moment moment, Notification notification, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, false, 128, null);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) notification, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(cIE.b.M);
        if (frameLayout != null) {
            AbstractC5649cDf.a(this, frameLayout, notification, null, null, 12, null);
            frameLayout.setContentDescription(moment.accessibilityDescription(interactiveMoments));
            Context context = frameLayout.getContext();
            C8632dsu.a(context, "");
            AccessibilityUtils.b(context, frameLayout.getContentDescription());
            Notification.NotificationChildren children = notification.children();
            if (children != null) {
                C8632dsu.d(children);
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(cIE.b.r);
                if (constraintLayout != null) {
                    C8632dsu.d(constraintLayout);
                    SimpleElement contentContainer = children.contentContainer();
                    if (contentContainer != null) {
                        C8632dsu.d(contentContainer);
                        AbstractC5649cDf.a(this, constraintLayout, contentContainer, null, null, 12, null);
                    }
                }
                NetflixImageView netflixImageView = (NetflixImageView) view.findViewById(cIE.b.aw);
                if (netflixImageView != null) {
                    C8632dsu.d(netflixImageView);
                    ImageElement image1 = children.image1();
                    if (image1 != null) {
                        C8632dsu.d(image1);
                        AbstractC5649cDf.a(this, netflixImageView, image1, null, null, 12, null);
                        netflixImageView.setVisibility(0);
                    }
                }
                NetflixImageView netflixImageView2 = (NetflixImageView) view.findViewById(cIE.b.aB);
                if (netflixImageView2 != null) {
                    C8632dsu.d(netflixImageView2);
                    ImageElement image2 = children.image2();
                    if (image2 != null) {
                        C8632dsu.d(image2);
                        AbstractC5649cDf.a(this, netflixImageView2, image2, null, null, 12, null);
                        netflixImageView2.setVisibility(0);
                    }
                }
                NetflixImageView netflixImageView3 = (NetflixImageView) view.findViewById(cIE.b.ax);
                if (netflixImageView3 != null) {
                    C8632dsu.d(netflixImageView3);
                    ImageElement image3 = children.image3();
                    if (image3 != null) {
                        C8632dsu.d(image3);
                        AbstractC5649cDf.a(this, netflixImageView3, image3, null, null, 12, null);
                        netflixImageView3.setVisibility(0);
                    }
                }
            }
        }
    }
}
