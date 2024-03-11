package o;

import android.content.Context;
import com.netflix.mediaclient.servicemgr.AddToMyListStateListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.bsd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5113bsd {
    private static C5113bsd c = new C5113bsd();
    private final HashMap<String, e> d = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C5113bsd b() {
        return c;
    }

    private C5113bsd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str, AddToMyListStateListener addToMyListStateListener) {
        e eVar = this.d.get(str);
        if (eVar == null) {
            C1044Mm.b("AddToMyListWrapper", "Creating new state data for video: " + str);
            eVar = new e(addToMyListStateListener);
            this.d.put(str, eVar);
        } else {
            eVar.c(addToMyListStateListener);
            C1044Mm.b("AddToMyListWrapper", "Found state data for video: " + str + ", state: " + eVar.c());
        }
        addToMyListStateListener.b(eVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, AddToMyListStateListener addToMyListStateListener) {
        e eVar = this.d.get(str);
        if (eVar == null) {
            C1044Mm.j("AddToMyListWrapper", "Unexpected case - can't find listener for video: " + str);
            return;
        }
        C1044Mm.b("AddToMyListWrapper", "Removing listener for video: " + str + ", listener: " + addToMyListStateListener);
        eVar.a(addToMyListStateListener);
        if (eVar.e()) {
            return;
        }
        this.d.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str, boolean z) {
        a(str, z ? AddToMyListStateListener.AddToMyListState.d : AddToMyListStateListener.AddToMyListState.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str, boolean z, boolean z2) {
        e eVar = this.d.get(str);
        if (eVar == null) {
            C1044Mm.b("AddToMyListWrapper", "Could not revert state for video: " + str);
            return;
        }
        C1044Mm.b("AddToMyListWrapper", "Reverting state for video: " + str);
        eVar.b();
        if (z2) {
            C8054ddD.c((Context) C1332Xp.b(Context.class), z ? com.netflix.mediaclient.ui.R.o.dx : com.netflix.mediaclient.ui.R.o.dB, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        a(str, AddToMyListStateListener.AddToMyListState.e);
    }

    private void a(String str, AddToMyListStateListener.AddToMyListState addToMyListState) {
        e eVar = this.d.get(str);
        if (eVar == null) {
            C1044Mm.b("AddToMyListWrapper", "No listeners for video: " + str);
            return;
        }
        C1044Mm.b("AddToMyListWrapper", "Updating state for video: " + str + " to: " + addToMyListState);
        eVar.e(addToMyListState);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bsd$e */
    /* loaded from: classes4.dex */
    public static class e {
        private AddToMyListStateListener.AddToMyListState a;
        private final Set<AddToMyListStateListener> b;
        private AddToMyListStateListener.AddToMyListState e;

        /* JADX INFO: Access modifiers changed from: private */
        public AddToMyListStateListener.AddToMyListState c() {
            return this.a;
        }

        private e(AddToMyListStateListener addToMyListStateListener) {
            HashSet hashSet = new HashSet(2);
            this.b = hashSet;
            AddToMyListStateListener.AddToMyListState addToMyListState = AddToMyListStateListener.AddToMyListState.e;
            this.a = addToMyListState;
            this.e = addToMyListState;
            hashSet.add(addToMyListStateListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(AddToMyListStateListener addToMyListStateListener) {
            this.b.add(addToMyListStateListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(AddToMyListStateListener addToMyListStateListener) {
            this.b.remove(addToMyListStateListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            return !this.b.isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            e(this.e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(AddToMyListStateListener.AddToMyListState addToMyListState) {
            AddToMyListStateListener.AddToMyListState addToMyListState2 = this.a;
            if (addToMyListState2 != AddToMyListStateListener.AddToMyListState.e) {
                this.e = addToMyListState2;
            }
            this.a = addToMyListState;
            for (AddToMyListStateListener addToMyListStateListener : this.b) {
                addToMyListStateListener.b(addToMyListState);
            }
        }
    }
}
