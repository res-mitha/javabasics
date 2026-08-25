class Store{
    void getchocolate(int money){
         System.out.println("chocolate purchased");
    }
    void getpowder(int money){
        System.out.println("powder purchased");
    }

    public static void main(String[] args){
        Store obj1 = new Store();
        obj1.getchocolate(40);
        obj1.getpowder(25);
    }
}