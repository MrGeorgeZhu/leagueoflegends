
public class Champion extends Characters
	{
		protected String championName;
		protected String passiveDescription;
		protected String QDescription;
		protected String WDescription;
		protected String EDescription;
		protected String RDescription;
		
		public Champion(String a, String b, String c, String d, String e, String f)
			{
				championName = a;
				passiveDescription = b;
				QDescription = c;
				WDescription = d;
				EDescription = e;
				RDescription = f;
			}
		
        public String getPassiveDescription()
			{
				return passiveDescription;
			}
		public void setPassiveDescription(String passiveDescription)
			{
				this.passiveDescription = passiveDescription;
			}
		public String getQDescription()
			{
				return QDescription;
			}
		public void setQDescription(String qDescription)
			{
				QDescription = qDescription;
			}
		public String getWDescription()
			{
				return WDescription;
			}
		public void setWDescription(String wDescription)
			{
				WDescription = wDescription;
			}
		public String getEDescription()
			{
				return EDescription;
			}
		public void setEDescription(String eDescription)
			{
				EDescription = eDescription;
			}
		public String getRDescription()
			{
				return RDescription;
			}
		public void setRDescription(String rDescription)
			{
				RDescription = rDescription;
			}
		
		protected void passive(){
        	
        }
        protected void q(){
        	
        }
        protected void w(){
        	
        }	
        protected void e(){
        	
        }	
        protected void r(){
        	
        }	
        
        
	}
