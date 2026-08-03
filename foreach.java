class foreach{
    public static void main(String[] args){
        int arr[] = {12,2,34,56};
        String[] res = {"hello","world"};
        for(int var : arr){
            System.out.println(var);
        }
        for(String dum : res){
            System.out.println(dum);
        }
    }
}