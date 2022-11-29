         public interface Formatter{
	    		 String format(String line); 
	    		 class F implements Formatter{
	    		    public String format(String s){
	    		        return "** " + s + " **";
	    		    }
	    		}
	    		
		}
	