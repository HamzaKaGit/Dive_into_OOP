class Horse extends Animals{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    public static void main(String args[]){
    	Animals obj = new Horse();
    	obj.sound();
    }
}