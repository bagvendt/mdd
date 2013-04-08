
			
	Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.dk/"));
	
		
			
	i.putExtra("var_1" , String your_var);

		
			
	i.putExtra("var_2" , String your_var);

		
		startActivityForResult(i);
	

		