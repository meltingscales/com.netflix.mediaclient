package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.R;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C8632dsu;
import o.InterfaceC8555dpy;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt {
    private static final Class<? extends Object>[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        ViewParent parent = view.getParent();
        C8632dsu.d(parent);
        View view2 = (View) parent;
        Object tag = view2.getTag(R.id.compose_view_saveable_id_tag);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(str, savedStateRegistryOwner);
    }

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(String str, SavedStateRegistryOwner savedStateRegistryOwner) {
        final boolean z;
        final String str2 = SaveableStateRegistry.class.getSimpleName() + ':' + str;
        final SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str2);
        final SaveableStateRegistry SaveableStateRegistry = SaveableStateRegistryKt.SaveableStateRegistry(consumeRestoredStateForKey != null ? toMap(consumeRestoredStateForKey) : null, new drM<Object, Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drM
            public final Boolean invoke(Object obj) {
                boolean canBeSavedToBundle;
                canBeSavedToBundle = DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(obj);
                return Boolean.valueOf(canBeSavedToBundle);
            }
        });
        try {
            savedStateRegistry.registerSavedStateProvider(str2, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$$ExternalSyntheticLambda0
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    Bundle DisposableSaveableStateRegistry$lambda$0;
                    DisposableSaveableStateRegistry$lambda$0 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry$lambda$0(SaveableStateRegistry.this);
                    return DisposableSaveableStateRegistry$lambda$0;
                }
            });
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new DisposableSaveableStateRegistry(SaveableStateRegistry, new drO<dpR>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z) {
                    savedStateRegistry.unregisterSavedStateProvider(str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle DisposableSaveableStateRegistry$lambda$0(SaveableStateRegistry saveableStateRegistry) {
        return toBundle(saveableStateRegistry.performSave());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                T value = snapshotMutableState.getValue();
                if (value == 0) {
                    return true;
                }
                return canBeSavedToBundle(value);
            }
            return false;
        } else if ((obj instanceof InterfaceC8555dpy) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> cls : AcceptableClasses) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final Map<String, List<Object>> toMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            C8632dsu.d(parcelableArrayList);
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    private static final Bundle toBundle(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }
}
