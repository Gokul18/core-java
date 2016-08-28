public  class Overload {
	private int id ;
	private int id2 ;
	

	public int display(int id, int id2,String name) {
		//System.out.println(id + " " + id2 + " " + name);
		return id + id2;
	}
	public int display(int id1, int id2, int id3,String name) {
		//System.out.println(id3 + " " + id4);
		return id1+id2+id3;
		
	}

}
