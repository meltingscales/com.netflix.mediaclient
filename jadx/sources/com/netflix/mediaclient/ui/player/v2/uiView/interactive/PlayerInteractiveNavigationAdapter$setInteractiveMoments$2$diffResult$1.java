package com.netflix.mediaclient.ui.player.v2.uiView.interactive;

import androidx.recyclerview.widget.DiffUtil;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import com.netflix.model.leafs.originals.interactive.condition.State;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.cHZ;
import o.dpR;
import o.drX;
import o.dwU;
import o.dwY;

/* loaded from: classes4.dex */
public final class PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$diffResult$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super DiffUtil.DiffResult>, Object> {
    int a;
    final /* synthetic */ List<State> b;
    final /* synthetic */ PlayerControls c;
    final /* synthetic */ List<State> d;
    final /* synthetic */ Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> e;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$diffResult$1(List<? extends State> list, List<? extends State> list2, PlayerControls playerControls, Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> map, InterfaceC8585dra<? super PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$diffResult$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = list;
        this.d = list2;
        this.c = playerControls;
        this.e = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$diffResult$1 playerInteractiveNavigationAdapter$setInteractiveMoments$2$diffResult$1 = new PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$diffResult$1(this.b, this.d, this.c, this.e, interfaceC8585dra);
        playerInteractiveNavigationAdapter$setInteractiveMoments$2$diffResult$1.i = obj;
        return playerInteractiveNavigationAdapter$setInteractiveMoments$2$diffResult$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super DiffUtil.DiffResult> interfaceC8585dra) {
        return ((PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$diffResult$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            final dwU dwu = (dwU) this.i;
            try {
                cHZ.c.getLogTag();
                final List<State> list = this.b;
                final List<State> list2 = this.d;
                final PlayerControls playerControls = this.c;
                final Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> map = this.e;
                return DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.PlayerInteractiveNavigationAdapter$setInteractiveMoments$2$diffResult$1.2
                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public int getOldListSize() {
                        return list.size();
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public int getNewListSize() {
                        return list2.size();
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public boolean areItemsTheSame(int i, int i2) {
                        dwY.c(dwu);
                        return C8632dsu.c((Object) list.get(i).getStateSegmentId(), (Object) list2.get(i2).getStateSegmentId());
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public boolean areContentsTheSame(int i, int i2) {
                        PlayerControls.ChoicePointsMetadata choicePointsMetadata;
                        Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> choicePoints;
                        PlayerControls.ChoicePointsMetadata.ChoicePoint choicePoint;
                        PlayerControls.ChoicePointsMetadata.ChoicePoint choicePoint2;
                        if (i == 0 || i2 == 0 || i == getOldListSize() - 1 || i2 == getNewListSize() - 1) {
                            return false;
                        }
                        if (getNewListSize() != 1 || getOldListSize() == 1) {
                            if (getOldListSize() != 1 || getNewListSize() == 1) {
                                String stateSegmentId = list.get(i).getStateSegmentId();
                                String stateSegmentId2 = list2.get(i2).getStateSegmentId();
                                if (!C8632dsu.c((Object) stateSegmentId, (Object) stateSegmentId2) || (choicePointsMetadata = playerControls.choicePointsMetadata()) == null || (choicePoints = choicePointsMetadata.choicePoints()) == null) {
                                    return false;
                                }
                                Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> map2 = map;
                                String description = (map2 == null || (choicePoint2 = map2.get(stateSegmentId)) == null) ? null : choicePoint2.description();
                                PlayerControls.ChoicePointsMetadata.ChoicePoint choicePoint3 = choicePoints.get(stateSegmentId2);
                                if (C8632dsu.c((Object) description, (Object) (choicePoint3 != null ? choicePoint3.description() : null))) {
                                    String assetId = (map2 == null || (choicePoint = map2.get(stateSegmentId)) == null) ? null : choicePoint.assetId();
                                    PlayerControls.ChoicePointsMetadata.ChoicePoint choicePoint4 = choicePoints.get(stateSegmentId2);
                                    return C8632dsu.c((Object) assetId, (Object) (choicePoint4 != null ? choicePoint4.assetId() : null));
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                }, true);
            } catch (CancellationException unused) {
                cHZ.c.getLogTag();
                return null;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
