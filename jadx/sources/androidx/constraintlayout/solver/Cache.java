package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.Pools;
import com.netflix.android.org.json.zip.JSONzip;

/* loaded from: classes2.dex */
public class Cache {
    Pools.Pool<ArrayRow> optimizedArrayRowPool = new Pools.SimplePool(JSONzip.end);
    Pools.Pool<ArrayRow> arrayRowPool = new Pools.SimplePool(JSONzip.end);
    Pools.Pool<SolverVariable> solverVariablePool = new Pools.SimplePool(JSONzip.end);
    SolverVariable[] mIndexedVariables = new SolverVariable[32];
}