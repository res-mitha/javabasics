class Addition{
    String getname()
    {
        return "Resmitha Saravanan";
    }
    int getphone(){
         return 98765432 ;
    }
    public static void main(String[] args){
        Addition obj1 = new Addition();
        String name = obj1.getname();
        int res = obj1.getphone();
        System.out.println(res);
        System.out.println(name);
    }
}