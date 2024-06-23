package tasks_shaheena;

     // interface to have sme options for controlling brower 

  

      public interface  WebDriver1 {
	 
	   public void get_url(String  Url);// if we call this abstract method, it  helps us to open any page (url) 

       
      
      
	   public void close(); // if we call this abstract method, it  closes current browser  window 
    
        
        
        
       public void quit();// if we call this abstract method, it closes all open windows in the browser 
        }