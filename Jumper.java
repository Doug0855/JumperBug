public class Jumper extends Actor {
	
	public static void main(String[] args) {
		
	} 

	public boolean CanJump() 
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
    }

    public void jump(){
    	Grid<Actor> gr = getGrid();
    	if (gr == null) {
    		return;
    	}
    	Location loc = next.getLocation();
    	Location next = loc.getAdjacentLocation(getDirection());

    	if (gr.isValid) {
    		move();
    	}
    }


}