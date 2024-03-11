package com.netflix.mediaclient.ui.player.v2.uiView.interactive;

import androidx.recyclerview.widget.RecyclerView;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5639cCw;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.cHZ;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ cHZ a;
    int b;
    final /* synthetic */ PlayerControls d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$1(PlayerControls playerControls, cHZ chz, InterfaceC8585dra<? super PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = playerControls;
        this.a = chz;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$1(this.d, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> choicePoints;
        Set<String> keySet;
        PlayerControls.Config.ImagesConfig images;
        Image imageForSegmentId;
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            PlayerControls.ChoicePointsMetadata choicePointsMetadata = this.d.choicePointsMetadata();
            if (choicePointsMetadata == null || (choicePoints = choicePointsMetadata.choicePoints()) == null || (keySet = choicePoints.keySet()) == null) {
                return null;
            }
            cHZ chz = this.a;
            PlayerControls playerControls = this.d;
            ArrayList arrayList = new ArrayList(keySet.size());
            for (String str : keySet) {
                PlayerControls.Config config = playerControls.config();
                if (config != null && (images = config.images()) != null && (imageForSegmentId = images.getImageForSegmentId(str)) != null) {
                    arrayList.add(imageForSegmentId);
                }
            }
            C5639cCw c5639cCw = C5639cCw.e;
            RecyclerView recyclerView = chz.j;
            c5639cCw.c(recyclerView != null ? recyclerView.getContext() : null, arrayList);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
