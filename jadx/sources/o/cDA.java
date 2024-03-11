package o;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.TriviaContainerElement;
import com.netflix.model.leafs.originals.interactive.template.ElementChildrenList;
import com.netflix.model.leafs.originals.interactive.template.ElementV2;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cDA extends AbstractC5649cDf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cDA(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, FrameLayout frameLayout, TriviaContainerElement triviaContainerElement, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, false);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) frameLayout, "");
        C8632dsu.c((Object) triviaContainerElement, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        frameLayout.setTag(triviaContainerElement.id());
        AbstractC5649cDf.a(this, frameLayout, triviaContainerElement, null, null, 12, null);
        d(triviaContainerElement, interactiveMoments, frameLayout, hashMap, interfaceC9638uF, moment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d(ElementChildrenList elementChildrenList, InteractiveMoments interactiveMoments, FrameLayout frameLayout, HashMap<String, Image> hashMap, InterfaceC9638uF interfaceC9638uF, Moment moment) {
        TextView textView;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        List<ElementV2> childrenList = elementChildrenList.childrenList();
        if (childrenList != null) {
            for (ElementV2 elementV2 : childrenList) {
                ElementV2 override = elementV2.override(interactiveMoments);
                if (override != null) {
                    C8632dsu.d(override);
                    CharSequence text = override.text(interactiveMoments);
                    if (text == null) {
                        text = c(override.id());
                    }
                    if (override.childrenList() != null) {
                        FrameLayout frameLayout4 = new FrameLayout(frameLayout.getContext());
                        frameLayout4.setId(View.generateViewId());
                        frameLayout4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        frameLayout4.setVisibility(0);
                        AbstractC5649cDf.a(this, frameLayout4, override, null, null, 12, null);
                        frameLayout3 = frameLayout4;
                        d(override, interactiveMoments, frameLayout4, hashMap, interfaceC9638uF, moment);
                        frameLayout2 = frameLayout;
                    } else {
                        if (text != null) {
                            TextView textView2 = new TextView(frameLayout.getContext());
                            textView2.setId(View.generateViewId());
                            textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                            textView2.setVisibility(0);
                            AbstractC5649cDf.a(this, textView2, override, null, null, 12, null);
                            textView2.setText(text);
                            AbstractC5649cDf.d.getLogTag();
                            String assetId = override.assetId();
                            textView = textView2;
                            if (assetId != null) {
                                Image image = hashMap.get(assetId);
                                textView = textView2;
                                if (image != null) {
                                    C5794cIp.a.e(interfaceC9638uF, textView2, image, null, moment);
                                    textView = textView2;
                                }
                            }
                        } else {
                            Context context = frameLayout.getContext();
                            C8632dsu.a(context, "");
                            C5640cCx c5640cCx = new C5640cCx(context, null, 0, 6, null);
                            c5640cCx.setId(View.generateViewId());
                            c5640cCx.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                            c5640cCx.setVisibility(0);
                            AbstractC5649cDf.a(this, c5640cCx, override, null, null, 12, null);
                            textView = c5640cCx;
                        }
                        frameLayout2 = frameLayout;
                        frameLayout3 = textView;
                    }
                    frameLayout2.addView(frameLayout3);
                }
            }
        }
    }
}
