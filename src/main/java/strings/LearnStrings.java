package strings;

public class LearnStrings {
    public static void main(String[] args) {
        String name = "anuj";
        String sameName = "anuj";
        String newName = new String("anuj");
        System.out.println(name);
        System.out.println(newName);

        // compare two strings
        // compare two reference
        if(name == sameName){
            System.out.println("Both are same");
        }
        if(name == newName){
            System.out.println("Both are same");
        }else{
            System.out.println("different");
        }


        //  compare two value
        if(name.equals(sameName)){
            System.out.println("Both are same");
        }
        if(name.equals(newName)){
            System.out.println("Both are same");
        }else{
            System.out.println("different");
        }

    }
}
