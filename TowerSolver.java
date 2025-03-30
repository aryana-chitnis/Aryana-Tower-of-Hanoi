
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
       this.model = model;
    solve(model.getHeight(), 0, 1, 2); // Start solving from tower 0 to tower 2 using tower 1 as auxiliary
}

    public void solve(int n, int source, int original, int destination) {
        if (n > 0) {
            solve(n - 1, source, destination, original); 

// Overloaded recursive solve method

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //

}
