
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

    public void solve(int count, int source, int original, int destination) {
        if (count > 0) {
            solve(count - 1, source, destination, original); 
            model.move(source, destination);
            solve(count - 1, original, source, destination);
        }

    }
// Overloaded recursive solve method

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //

}
