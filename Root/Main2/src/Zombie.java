public class Zombie extends Monster {

	    private char[] scream;
		public Zombie(String name) {
	        super(name + " the Zombie", 5);
	    
		}
	    public void growl(){
	        System.out.print("Raaaauuughhhh");
	        super.growl();
	    }

	    	@Override
	        public void attack(Monster monster){
	            monster.damage(getForce());
	            growl();
	       }    	
		
	    public void growl(boolean loud){
	        if (!loud) {
	            growl();
	        }
	        else 
	            System.out.print(scream.length);
	            super.growl();
	        }
	    }
	


