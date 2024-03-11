package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import com.netflix.model.leafs.originals.interactive.condition.Snapshots;
import com.netflix.model.leafs.originals.interactive.condition.State;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.C8632dsu;
import o.InterfaceC5710cFm;
import o.cBA;
import o.cEL;
import o.cEW;
import o.cHT;
import o.dpR;

/* loaded from: classes4.dex */
public final class cEL extends cEF implements cEW, InterfaceC5710cFm {
    private final cHT a;
    private String b;
    private Interactivity c;
    private InteractiveMoments d;
    private boolean e;

    public Interactivity a() {
        return this.c;
    }

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.c = interactivity;
    }

    @Override // o.InterfaceC5710cFm
    public void b(String str) {
        this.b = str;
    }

    @Override // o.cEF, o.cEX
    public void b(boolean z) {
        this.e = z;
    }

    @Override // o.InterfaceC5710cFm
    public String c() {
        return this.b;
    }

    @Override // o.cEF
    public boolean l() {
        return this.e;
    }

    @Override // o.InterfaceC5710cFm
    public void c(Observable<cBA> observable) {
        InterfaceC5710cFm.e.c(this, observable);
    }

    @Override // o.cEW
    public void e(Observable<cBA> observable) {
        cEW.d.a(this, observable);
    }

    public boolean j() {
        return InterfaceC5710cFm.e.e(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cEL(cHT cht, Observable<cBA> observable) {
        super(cht, observable, null, 4, null);
        C8632dsu.c((Object) cht, "");
        C8632dsu.c((Object) observable, "");
        this.a = cht;
        cht.b();
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        PlayerControls.Config config;
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cBA.C5546h) {
            InteractiveMoments e = ((cBA.C5546h) cba).e();
            cHT cht = this.a;
            PlayerControls playerControls = e.playerControls();
            cht.a(playerControls != null ? playerControls.headerText() : null);
            this.a.a(e, this.d != null);
            this.d = e;
        } else if (cba instanceof cBA.C5542d) {
            cBA.C5542d c5542d = (cBA.C5542d) cba;
            if (c5542d.c() == Interactivity.e) {
                cHT cht2 = this.a;
                InteractiveSummary az_ = c5542d.e().g().az_();
                if (az_ == null || !az_.isInDebug()) {
                    r2 = false;
                }
                cht2.d(r2);
                return;
            }
            this.a.g();
        } else if (cba instanceof cBA.ai) {
            if (a() == Interactivity.e) {
                this.a.d();
                if (j() || ((cBA.ai) cba).i()) {
                    return;
                }
                this.a.a();
            }
        } else if (cba instanceof cBA.C5553o) {
            cBA.C5553o c5553o = (cBA.C5553o) cba;
            this.a.b(c5553o.d());
            final InteractiveMoments interactiveMoments = this.d;
            if (interactiveMoments != null) {
                final String str = c5553o.d().a;
                C8632dsu.a(str, "");
                PlayerControls playerControls2 = interactiveMoments.playerControls();
                if (playerControls2 == null || (config = playerControls2.config()) == null || !config.playerControlsSnapshots()) {
                    return;
                }
                C9726vo.d(interactiveMoments.snapshots(), interactiveMoments.stateHistory().persistent(), new drX<Snapshots, State, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.interactive.PlayerInteractiveNavigationPresenter$onEvent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Snapshots snapshots, State state) {
                        e(snapshots, state);
                        return dpR.c;
                    }

                    public final void e(Snapshots snapshots, State state) {
                        cHT cht3;
                        cHT cht4;
                        cHT cht5;
                        PlayerControls.ChoicePointsMetadata choicePointsMetadata;
                        Map<String, PlayerControls.ChoicePointsMetadata.ChoicePoint> choicePoints;
                        State state2;
                        C8632dsu.c((Object) snapshots, "");
                        C8632dsu.c((Object) state, "");
                        cht3 = cEL.this.a;
                        cht3.e(0, false);
                        PlayerControls playerControls3 = interactiveMoments.playerControls();
                        if (playerControls3 != null && (choicePointsMetadata = playerControls3.choicePointsMetadata()) != null && (choicePoints = choicePointsMetadata.choicePoints()) != null && choicePoints.containsKey(str)) {
                            String str2 = str;
                            Iterator<State> it = snapshots.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    state2 = null;
                                    break;
                                }
                                state2 = it.next();
                                if (C8632dsu.c((Object) state2.getStateSegmentId(), (Object) str2)) {
                                    break;
                                }
                            }
                            State state3 = state2;
                            if (state3 != null) {
                                snapshots.remove(state3);
                            }
                            State state4 = new State();
                            HashMap<String, JsonElement> hashMap = new HashMap<>(state.values);
                            state4.values = hashMap;
                            hashMap.remove(State.SEGMENT_ID);
                            HashMap<String, JsonElement> hashMap2 = state4.values;
                            C8632dsu.a(hashMap2, "");
                            hashMap2.put(State.SEGMENT_ID, new JsonPrimitive(str));
                            snapshots.add(state4);
                        }
                        cht4 = cEL.this.a;
                        cHT.a.a(cht4, interactiveMoments, false, 2, null);
                        cht5 = cEL.this.a;
                        cht5.c(null);
                    }
                });
            }
        } else if (cba instanceof cBA.C5556r) {
            this.a.b();
            this.a.g();
        } else if (C8632dsu.c(cba, cBA.C5558t.d)) {
            this.a.b();
        } else if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
            this.a.c();
        } else if ((cba instanceof cBA.C5547i) && l()) {
            this.a.g();
        }
    }

    @Override // o.cEF
    public void bK_() {
        if (a() != Interactivity.e || j() || l()) {
            return;
        }
        super.bK_();
    }
}
